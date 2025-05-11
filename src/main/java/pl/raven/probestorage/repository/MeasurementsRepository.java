package pl.raven.probestorage.repository;

import org.springframework.data.repository.CrudRepository;
import pl.raven.probestorage.model.Measurement;

public interface MeasurementsRepository extends CrudRepository<Measurement,Long> {
}
