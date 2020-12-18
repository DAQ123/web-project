package controller;


import dao.Set;
import entity.Xx;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/save.do")
public class Save extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset = UTF-8");
        String id = req.getParameter("id");
        String code = req.getParameter("code");
        String name = req.getParameter("name");

        String cd = req.getParameter("cd");
        String jiliang = req.getParameter("jiliang");
        String one = req.getParameter("one");
        String two = req.getParameter("two");

        Set set = new Set();
        Xx xx = new Xx(1,id,code,name,cd,jiliang,one,two);
        set.SetAll(xx);

        PrintWriter out = resp.getWriter();
        out.println("保存成功！");
        out.flush();
        out.close();

    }
}
