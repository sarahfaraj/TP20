package servlet;

import modeles.Livre;
import modeles.LivreDAO;
import modeles.Musique;
import modeles.MusiqueDAO;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ModifierLivreServlet", urlPatterns = "/ModifierLivreServlet")
public class ModifierLivreServlet extends HttpServlet {
    @EJB
    LivreDAO livreDAO;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String auteur= request.getParameter("auteur");
        String titre =request.getParameter("titre");
        int id=Integer.parseInt(request.getParameter("ok"));
        livreDAO.modifierLivre(new Livre(auteur, titre),id);
        response.sendRedirect("FindAllLivreServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
