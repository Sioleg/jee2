package tp1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Servlet3 extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom");
		Personne perso = new Personne(nom);
		try {
			HttpSession session = request.getSession();
			ArrayList<Personne> lesPersonnes = (ArrayList<Personne>) session.getAttribute("liste");
			lesPersonnes.add(perso);
			session.setAttribute("liste",lesPersonnes);
			System.out.println(lesPersonnes);
			for(int i=0;i<lesPersonnes.size();i++){
				System.out.println(lesPersonnes.get(i).GetNom());
			}
		}
		catch(Exception e){
			HttpSession session = request.getSession();
			ArrayList<Personne> lesPersonnes = new ArrayList<Personne>(Arrays.asList(perso));
			session.setAttribute("liste", lesPersonnes);
		}
		
		
		request.setAttribute("name", perso);
		
		request.getRequestDispatcher("/edit.jsp").forward(request,response);
			
	}
	
}
