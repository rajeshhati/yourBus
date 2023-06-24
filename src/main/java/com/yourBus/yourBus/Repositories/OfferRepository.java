package com.yourBus.yourBus.Repositories;
import com.yourBus.yourBus.Entities.Offer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface OfferRepository extends JpaRepository<Offer, Long> {
}
