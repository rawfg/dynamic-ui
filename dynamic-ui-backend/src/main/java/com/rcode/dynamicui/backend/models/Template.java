package com.rcode.dynamicui.backend.models;

import java.util.Collection;

public class Template {

    private final String name;
    private final Collection<Property> properties;

    public Template(String name, Collection<Property> properties) {
        this.name = name;
        this.properties = properties;
    }

    public String getName() {
        return name;
    }

    public Collection<Property> getProperties() {
        return properties;
    }
}
