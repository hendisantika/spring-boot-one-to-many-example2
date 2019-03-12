package com.hendisantika.springbootonetomanyexample2.controller;

import com.hendisantika.springbootonetomanyexample2.entity.Country;
import com.hendisantika.springbootonetomanyexample2.repository.CountryRepository;
import com.hendisantika.springbootonetomanyexample2.repository.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-one-to-many-example2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-03-12
 * Time: 22:14
 */

@RestController
@RequestMapping("/api")
public class CountryController {

    @Autowired
    private CountryRepository countryRepository;

    @Autowired
    private StateRepository stateRepository;

    @GetMapping
    List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

}
