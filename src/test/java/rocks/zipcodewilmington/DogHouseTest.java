package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Mammal;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void addTest() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog milo = new Dog(name, birthDate, 1);
        DogHouse.clear();

        // When
        DogHouse.add(milo);


        // Then
        Assert.assertEquals(milo, DogHouse.getDogById(1));
    }

    @Test
    public void removeTest() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog milo = new Dog(name, birthDate, 1);
        DogHouse.clear();

        // When
        DogHouse.remove(1);

        // Then
        Assert.assertEquals(null, DogHouse.getDogById(1));
    }

    @Test
    public void testRemoveTest() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog milo = new Dog(name, birthDate, 1);
        DogHouse.clear();

        // When
        DogHouse.remove(milo);

        // Then
        Assert.assertEquals(null, DogHouse.getDogById(1));
    }

    @Test
    public void getDogByIdTest() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog milo = new Dog(name, birthDate, 1);
        DogHouse.clear();

        // When
        DogHouse.add(milo);

        // Then
        Assert.assertEquals(milo, DogHouse.getDogById(1));
    }

    @Test
    public void getNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog milo = new Dog(name, birthDate, 1);
        DogHouse.clear();

        // When
        DogHouse.add(milo);

        // Then
        Assert.assertEquals(1, DogHouse.getNumberOfDogs(), 0);
    }
}