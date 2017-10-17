package com.demo.hbm;

import com.demo.hbm.common.HibernateUtil;
import org.hibernate.Session;

import java.util.Date;

/**
 * Created by rahul on 17/10/17.
 */
public class HbmMain {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        User user = new User();
        user.setUsername("rahul");
        user.setCreatedBy("system");
        user.setCreatedDate(new Date());
        session.save(user);
        session.getTransaction().commit();
        System.out.println("Saved user: " + user);
        session.close();
    }
}
