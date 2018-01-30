package com.adobe.training.core.ui.servlets;

/**
 * Created by arun on 1/29/18.
 */

import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.sling.SlingServlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;
import org.apache.sling.commons.json.JSONException;
import org.apache.sling.commons.json.JSONObject;

import javax.jcr.Repository;
import javax.servlet.ServletException;
import java.io.IOException;

//http://www.aemcq5tutorials.com/tutorials/sling-servlet-in-aem/

@SuppressWarnings("serial")
@SlingServlet(paths = "/bin/custom/path")
public class SimpleServletPath extends SlingSafeMethodsServlet {
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