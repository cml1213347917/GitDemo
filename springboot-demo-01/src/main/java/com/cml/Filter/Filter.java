package com.cml.Filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 自定义过滤器
 * 过滤请求到sevlet之前
 */
@WebFilter(filterName = "filter",urlPatterns = {"/*"})
public class Filter implements javax.servlet.Filter {
    @Override
    public void init(javax.servlet.FilterConfig filterConfig) throws ServletException {
        System.out.println("filter初始化..............................");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("filter过滤..............................");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println("filter销毁..............................");

    }
}
