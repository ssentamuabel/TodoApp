package org.pahappa.systems.Models;

/**
 * this is the model for the values.
 */
public class Items {
    private int id;
    private String item;
    private Boolean status ;

    public int getId(){
        return id;
    }

    public String getItem(){
        return item;
    }
    public Boolean getStatus(){
        return status;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setItem(String item){

        this.item = item;
    }
    public void setStatus(Boolean value){

        this.status = value;
    }
}
