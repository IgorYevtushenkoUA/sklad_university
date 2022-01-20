package com.example.sklad.entity;

import com.example.sklad.entity.base.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.sql.Timestamp;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Table(name = "booked_product")
public class BookedProduct extends BaseEntity {

    @Column(name = "client_uuid")
    private UUID clientUUID;

    @Column(name = "product_uuid")
    private UUID productUUID;

    @Column(name = "storage_uuid")
    private UUID storageUUID;

    @Column(name = "number")
    private int number;

    @Column(name = "order_time")
    private Timestamp orderTime;

    @Column(name = "order_time_end")
    private Timestamp orderTimeEnd;

}
