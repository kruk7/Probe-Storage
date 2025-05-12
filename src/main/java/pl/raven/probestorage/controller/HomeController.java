package pl.raven.probestorage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import pl.raven.probestorage.model.Measurement;
import pl.raven.probestorage.model.Probe;
import pl.raven.probestorage.repository.MeasurementsRepository;
import pl.raven.probestorage.repository.ProbeRepository;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    ProbeRepository probeRepository;

    @Autowired
    MeasurementsRepository measurementsRepository;

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @PostMapping("/api/add-probe")
    public ResponseEntity<String> addProbe(Probe probe){

        probeRepository.save(probe);

        return ResponseEntity.status(200).body("Dodano nowy czujnik");
    }

    @GetMapping("/api/all-probes")
    public ResponseEntity<List<Probe>> getAllProbes(){
        List<Probe> probeList = (List<Probe>) probeRepository.findAll();
        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<>(probeList, httpStatus);
    }

    @GetMapping("/api/all-measurements")
    public ResponseEntity<List<Measurement>> getAllMeasurements(){
        List<Measurement> measurementsList = (List<Measurement>) measurementsRepository.findAll();
        HttpStatus httpStatus = HttpStatus.OK;
        return new ResponseEntity<>(measurementsList,httpStatus);
    }


    @PostMapping("/api/add-measurement")
    public ResponseEntity<Measurement> saveMeasurement(@RequestBody Measurement measurement) {
        Measurement saved = measurementsRepository.save(measurement);
        return ResponseEntity.ok(saved);
    }


}
