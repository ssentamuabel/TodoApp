package org.example.Services;
import org.example.Services.TodoServices;
import org.example.Model.Items;
import java.util.ArrayList;
import java.util.List;


public class TodoServicesImp implements TodoServices {
    public static List<Items> itemList = new ArrayList<Items>();
    public static List<Items> cloned_list = new ArrayList<Items>();


    @Override
    public void addItem(Items item) {
        itemList.add(item);
    }

    @Override
    public void deleteItem( int id){
        cloned_list.addAll(itemList);
        int idOf=0;

        for(Items t: cloned_list){
            if(t.getId() == id){
                System.out.println();
                System.out.println("Item deleted successfully. ");
                idOf = cloned_list.indexOf(t);

            }
        }
        itemList.remove(idOf);

    }

    @Override
    public void markDone(int id){

        cloned_list.addAll(itemList);
        int idOf=0;

        for(Items t: cloned_list){
            if(t.getId() == id){
               idOf = cloned_list.indexOf(t);
            }
        }
        itemList.get(idOf).setStatus(true);
    }

    @Override
    public void showItems(){
        for(Items t: itemList ){
            System.out.println(t.getId() +"-"+ t.getItem() + "-"+ t.getStatus());

        }
    }
}