package model;

import entities.User;

import java.util.HashMap;
import java.util.Map;

public class UserModel {
    static Map<String,String> list = new HashMap<>();

    static {
        list.put("test@gmail.com","123");
        list.put("abc@gmail.com","321");
    }

    public User checkLogin(String email,String password) {
        if(list.get(email) == null) return null;

        if(password != null && list.get(email).equalsIgnoreCase(password)) {
            return new User(email,email);
        }
        return null;
    }

}
