package edu.eci.cvds.tdd.registry;

import org.junit.Assert;
import org.junit.Test;

public class RegistryTest {

    private Registry registry = new Registry();

    @Test
    public void validateRegistryResult() {

        Person person = new Person("Esteban", 1192793090, 21, Gender.MALE, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.VALID, result);
    }
    
    @Test
    public void validateRegistryResultPersonDead() {

        Person person = new Person("Esteban", 1192793090, 21, Gender.MALE, false);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.DEAD, result);
    }
    
    @Test
    public void validateRegistryResultPersonUnderAge() {

        Person person = new Person("Esteban", 1192793090, 7, Gender.MALE, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }
    
    @Test
    public void validateRegistryResultPersonInvalidAge() {

        Person person = new Person("Esteban", 1192793090, 500, Gender.MALE, true);

        RegisterResult result = registry.registerVoter(person);

        Assert.assertEquals(RegisterResult.INVALID_AGE, result);
    }
    
    @Test
    public void validateRegistryResultPersonDuplicated() {

        Person person = new Person("Esteban", 1192793090, 18, Gender.MALE, true);
        Person person1 = new Person("Guillermo", 1192793090, 26, Gender.MALE, true);

        RegisterResult result = registry.registerVoter(person);
        RegisterResult result1 = registry.registerVoter(person1);

        Assert.assertEquals(RegisterResult.VALID, result);
        Assert.assertEquals(RegisterResult.DUPLICATED, result1);
    }
    // TODO Complete with more test cases
}