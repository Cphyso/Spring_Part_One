package com.partOne.PartOne.service;

public interface UserService {
    void addUser(String name, String surname, long id);
    void removeUser(long id);
    void getUser(long id);
}
