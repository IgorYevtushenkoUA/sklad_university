package com.example.sklad.entity;

import com.example.sklad.entity.base.BaseEntity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Table(name = "products")
public class Product extends BaseEntity {

    @Column(name = "name", unique = true)
    private String name;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "group_id")
    @JsonBackReference
    private Group group;

    @Column(name = "description")
    private String description;

    @Column(name = "producer")
    private String producer;

    @Column(name = "price")
    private double price;

    @OneToMany(mappedBy = "product", cascade = {CascadeType.ALL})
    List<StorageHasProduct> storageHasProductList;

    @OneToMany(mappedBy = "product", cascade = {CascadeType.ALL})
    List<BookedProduct> bookedProductList;

}