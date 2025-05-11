package pl.raven.probestorage.model;



import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Probe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Integer serial;
    String name;
    String location;
    String annotation;

    public Probe(Integer serial, String name, String location, String annotation) {
        this.serial = serial;
        this.name = name;
        this.location = location;
        this.annotation = annotation;
    }
}
