package tn.esprit.dto.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.dto.Dto.ProjetDto;
import tn.esprit.dto.DtoMapper.ProjetMapper;
import tn.esprit.dto.entities.Projet;
import tn.esprit.dto.repositories.ProjetRepository;

@Service
public class ProjetService {
    @Autowired
    private ProjetRepository projetRepository;
    @Autowired
    ProjetMapper projetMapper;
    public ProjetDto getProjet(Long id )
    {
        Projet projet = projetRepository.findById(id).orElse(null);
        return  projetMapper.toDto(projet);
    }
}
