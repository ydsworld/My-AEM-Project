package com.adobe.training.core.ui.servlets;

import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.sling.SlingServlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingAllMethodsServlet;
import org.apache.sling.commons.json.JSONException;
import org.apache.sling.commons.json.JSONObject;

import javax.jcr.Repository;
import javax.servlet.ServletException;
import java.io.IOException;

/**
 * Created by arun on 1/30/18.
 */
@SlingServlet(
        resourceTypes = {"sling/servlet/default"},
        methods = {"POST", "GET"},
        selectors = {"simpleservlet"},
        label = "Simple Servlet Selector",
        extensions = {"html"})
public class SimpleServletSelector extends SlingAllMethodsServlet {
    @Reference
    private Repository repository;

    @Override
    protected void doGet(final SlingHttpServletRequest req,
                         final SlingHttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        String keys[] = repository.getDescriptorKeys();
        JSONObject jsonObject = new JSONObject();
        for (int i = 0; i < keys.length; i++) {
            try {
                jsonObject.put(keys[i], repository.getDescriptor(keys[i]));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        resp.getWriter().println(jsonObject.toString());
    }
}
