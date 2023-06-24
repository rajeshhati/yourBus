package com.yourBus.yourBus.Payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@Data
@NoArgsConstructor
public class UserDTO {
    private Long id;
    @NotEmpty(message = "First name cannot be empty")
    @Size(min = 2, max = 50, message = "First name must be between 2 and 50 characters")
            private String firstName;
            @NotEmpty(message = "Last name cannot be empty")
            @Size(min = 2, max = 50, message = "Last name must be between 2 and 50 characters")
            private String lastName;
            @NotEmpty(message = "Email cannot be empty")

            @Email(message = "Invalid email format")
            private String email;
            @NotEmpty(message = "Password cannot be empty")
            @Size(min = 8, max = 30, message = "Password must be between 8 and 30 characters")
            private String password;
            private String phoneNumber;
            private String profilePicture;
            private MultipartFile profileImage;
            private Date createdAt;
            private Date updatedAt;
}
