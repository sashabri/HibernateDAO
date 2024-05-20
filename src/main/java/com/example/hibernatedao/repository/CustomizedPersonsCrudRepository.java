package com.example.hibernatedao.repository;

import com.example.hibernatedao.entity.Man;
import com.example.hibernatedao.entity.Persons;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomizedPersonsCrudRepository extends JpaRepository<Persons, Man> {

    //List<Persons> findByCityOfLiving(String city);

    @Query("select p from Persons p where p.cityOfLiving = :city_of_living")
    List<Persons> findByCity(@Param("city_of_living") String city);

    @Query("select p from Persons p where p.man.age = :age")
    List<Persons> findByAge(Integer age, Sort sort);

    @Query("select p from Persons p where p.man.name = :name and p.man.surname = :surname")
    Optional<Persons> findByNameAndSurname(String name, String surname);
}
