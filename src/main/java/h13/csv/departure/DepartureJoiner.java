package h13.csv.departure;

import h13.csv.CSVWriter;
import h13.csv.CSVParser;
import org.tudalgo.algoutils.student.annotation.DoNotTouch;
import org.tudalgo.algoutils.student.annotation.StudentImplementationRequired;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Duration;
import java.time.LocalTime;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Class whose methods implement joining schedule and live departure data
 */
public final class DepartureJoiner {

    @DoNotTouch
    private DepartureJoiner() {
    }

    /**
     * Reads scheduled and live departure data from two files, joins them and writes the result to a third file.
     *
     * @param scheduledDeparturesPath the path from which to read scheduled departures
     * @param liveDeparturesPath      the path from which to read live departures
     * @param outputPath              the path to write the joined departures
     * @throws IOException if an I/O error occurs
     */
    @StudentImplementationRequired("H13.2.6")
    public static void processFiles(Path scheduledDeparturesPath, Path liveDeparturesPath, Path outputPath) throws IOException {
        // TODO: H13.2.6
        org.tudalgo.algoutils.student.Student.crash("H13.2.6 - Remove if implemented");
    }

    /**
     * Joins two tables of scheduled and live departures by their IDs.
     * If a scheduled departure is present without a live departure with matching ID,
     * its actual departure time is assumed to be its planned departure time.
     *
     * @param scheduledDepartures the scheduled departure table as a list of rows
     * @param liveDepartures      the live departures table as a list of rows
     * @return the joined table of combined departure information as a list of rows
     */
    @StudentImplementationRequired("H13.2.3")
    public static List<JoinedDeparture> joinTables(List<ScheduledDeparture> scheduledDepartures, List<LiveDeparture> liveDepartures) {
        // TODO: H13.2.3
        return org.tudalgo.algoutils.student.Student.crash("H13.2.3 - Remove if implemented");
    }
}
