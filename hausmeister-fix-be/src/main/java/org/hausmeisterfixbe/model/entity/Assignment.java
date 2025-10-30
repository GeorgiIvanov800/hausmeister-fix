package org.hausmeisterfixbe.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "assignments")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Assignment extends BaseEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ticket_id", nullable = false)
    private Ticket ticket;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "technician_user_id", nullable = false)
    private User technician;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "assigned_by",nullable = false)
    private User assignedBy;

}
