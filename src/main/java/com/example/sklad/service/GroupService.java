package com.example.sklad.service;

import com.example.sklad.repository.GroupRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
@Transactional
@AllArgsConstructor
public class GroupService {

    final GroupRepository groupRepository;

    public void deleteGroup(UUID id) {
        System.out.println("we are in service delete group");
        groupRepository.deleteById(id);
        System.out.println("we are here");
    }


}
