package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BmiBerechnen;

/**
 * Servlet implementation class BMIServlet
 */
@WebServlet("/BMIServlet")
public class BMIServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BMIServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * Servlet responds to the information on the homepage and provides the website with the calculated BMI data.
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * @author Martin Klestil
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Daten bekommen
		String theHeight = request.getParameter("height");
		String theWeight = request.getParameter("weight");
		double height = Double.parseDouble(theHeight);
		double weight = Double.parseDouble(theWeight);
		
		//Berechnen
		BmiBerechnen berechnen = new BmiBerechnen(height, weight);
		
		//Daten weitersenden
		request.setAttribute("BMI", berechnen.getBmi());
		request.setAttribute("BMIDescription", berechnen.getBmiDescription());
		
		
		//send to JSP Page
		RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
		dispatcher.forward(request, response);
		
	}

}
