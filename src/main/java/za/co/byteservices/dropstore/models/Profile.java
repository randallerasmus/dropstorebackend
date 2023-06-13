package za.co.byteservices.dropstore.models;

import javax.persistence.*;
import org.springframework.data.annotation.Id;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "profiles")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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


    public Profile() {
    }

    public Profile(Long id, User user, String fullName, LocalDate dateOfBirth, String address, String city, String country, String phoneNumber) {
        this.id = id;
        this.user = user;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.city = city;
        this.country = country;
        this.phoneNumber = phoneNumber;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Profile setUser(User user) {
        this.user = user;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public Profile setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public Profile setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Profile setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Profile setCity(String city) {
        this.city = city;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public Profile setCountry(String country) {
        this.country = country;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Profile setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profile profile = (Profile) o;
        return Objects.equals(id, profile.id) && Objects.equals(user, profile.user) && Objects.equals(fullName, profile.fullName) && Objects.equals(dateOfBirth, profile.dateOfBirth) && Objects.equals(address, profile.address) && Objects.equals(city, profile.city) && Objects.equals(country, profile.country) && Objects.equals(phoneNumber, profile.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, fullName, dateOfBirth, address, city, country, phoneNumber);
    }

    @Override
    public String toString() {
        return "Profile{" +
                "id=" + id +
                ", user=" + user +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
