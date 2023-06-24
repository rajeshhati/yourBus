package com.yourBus.yourBus.Repositories;
import com.yourBus.yourBus.Entities.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}
