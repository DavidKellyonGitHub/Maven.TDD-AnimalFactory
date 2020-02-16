package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testGetNumberOfCats() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);

        // Then
        CatHouse.getNumberOfCats();
    }

    @Test
    public void addTest() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Cat milo = new Cat(name, birthDate, 1);
        CatHouse.clear();

        // When
        CatHouse.add(milo);


        // Then
        Assert.assertEquals(milo, CatHouse.getCatById(1));
    }

    @Test
    public void removeTest() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Cat milo = new Cat(name, birthDate, 1);
        CatHouse.clear();

        // When
        CatHouse.remove(1);

        // Then
        Assert.assertEquals(null, CatHouse.getCatById(1));
    }

    @Test
    public void testRemoveTest() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Cat milo = new Cat(name, birthDate, 1);
        CatHouse.clear();

        // When
        CatHouse.remove(milo);

        // Then
        Assert.assertEquals(null, CatHouse.getCatById(1));
    }

    @Test
    public void getCatByIdTest() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Cat milo = new Cat(name, birthDate, 1);
        CatHouse.clear();

        // When
        CatHouse.add(milo);

        // Then
        Assert.assertEquals(milo, CatHouse.getCatById(1));
    }

    @Test
    public void getNumberOfCats() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Cat milo = new Cat(name, birthDate, 1);
        CatHouse.clear();

        // When
        CatHouse.add(milo);

        // Then
        Assert.assertEquals(1, CatHouse.getNumberOfCats(), 0);
    }
}
