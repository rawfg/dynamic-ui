package com.rcode.dynamicui.backend.models;

public class Property {

    private final String name;

    private final String defaultValue;

    private final String expression;

    private final Boolean mandatory;

    public Property(String name) {
        this(name, null, null, false);
    }

    public Property(String name, String defaultValue, String expression, Boolean mandatory) {
        this.name = name;
        this.defaultValue = defaultValue;
        this.expression = expression;
        this.mandatory = mandatory;
    }

    public String getName() {
        return name;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public String getExpression() {
        return expression;
    }

    public Boolean getMandatory() {
        return mandatory;
    }
}
