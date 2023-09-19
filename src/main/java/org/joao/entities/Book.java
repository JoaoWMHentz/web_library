package org.joao.entities;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
@Entity
public class Book extends PanacheEntity{
    public String title;
    public String subTitle;
    public String description;
    @OneToOne()
    public Category category;
    @OneToOne()
    public Author author;
}
