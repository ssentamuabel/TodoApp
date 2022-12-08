package org.pahappa.systems.todo.Services;
import org.pahappa.systems.todo.Models.Item;





interface TodoServices {


     void addItem(Item item);
    void deleteItem( int id);
    void markDone(int id);
    void showItems();
}
