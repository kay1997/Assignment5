package za.ac.cput.factory;

import za.ac.cput.domain.Learner;

public class LearnerFactory {

    public static Learner getLearner(String id, String firstName, String lastName, String address, String telephoneNumber, int age) {
        return new Learner.Builder().age(age)
                .learnerFirstName(firstName)
                .learnerLastName(lastName)
                .learnerId(id)
                .learnerAddress(address)
                .learnerTelephoneNumber(telephoneNumber)
                .build();
    }
}
