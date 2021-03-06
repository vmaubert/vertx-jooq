/*
 * This file is generated by jOOQ.
 */
package generated.classic.reactive.regular.vertx.enums;


import generated.classic.reactive.regular.vertx.Vertx;

import org.jooq.Catalog;
import org.jooq.EnumType;
import org.jooq.Schema;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public enum Someenum implements EnumType {

    BAR("BAR"),

    BAZ("BAZ"),

    FOO("FOO");

    private final String literal;

    private Someenum(String literal) {
        this.literal = literal;
    }

    @Override
    public Catalog getCatalog() {
        return getSchema() == null ? null : getSchema().getCatalog();
    }

    @Override
    public Schema getSchema() {
        return Vertx.VERTX;
    }

    @Override
    public String getName() {
        return "someEnum";
    }

    @Override
    public String getLiteral() {
        return literal;
    }
}
