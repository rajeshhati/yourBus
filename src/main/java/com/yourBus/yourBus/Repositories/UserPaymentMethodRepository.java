package com.yourBus.yourBus.Repositories;

import com.yourBus.yourBus.Entities.UserPaymentMethod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserPaymentMethodRepository extends JpaRepository<UserPaymentMethod, Long> {
}
