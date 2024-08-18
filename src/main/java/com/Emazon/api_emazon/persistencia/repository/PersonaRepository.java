package com.Emazon.api_emazon.persistencia.repository;

import com.Emazon.api_emazon.persistencia.entity.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends JpaRepository<PersonaEntity, Long> {
}
