package com.abc.dao;

import com.abc.model.User;
import com.abc.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDao {
    public void saveUser(User user) {
        Transaction transaction = null;
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();

            session.save(user);  // Save the user
            transaction.commit();

        } catch (Exception e) {
            if (transaction != null && transaction.getStatus().canRollback()) {
                try {
                    transaction.rollback();
                } catch (IllegalStateException ise) {
                    System.err.println("Transaction already closed.");
                }
            }
            e.printStackTrace();

        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }
}
