package de.atruvia.kreditantragcityscoring.domain.aggregate;

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
    private String city;

    public boolean determineScoring() {
        return !isMuenchen();
    }

    private boolean isMuenchen() {
        return "München".equalsIgnoreCase(city) || "Muenchen".equalsIgnoreCase(city);
    }
}
