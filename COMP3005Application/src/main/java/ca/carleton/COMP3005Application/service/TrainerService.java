package ca.carleton.COMP3005Application.service;

import ca.carleton.COMP3005Application.model.Trainer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class TrainerService {

    private Session session;
    Trainer trainer;

    public TrainerService(SessionFactory factory) {
        this.session = factory.getCurrentSession();
    }

    public boolean login(String email, String password) {
        session.beginTransaction();

        Query<Trainer> query = session.createQuery("from Trainer where email = :email and password = :password", Trainer.class);
        query.setParameter("email", email);
        query.setParameter("password", password);

        if(!query.list().isEmpty()) {
            trainer = query.uniqueResult();
            return true;
        }

        return false;
    }

    public void trainerHub() {

    }
}
