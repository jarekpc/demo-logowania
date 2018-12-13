package com.jarek.model;

import lombok.*;

import javax.persistence.*;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "AUTHORITIES")
public class Authorities {

    @Id
    @Column(name = "AUTHORITY")
    private String authority;

    @ManyToOne
    @JoinColumn(name = "USERNAME")
    private User user;

}
