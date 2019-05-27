package servlet;

import modeles.MusiqueDAO;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FindAllServlet",urlPatterns = "/FindAllServlet")
public class FindAllServlet extends HttpServlet {
    @EJB
    MusiqueDAO musiqueDAO;
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("listMusique",musiqueDAO.findAll());
        request.setAttribute("id",Integer.parseInt(request.getParameter("modif")));
        request.getRequestDispatcher("list.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("listMusique",musiqueDAO.findAll());
        request.getRequestDispatcher("list.jsp").forward(request, response);
    }
}
