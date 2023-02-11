package com.example.comics.gadgets;

import jakarta.persistence.*;

@Entity(name = "Gadget")
@Table(name = "gadget")
public class Gadget {

    @Id
    @SequenceGenerator(name = "gadget_sequence", sequenceName = "gadget_sequence", allocationSize = 1)
    @GeneratedValue(generator = "gadget_sequence", strategy = GenerationType.SEQUENCE)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private GadgetName name;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private GadgetCategory category;

    public Gadget() {
    }

    public Gadget(GadgetName name, GadgetCategory category) {
        this.name = name;
        this.category = category;
    }
}
