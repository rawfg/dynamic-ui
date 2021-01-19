package com.rcode.dynamicui.backend;

import com.rcode.dynamicui.backend.models.Property;
import com.rcode.dynamicui.backend.models.Template;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.Collection;

@Configuration
public class TemplateConfiguration {

    @Bean
    public Collection<Template> templates() {
        return Arrays.asList(
            new Template("tmpl-1", Arrays.asList(new Property("Name"))),
            new Template("tmpl-2", Arrays.asList(new Property("TaxRange"))),
            new Template("tmpl-3", Arrays.asList(new Property("JustProperty")))
        );
    }
}
