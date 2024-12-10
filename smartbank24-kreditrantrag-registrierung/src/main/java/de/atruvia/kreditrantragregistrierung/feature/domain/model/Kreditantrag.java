package de.atruvia.kreditrantragregistrierung.feature.domain.model;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter(AccessLevel.PRIVATE)
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Kreditantrag {

    private String creditApplicationId ;


    private String firstName;


    private String lastName;


    private String city;


    private LocalDateTime applicationDate ;


    private double monthlyIncome;

    private double monthlyExpenditure;

    private double creditSum;

}
