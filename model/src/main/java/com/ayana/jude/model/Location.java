/**
 * Copyright (c) 2015 云智盛世
 * Created with Location.
 */
package com.ayana.jude.model;

import javax.persistence.*;

/**
 * Class description
 *
 * @author GanJc on 2015/8/10
 */
@Entity
@NamedQueries({
        @NamedQuery(name="Location.uniqueByZip", query="from Location l where l.zip = :zip")
})
public class Location {

    @Id
    private String zip;

    private String city;

    private String region;

    private String country;

    public Location() {}

    public String getZip() { return zip; }
    public void setZip(String zip) { this.zip = zip; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getRegion() {	return region; }
    public void setRegion(String region) { this.region = region; }

    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }

}
