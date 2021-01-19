package com.rcode.dynamicui.backend.controllers;

import com.rcode.dynamicui.backend.models.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Optional;

@RestController
public class TemplateController {

    private final Collection<Template> templates;

    @Autowired
    public TemplateController(final Collection<Template> templates) {
        this.templates = templates;
    }

    @GetMapping("/templates")
    public ResponseEntity<Collection<Template>> templates() {
        return ResponseEntity.of(Optional.of(templates));
    }
}
