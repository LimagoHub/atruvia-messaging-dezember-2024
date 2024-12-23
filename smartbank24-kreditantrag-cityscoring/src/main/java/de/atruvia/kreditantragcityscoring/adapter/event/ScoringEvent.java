package de.atruvia.kreditantragcityscoring.adapter.event;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class ScoringEvent extends BaseEvent {
    private String creditApplicationId;
}
