package com.example.sklad.entity;


import com.example.sklad.entity.embeddable.OrderProductKey;
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
@Table(name = "order_has_product")
public class OrderHasProduct {

    @EmbeddedId
    OrderProductKey id;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @MapsId("orderUUID")
    Order order;

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
