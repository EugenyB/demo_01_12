package com.example.demo_01_12;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = {"/hello-servlet", "/clear"})
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        String btn = request.getParameter("btn");
        if ("Clear".equals(btn)) {
            request.getSession().invalidate();
        }
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        int num = Integer.parseInt(request.getParameter("numField"));
        HttpSession session = request.getSession();
        if (session != null) {
            MyBean bean = (MyBean) session.getAttribute("bean");
            if (bean != null) {
                int total = bean.getNum() + num;
                bean.setNum(total);
                session.setAttribute("bean", bean);
            } else {
                session.setAttribute("bean", new MyBean(num));
            }
        }
        request.getRequestDispatcher("/result.jsp").forward(request, response);
    }

    public void destroy() {
    }
}