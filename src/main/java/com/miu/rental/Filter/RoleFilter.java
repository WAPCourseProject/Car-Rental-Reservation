package com.miu.rental.Filter;
import com.miu.rental.Util;

import javax.annotation.processing.Filer;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(
        filterName = "RoleFilter",
        urlPatterns = { "/dashboard", "/admin/*" },
        servletNames = { "Dashboard","VehicleAddController" }
)

public class RoleFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;


        if(Util.isAdmin(req) && Util.isLoggedIn(req)) {
            filterChain.doFilter(servletRequest,servletResponse);
            System.out.println("Admin login Detected");
        }else{
            RequestDispatcher view = req.getRequestDispatcher("/home");
            view.forward(req,resp);

            }
    }

    @Override
    public void destroy() {

    }
}
