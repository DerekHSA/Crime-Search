
package org.jointheleague.api.derek.CrimeSearch.repository.dto;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Data {

    private String uri;
    private String name;
    private Artists artists;
    private CoverArt coverArt;
    private Date date;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Artists getArtists() {
        return artists;
    }

    public void setArtists(Artists artists) {
        this.artists = artists;
    }

    public CoverArt getCoverArt() {
        return coverArt;
    }

    public void setCoverArt(CoverArt coverArt) {
        this.coverArt = coverArt;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
