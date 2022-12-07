package org.pahappa.systems.Services;
import org.pahappa.systems.Model.Items;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Implements the TodoServices
 */
public class TodoServicesImp implements TodoServices {
    @Override
    public void addItem(Items item) {

        /**
         * Adding items in the database
         */
        String query = "INSERT INTO todo(idtodo, item, status) values('" + item.getId() + "','" +
                item.getItem() + "','" + item.getStatus() + "')";

        try{
            statement.executeUpdate(query);
            System.out.println("Item inserted successfully");

        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    /**
     * This is to delete an item from database
     * @param id
     */
    @Override
    public void deleteItem( int id){
        String query = "DELETE FROM todo WHERE idtodo ='" +id+"' ";

        try {
            if (statement.executeUpdate(query) != 0) {
                System.out.println("Deleted all tasks in the database !!!");
            } else {
                System.out.println("No tasks to delete !");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    @Override
    public void markDone(int id){
        String query = "UPDATE todo SET status ='"+true+ "' WHERE idtodo='"+id+"' ";

        try{
            statement.executeUpdate(query);
            System.out.println("Item marked done successfully ");

        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

    @Override
    public void showItems(){

        String query = "SELECT * FROM todo";

        try {
            ResultSet results = statement.executeQuery(query);
            while(results.next()){
                System.out.println();
                System.out.println("ID-> "+results.getInt("idtodo"));
                System.out.println("ITEM-> "+results.getString("item"));
                System.out.println("STATUS-> "+results.getString("status"));
                }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}