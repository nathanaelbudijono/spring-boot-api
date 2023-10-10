package com.multipolar.bootcamp.kyc.domain;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotEmpty;

@Document(collection = "customers")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class Customer implements Serializable {
    @Id
    private String id;
    @NotEmpty(message = "NIK must be filed!")
    private String nik;
    @NotEmpty(message = "First Name must be filed!")
    private String firstName;
    private String lastName;
    @NotEmpty(message = "Email must be filed!")
    private String email;
    @NotEmpty(message = "Phone Number must be filed!")
    private String phoneNumber;
    private LocalDate dateOfBirth;
    @NotEmpty(message = "Street must be filed!")
    private String street;
    @NotEmpty(message = "City must be filed!")
    private String city;
    @NotEmpty(message = "State must be filed!")
    private String state;
    @NotEmpty(message = "Postal Code must be filed!")
    private String postalCode;
    @NotEmpty(message = "Country must be filed!")
    private String country;
    @NotEmpty(message = "Address must be filed!")
    private String address;
    private MembershipStatus membershipStatus;
}
