package com.yourBus.yourBus.Entities;

import java.io.Serializable;

import com.yourBus.yourBus.Util.UserOfferId;
import com.yourBus.yourBus.Util.UserRoleId;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "user_roles")
@IdClass(UserRoleId.class)
@Data
@NoArgsConstructor
public class UserRole implements Serializable {
    @Id
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
    @Id
    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "id")
    private Role role;
}