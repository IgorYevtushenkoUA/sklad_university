package com.example.sklad.entity;

import com.example.sklad.entity.base.BaseEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@Table(name = "groups")
@Builder
public class Group extends BaseEntity {

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "description")
    private String description;

    //    @JsonIgnore
    @JsonManagedReference
    @OneToMany(mappedBy = "group", cascade = {CascadeType.REMOVE})
    private List<Product> productList = new ArrayList<>();

}