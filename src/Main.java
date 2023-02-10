public class Main {
    public static void main(String[] args) {
        //task1
        System.out.println("Задача 1");
        int age = 6;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то он совершеннолетний");
        }
        if (age < 18) {
            System.out.println("Если возраст человек равен " + age + " ,то он не достиг совершеннолетия, нужно немного подождать");
        }

        //task2
        System.out.println("Задача 2");
        int temper = 60;
        if (temper >= 5) {
            System.out.println("На улице " + temper + " градусов, можно идти без шапки");
        }
        if (temper < 5) {
            System.out.println("На улице " + temper + " градусов, нужно надеть шапку");
        }

        //task3
        System.out.println("Задача 3");
        int speed = 50;
        if (speed >= 60) {
            System.out.println("Если скорость равна " + speed + " км/ч, то придётся заплатить штраф");
        }
        if (speed < 60) {
            System.out.println("Если скорость равна " + speed + " км/ч, можно ездить спокойно");
        }

        //task4
        System.out.println("Задача 4");
        int ageHuman = 10;
        if (ageHuman >= 2 && ageHuman <= 6) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в детский сад");
        } else if (ageHuman >= 7 && ageHuman <= 18) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему нужно ходить в школу");
        } else if (ageHuman > 18 && ageHuman <= 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то его место в университете");
        } else if (ageHuman > 24) {
            System.out.println("Если возраст человека равен " + ageHuman + ", то ему пора ходить на работу");
        }

        //task5
        System.out.println("Задача 5");
        int newAge = 10;
        if (newAge <= 5) {
            System.out.println("Если возраст ребенка равен " + newAge + " , то ему нельзя кататься на аттракционе");
        } else if (newAge <= 14) {
            System.out.println("Если возраст ребенка равен " + newAge + " , то он может кататься на аттракционе только в сопровождении взрослого. Если взрослого нет, кататься нельзя");
        } else if (newAge > 14) {
            System.out.println("Если возраст ребенка равен " + newAge + " , то он может кататься на аттракционе без сопровождения взрослого");
        }

        //task6
        System.out.println("Задача 6");
        int allPlaces = 102;
        int sitPlaces = 60;
        int otherPlaces = allPlaces - sitPlaces; // стоячие
        int sit = 6;
        int other = 46;
        if (sit < sitPlaces) {
            System.out.println("Ещё есть " + (sitPlaces - sit) + " сидячих мест");
        } else {
            System.out.println("Сидячих мест нет");
        }
        if (other < otherPlaces) {
            System.out.println("Ещё есть " + (otherPlaces - other) + " стоячих мест");
        } else
            System.out.println("Стоячих мест нет");

        //task7
        System.out.println("Задача 7");
        int one = 10;
        int two = 100;
        int three = 1000;
        if (one > two) {
            if (one >= three) {
                System.out.println("Максимальное число - " + one);
            } else {
                System.out.println("Максимальное число - " + three);
            }
        } else if (two > one){
            if (two >= three) {
                System.out.println("Максимальное число - " + two);
            } else {
                System.out.println("Максимальное число - " + three);
            }
        } else {
            if (one > three) {
                System.out.println("Максимальное число - " + one);
            } else if (three > one) {
                System.out.println("Максимальное число - " + three);
            } else {
                System.out.println("Все числа равны");
            }
        }
    }
}