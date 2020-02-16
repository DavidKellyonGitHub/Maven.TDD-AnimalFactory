package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void catConstructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();


        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();


        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);

    }

    @Test
    public void dogConstructorTest() {
        // Given (dog data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();


        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate);

        // When (we retrieve data from the dog)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();


        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
    }
}