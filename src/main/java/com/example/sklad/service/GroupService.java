package com.example.sklad.service;

import com.example.sklad.entity.Group;
import com.example.sklad.repository.GroupRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
@AllArgsConstructor
public class GroupService {

    final GroupRepository groupRepository;

    public void deleteGroup(UUID id) {
        groupRepository.deleteById(id);
    }

    public List<Group> findAll() {
        return groupRepository.findAll();
    }

    public Group save(Group group) {
        return groupRepository.save(group);
    }

    public Group findById(UUID id) {
        return groupRepository.findById(id).orElse(null);
    }
}
