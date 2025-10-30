package org.hausmeisterfixbe.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hausmeisterfixbe.model.enums.Role;

import java.util.List;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User extends BaseEntity {

    @Column(unique = true, nullable = false)
    private String keycloakUserId;

    @Column(nullable = false)
    private String firstName;
    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    @Email
    private String email;

    private String phoneNumber;

    private boolean isActive;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    @OneToMany(mappedBy = "createdBy")
    private List<Ticket> tickets;

    @OneToMany(mappedBy = "technician")
    private List<Assignment> assignments;
}
