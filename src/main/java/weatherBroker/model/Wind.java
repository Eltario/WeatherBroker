package weatherBroker.model;


import com.fasterxml.jackson.annotation.*;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Wind implements Serializable {

    private String chill;
    private String direction;
    private String speed;

    public Wind() {
    }

    public String getChill() {
        return chill;
    }

    public void setChill(String chill) {
        this.chill = chill;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}
