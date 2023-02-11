package com.example.comics.quiver;

import com.example.comics.gadgets.Gadget;
import com.example.comics.universe.Universe;
import jakarta.persistence.*;

@Entity(name = "Quiver")
@Table(name = "quiver")
public class Quiver {

    @Id
    @SequenceGenerator(name = "quiver_sequence", sequenceName = "quiver_sequence", allocationSize = 1)
    @GeneratedValue(generator = "quiver_sequence", strategy = GenerationType.SEQUENCE)
    private Long id;

    @JoinColumn
    @ManyToOne()
    private Universe universe;

    @JoinColumn
    @ManyToOne()
    private Gadget gadget;

    @Column(nullable = false)
    private Long quantity;

}
