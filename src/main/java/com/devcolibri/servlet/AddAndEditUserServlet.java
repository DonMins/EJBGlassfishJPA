package com.devcolibri.servlet;

import com.devcolibri.bean.UserBean;
import com.devcolibri.entity.Book;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import javax.ejb.EJB;
import javax.ejb.EJBs;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/add")
public class AddAndEditUserServlet extends HttpServlet {

    @EJB(name = "UserBean")
    private UserBean userBean;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Book f = userBean.getAll().get(0);
        System.out.println(f);

        Book book = new Book("aaaaaaaaaaa");
        userBean.add(book);

    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.sendRedirect("list");
    }
}
