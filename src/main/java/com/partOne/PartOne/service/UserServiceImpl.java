package com.partOne.PartOne.service;

import com.partOne.PartOne.repository.FakeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class UserServiceImpl implements UserService{

    public UserServiceImpl(){}

    @Autowired
    FakeRepo repo;

    @Override
    public void addUser(String name, String surname, long id) {
        System.out.println(repo.insertUser(id,name,surname));
    }

    @Override
    public void removeUser(long id) {
        System.out.println(repo.deleteUser(id));
    }

    @Override
    public void getUser(long id) {
        System.out.println(repo.findUserById(id));
        }

    public int countUsers() {
       return repo.countUsersInRepo();
    }
}
