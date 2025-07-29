package com.abc.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.abc.model.Order;
import com.abc.util.HibernateUtil;

public class OrderDao {
    public void placeOrder(Order order) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.save(order);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }
}
