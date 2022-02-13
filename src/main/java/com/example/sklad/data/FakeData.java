package com.example.sklad.data;

import com.example.sklad.entity.Group;
import com.example.sklad.entity.Product;
import com.example.sklad.entity.Storage;

import java.util.ArrayList;
import java.util.List;

public class FakeData {

    private List<Group> groups;
    private List<Product> products;

    public List<Group> setGroups(int size) {
        groups = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            Group group = Group.builder()
                    .name("name" + i)
                    .description("description")
                    .build();
            groups.add(group);
        }
        return groups;
    }

    public List<Group> getGroups() {
        return this.groups;
    }


    public List<Product> setProducts(int size) {
        products = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Product product = Product.builder()
                    .group(groups.get((int) (Math.random() * groups.size())))
                    .description("description")
                    .producer("producer")
                    .price(1)
                    .build();
            products.add(product);
        }
        return products;
    }

    public List<Product> getProducts(){return this.products;}

    public List<Storage> setStorages(int size){
        return null;
    }


}
