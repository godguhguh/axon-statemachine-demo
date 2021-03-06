package pro.idugalic.axonstatemachine.command.api.command;

import lombok.*;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
final public class MarkOrderAsCancelledCommand {

    @TargetAggregateIdentifier
    private String aggregateIdentifier;

}
