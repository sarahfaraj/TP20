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

@WebServlet(name = "DeleteServlet" ,urlPatterns = "/DeleteServlet")
public class DeleteServlet extends HttpServlet {

    @EJB
    MusiqueDAO musiqueDAO;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id =Integer.parseInt( request.getParameter("delet"));
        musiqueDAO.deletId(id);
        response.sendRedirect("FindAllServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
