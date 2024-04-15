package pl.asilver.country_test;

import org.testng.Assert;
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

        Citizen citizen1 = new Citizen();
        citizen1.setAge(30);
        Citizen citizen2 = new Citizen();
        citizen2.setAge(40);
        country.addCitizen(citizen1);
        country.addCitizen(citizen2);

        Assert.assertEquals(country.getAverageCitizenAge(), 35.0);
    }

}


