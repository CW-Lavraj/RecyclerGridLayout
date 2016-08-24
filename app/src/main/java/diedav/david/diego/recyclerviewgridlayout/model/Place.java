package diedav.david.diego.recyclerviewgridlayout.model;

/**
 * Created by root on 29/07/16.
 */
public class Place {
    public int image;
    public String name;
    public String country;

    public Place(int image, String name, String country) {
        this.image = image;
        this.name = name;
        this.country = country;
    }

    public Place() {
    }


    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
