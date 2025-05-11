package pl.raven.probestorage.repository;

import org.springframework.data.repository.CrudRepository;
import pl.raven.probestorage.model.Probe;

public interface ProbeRepository extends CrudRepository<Probe,Long> {
}
