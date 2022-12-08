package org.pahappa.systems.Services;
import org.pahappa.systems.Models.Items;

import java.sql.Statement;




interface TodoServices {

    DatabaseManager db_connection = new DatabaseManager();
    Statement statement = db_connection.db_connection();
     void addItem(Items item);
    void deleteItem( int id);
    void markDone(int id);
    void showItems();
}
