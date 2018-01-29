package com.adobe.training.core.ui.controllers;

import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Model;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

/**
 * Created by arun on 1/28/18.
 */
@Model(adaptables = SlingHttpServletRequest.class)
public class HtmlSource {

    private static final Logger LOGGER = LoggerFactory.getLogger(HtmlSource.class);

    private String htmlSource;

    @Inject
    Resource resource;

    @PostConstruct
    protected void init(){
        LOGGER.info("Here xxxxxxxx");
        htmlSource = "tetst";
    }

    public String getHtmlSource() {
        return htmlSource;
    }
}
