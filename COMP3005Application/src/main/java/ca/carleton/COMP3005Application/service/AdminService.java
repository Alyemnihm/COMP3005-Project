package ca.carleton.COMP3005Application.service;

import ca.carleton.COMP3005Application.model.Admin;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class AdminService {

    private Session session;
    Admin admin;

    public AdminService(SessionFactory factory) {
        this.session = factory.getCurrentSession();
    }

    public boolean login(String email, String password) {
        session.beginTransaction();

        Query<Admin> query = session.createQuery("from Admin where email = :email and password = :password", Admin.class);
        query.setParameter("email", email);
        query.setParameter("password", password);

        if(!query.list().isEmpty()) {
            admin = query.uniqueResult();
            return true;
        }

        return false;
    }

    public void adminHub() {

    }
}
