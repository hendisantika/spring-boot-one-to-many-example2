package com.hendisantika.springbootonetomanyexample2.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-one-to-many-example2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-03-12
 * Time: 22:05
 */
@Entity
@Table(name = "state")
@Data
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String stateName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;

    public State() {

    }

    public State(String stateName) {
        this.stateName = stateName;
    }

}
