/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.sample.tables.records;


import com.example.jooq.sample.tables.UserDetails;

import org.jooq.Field;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserDetailsRecord extends TableRecordImpl<UserDetailsRecord> implements Record4<String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>test.user_details.id</code>.
     */
    public UserDetailsRecord setId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>test.user_details.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>test.user_details.username</code>.
     */
    public UserDetailsRecord setUsername(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>test.user_details.username</code>.
     */
    public String getUsername() {
        return (String) get(1);
    }

    /**
     * Setter for <code>test.user_details.password</code>.
     */
    public UserDetailsRecord setPassword(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>test.user_details.password</code>.
     */
    public String getPassword() {
        return (String) get(2);
    }

    /**
     * Setter for <code>test.user_details.subject</code>.
     */
    public UserDetailsRecord setSubject(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>test.user_details.subject</code>.
     */
    public String getSubject() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return UserDetails.USER_DETAILS.ID;
    }

    @Override
    public Field<String> field2() {
        return UserDetails.USER_DETAILS.USERNAME;
    }

    @Override
    public Field<String> field3() {
        return UserDetails.USER_DETAILS.PASSWORD;
    }

    @Override
    public Field<String> field4() {
        return UserDetails.USER_DETAILS.SUBJECT;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getUsername();
    }

    @Override
    public String component3() {
        return getPassword();
    }

    @Override
    public String component4() {
        return getSubject();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getUsername();
    }

    @Override
    public String value3() {
        return getPassword();
    }

    @Override
    public String value4() {
        return getSubject();
    }

    @Override
    public UserDetailsRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public UserDetailsRecord value2(String value) {
        setUsername(value);
        return this;
    }

    @Override
    public UserDetailsRecord value3(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public UserDetailsRecord value4(String value) {
        setSubject(value);
        return this;
    }

    @Override
    public UserDetailsRecord values(String value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserDetailsRecord
     */
    public UserDetailsRecord() {
        super(UserDetails.USER_DETAILS);
    }

    /**
     * Create a detached, initialised UserDetailsRecord
     */
    public UserDetailsRecord(String id, String username, String password, String subject) {
        super(UserDetails.USER_DETAILS);

        setId(id);
        setUsername(username);
        setPassword(password);
        setSubject(subject);
    }
}
