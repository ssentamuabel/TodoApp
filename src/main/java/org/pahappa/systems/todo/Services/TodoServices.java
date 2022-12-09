package org.pahappa.systems.todo.Services;
import org.pahappa.systems.todo.Models.Item;

import java.util.List;


public interface TodoServices {


     void addItem(Item item);
    void deleteItem( String id);
    void markDone(String id);
    List<Item> showItems(String ownerId);
}
