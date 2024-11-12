package com.example.thymeleaf.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;

@Getter
@Setter
public class CreateStudentDTO {

    @NotEmpty(message = "{NotEmpty.name}")
    @Pattern(regexp = "^[\\p{L} .'-]+$", message = "{Pattern.name}")
    private String name;

    @Email
    @NotEmpty(message = "{NotEmpty.email}")
    private String email;

    @NotNull(message = "{NotNull.birthday}")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    @NotEmpty(message = "{NotEmpty.zipCode}")
    @Pattern(regexp = "^[0-9-]+$", message = "{Pattern.zipCode}")
    private String zipCode;

    @NotEmpty(message = "{NotEmpty.street}")
    @Pattern(regexp = "^[\\p{L}0-9 .'-]+$", message = "{Pattern.street}")
    private String street;

    @NotEmpty(message = "{NotEmpty.number}")
    @Pattern(regexp = "^[\\p{L}0-9]+$", message = "{Pattern.number}")
    private String number;

    @Pattern(regexp = "^[\\p{L}0-9 .'-]*$", message = "{Pattern.complement}")
    private String complement;

    @NotEmpty(message = "{NotEmpty.district}")
    @Pattern(regexp = "^[\\p{L} .'-]+$", message = "{Pattern.district}")
    private String district;

    @NotEmpty(message = "{NotEmpty.city}")
    @Pattern(regexp = "^[\\p{L} .'-]+$", message = "{Pattern.city}")
    private String city;

    @NotEmpty(message = "{NotEmpty.state}")
    @Pattern(regexp = "^[\\p{L} .'-]+$", message = "{Pattern.state}")
    private String state;

}