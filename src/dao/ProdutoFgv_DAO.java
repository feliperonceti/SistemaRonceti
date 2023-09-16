/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.ProdutoFgv;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Felipe Ronceti
 */
public class ProdutoFgv_DAO {

public Session session;

public ProdutoFgv_DAO() {
SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
session = sessionFactory.openSession();
}

    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }
    

    public void update(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.update(object);
        session.getTransaction().commit();
    }

    public void delete(Object object) {
        session.beginTransaction();
         session.flush();
         //flush: grava as informaçoes
        session.clear();
        //clear: limpa tudo
        session.delete(object);
        session.getTransaction().commit();
    }

    public Object list(int id) {
       session.beginTransaction();
       Criteria criteria = session.createCriteria(ProdutoFgv.class);
       criteria.add(Restrictions.eq("idproduto", id));
       List lista = criteria.list();
       session.getTransaction().commit();
       return lista.get(0);
       
    }

    public List listAll() {
        
       session.beginTransaction();
       Criteria criteria = session.createCriteria(ProdutoFgv.class);
       List lista = criteria.list();
       session.getTransaction().commit();
       return lista;
    }
    
}


