package modeles;

import javax.annotation.Resource;
import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.transaction.UserTransaction;


@WebListener
public class StartupListener implements ServletContextListener {

   @EJB
   MusiqueDAO musiqueDAO;

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
            System.out.println("Starting up!");
            Musique musique=new Musique("toto","tata",85);
           // musiqueDAO.creat(musique);
            System.out.println(musique);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
