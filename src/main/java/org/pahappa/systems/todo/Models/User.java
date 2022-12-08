package org.pahappa.systems.todo.Models;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.*;
import org.pahappa.systems.todo.constants.gender;

@Entity
@Table(name="users")
public class User {
    private String id;
    private String name;
    private String email;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private gender gender;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id", nullable=false)
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

    public org.pahappa.systems.todo.constants.gender getGender() {
        return gender;
    }

    public void setGender(org.pahappa.systems.todo.constants.gender gender) {
        this.gender = gender;
    }
}
