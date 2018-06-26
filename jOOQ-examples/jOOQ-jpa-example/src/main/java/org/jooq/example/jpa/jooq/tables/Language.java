/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.jpa.jooq.tables;


import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.example.jpa.jooq.Indexes;
import org.jooq.example.jpa.jooq.Keys;
import org.jooq.example.jpa.jooq.Public;
import org.jooq.example.jpa.jooq.tables.records.LanguageRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Language extends TableImpl<LanguageRecord> {

    private static final long serialVersionUID = 1504906946;

    /**
     * The reference instance of <code>PUBLIC.LANGUAGE</code>
     */
    public static final Language LANGUAGE = new Language();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<LanguageRecord> getRecordType() {
        return LanguageRecord.class;
    }

    /**
     * The column <code>PUBLIC.LANGUAGE.LANGUAGEID</code>.
     */
    public final TableField<LanguageRecord, Integer> LANGUAGEID = createField("LANGUAGEID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), this, "");

    /**
     * The column <code>PUBLIC.LANGUAGE.NAME</code>.
     */
    public final TableField<LanguageRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(255), this, "");

    /**
     * Create a <code>PUBLIC.LANGUAGE</code> table reference
     */
    public Language() {
        this(DSL.name("LANGUAGE"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.LANGUAGE</code> table reference
     */
    public Language(String alias) {
        this(DSL.name(alias), LANGUAGE);
    }

    /**
     * Create an aliased <code>PUBLIC.LANGUAGE</code> table reference
     */
    public Language(Name alias) {
        this(alias, LANGUAGE);
    }

    private Language(Name alias, Table<LanguageRecord> aliased) {
        this(alias, aliased, null);
    }

    private Language(Name alias, Table<LanguageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> Language(Table<O> child, ForeignKey<O, LanguageRecord> key) {
        super(child, key, LANGUAGE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PRIMARY_KEY_C);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<LanguageRecord, Integer> getIdentity() {
        return Keys.IDENTITY_LANGUAGE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<LanguageRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_C;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<LanguageRecord>> getKeys() {
        return Arrays.<UniqueKey<LanguageRecord>>asList(Keys.CONSTRAINT_C);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Language as(String alias) {
        return new Language(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Language as(Name alias) {
        return new Language(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Language rename(String name) {
        return new Language(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Language rename(Name name) {
        return new Language(name, null);
    }
}
