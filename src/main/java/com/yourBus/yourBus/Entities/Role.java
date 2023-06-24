package com.yourBus.yourBus.Entities;
import jakarta.persistence.*;
import lombok.*;
import java.util.*;
@Entity

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String roleName;
    @OneToMany(mappedBy = "role")
    private Set<UserRole> userRoles;
}