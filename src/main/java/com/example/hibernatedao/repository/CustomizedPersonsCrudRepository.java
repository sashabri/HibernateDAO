package com.example.hibernatedao.repository;

import com.example.hibernatedao.entity.Man;
import com.example.hibernatedao.entity.Persons;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomizedPersonsCrudRepository extends JpaRepository<Persons, Man> {

    List<Persons> findByCityOfLiving(String city);

    List<Persons> findByMan_AgeLessThan(Integer man_age, Sort sort);

    Optional<Persons> findByMan_NameAndMan_Surname(String man_name, String man_surname);
}
