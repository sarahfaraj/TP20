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

@WebServlet(name = "FindAllLivreServlet", urlPatterns = "/FindAllLivreServlet")
public class FindAllLivreServlet extends HttpServlet {
    @EJB
    LivreDAO livreDAO;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("listLivre",livreDAO.findAll());
        request.setAttribute("id",Integer.parseInt(request.getParameter("modif")));
        request.getRequestDispatcher("listLivre.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("listLivre",livreDAO.findAll());
        request.getRequestDispatcher("listLivre.jsp").forward(request, response);
    }
}
