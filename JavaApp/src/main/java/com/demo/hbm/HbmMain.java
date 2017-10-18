package com.demo.hbm;

import com.demo.hbm.common.HibernateUtil;
import org.hibernate.Session;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by rahul on 17/10/17.
 */
public class HbmMain {

    static Session session = HibernateUtil.getSessionFactory().openSession();

    public static void main(String[] args) {
        session.beginTransaction();
//        addUser();
//        listUsers();
//        updateUser();
        deleteUser();
        session.getTransaction().commit();
        session.close();
    }

    public static void addUser() {
        User user = new User();
        user.setUsername("rahul");
        user.setCreatedBy("system");
        user.setCreatedDate(new Date());
        session.save(user);
        System.out.println("Saved user: " + user);
    }

    public static void listUsers() {
        List users = session.createQuery("FROM User").list();
        for (Iterator iterator = users.iterator(); iterator.hasNext(); ) {
            User user = (User) iterator.next();
            System.out.println("Username: " + user.getUsername());
        }
    }

    public static void updateUser() {
        User user = (User) session.get(User.class, 1);
        System.out.println("User found : " + user);
        user.setUsername("Rahul-".concat(new Date().toString()));
        session.update(user);
    }

    public static void deleteUser() {
        User user = (User) session.get(User.class, 1);
        System.out.println("Deleting User: " + user);
        session.delete(user);
    }
}
