package ru.Budeanski.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.Budeanski.spring.models.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {

}
