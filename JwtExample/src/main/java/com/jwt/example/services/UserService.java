package com.jwt.example.services;
import com.jwt.example.models.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Service
public class UserService {
    public List<User> store=new ArrayList<>();
    public UserService() {
        store.add(new User(UUID.randomUUID().toString(),"Subin Roushan","rsubin8340@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Hritik Roushan","rritik8340@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Raj Shrivastav","raj8340@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(),"Jay lily","jay8340@gmail.com"));
    }
    public List<User> getStore()
    {
        return store;
    }
}
