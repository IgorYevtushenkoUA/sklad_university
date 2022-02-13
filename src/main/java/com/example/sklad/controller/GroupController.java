package com.example.sklad.controller;

import com.example.sklad.dto.GroupShortDto;
import com.example.sklad.entity.Group;
import com.example.sklad.exceptions.NotFoundByIdException;
import com.example.sklad.exceptions.NotUniqueNameException;
import com.example.sklad.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/sklad/group")
public class GroupController {

    @Autowired
    GroupService groupService;

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") UUID id) {
        if (groupService.findById(id) == null) throw new NotFoundByIdException();
        groupService.deleteById(id);
        return new ResponseEntity<>("Deleted successfully", HttpStatus.OK);
    }

    @GetMapping("/get/all")
    public List<Group> getAll() {
        return groupService.findAll();
    }

    @GetMapping("/get/{id}")
    public Group getById(@PathVariable("id") UUID id) {
        Group group = groupService.findById(id);
        if (group == null) throw new NotFoundByIdException();
        return group;
    }

    @PostMapping("/post/add")
    public Group addNewGroup(@RequestBody GroupShortDto groupDto) {
        boolean isNotUniqueName = groupService.findAll().stream()
                .anyMatch(g -> g.getName().equals(groupDto.getName()));
        if (isNotUniqueName) throw new NotUniqueNameException();
        return groupService.save(Group.builder()
                .name(groupDto.getName())
                .description(groupDto.getDescription())
                .build());
    }

}
