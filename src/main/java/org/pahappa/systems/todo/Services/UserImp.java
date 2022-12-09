package org.pahappa.systems.todo.Services;
import org.hibernate.query.Query;
import org.pahappa.systems.todo.Models.User;
import org.pahappa.systems.todo.Services.UserServices;
import org.pahappa.systems.todo.config.HibernateConfiguration;
import org.hibernate.Session;
import java.sql.ResultSet;
public class UserImp implements UserServices {

    @Override
    public void register(User user){
        User savedUser = new User();
        try{
            Session session = HibernateConfiguration.getSessionFactory().openSession();
            session.beginTransaction();

            savedUser = session.merge(user);

            session.getTransaction().commit();
            session.close();

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public User login(String email, String password ){
            User user = new User();
        try{
            Session session = HibernateConfiguration.getSessionFactory().openSession();
            session.beginTransaction();

            Query query2 =  session.createQuery("from User where email ='"+ email +"'and password ='"+password+"'");
            query2.uniqueResult();

            Object result = query2.uniqueResult();
            if(result != null ){
                user = session.merge((User) result);

            }
            session.close();
            return user;
        }catch(Exception e){
            e.printStackTrace();
        }
        return user;
    }


}
