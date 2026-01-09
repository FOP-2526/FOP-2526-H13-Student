package h13.csv.departure;

import java.time.LocalTime;
import java.util.List;
import org.tudalgo.algoutils.student.annotation.DoNotTouch;
import org.tudalgo.algoutils.student.annotation.StudentImplementationRequired;

/**
 * A departure present in a schedule without real-world information of actual departure times.
 *
 * @param tripId        a unique ID identifying this departure
 * @param trainLine     the train's line/display name on the departure display
 * @param destination   the train's destination
 * @param scheduledTime the train's scheduled (planned) departure time
 */
public record ScheduledDeparture(int tripId, String trainLine, String destination, LocalTime scheduledTime) {

    @DoNotTouch
    public ScheduledDeparture {
        if (trainLine == null) {
            throw new IllegalArgumentException("trainLine must not be null");
        }
        if (destination == null) {
            throw new IllegalArgumentException("destination must not be null");
        }
        if (scheduledTime == null) {
            throw new IllegalArgumentException("scheduledTime must not be null");
        }
    }

    /**
     * Deserializes a row of strings into a {@link ScheduledDeparture} object.
     *
     * @param row a list of length 4 containing ID, train line, destination, scheduled departure time as strings
     * @return a deserialized {@link ScheduledDeparture} object.
     */
    @StudentImplementationRequired("H13.2.2")
    public static ScheduledDeparture deserialize(List<String> row) {
        // TODO: H13.2.2
        return org.tudalgo.algoutils.student.Student.crash("H13.2.2 - Remove if implemented");
    }
}
