package com.yourBus.yourBus.Payloads;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class BusDTO {
    private Long id;
    private Long operatorId;
    @NotEmpty(message = "Bus type cannot be empty")
    @Size(min = 2, max = 50, message = "Bus type must be between 2 and 50 characters")
            private String busType;
            @NotNull(message = "Total seats cannot be empty")
            @Min(value = 1, message = "Total seats must be greater than 0")
    private Integer totalSeats;
    private String amenities;
}

