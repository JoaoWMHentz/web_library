package org.joao.entities;

import java.sql.Date;

import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Loan extends PanacheEntity{
    @OneToMany
    public List<CollectionItem> collectionItems;
    @OneToOne
    public User user;
    public Date issueDate;
    public Date returnDate;
}
