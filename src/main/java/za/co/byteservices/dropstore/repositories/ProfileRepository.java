package za.co.byteservices.dropstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.byteservices.dropstore.models.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {
    // Custom queries can be added here if needed
}
