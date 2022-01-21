package com.example.sklad.controller;

import com.example.sklad.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/sklad")
public class GroupController {


    @Autowired
    GroupService groupService;

    @DeleteMapping("/product/{id}")
    public String delete(@PathVariable("id") UUID id) {
        groupService.deleteGroup(id);

        return "delete";
    }

}
