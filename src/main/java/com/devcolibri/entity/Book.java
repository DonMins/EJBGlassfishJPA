package com.devcolibri.entity;

import com.sun.istack.internal.NotNull;
import lombok.*;
import javax.persistence.*;
import java.io.Serializable;

@Table(name = "Books")
@NamedQuery(name = "getAll", query = "SELECT c from Book c")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@ToString
public class Book implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private int id;

    @Column(name = "name",length = 50)
    private String name;

    public Book(String name) {
        this.name = name;
    }
}