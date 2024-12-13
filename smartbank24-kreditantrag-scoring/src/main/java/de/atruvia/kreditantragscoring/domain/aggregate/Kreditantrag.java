package de.atruvia.kreditantragscoring.domain.aggregate;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter(AccessLevel.PRIVATE)
@ToString
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Kreditantrag {

    private String creditApplicationId;
    private double monthlyIncome;
    private double monthlyExpenditure;
    private double creditSum;

    public boolean determineScoring() {
        return creditSum < (monthlyIncome - monthlyExpenditure) * 10.0;
    }
}
