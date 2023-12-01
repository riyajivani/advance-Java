package riya;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Filter1 implements Filter {

    @Override
    public void destroy() {
        Filter.super.destroy();
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest sr, ServletResponse sr1, FilterChain fc) throws IOException, ServletException {

        HttpServletRequest hsr = (HttpServletRequest) sr;
        HttpServletResponse hsr1 = (HttpServletResponse) sr1;
        PrintWriter out = sr1.getWriter();
                
        if (hsr.getParameter("name").equals("riya"))
        {
            out.println("filter-1 called....... ");
            fc.doFilter(sr, sr1);
            out.println("filter-1 again called in reverse....");
        }
        else
           hsr1.sendRedirect("index.html");
    }

}
