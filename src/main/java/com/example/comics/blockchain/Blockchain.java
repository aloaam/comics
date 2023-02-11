package com.example.comics.blockchain;

import jakarta.persistence.*;

@Entity(name = "Blockchain")
@Table(name = "blockchain")
public class Blockchain {

    @Id
    @SequenceGenerator(name = "blockchain_sequence", sequenceName = "blockchain_sequence", allocationSize = 1)
    @GeneratedValue(generator = "blockchain_sequence", strategy = GenerationType.SEQUENCE)
    private Long blockchain_id;

    @Enumerated(EnumType.STRING)
    private BlockchainName name;

    @Column(nullable = true)
    private Integer evmChainId;

    public Blockchain() {
    }

    public Blockchain(BlockchainName name) {
        this.name = name;
    }

    public Blockchain(BlockchainName name, int evmChainId) {
        this.name = name;
        this.evmChainId = evmChainId;
    }
}
