package com.abc.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.abc.model.Product;
import com.abc.util.HibernateUtil;

public class ProductDao {
    public void saveProduct(Product product) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.save(product);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }
}
