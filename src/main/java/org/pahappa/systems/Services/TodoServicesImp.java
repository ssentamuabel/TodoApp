package org.pahappa.systems.Services;
import org.pahappa.systems.Model.Items;

import java.sql.ResultSet;
import java.sql.SQLException;
public class TodoServicesImp implements TodoServices {
    @Override
    public void addItem(Items item) {
        String query = "INSERT INTO todo(idtodo, item, status) values('" + item.getId() + "','" +
                item.getItem() + "','" + item.getStatus() + "')";

        try{
            statement.executeUpdate(query);
            System.out.println("Item inserted successfully");

        } catch(SQLException e){
            throw new RuntimeException(e);
        }
    }

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

    }

    @Override
    public Items showItems(){

        String query = "SELECT * FROM todo";

        try {
            if (statement.executeUpdate(query) != 0) {

                Items item = new Items();



               
                return item;
            } else {
                System.out.println("No tasks to delete !");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}