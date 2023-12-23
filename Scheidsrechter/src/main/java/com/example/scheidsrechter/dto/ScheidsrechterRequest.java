package com.example.scheidsrechter.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ScheidsrechterRequest {
    private String skuCode;
    private String naam;
    private String mail;
    private String niveau;
    private Boolean isAssistent;
    private Long scheidsrechterID;

}
