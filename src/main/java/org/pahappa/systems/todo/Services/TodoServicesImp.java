package org.pahappa.systems.todo.Services;
import jakarta.persistence.criteria.CriteriaQuery;
import org.pahappa.systems.todo.Models.Item;

import org.hibernate.Session;
import org.pahappa.systems.todo.config.HibernateConfiguration;

import java.util.ArrayList;
import java.util.List;

/**
 * Implements the TodoServices
 */
public class TodoServicesImp implements TodoServices {
    @Override
    public void addItem(Item item) {

        /**
         * Adding items in the database
         */
        Item savedItem = new Item();

        try{

            Session session = HibernateConfiguration.getSessionFactory().openSession();
            session.beginTransaction();

            savedItem = session.merge(item);

            session.getTransaction().commit();
            session.close();

        } catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * This is to delete an item from database
     * @param id
     */
    @Override
    public void deleteItem( String id){



    }

    @Override
    public void markDone(String id){

    }

    @Override
    public List<Item> showItems(String ownerId){

        List<Item> items = new ArrayList<>();

        try{
            Session session = HibernateConfiguration.getSessionFactory().openSession();
            session.beginTransaction();

            CriteriaQuery<Item> criteriaQuery = session.getCriteriaBuilder().createQuery(Item.class);
            criteriaQuery.from(Item.class);

            


            session.getTransaction().commit();
            session.close();

        }catch(Exception e){
            e.printStackTrace();
        }

        return items;
    }
}