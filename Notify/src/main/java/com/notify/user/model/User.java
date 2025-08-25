package com.notify.user.model;

import com.notify.note.model.Note;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(unique = true)
    private String email;

    @Column(unique = true, nullable = false)
    private String username;

    private String firstName;

    private String lastName;

    private boolean profilePicture;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private UserRole role;

    @OneToMany(fetch = FetchType.EAGER)
    private ArrayList<Note> notes = new ArrayList<>();

    @Column(nullable = false)
    private LocalDateTime createdOn;

    private boolean isActive;

}
