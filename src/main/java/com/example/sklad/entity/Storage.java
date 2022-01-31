package com.example.sklad.entity;

import com.example.sklad.entity.base.BaseEntity;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Table(name="storages")
public class Storage extends BaseEntity {

    @Column(name="name")
    private String name;

    @Column(name="location")
    private String location;

    @OneToMany(mappedBy = "storage", cascade = {CascadeType.ALL})
    List<StorageHasProduct> storageHasProductList;
}