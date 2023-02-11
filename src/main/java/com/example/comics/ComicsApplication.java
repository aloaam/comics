package com.example.comics;

import com.example.comics.blockchain.Blockchain;
import com.example.comics.blockchain.BlockchainName;
import com.example.comics.blockchain.BlockchainRepository;
import com.example.comics.domains.Domain;
import com.example.comics.domains.DomainRepository;
import com.example.comics.universe.Universe;
import com.example.comics.universe.UniverseName;
import com.example.comics.universe.UniverseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

//TODO: ALO - change names blockchains -> universe, and universe for heroess


@SpringBootApplication
public class ComicsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComicsApplication.class, args);

    }

    @Bean
    public CommandLineRunner commandLineRunner(
            BlockchainRepository blockchainRepository,
            UniverseRepository universeRepository,
            DomainRepository domainRepository
    ) {

        return args -> {
            Blockchain avalanche = new Blockchain(BlockchainName.AVALANCHE, 43114);
            Blockchain cardano = new Blockchain(BlockchainName.CARDANO);
            Blockchain ethereum = new Blockchain(BlockchainName.ETHEREUM, 1);
            Blockchain polygon = new Blockchain(BlockchainName.POLYGON, 137);
            blockchainRepository.saveAll(
                    List.of(
                            avalanche,
                            cardano,
                            ethereum,
                            polygon
                    )
            );

            universeRepository.saveAll(
                    List.of(
                            new Universe("0x...8785", UniverseName.Lockjaw)
                    )
            );


            domainRepository.saveAll(
                    List.of(
                        new Domain("italiannis.crypto", ethereum),
                        new Domain("agadmator.888", polygon),
                        new Domain("agadmator.nft", polygon),
                        new Domain("agadmator.wallet", polygon),
                        new Domain("agadmator.x", polygon),
                        new Domain("aloariza.wallet", polygon),
                        new Domain("antoniottolini.crypto", polygon),
                        new Domain("attolini.crypto", polygon),
                        new Domain("barcelonafans.wallet", polygon),
                        new Domain("bauenperinatal.crypto", polygon),
                        new Domain("bauenperinatal.wallet", polygon),
                        new Domain("danaemartinez.crypto", polygon),
                        new Domain("derecakir.wallet", polygon),
                        new Domain("elomar.crypto", polygon),
                        new Domain("jorgemessi.crypto", polygon),
                        new Domain("marycruzvilla.crypto", polygon),
                        new Domain("marycruzvilla.wallet", polygon),
                        new Domain("vfuentes.wallet", polygon),
                        new Domain("walkofftheearth.crypto", polygon),
                        new Domain("walkofftheearth.wallet", polygon),
                        new Domain("walkofftheearth.x", polygon),
                        new Domain("victorpalacios.crypto", polygon),
                        new Domain("victorpalacios.wallet", polygon)
                    )
            );
        };
    }



}

