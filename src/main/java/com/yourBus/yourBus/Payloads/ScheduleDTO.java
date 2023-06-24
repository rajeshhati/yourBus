package com.yourBus.yourBus.Payloads;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;
@Data
@NoArgsConstructor
public class ScheduleDTO {
    private Long id;
    private Long busId;
    private Long routeId;
    @NotNull(message = "Departure time cannot be empty")
    @FutureOrPresent(message = "Departure time must be in the future or present")
            private Date departureTime;
            @NotNull(message = "Arrival time cannot be empty")
            @FutureOrPresent(message = "Arrival time must be in the future or present")
            private Date arrivalTime;
            @NotNull(message = "Price cannot be empty")
            @Min(value = 0, message = "Price must be greater than or equal to 0")
    private Double price;
}

