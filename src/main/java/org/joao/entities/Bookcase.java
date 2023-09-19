package org.joao.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
@Entity
public class Bookcase extends PanacheEntity{
    public String description;
    public Category category;
    public Integer number;
}
