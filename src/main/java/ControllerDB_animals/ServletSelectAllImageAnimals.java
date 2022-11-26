package ControllerDB_animals;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ConnectionDB_animals.Table_imageanimals;

import java.util.ArrayList;

import ModelAnimals.ImageAnimals;

@WebServlet(urlPatterns = {"/ServletSelectAllImageAnimals"})
public class ServletSelectAllImageAnimals extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Table_imageanimals tia = new Table_imageanimals();
		ArrayList<ImageAnimals> listImageAnimals = tia.SelectAll();
		PrintWriter out = resp.getWriter();
		out.print("<h1>nam</h1>");
		for (ImageAnimals ia : listImageAnimals) {
			String url = ia.getUrlImage(); 
			out.print("<br><img src= '"+url+"'><br>");		
			out.print(ia.getUrlImage());
			System.out.println(ia.getUrlImage());
		}
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Table_imageanimals tia = new Table_imageanimals();
		ArrayList<ImageAnimals> listImageAnimals = tia.SelectAll();
		PrintWriter out = resp.getWriter();
		out.print("<h1>nam</h1>");
		for (ImageAnimals ia : listImageAnimals) {
			String url = ia.getUrlImage(); 
			out.print("<br><img src= '"+url+"'><br>");		
			System.out.println(ia.getUrlImage());
		}
	}

}
