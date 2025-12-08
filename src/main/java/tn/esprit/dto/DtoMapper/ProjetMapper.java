package tn.esprit.dto.DtoMapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import tn.esprit.dto.Dto.ProjetDto;
import tn.esprit.dto.entities.Projet;

@Mapper(componentModel = "spring")
public interface ProjetMapper {

    @Mapping(target = "libelleProjet",source = "nom")
    ProjetDto toDto(Projet projet);
}
