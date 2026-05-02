package com.management.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
@Entity
@Table(name = "tb_imovel")
public class Imovel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "preco", nullable = false)
    private BigDecimal preco;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "img_url", nullable = false)
    private String imgUrl;

    @Column(name = "pdf_book_url", nullable = false)
    private String pdfBookUrl;

    @Column(name = "bairro", nullable = false)
    private String bairro;
}
