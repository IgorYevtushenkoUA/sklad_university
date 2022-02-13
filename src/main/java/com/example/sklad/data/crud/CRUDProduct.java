package com.example.sklad.data.crud;

import com.example.sklad.entity.Product;
import com.example.sklad.service.ProductService;

import java.util.List;

public class CRUDProduct implements CRUD<Product, ProductService>{

    @Override
    public void create(List<Product> list, ProductService service) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, service.save(list.get(i)));
        }
    }

    @Override
    public void read(List<Product> list, ProductService service) {
        for (int i = 0; i < list.size(); i++) {
            service.findById(list.get(i).getId());
        }
    }

    @Override
    public void update(List<Product> list, ProductService service) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setDescription("new Description Product");
            list.set(i, service.save(list.get(i)));
        }
    }

    @Override
    public void delete(List<Product> list, ProductService service) {
        for (int i = 0; i < list.size(); i++) {
            service.deleteById(list.get(i).getId());
        }
    }
}
