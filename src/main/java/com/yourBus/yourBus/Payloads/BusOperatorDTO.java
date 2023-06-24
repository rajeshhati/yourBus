package com.yourBus.yourBus.Payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BusOperatorDTO {
    private Long id;
    @NotEmpty(message = "Operator name cannot be empty")
    @Size(min = 2, max = 100, message = "Operator name must be between 2 and 100 characters")
            private String operatorName;
            @Email(message = "Invalid email format")
            private String contactEmail;
            @NotEmpty(message = "Contact phone number cannot be empty")
            @Size(min = 10, max = 15, message = "Contact phone number must be between 10 and 15 digits")
            private String contactPhone;
            private String logoUrl;
}