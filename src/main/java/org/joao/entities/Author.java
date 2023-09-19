package org.joao.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
@Entity
public class Author extends PanacheEntity{
    public String name;
    public String biography;
}
