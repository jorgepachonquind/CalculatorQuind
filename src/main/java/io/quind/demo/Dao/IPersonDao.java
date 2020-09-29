package io.quind.demo.Dao;


import io.quind.demo.Domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonDao  extends JpaRepository<Person,Long> {

}
