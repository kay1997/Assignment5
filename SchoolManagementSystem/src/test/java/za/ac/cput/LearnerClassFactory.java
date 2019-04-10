package za.ac.cput;

import org.junit.Assert;
import org.junit.Test;
import za.ac.cput.domain.Learner;
import za.ac.cput.factory.LearnerFactory;

import static org.junit.Assert.*;

public class LearnerClassFactory {

    @Test
    public void getLearnerFirstName() {

        String id = "970826"
        String name = "Kaylen";
        String lname = "Abrahams";
        String address = "Cape Town";
        String telephone = "0605220503";
        int age = 21;

        Learner l = LearnerFactory.getLearner(id, name, lname, address, telephone, age);
        System.out.println(l);
        Assert.assertNotNull(l.getLearner());
    }
}
