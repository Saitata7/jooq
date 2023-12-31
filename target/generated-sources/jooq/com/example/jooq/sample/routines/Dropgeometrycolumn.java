/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.sample.routines;


import com.example.jooq.sample.Test;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Dropgeometrycolumn extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter <code>test.DropGeometryColumn.catalog</code>.
     */
    public static final Parameter<String> CATALOG = Internal.createParameter("catalog", SQLDataType.VARCHAR(64), false, false);

    /**
     * The parameter <code>test.DropGeometryColumn.t_schema</code>.
     */
    public static final Parameter<String> T_SCHEMA = Internal.createParameter("t_schema", SQLDataType.VARCHAR(64), false, false);

    /**
     * The parameter <code>test.DropGeometryColumn.t_name</code>.
     */
    public static final Parameter<String> T_NAME = Internal.createParameter("t_name", SQLDataType.VARCHAR(64), false, false);

    /**
     * The parameter <code>test.DropGeometryColumn.geometry_column</code>.
     */
    public static final Parameter<String> GEOMETRY_COLUMN = Internal.createParameter("geometry_column", SQLDataType.VARCHAR(64), false, false);

    /**
     * Create a new routine call instance
     */
    public Dropgeometrycolumn() {
        super("DropGeometryColumn", Test.TEST);

        addInParameter(CATALOG);
        addInParameter(T_SCHEMA);
        addInParameter(T_NAME);
        addInParameter(GEOMETRY_COLUMN);
    }

    /**
     * Set the <code>catalog</code> parameter IN value to the routine
     */
    public void setCatalog_(String value) {
        setValue(CATALOG, value);
    }

    /**
     * Set the <code>t_schema</code> parameter IN value to the routine
     */
    public void setTSchema(String value) {
        setValue(T_SCHEMA, value);
    }

    /**
     * Set the <code>t_name</code> parameter IN value to the routine
     */
    public void setTName(String value) {
        setValue(T_NAME, value);
    }

    /**
     * Set the <code>geometry_column</code> parameter IN value to the routine
     */
    public void setGeometryColumn(String value) {
        setValue(GEOMETRY_COLUMN, value);
    }
}
