package com.management.builders;

import com.management.dto.HomeDTO;
import com.management.dto.PageHomeDTO;
import com.management.entities.Imovel;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class HomeBuilder {

    public PageHomeDTO build(Page<Imovel> page) {
        return PageHomeDTO.builder()
                .home(build(page.getContent()))
                .page(page.getNumber())
                .size(page.getTotalElements())
                .last(page.isLast())
        .build();
    }

    public List<HomeDTO> build(List<Imovel> entities) {
        return entities.stream().map(this::build).collect(Collectors.toList());
    }

    public HomeDTO build(Imovel entity) {
        return HomeDTO.builder()
                .id(entity.getId())
                .titulo(entity.getTitulo())
                .descricao(entity.getDescricao())
                .preco(entity.getPreco())
                .bairro(entity.getBairro())
                .imgUrl(entity.getImgUrl())
                .pdfBookUrl(entity.getPdfBookUrl())
        .build();
    }

    public Imovel build(HomeDTO dto) {
        return Imovel.builder()
                .titulo(dto.getTitulo())
                .bairro(dto.getBairro())
                .descricao(dto.getDescricao())
                .imgUrl(dto.getImgUrl())
                .pdfBookUrl(dto.getPdfBookUrl())
                .preco(dto.getPreco())
        .build();
    }
}
