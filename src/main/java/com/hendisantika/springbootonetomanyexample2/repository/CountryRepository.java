package com.hendisantika.springbootonetomanyexample2.repository;

import com.hendisantika.springbootonetomanyexample2.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-one-to-many-example2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-03-12
 * Time: 22:07
 */
public interface CountryRepository extends JpaRepository<Country, Long> {
}
