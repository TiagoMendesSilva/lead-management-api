package com.management.builders;

import com.management.dto.LeadDTO;
import com.management.entities.Lead;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class LeadBuilder {

    public Lead build(LeadDTO dto) {
        return Lead.builder()
                .name(dto.getName())
                .whatsapp(dto.getWhatsapp())
                .propertyType(dto.getPropertyType())
                .rangePrice(dto.getRangePrice())
                .creationDate(LocalDateTime.now())
        .build();
    }
}
