package com.yourBus.yourBus.Entities;

import java.io.Serializable;

import com.yourBus.yourBus.Util.UserOfferId;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name = "user_offers")
@IdClass(UserOfferId.class)
@Data
@NoArgsConstructor
public class UserOffer implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;
    @Id
    @ManyToOne
    @JoinColumn(name = "offer_id", referencedColumnName = "id")
    private Offer offer;
}