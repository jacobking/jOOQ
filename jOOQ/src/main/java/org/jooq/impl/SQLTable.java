/**
 * Copyright (c) 2009-2011, Lukas Eder, lukas.eder@gmail.com
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
package org.jooq.impl;

import java.util.Collections;
import java.util.List;

import org.jooq.Attachable;
import org.jooq.BindContext;
import org.jooq.Param;
import org.jooq.Record;
import org.jooq.RenderContext;
import org.jooq.Table;

/**
 * @author Lukas Eder
 */
class SQLTable extends AbstractTable<Record> implements BindingProvider {

    private static final long    serialVersionUID = -5122023013463718796L;

    private final String         sql;
    private final List<Param<?>> bindings;

    public SQLTable(String sql, Object[] bindings) {
        super("sql");

        this.sql = sql;
        this.bindings = Util.bindings(bindings);
    }

    // ------------------------------------------------------------------------
    // SQLTable API
    // ------------------------------------------------------------------------

    @Override
    public final List<Attachable> getAttachables0() {
        return Collections.emptyList();
    }

    @Override
    public final Class<? extends Record> getRecordType() {
        return RecordImpl.class;
    }

    @Override
    public final Table<Record> as(String alias) {
        return new TableAlias<Record>(this, alias);
    }

    @Override
    public final void toSQL(RenderContext context) {
        Util.toSQLReference(context, sql, bindings);
    }

    @Override
    public final void bind(BindContext context) {
        context.bind(bindings);
    }

    @Override
    protected final FieldList getFieldList() {
        return new FieldList();
    }

    // ------------------------------------------------------------------------
    // QueryPart API
    // ------------------------------------------------------------------------

    @Override
    public final List<Param<?>> getBindings() {
        return bindings;
    }
}
