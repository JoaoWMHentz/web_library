package org.joao.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
@Entity
public class CollectionItem extends PanacheEntity{
    public String barCode;
    public Book book;
    public Bookcase bookcase;
    public Integer status;

    
}
