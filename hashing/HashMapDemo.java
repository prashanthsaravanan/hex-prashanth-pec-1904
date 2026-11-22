package hashing;

import java.util.*;

public class HashMapDemo {

    Map<String, String> map = new HashMap<>();

    public HashMapDemo(){
        map.put("rutu","csk@123");
        map.put("hp","pbks@123");

    }
    public String validateEntry(String name, String password) {
        String originalpswd = map.get(name);
        if(originalpswd.equals(password)){
//            System.out.println("entered the valid email and password");
            return "valid";
        }else {
//            System.out.println("invalid password ...........");
            return "invalid";
        }
    }
}
