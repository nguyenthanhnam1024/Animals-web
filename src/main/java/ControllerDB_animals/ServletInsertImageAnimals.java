package ControllerDB_animals;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ConnectionDB_animals.Table_imageanimals;

@WebServlet(urlPatterns = {"/ServletInsertImageAnimals"})
public class ServletInsertImageAnimals extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int idm = Integer.parseInt(req.getParameter("id"));
        String tenm = req.getParameter("ten");
        String tuoim = req.getParameter("url");
        String dcm = req.getParameter("lop");
		Table_imageanimals tia = new Table_imageanimals();
		tia.Insert(idm, tenm, tuoim, dcm);
		PrintWriter out = resp.getWriter();
		out.print("oke");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int idm = Integer.parseInt(req.getParameter("id"));
        String tenm = req.getParameter("ten");
        String tuoim = req.getParameter("url");
        String dcm = req.getParameter("lop");
		Table_imageanimals tia = new Table_imageanimals();
		tia.Insert(idm, tenm, tuoim, dcm);
		PrintWriter out = resp.getWriter();
		out.print("ok");
	}

}
