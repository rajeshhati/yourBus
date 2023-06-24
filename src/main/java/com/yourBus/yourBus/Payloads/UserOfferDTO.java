package com.yourBus.yourBus.Payloads;


import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class UserOfferDTO {
    private Long userId;
    private Long offerId;
}