package modeles;

import modeles.Musique;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class MusiqueDAO {
    @PersistenceContext
    EntityManager em;

    public MusiqueDAO() {
    }
    public  Musique creat(Musique musique){
        em.persist(musique);
        return musique;
    }

    public List<Musique> findAll(){
        String requete="Select m From Musique as m";
        Query query = em.createQuery(requete);
        return query.getResultList();
    }

    public void deletId(int id){
        String requete="delete From Musique as m " +
                "where m.id = "+id;
        Query query=em.createQuery(requete);
        int nbEntitesModi = query.executeUpdate();
    }
}
