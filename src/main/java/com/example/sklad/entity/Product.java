package com.example.sklad.entity;

import com.example.sklad.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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

    @Column(name = "name")
    private String name;

    @Column(name="group_uuid")
    private UUID productGroupUUID;

    @Column(name = "description")
    private String description;

    @Column(name = "producer")
    private String producer;

    @Column(name = "price")
    private double price;

    @OneToMany(mappedBy = "product")
    List<StorageHasProduct> storageHasProductList;
}
