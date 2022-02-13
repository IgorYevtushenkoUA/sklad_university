package com.example.sklad.entity;

import com.example.sklad.entity.base.BaseEntity;
import com.example.sklad.enums.OrderStatus;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Table(name="_orders")
public class Order extends BaseEntity {

    @Column(name = "client_uuid")
//    @Type(type = "uuid-char")
//    @NotNull
    private UUID clientUUID;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private OrderStatus status;




}