package ir.maktabsharif.model.Address;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "addresses")
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "city")
    private String city;
    @Column(name = "state")
    private String state;
    @Column(name = "number", unique = true, nullable = false)
    private String number;
    @Column(name = "postal_address")
    private String postalAddress;
    @Column(name = "postal_code")
    private String postalCode;

    public Address(String city, String state, String number, String postalAddress, String postalCode) {
        this.city = city;
        this.state = state;
        this.number = number;
        this.postalAddress = postalAddress;
        this.postalCode = postalCode;
    }

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", number='" + number + '\'' +
                ", postalAddress='" + postalAddress + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

}
