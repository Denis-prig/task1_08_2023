package org.arishin.utils;

import org.arishin.entity.Cat;
import org.arishin.entity.Dog;

public class UtilityClass {


    public static String[] getValueArrayFromConsole(String value) {
        String[] array = value.split("=");
        return array;
    }

    public static Cat catBuilder(String s) {
        Cat cat = new Cat();
        if (s.contains("?")) {
            cat.setFlag(true);
        } else {
            String[] valueCat = s.split("Cat");
            cat.setWeight(Double.parseDouble(valueCat[0]));
            cat.setFlag(false);
        }
        return cat;
    }

    public static Dog dogBuilder(String s) {
        Dog dog = new Dog();
        if (s.contains("?")) {
            dog.setFlag(true);
        } else {
            String[] valueCat = s.split("Dog");
            dog.setWeight(Double.parseDouble(valueCat[0]));
            dog.setFlag(false);
        }
        return dog;
    }

}
