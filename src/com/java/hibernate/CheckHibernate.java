package com.java.hibernate;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class CheckHibernate {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        Session session = configuration.buildSessionFactory().openSession(); 
    }
}
