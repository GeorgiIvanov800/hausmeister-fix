package org.hausmeisterfixbe.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hausmeisterfixbe.model.enums.TicketCategory;
import org.hausmeisterfixbe.model.enums.Priority;
import org.hausmeisterfixbe.model.enums.Status;

import java.time.Instant;

@Entity
@Table(name = "tickets")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Ticket extends BaseEntity {

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TicketCategory ticketCategory;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Priority priority;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @ManyToOne(optional = false)
    @JoinColumn(name = "unit_id", nullable = false)
    private Unit unit;

    @ManyToOne(optional = false)
    @JoinColumn(name = "created_by", nullable = false)
    private User createdBy;

    @ManyToOne
    @JoinColumn(name = "current_technician_id")
    private User currentTechnician;

    private Instant closedAt;
}
