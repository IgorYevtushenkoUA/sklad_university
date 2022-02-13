package com.example.sklad.data.crud;

import java.util.List;

public interface CRUD<T, K> {

    void create(List<T> list, K service);

    void read(List<T> list, K service);

    void update(List<T> list, K service);

    void delete(List<T> list, K service);

}
