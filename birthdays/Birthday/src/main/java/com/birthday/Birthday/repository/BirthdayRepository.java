package com.birthday.Birthday.repository;

import com.birthday.Birthday.model.Birthday;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BirthdayRepository extends JpaRepository<Birthday, Integer> {

List<Birthday> findByNameContaining(String name);

}
