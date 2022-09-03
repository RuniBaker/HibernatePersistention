package entity;

import config.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ActiveUser {

    public void save() {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(this);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void update(int ID, String name, String last_name, int age, String adress, double income) {

        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.getTransaction().begin();
            Query query = session.createQuery("UPDATE User " +
                    "SET " +
                    " name = :name, " +
                    "    last_name = :lastname," +
                    "    age = :age, " +
                    "    adress = :adress, " +
                    "    income = :income"  +
                    " WHERE user_id = :ID ");
            query.setParameter("ID", ID);
            query.setParameter("name", name);
            query.setParameter("lastname", last_name);
            query.setParameter("age", age);
            query.setParameter("adress", adress);
            query.setParameter("income", income);
            query.executeUpdate();
            session.getTransaction().commit();
        } catch (HibernateException e) {
            System.err.println(e.getMessage());
        }
    }
    public static void delete(int ID){

        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.getTransaction().begin();
            Query query =  session.createQuery("DELETE from User where user_id = :ID");
            query.setParameter("ID", ID);
            query.executeUpdate();
            session.getTransaction().commit();
        }catch (HibernateException e) {
            System.err.println(e.getMessage());
        }
    }
    public static List<User> loadAll(){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.getTransaction().begin();
            Query query = session.createQuery("from User");
            session.getTransaction().commit();
            return query.list();
        }catch (HibernateException e) {
            System.err.println(e.getMessage());
            return Collections.EMPTY_LIST;
        }
    }

    public static List<User> loadbyAge(int age){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.getTransaction().begin();
            Query query = session.createQuery("from User where age = :age");
            query.setParameter("age", age);
            session.getTransaction().commit();
            return query.list();
        }catch (HibernateException e) {
            System.err.println(e.getMessage());
            return Collections.EMPTY_LIST;
        }
    }

    public static List<User> loadbyName(String name){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.getTransaction().begin();
            Query query = session.createQuery("from User where name = :name");
            query.setParameter("name", name);
            session.getTransaction().commit();
            return query.list();
        }catch (HibernateException e) {
            System.err.println(e.getMessage());
            return Collections.EMPTY_LIST;
        }
    }

}
