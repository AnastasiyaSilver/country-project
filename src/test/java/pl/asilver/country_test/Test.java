package pl.asilver.country_test;

import org.testng.Assert;
import pl.asilver.country_project.service.Service;
import pl.asilver.country_project.subject.Citizen;
import pl.asilver.country_project.subject.Country;


public class Test {
    @org.testng.annotations.Test
    public void testGetRegionsCount() {
        Country country = Country.getInstance();

        Assert.assertEquals(country.getRegionsCount(), 3);
    }

    @org.testng.annotations.Test
    public void testGetAverageCitizenAge() {
        Country country = Country.getInstance();

        Service service = new Service(country.getRegions());

        Citizen citizen1 = new Citizen();
        citizen1.setAge(30);
        Citizen citizen2 = new Citizen();
        citizen2.setAge(40);
        service.addCitizen(citizen1);
        service.addCitizen(citizen2);

        Assert.assertEquals(service.getAverageCitizenAge(), 35.0);
    }

}


