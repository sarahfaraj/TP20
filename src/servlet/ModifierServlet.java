package servlet;

import modeles.Musique;
import modeles.MusiqueDAO;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ModifierServlet", urlPatterns = "/ModifierServlet")
public class ModifierServlet extends HttpServlet {
    @EJB
    MusiqueDAO musiqueDAO;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String artiste= request.getParameter("artiste");
        String titre =request.getParameter("titre");
                int duree =Integer.parseInt(request.getParameter("duree"));
                int id=Integer.parseInt(request.getParameter("ok"));
        musiqueDAO.modifierMusique(new Musique(titre,artiste,duree),id);
        response.sendRedirect("FindAllServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
