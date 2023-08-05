package org.arishin.scan;

import org.arishin.entity.Cat;
import org.arishin.entity.Dog;
import org.arishin.utils.UtilityClass;

import java.util.Arrays;
import java.util.Scanner;

public class MyScanner {

    public void start() {
        this.myScanManage();
    }

    private void myScanManage() {
        System.out.println("Введите данные для расчета пропорций между объектами без пробелов : ");
        Dog dog = new Dog();
        Cat cat = new Cat();
        String tmp;
        String printValue;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            tmp = scanner.next();
            if (tmp.equalsIgnoreCase("exit")) {
                break;
            }
            String[] value = UtilityClass.getValueArrayFromConsole(tmp);

            for (int i = 0; i <= value.length - 1; i++) {
                if (value[i].contains("Cat")) {
                    cat = UtilityClass.catBuilder(value[i]);
                } else if (value[i].contains("Dog")) {
                    dog = UtilityClass.dogBuilder(value[i]);
                } else {
                    System.out.println("Ошибка при вводе наименования объектов");
                    this.start();
                }
            }
            if(dog.isFlag()==false && cat.isFlag()==false){
                System.out.println("Для расчета пропорций у одного из объектов данные должны быть неизвестны!!!" + "\n");
                this.start();
            }
            if (dog.isFlag()) {
                double valueForDog = cat.getWeight() / 2;
                System.out.printf("Пропорция между объектами будет равна :" + cat.getWeight() + "Cat=" + valueForDog + "Dog");
            } else {
                double valueForCat = dog.getWeight() * 2;
                System.out.printf("Пропорция между объектами будет равна : " + valueForCat + "Cat=" + dog.getWeight() + "Dog");
            }
            System.out.println("\n");
            System.out.println("Введите  еще данные для расчета пропорций или exit для завершения операций: ");

        }
    }
}


