package uz.pdp.apprelationship.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TaxiPark {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String parkName;

    @Column(nullable = false)
    private String parkAddress;

    @OneToMany
    private List<Taxi> taxis;

}
