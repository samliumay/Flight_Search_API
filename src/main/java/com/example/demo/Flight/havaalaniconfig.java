/*package com.example.demo.Flight;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class havaalaniconfig {
    @Bean
    CommandLineRunner commandLineRunner(HavaalaniRepository repository){
        return args -> {
            Havaalani havaalani1 = new Havaalani(
                    1,
                    "Ankara"
            );

            Havaalani havaalani2 = new Havaalani(
                    2,
                    "Antalya"
            );

            repository.saveAll(List.of(havaalani1,havaalani2));
        };
    }
}*/
