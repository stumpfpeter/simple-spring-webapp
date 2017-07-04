package com.folder;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.*;

import static java.util.UUID.randomUUID;

@RestController
public class StumpfController {

    @RequestMapping("/stumpf")
    public String whoIsTheKing() {
        return "Stumpf";
    }

    @RequestMapping("/stumpf/list")
    public List<String> list() {
        List<String> listOfString = new ArrayList<String>();
        listOfString.add("One");
        listOfString.add(randomUUID().toString());
        listOfString.add(LocalDateTime.now().toString());
        return listOfString;
    }

    @RequestMapping("/stumpf/map")
    public Map<String, String> map() {
        Map<String, String> map = new HashMap<>();
        map.put("A", UUID.randomUUID().toString());
        map.put("B", "Hello!");
        return map;
    }

    @RequestMapping("/stumpf/employee")
    public Employee employee() {
        return new Employee("Stumpf");
    }

}
