/**
 * Copyright (c) 2015 云智盛世
 * Created with Wind.
 */
package com.ayana.jude.model;

import javax.persistence.*;

/**
 * Class description
 *
 * @author GanJc on 2015/8/10
 */
@Entity
public class Wind {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private String chill;
    private String direction;
    private String speed;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="weather_id", nullable=false)
    private Weather weather;

    public Wind() {}

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getChill() { return chill; }
    public void setChill(String newChill) {
        this.chill = newChill;
    }

    public final String getDirection() { return direction; }
    public final void setDirection(final String newDirection) {
        this.direction = newDirection;
    }

    public final String getSpeed() { return speed; }
    public final void setSpeed(final String newSpeed) {
        this.speed = newSpeed;
    }

    public Weather getWeather() { return weather; }
    public void setWeather(Weather weather) { this.weather = weather; }
}
