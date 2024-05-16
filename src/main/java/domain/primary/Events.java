package domain.primary;

sealed interface Event {
}

record CreatedEvent(
        Technique entity
) implements Event {

}

record EditEvent(
        Technique entity
) implements Event {

}

record DeleteEvent(
        Technique entity
) implements Event {

}
