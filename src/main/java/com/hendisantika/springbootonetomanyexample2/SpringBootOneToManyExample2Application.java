package com.hendisantika.springbootonetomanyexample2;

import com.hendisantika.springbootonetomanyexample2.entity.Country;
import com.hendisantika.springbootonetomanyexample2.entity.State;
import com.hendisantika.springbootonetomanyexample2.repository.CountryRepository;
import com.hendisantika.springbootonetomanyexample2.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootOneToManyExample2Application implements CommandLineRunner {
    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private StateRepository stateRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootOneToManyExample2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Country country = new Country("Indonesia", "Jakarta", "Rupiah");

        State state1 = new State("Bandung");
        state1.setCountry(country);
        State state2 = new State("Cimahi");
        state2.setCountry(country);
        country.getState().add(state1);
        country.getState().add(state2);

        countryRepository.save(country);
        stateRepository.save(state1);
        stateRepository.save(state2);
    }

}
