package org.pahappa.systems.todo.Models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;
import org.pahappa.systems.todo.constants.Gender;

import java.util.Set;

@Entity
@Table(name="users")
public class User {
    private String id;
    private String name;
    private String email;

    public Set<Item> getItems() {
        return Items;
    }

    public void setItems(Set<Item> items) {
        Items = items;
    }

    private String password;

    @OneToMany(mappedBy = "users", cascade= CascadeType.ALL)
    private Set<Item> Items;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private Gender gender;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator="uuid")
    @GenericGenerator(name="uuid", strategy="uuid2")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
