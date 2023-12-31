package com.gestionVenteSpring.demo.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoleDto {

    private Integer id;

    private String roleName;

    private UtilisateurDto utilisateur;
}
