package pe.edu.cibertec.spring_mvc_jyd.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer inventoryId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "film_id", nullable = false)
    private Film film;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;
}
