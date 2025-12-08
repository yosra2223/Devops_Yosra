package tn.esprit.dto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.dto.Dto.ProjetDetailDto;
import tn.esprit.dto.entities.ProjetDetail;
import tn.esprit.dto.repositories.PrjetDetailRepository;

import java.time.format.DateTimeFormatter;

import static java.lang.String.format;

@Service
public class ProjetDetailService {

    @Autowired
    PrjetDetailRepository projetDetailRepository;

    private ProjetDetailDto convertToDto(ProjetDetail detail) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return new ProjetDetailDto(
                detail.getDescription(),
                detail.getTechnologie(),
                detail.getDateDebut().format(formatter)
        );
    }

    public ProjetDetailDto getDetailsProjet(Long id) {
        ProjetDetail detail = projetDetailRepository.findById(id).orElse(null);
        // Conversion Entité → DTO
        return convertToDto(detail);
    }

}

