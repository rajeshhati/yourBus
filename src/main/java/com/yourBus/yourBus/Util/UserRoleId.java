package com.yourBus.yourBus.Util;

import lombok.*;
import java.io.Serializable;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRoleId implements Serializable {
    private Long user;
    private Long role;
    // constructors, equals and hashCode methods
}
