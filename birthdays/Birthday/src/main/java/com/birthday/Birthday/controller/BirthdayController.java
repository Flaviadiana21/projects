package com.birthday.Birthday.controller;

import com.birthday.Birthday.model.Birthday;
import com.birthday.Birthday.service.BirthdayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin
@RequestMapping(value = "/api")
public class BirthdayController {

    @Autowired
    BirthdayService birthdayService;

    //REST API - expune functionalitati backend
    // HTTP METHODS:
    // GET - obtii date
    // POST - adaugi date
    // PUT - update date
    // DELETE - delete date

    // Adnotari
    // param: localhost:8080/api/birthdays?name=Ana
    // pathvariable: localhost:8080/api/birthdays/30
    // body: localhost:8080/api/birthdays
    //{
     // "name": "Ana"
    //"day": "5 martie"
    //}


    @GetMapping("/birthdays")
    public List<Birthday> getAllBirthdays(@RequestParam(required = false) String name){
        return birthdayService.getAllBirthdays(name);
    }

    @PostMapping("/birthdays")
    public Birthday createBirthday(@RequestBody Birthday birthday){
        return birthdayService.createBirthday(birthday);
    }

    @PutMapping("/birthdays/{id}")
    public Birthday updateBirthday(@PathVariable("id") Integer id, @RequestBody Birthday birthday){
        return birthdayService.updateBirthday(id,birthday);
    }

    @DeleteMapping("birthdays/{id}")
    public void deleteBirthdayById(@PathVariable("id") Integer id){
        birthdayService.deleteBirthdayById(id);
    }





}
