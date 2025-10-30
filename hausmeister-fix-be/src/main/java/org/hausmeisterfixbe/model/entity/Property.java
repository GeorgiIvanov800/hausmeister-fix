package org.hausmeisterfixbe.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "properties")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Property extends BaseEntity {

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String zipCode;

    private String notes;

    @OneToMany(mappedBy = "property")
    private List<Unit> units;
}
