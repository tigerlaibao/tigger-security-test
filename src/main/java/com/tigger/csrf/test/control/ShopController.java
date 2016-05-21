package com.tigger.csrf.test.control;

import org.apache.velocity.Template;
import org.apache.velocity.context.Context;
import org.apache.velocity.tools.view.VelocityViewServlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by laibao
 */
public class ShopController extends VelocityViewServlet {

    @Override
    protected void setContentType(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html;charset=utf-8");
    }

    @Override
    public Template handleRequest(HttpServletRequest request,HttpServletResponse response,Context ctx){
        ctx.put("name", "laibao...");
        return getTemplate("index.html");
    }

}
