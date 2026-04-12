package com.management.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LeadDTO {
    @JsonProperty("nome")
    private String name;

    @JsonProperty("whatsapp")
    private String whatsapp;

    @JsonProperty("tipoImovel")
    private String propertyType;

    @JsonProperty("faixaPreco")
    private String rangePrice;
}
