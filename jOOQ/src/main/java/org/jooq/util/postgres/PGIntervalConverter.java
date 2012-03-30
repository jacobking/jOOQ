/**
 * Copyright (c) 2009-2012, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * This software is licensed to you under the Apache License, Version 2.0
 * (the "License"); You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package org.jooq.util.postgres;

import static org.jooq.tools.reflect.Reflect.on;

import org.jooq.tools.reflect.Reflect;
import org.jooq.types.DayToSecond;
import org.jooq.types.YearToMonth;

/**
 * A converter for <code>org.postgresql.util.PGInterval</code>
 * <p>
 * Postgres returns an undisclosed internal type for intervals. This converter
 * takes care of converting the internal type to jOOQ's interval data types
 * {@link DayToSecond} and {@link YearToMonth}
 *
 * @author Lukas Eder
 */
public class PGIntervalConverter {

    public static Object toPGInterval(DayToSecond interval) {
        return on("org.postgresql.util.PGInterval").create(0, 0,
            interval.getDays(),
            interval.getHours(),
            interval.getMinutes(),
            interval.getSeconds() +
            interval.getNano() / 1000000000.0).get();
    }

    public static Object toPGInterval(YearToMonth interval) {
        return on("org.postgresql.util.PGInterval").create(
            interval.getYears(),
            interval.getMonths(),
            0, 0, 0, 0.0).get();
    }

    public static DayToSecond toDayToSecond(Object pgInterval) {
        Reflect i = on(pgInterval);
        Double seconds = i.call("getSeconds").<Double>get();
        return new DayToSecond(
            i.call("getDays").<Integer>get(),
            i.call("getHours").<Integer>get(),
            i.call("getMinutes").<Integer>get(),
            seconds.intValue(),
            (int) (1000000000 * (seconds - seconds.intValue())));
    }

    public static YearToMonth toYearToMonth(Object pgInterval) {
        Reflect i = on(pgInterval);
        return new YearToMonth(
            i.call("getYears").<Integer>get(),
            i.call("getMonths").<Integer>get());
    }
}