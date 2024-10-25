package com.example.lab8;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    public CustomList MockCityList() {
        CustomList list = new CustomList(null, new ArrayList<>());
        return list;
    }

    @Test
    public void addCityTest() {
        CustomList list = MockCityList(); //expected value for count is 0
        int expectedCountBeforeAdd = 0;
        assertEquals(expectedCountBeforeAdd, list.getCount(), "Count should be 0.");
        //call AddCity Method
        City cityToAdd = new City("Nanton", "AB");
        list.addCity(cityToAdd);

        //check that count of cities increased by one
        int expectedCountAfterAdd = 1;
        assertEquals(expectedCountAfterAdd, list.getCount(), "The city count is now 1");
    }

    private City mockCity() {
        return new City("Etobicoke", "ON");
    }

    @Test
    public void hasCityTest(){
        CustomList list = MockCityList();
        assertTrue(list.hasCity(mockCity()));
    }

}
