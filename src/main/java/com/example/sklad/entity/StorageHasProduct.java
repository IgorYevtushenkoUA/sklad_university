package com.example.sklad.entity;

import com.example.sklad.entity.embeddable.StorageProductKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Table(name="_storage_has_product")
public class StorageHasProduct {

    @EmbeddedId
    StorageProductKey id;

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @MapsId("productUUID")
    Product product;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @MapsId("storageUUID")
    Storage storage;

    @Column(name="number")
    private int number;

}