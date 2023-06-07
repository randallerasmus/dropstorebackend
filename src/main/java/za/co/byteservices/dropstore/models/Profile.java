package za.co.byteservices.dropstore.models;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;
import java.time.LocalDate;

@Entity
@Table(name = "profiles")
public @Data class Profile {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    private String fullName;

    private LocalDate dateOfBirth;

    private String address;

    private String city;

    private String country;

    private String phoneNumber;


    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
