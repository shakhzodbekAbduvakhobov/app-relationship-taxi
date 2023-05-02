package uz.pdp.apprelationship.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Taxi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String driverName;

    @Column(nullable = false)
    private String driverPhoneNumber;

    @OneToOne
    private Car car;

}
