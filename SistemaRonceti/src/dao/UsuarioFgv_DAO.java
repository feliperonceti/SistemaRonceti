/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.UsuarioFgv;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Felipe Ronceti
 */
public class UsuarioFgv_DAO {

public Session session;
    private Object usuarioFgv;

public UsuarioFgv_DAO() {
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
       Criteria criteria = session.createCriteria(UsuarioFgv.class);
       criteria.add(Restrictions.eq("idusuario", id));
       List lista = criteria.list();
       session.getTransaction().commit();
       return lista.get(0);
       
    }

    public List listAll() {
        
       session.beginTransaction();
       Criteria criteria = session.createCriteria(UsuarioFgv.class);
       List lista = criteria.list();
       session.getTransaction().commit();
       return lista;
    }
    
   public UsuarioFgv fazerLogin(String apelido, String senha) {
         UsuarioFgv usuarioFgv = null;
        
        String url, user, password;
       //        url = "jdbc:mysql://10.7.0.51:33062/db_felipe_ronceti";
//        user = "felipe_ronceti";
//        password = "felipe_ronceti";

        url = "jdbc:mysql://127.0.0.1:3306/db_felipe_ronceti";
        user = "root";
        password = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection cnt = DriverManager.getConnection(url, user, password);

            String sql = "SELECT * FROM usuario_fgv WHERE apelido_fgv = ? AND senha_fgv = ?";
            java.sql.PreparedStatement pstm = cnt.prepareStatement(sql);
            pstm.setString(1, apelido);
            pstm.setString(2, senha);

            ResultSet rs = pstm.executeQuery();

            if (rs.next()) {
                usuarioFgv = new UsuarioFgv();
                usuarioFgv.setApelidoFgv(rs.getString("lipe"));
                usuarioFgv.setSenhaFgv(rs.getString("123"));
            }

            rs.close();
            pstm.close();
            cnt.close();

         } catch (ClassNotFoundException ex) {
            Logger.getLogger(UsuarioFgv_DAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioFgv_DAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return usuarioFgv;
    }
  

}

