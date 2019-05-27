package servlet;

import modeles.Livre;
import modeles.LivreDAO;
import modeles.Musique;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CreateLivreServlet",urlPatterns = "/CreateLivreServlet")
public class CreateLivreServlet extends HttpServlet {

    @EJB
    LivreDAO livreDAO;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();

        String auteur=request.getParameter("auteur");
        String titre=request.getParameter("titre");
        Livre livre=new Livre(auteur, titre);
        livreDAO.creat(livre);
        response.sendRedirect("FindAllLivreServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
