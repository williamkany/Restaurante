package br.com.ezzysoft.restaurante.dao;

//import br.com.ezzysoft.restaurante.bean.DAO;
import br.com.ezzysoft.restaurante.entidade.Produto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Christian Medeiros <christian.souza@gmail.com>
 */
public class ProdutoDAO {// implements DAO<Produto>{

//    @Override
//    public EntityManager getEM() {
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("Ezzysoft_RestaurantePU");
//        return factory.createEntityManager();
//    }
//    
//    @Override
//    public Produto findById(Long id) {
//        EntityManager em = getEM();
//        Produto produto = null;
//        try {
//            produto = em.find(Produto.class, id); //select
//        } finally {
//            em.close();
//        }
//        return produto;
//    }
//
//    @Override
//    public Produto save(Produto p) throws Exception {
//        
//        EntityManager em = getEM();
//        try {
//            em.getTransaction().begin();
//            if (p.getId() == null) {
//                em.persist(p); // insert    
//            } else {
//                if (!em.contains(p)) {
//                    if (em.find(Produto.class, p.getId()) == null) {
//                        throw new Exception("Erro ao atualizar a unidade!");
//                    }
//                }
//                p = em.merge(p); // update
//            }
//            em.getTransaction().commit();
//        } finally {
//            em.close();
//        }
//        return p;
//    }
//
//    @Override
//    public void remove(Long id) {
//        EntityManager em = getEM();
//        Produto produto = em.find(Produto.class, id);
//        try {
//            em.getTransaction().begin();
//            em.remove(produto); // delete
//            em.getTransaction().commit();
//        } finally {
//            em.close();
//        }
//    }
//
//    @Override
//    public List<Produto> listAll() {
//        EntityManager em = getEM();
//        try {
//            em.getTransaction().begin();
//            Query q = em.createQuery("SELECT p FROM Produto p");
//            return q.getResultList();
//        } finally {
//            em.close();
//        }
//    }
    
}