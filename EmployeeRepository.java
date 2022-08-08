package net.javaguides.springboot.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.Employee;

import java.util.List;
import java.util.Optional;

//interface servant d'intermédiaire entre l'API et la base de donées de données
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{


}
