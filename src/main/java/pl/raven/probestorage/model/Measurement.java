package pl.raven.probestorage.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Measurement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Integer serialProbe;
    LocalDateTime dateTime;
    Double magnetField;
    Double intTemp;
    Double outTemp;
    Double humidity;

    public Measurement(Integer serialProbe, LocalDateTime dateTime, Double magnetField, Double intTemp, Double outTemp, Double humidity) {
        this.serialProbe = serialProbe;
        this.dateTime = dateTime;
        this.magnetField = magnetField;
        this.intTemp = intTemp;
        this.outTemp = outTemp;
        this.humidity = humidity;
    }
}
