package com.company;

public class Main {

    public static void main(String[] args) {

        int temperature = -6;
        int numberOfStudents = 5;
        boolean isItSnowy = false;

        if (temperature < 0) {
            System.out.println("Лучше остаться дома");
            System.out.println("Холодно!");
        }

        if (isItSnowy) {
            System.out.println("Надентье шапку");
        }

        int a = 0;

        if (numberOfStudents > 10) {
            System.out.println("Едем на пикник");
        } else {
            System.out.println("Идем в кино");
        }

        if (isItSnowy) {
            System.out.println("Одевайте куртку");
        } else if (temperature > -10) {
            System.out.println("Надентье футболку");
        } else if (numberOfStudents > 2) {
            System.out.println("Вас больше 2 человек");
        } else {
            System.out.println("Одежда на выбор");
        }

        if (numberOfStudents < 20){
            System.out.println("Необходимо заказать минибус");
            if (isItSnowy){
                System.out.println("Минибус должен быть оснащен зимней резиной");
            }else{
                System.out.println("Минибус пусть будет красного цвета");
                }
            }
        }
    }

}
