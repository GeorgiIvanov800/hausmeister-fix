package org.hausmeisterfixbe.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "units")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Unit extends BaseEntity {

    @Column
    private Integer floor;

    @Column(nullable = false)
    private String unitNumber;

    @ManyToOne(optional = false)
    @JoinColumn(name = "property_id")
    private Property property;

    @ManyToOne
    @JoinColumn(name = "tenant_id")
    private User tenantUser;
}
