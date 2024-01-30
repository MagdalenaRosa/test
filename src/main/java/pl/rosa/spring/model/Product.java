package pl.rosa.spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
// @Entity
public class Product {
    // @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String desc;
    private String urlUri;
    private BigDecimal price;

}
