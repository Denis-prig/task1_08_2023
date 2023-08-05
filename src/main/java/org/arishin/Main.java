package org.arishin;

import org.arishin.scan.MyScanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Старт расчета пропорций Cat и Dog. Исходные данные для расчетов  2Cat=1Dog");
        new MyScanner().start();
    }
}