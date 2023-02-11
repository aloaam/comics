package com.example.comics.domains;

import com.example.comics.blockchain.Blockchain;
import com.example.comics.marketplace.MarketPlace;
import jakarta.persistence.*;

@Entity(name = "Domain")
@Table(name = "domain")
/**
 * Represents a domain class.
 *
 *  The property: marketPlaceForSale contains the name of the market-place where the domain is being
 *  offered. If it is not for sale the column is empty.
 *
 */
public class Domain {

    @Id
    @SequenceGenerator(name = "domain_sequence", sequenceName = "domain_sequence", allocationSize = 1)
    @GeneratedValue(generator = "domain_sequence", strategy = GenerationType.SEQUENCE)
    private Long domain_id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "blockchain_id", foreignKey = @ForeignKey(name = "blockchain_fk"), nullable = false)
    private Blockchain blockchain;

    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    private MarketPlace marketPlaceForSale;

    public Domain() {
    }

    public Domain(String name, Blockchain blockchain) {
        this.name = name;
        this.blockchain = blockchain;
    }

    public Domain(String name, Blockchain blockchain, MarketPlace marketPlaceForSale) {
        this.name = name;
        this.blockchain = blockchain;
        this.marketPlaceForSale = marketPlaceForSale;
    }
}
