package modeles;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class LivreDAO {
    @PersistenceContext
    EntityManager em;

    public LivreDAO(){}

    public Livre creat(Livre livre){
        em.persist(livre);
        return livre;
    }
    public List<Livre> findAll(){
        String requete="Select l From Livre as l";
        Query query = em.createQuery(requete);
        return query.getResultList();
    }

    public void deletId(int id){
        String requete="delete From Livre as l " +
                "where l.id = "+id;
        Query query=em.createQuery(requete);
        int nbEntitesModi = query.executeUpdate();
    }

    public void modifierLivre(Livre livre, int id) {
        String ordre = "update Livre l set l.auteur = :auteur,l.titre = :titre " +
                "where l.id="+id;
        Query q = em.createQuery(ordre);
        q.setParameter("auteur",livre.getAuteur());
        q.setParameter("titre",livre.getTitre());
        int nbEntitesModif = q.executeUpdate();
    }

}
