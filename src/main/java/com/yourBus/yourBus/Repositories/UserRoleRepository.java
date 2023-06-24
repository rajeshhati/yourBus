package com.yourBus.yourBus.Repositories;


import com.yourBus.yourBus.Entities.UserRole;
import com.yourBus.yourBus.Util.UserRoleId;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRoleRepository extends JpaRepository<UserRole, UserRoleId> {
}