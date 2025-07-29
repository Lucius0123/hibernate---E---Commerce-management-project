package com.abc.dao;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.abc.model.Payment;
import com.abc.util.HibernateUtil;

public class PaymentDao {
    public void makePayment(Payment payment) {
        Transaction tx = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            tx = session.beginTransaction();
            session.save(payment);
            tx.commit();
        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }
}
