package tn.esprit.dto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.dto.entities.Projet;

@Repository
public interface ProjetRepository extends JpaRepository<Projet, Long> {
}
