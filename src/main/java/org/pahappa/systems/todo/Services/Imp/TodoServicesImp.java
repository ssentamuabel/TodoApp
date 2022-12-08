package org.pahappa.systems.todo.Services;
import org.pahappa.systems.todo.Models.Item;

import org.hibernate.Session;
import org.pahappa.systems.todo.config.HibernateConfiguration;
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
    public void deleteItem( int id){



    }

    @Override
    public void markDone(int id){

    }

    @Override
    public void showItems(){


    }
}