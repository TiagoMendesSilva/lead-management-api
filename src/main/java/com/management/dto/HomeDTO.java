package com.management.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HomeDTO {
    private Long id;
    private String titulo;
    private BigDecimal preco;
    private String descricao;
    private String imgUrl;
    private String pdfBookUrl;
    private String bairro;
}
