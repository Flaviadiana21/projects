package com.birthday.Birthday.service;

import com.birthday.Birthday.model.Birthday;
import com.birthday.Birthday.repository.BirthdayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class BirthdayService {

    @Autowired
    BirthdayRepository birthdayRepository;

    // CRUD - create, read, update and delete

    public List<Birthday> getAllBirthdays(String name){

        List<Birthday> birthdays = new ArrayList<>();

        if(name==null){
            birthdays.addAll(birthdayRepository.findAll());
        }
        else{
            birthdays.addAll(birthdayRepository.findByNameContaining(name));
        }

        return birthdays;
    }

    public Birthday createBirthday(Birthday birthday){
        return birthdayRepository.save(new Birthday(birthday.getName(), birthday.getDay()));
    }

    public void deleteBirthdayById(Integer id){
        birthdayRepository.deleteById(id);
    }

    public Birthday updateBirthday(Integer id, Birthday birthdayObject){

        Optional<Birthday> birthdayData = birthdayRepository.findById(id);

        if(birthdayData.isPresent()){
            Birthday modifiedBirthday = birthdayData.get();
            modifiedBirthday.setName(birthdayObject.getName());
            modifiedBirthday.setDay(birthdayObject.getDay());
            return birthdayRepository.save(modifiedBirthday);
        }
        else{
            return null;
        }



    }





}
