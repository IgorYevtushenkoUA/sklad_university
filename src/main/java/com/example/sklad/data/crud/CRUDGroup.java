package com.example.sklad.data.crud;

import com.example.sklad.entity.Group;
import com.example.sklad.service.GroupService;

import java.util.List;

public class CRUDGroup implements CRUD<Group, GroupService> {

    @Override
    public void create(List<Group> list, GroupService service) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, service.save(list.get(i)));
        }
    }

    @Override
    public void read(List<Group> list, GroupService service) {
        for (int i = 0; i < list.size(); i++) {
            service.findById(list.get(i).getId());
        }
    }

    @Override
    public void update(List<Group> list, GroupService service) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).setDescription("new Description");
            list.set(i, service.save(list.get(i)));
        }
    }

    @Override
    public void delete(List<Group> list, GroupService service) {
        for (int i = 0; i < list.size(); i++) {
            service.deleteById(list.get(i).getId());
        }
    }
}
