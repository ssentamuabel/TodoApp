package org.pahappa.systems.todo.Models;

import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;


/**
 * this is the model for the values.
 */
@Entity
@Table(name="todos")
public class Item {
    private String id;
    private String item;
    private Boolean status ;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="uuid")
    @GenericGenerator(name="uuid", strategy="uuid2")
    public String getId(){
        return id;
    }

    @Column(name="Item", length=255)
    public String getItem(){
        return item;
    }

    @Column(name="status", length=20)
    public Boolean getStatus(){
        return status;
    }

    public void setId(String  id){
        this.id = id;
    }
    public void setItem(String item){

        this.item = item;
    }
    public void setStatus(Boolean value){

        this.status = value;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id='" + id + '\'' +
                ",item='" + item + '\'' +
                ",status=" + status +
                '}';
    }

}
