package tn.esprit.dto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.dto.Dto.ProjetDetailDto;
import tn.esprit.dto.Dto.ProjetDto;
import tn.esprit.dto.services.ProjetDetailService;
import tn.esprit.dto.services.ProjetService;

@RestController
@RequestMapping( "/projets")
public class ProjetController {
    @Autowired
    private ProjetDetailService projetDetailService;
     @GetMapping("/{id}/details")
    public ProjetDetailDto getDetails(@PathVariable Long id){
         return  projetDetailService.getDetailsProjet(id);
     }

     @Autowired
    private ProjetService projetService;
     @GetMapping("/{id}")
    public ProjetDto getProjet (@PathVariable Long id ){
         return  projetService.getProjet(id);
     }
}
