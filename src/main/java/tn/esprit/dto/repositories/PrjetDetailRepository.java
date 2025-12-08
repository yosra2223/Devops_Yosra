package tn.esprit.dto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.dto.entities.ProjetDetail;

@Repository
public interface PrjetDetailRepository  extends JpaRepository<ProjetDetail, Long> {
}
