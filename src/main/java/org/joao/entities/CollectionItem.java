package org.joao.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
@Entity
public class CollectionItem extends PanacheEntity{
    public String barCode;
    @OneToOne
    public Book book;
    @OneToOne
    public Bookcase bookcase;
    public Integer status;
}