package com.jarek.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "USERS")
public class User {

    @Id
    @Column(name = "USERNAME")
    private String username;


    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Column(name = "ENABLED", nullable = false)
    private boolean enabled;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    @JsonIgnore
    private Set<Authorities> authorities = new HashSet<>();


}
