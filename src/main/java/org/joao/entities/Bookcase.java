package org.joao.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
@Entity
public class Bookcase extends PanacheEntity{
    public String description;
    @OneToOne
    public Category category;
    public Integer number;
}
