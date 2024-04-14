package pl.asilver.country_project.subject;

import java.util.ArrayList;
import java.util.List;

public class Region {
    private String name;
    private String regionalCenter;
    private double area;
    private List<District> districts;

    public Region(String name, double area, String regionalCenter) {
        this.name = name;
        this.area = area;
        this.regionalCenter = regionalCenter;
        this.districts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getRegionalCenter() {
        return regionalCenter;
    }

    public double getArea() {
        return area;
    }

    public List<District> getDistricts() {
        return districts;
    }

    public void addDistricts(District district){
        districts.add(district);
    }

    @Override
    public String toString() {
        return "Region name: " + name + ", regionalCenter: "
                + regionalCenter + ", area: " + area +
                ", districts: " + districts;
    }
}
