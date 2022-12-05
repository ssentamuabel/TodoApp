package org.example.Services;
import org.example.Model.Items;

interface TodoServices {
    public void addItem(Items item);
    public void deleteItem( int id);
    public void markDone(int id);
    public void showItems();
}
