package fr.lernejo.todo;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



import org.springframework.stereotype.Component;

import javax.servlet.*;
import java.io.IOException;
import java.util.UUID;
import javax.servlet.http.HttpServletResponse;

@Component
public class ApplicationIdentifierFilter implements Filter {
    private String myUUID;


    public ApplicationIdentifierFilter() {
        myUUID = UUID.randomUUID().toString();
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;

        httpServletResponse.setHeader("Instance-Id", myUUID);

        filterChain.doFilter(servletRequest, httpServletResponse);
    }




}
