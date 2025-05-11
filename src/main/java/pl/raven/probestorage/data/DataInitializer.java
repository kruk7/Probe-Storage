package pl.raven.probestorage.data;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.raven.probestorage.model.Measurement;
import pl.raven.probestorage.model.Probe;
import pl.raven.probestorage.repository.MeasurementsRepository;
import pl.raven.probestorage.repository.ProbeRepository;

import java.time.LocalDateTime;
import java.util.List;

@Component
public class DataInitializer implements CommandLineRunner {

    private final ProbeRepository probeRepository;
    private final MeasurementsRepository measurementsRepository;


    public  DataInitializer(ProbeRepository probeRepository, MeasurementsRepository measurementsRepository){
        this.probeRepository = probeRepository;
        this.measurementsRepository = measurementsRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        probeRepository.saveAll(List.of(
                new Probe(900929, "Probe_1","WAW","ANNO1"),
                new Probe(912944, "Probe_2","WGW","ANNO2"),
                new Probe(956234, "Probe_3","ZUZ","ANNO2")
        ));

        measurementsRepository.saveAll(List.of(
                new Measurement(900929, LocalDateTime.parse("2025-05-11T14:30:00"), 345522.711, 22.5, 18.7, 45.7),
                new Measurement(900929, LocalDateTime.parse("2025-05-11T15:30:00"), 345565.990, 22.8, 18.9, 47.8),
                new Measurement(900929, LocalDateTime.parse("2025-05-11T16:30:00"), 345246.345, 23.1, 19.1, 48.5),
                new Measurement(900929, LocalDateTime.parse("2025-05-11T17:30:00"), 345785.854, 23.3, 19.5, 49.4),
                new Measurement(900929, LocalDateTime.parse("2025-05-11T18:30:00"), 345234.456, 23.8, 19.6, 50.1),
                new Measurement(912944, LocalDateTime.parse("2025-05-11T14:30:00"), 345522.711, 22.5, 18.7, 45.7),
                new Measurement(912944, LocalDateTime.parse("2025-05-11T15:30:00"), 345565.990, 22.8, 18.9, 47.8),
                new Measurement(912944, LocalDateTime.parse("2025-05-11T16:30:00"), 345246.345, 23.1, 19.1, 48.5),
                new Measurement(912944, LocalDateTime.parse("2025-05-11T17:30:00"), 345785.854, 23.3, 19.5, 49.4),
                new Measurement(912944, LocalDateTime.parse("2025-05-11T18:30:00"), 345234.456, 23.8, 19.6, 50.1),
                new Measurement(956234, LocalDateTime.parse("2025-05-11T14:30:00"), 345522.711, 22.5, 18.7, 45.7),
                new Measurement(956234, LocalDateTime.parse("2025-05-11T15:30:00"), 345565.990, 22.8, 18.9, 47.8),
                new Measurement(956234, LocalDateTime.parse("2025-05-11T16:30:00"), 345246.345, 23.1, 19.1, 48.5),
                new Measurement(956234, LocalDateTime.parse("2025-05-11T17:30:00"), 345785.854, 23.3, 19.5, 49.4),
                new Measurement(956234, LocalDateTime.parse("2025-05-11T18:30:00"), 345234.456, 23.8, 19.6, 50.1)
        ));
    }
}

