package com.gestionVenteSpring.demo.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CommandeFournisseurDto {

    private Integer id;

    private String code;

    private String datecommande;

    private FournisseurDto fournisseur;

    private List<LigneCommandeFourinisseurDto> ligneCommandeFourinisseurs;
}
