package pl.asilver.country_project.subject;

import java.util.ArrayList;
import java.util.List;

public class Region {
    private String name;
    private String regionCenter;
    private double area;
    private List<District> districts;

    public Region() {
        this.area = 10000;
        this.name = name;
        this.districts = new ArrayList<>();
        for (int i = 0; i < 2; ++i) {
            District district = new District();
            this.districts.add(district);
        }
    }

    public String getName(){
        return name;
    }

    public String getRegionCenter(){
        return regionCenter;
    }

    public double getArea(){
        return area;
    }

    public List<District> getDistricts(){
        return districts;
    }

}
