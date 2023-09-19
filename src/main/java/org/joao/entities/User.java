package org.joao.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
@Entity
public class User extends PanacheEntity{
    public String userName;
    public String name;
    public String lastName;
    public String email;
    public String password;
    public String saltKey;
    public String cpf;
    public String rule;
}
