package com.example.sklad.entity;

import com.example.sklad.entity.embeddable.StorageProductKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Table(name="storage_has_product")
public class StorageHasProduct {

    @EmbeddedId
    StorageProductKey id;

    @ManyToOne
    @MapsId("productUUID")
    Product product;

    @ManyToOne
    @MapsId("storageUUID")
    Storage storage;

    @Column(name="number")
    private String number;

}
