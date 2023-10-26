package com.gestionVenteSpring.demo.dto;

import com.gestionVenteSpring.demo.model.Article;
import com.gestionVenteSpring.demo.model.TypeMvt;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
public class MvtStkDto {

    private Integer id;

    private Instant dateMvt;

    private BigDecimal quantite;

    private Article article;

    private TypeMvt typeMvt;
}
