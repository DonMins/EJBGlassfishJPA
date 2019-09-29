package com.devcolibri.bean;

import com.devcolibri.entity.Book;

import javax.ejb.Stateless;
import javax.persistence.*;
import java.util.List;
//
@Stateless(name = "UserBean")
public class UserBean {

    private EntityManager em = Persistence.createEntityManagerFactory("hibernate.ejb.entitymanager_factory_name").createEntityManager();
//    @PersistenceContext(unitName = "zxcvbnm")
//    public EntityManager em;

    public void add(Book book){

        em.persist(book);
    }

    public List<Book> getAll() {
        System.out.println("JPA ----------- getAll");
        Query query = em.createQuery("SELECT e FROM Book e");
        return query.getResultList();
    }

}
