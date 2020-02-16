package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;
import sun.jvm.hotspot.ui.EditableAtEndDocument;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest(){
        // Given (cat data)
        String newName = "Mr. Whiskers";
        Date newBirthDate = new Date();
        int newID = 1;


        // When (a cat is constructed)
        Cat cat = new Cat(newName,newBirthDate,newID);

        // When (set cat name)
        String retrievedName = cat.getName();



        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(newName, retrievedName);
    }

    @Test
    public void setBirthDateTest(){
        // Given (cat data)
        String newName = "Mr. Whiskers";
        Date newBirthDate = new Date();
        int newID = 1;


        // When (a cat is constructed)
        Cat cat = new Cat(newName,newBirthDate,newID);

        // When (set cat birthdate)
        Date retrievedBirthdate = cat.getBirthDate();



        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(newBirthDate, retrievedBirthdate);
    }

    @Test
    public void speakTest(){

            // Given (cat data)
            String newName = "Mr. Whiskers";
            Date newBirthDate = new Date();
            int newID = 1;


            // When (a cat is constructed)
            Cat cat = new Cat(newName,newBirthDate,newID);

            // When (speak invoked)
            String meow = cat.speak();



            // Then (we expect the given data, to match the retrieved data)
            Assert.assertEquals("meow!", meow);
    }
    @Test
    public void eatTest(){
        // Given (cat data)
        String newName = "Mr. Whiskers";
        Date newBirthDate = new Date();
        int newID = 1;
        Food fishies = new Food();


        // When (a cat is constructed)
        Cat cat = new Cat(newName,newBirthDate,newID);
        int meals = cat.getNumberOfMealsEaten();

        // When (eat invoked)
        cat.eat(fishies);



        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(meals + 1, cat.getNumberOfMealsEaten(), 0);
    }

    @Test
    public void getIdTest(){
        // Given (cat data)
        String newName = "Mr. Whiskers";
        Date newBirthDate = new Date();
        int newID = 1;
        Food fishies = new Food();


        // When (a cat is constructed)
        Cat cat = new Cat(newName,newBirthDate,newID);


        // When (eat invoked)
        int retrievedID = cat.getId();



        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(newID, retrievedID);
    }
    @Test
    public void animalInheritanceTest() {
        // Given (cat data)
        String newName = "Mr. Whiskers";
        Date newBirthDate = new Date();
        int newID = 1;


        // When (a cat is constructed)
        Cat cat = new Cat(newName, newBirthDate, newID);


        // When (eat invoked)
        Boolean isIt = cat instanceof Animal;


        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(true, isIt);
    }

    @Test
    public void mammalInheritanceTest() {
        // Given (cat data)
        String newName = "Mr. Whiskers";
        Date newBirthDate = new Date();
        int newID = 1;


        // When (a cat is constructed)
        Cat cat = new Cat(newName, newBirthDate, newID);


        // When (eat invoked)
        Boolean isIt = cat instanceof Mammal;


        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(true, isIt);
    }

}
