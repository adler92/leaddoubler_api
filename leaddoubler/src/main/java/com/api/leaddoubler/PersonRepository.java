package com.api.leaddoubler;

import org.springframework.data.jpa.repository.JpaRepository;
//Person class <"table navn den leder efter", Long>
public interface PersonRepository extends JpaRepository<Person, Long> {
}
