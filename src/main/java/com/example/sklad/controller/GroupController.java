package com.example.sklad.controller;

import com.example.sklad.dto.GroupShortDto;
import com.example.sklad.entity.Group;
import com.example.sklad.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/sklad/group")
public class GroupController {

    @Autowired
    GroupService groupService;

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") UUID id) {
        groupService.deleteGroup(id);

        return "delete";
    }

    // do recursion
    @GetMapping("/get/all")
    public List<Group> getAll(){
       return groupService.findAll();
    }

    @GetMapping("/get/{id}")
    public Group getById(@PathVariable("id") UUID id){
        return groupService.findById(id);
    }

    @PostMapping("/post/add")
    public Group addNewGroup(@RequestBody GroupShortDto groupDto){
        Group group = new Group();
        group.setName(groupDto.getName());
        group.setDescription(groupDto.getDescription());
        return groupService.save(group);
    }


}
