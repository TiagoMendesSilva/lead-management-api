package com.management.services;

import com.management.builders.HomeBuilder;
import com.management.dto.HomeDTO;
import com.management.entities.Imovel;
import com.management.repositories.HomeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class HomeService {

    private final HomeRepository homeRepository;
    private final HomeBuilder homeBuilder;

    @Transactional(readOnly = true)
    public Page<Imovel> findAll(Pageable pageable) {
        return homeRepository.findAll(pageable);
    }

    @Transactional
    public void create(HomeDTO dto) {
        homeRepository.save(homeBuilder.build(dto));
    }
}
