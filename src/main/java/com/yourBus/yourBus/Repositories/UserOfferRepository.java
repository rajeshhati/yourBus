package com.yourBus.yourBus.Repositories;
import com.yourBus.yourBus.Entities.UserOffer;
import com.yourBus.yourBus.Util.UserOfferId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserOfferRepository extends JpaRepository<UserOffer, UserOfferId> {
}