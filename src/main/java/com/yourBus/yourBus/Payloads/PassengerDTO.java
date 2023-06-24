package com.yourBus.yourBus.Payloads;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class PassengerDTO {
    private Long id;
    private Long bookingId;
    @NotEmpty(message = "First name cannot be empty")
    @Size(min = 2, max = 50, message = "First name must be between 2 and 50 characters")
            private String firstName;
            @NotEmpty(message = "Last name cannot be empty")
            @Size(min = 2, max = 50, message = "Last name must be between 2 and 50 characters")
            private String lastName;
            @NotNull(message = "Age cannot be empty")
            @Min(value = 1, message = "Age must be greater than 0")
    private Integer age;
    @NotEmpty(message = "Gender cannot be empty")
    private String gender;
    @NotNull(message = "Seat number cannot be empty")
    @Min(value = 1, message = "Seat number must be greater than 0")
    private Integer seatNumber;
}

