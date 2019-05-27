package servlet;

import modeles.LivreDAO;
import modeles.MusiqueDAO;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DeleteLivreServlet", urlPatterns = "/DeleteLivreServlet")
public class DeleteLivreServlet extends HttpServlet {
    @EJB
    LivreDAO livreDAO;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id =Integer.parseInt( request.getParameter("delet"));
        livreDAO.deletId(id);
        response.sendRedirect("FindAllLivreServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
