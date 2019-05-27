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
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "CreateMusiqueServlet" ,urlPatterns = "/CreatMusiqueServlet")
public class CreateMusiqueServlet extends HttpServlet {
    @EJB
    MusiqueDAO musiqueDAO;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();

        String artiste=request.getParameter("artiste");
        String titre=request.getParameter("titre");
        int duree=Integer.parseInt(request.getParameter("duree"));
        Musique musique=new Musique(titre,artiste,duree);
        musiqueDAO.creat(musique);
        response.sendRedirect("FindAllServlet");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
