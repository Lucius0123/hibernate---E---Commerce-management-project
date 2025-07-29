package com.abc.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.abc.model.Cart;
import com.abc.util.HibernateUtil;

public class CartDao {
    public void addToCart(Cart cart) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.save(cart);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }
}
