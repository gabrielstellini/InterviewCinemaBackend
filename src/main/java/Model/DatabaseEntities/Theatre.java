package Model.DatabaseEntities;

import javax.persistence.*;

@Entity
public class Theatre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    private Cinema cinema;

    private String screenName;

    public Theatre(){}

    public Theatre(Cinema cinema, String screenName) {
        this.cinema = cinema;
        this.screenName = screenName;
    }

    public Integer getId() {
        return id;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public String getScreenName() {
        return screenName;
    }

    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }
}
