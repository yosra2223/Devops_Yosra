package tn.esprit.dto.Dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProjetDetailDto {
    private String description;
    private String technologie;
    private String dateDebut;
}
