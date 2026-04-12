package com.management.services;

import com.management.builders.LeadBuilder;
import com.management.dto.LeadDTO;
import com.management.repositories.LeadRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class LeadService {

    private final LeadRepository leadRepository;
    private final LeadBuilder leadBuilder;

    @Transactional
    public void create(LeadDTO dto) {
        leadRepository.save(leadBuilder.build(dto));
    }
}
