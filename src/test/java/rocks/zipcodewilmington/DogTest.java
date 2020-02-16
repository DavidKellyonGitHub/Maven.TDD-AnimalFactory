package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;

import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
   

    @Test
    public void setBirthDateTest(){
        // Given (dog data)
        String newName = "Mr. Whiskers";
        Date newBirthDate = new Date();
        int newID = 1;


        // When (a dog is constructed)
        Dog dog = new Dog(newName,newBirthDate,newID);

        // When (set dog birthdate)
        Date retrievedBirthdate = dog.getBirthDate();



        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(newBirthDate, retrievedBirthdate);
    }

    @Test
    public void speakTest(){

        // Given (dog data)
        String newName = "Professor Barkley";
        Date newBirthDate = new Date();
        int newID = 1;


        // When (a dog is constructed)
        Dog dog = new Dog(newName,newBirthDate,newID);

        // When (speak invoked)
        String bark = dog.speak();



        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals("bark!", bark);
    }
    @Test
    public void eatTest(){
        // Given (dog data)
        String newName = "Mr. Whiskers";
        Date newBirthDate = new Date();
        int newID = 1;
        Food bones = new Food();


        // When (a dog is constructed)
        Dog dog = new Dog(newName,newBirthDate,newID);
        int meals = dog.getNumberOfMealsEaten();

        // When (eat invoked)
        dog.eat(bones);



        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(meals + 1, dog.getNumberOfMealsEaten(), 0);
    }

    @Test
    public void getIdTest(){
        // Given (dog data)
        String newName = "Mr. Whiskers";
        Date newBirthDate = new Date();
        int newID = 1;
        Food fishies = new Food();


        // When (a dog is constructed)
        Dog dog = new Dog(newName,newBirthDate,newID);


        // When (eat invoked)
        int retrievedID = dog.getId();



        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(newID, retrievedID);
    }
    @Test
    public void animalInheritanceTest() {
        // Given (dog data)
        String newName = "Mr. Whiskers";
        Date newBirthDate = new Date();
        int newID = 1;


        // When (a dog is constructed)
        Dog dog = new Dog(newName, newBirthDate, newID);


        // When (eat invoked)
        Boolean isIt = dog instanceof Animal;


        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(true, isIt);
    }

    @Test
    public void mammalInheritanceTest() {
        // Given (dog data)
        String newName = "Mr. Whiskers";
        Date newBirthDate = new Date();
        int newID = 1;


        // When (a dog is constructed)
        Dog dog = new Dog(newName, newBirthDate, newID);


        // When (eat invoked)
        Boolean isIt = dog instanceof Mammal;


        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(true, isIt);
    }
}
