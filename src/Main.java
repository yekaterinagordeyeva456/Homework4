public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1() {
        System.out.println("Задача 1:");
        int age = 6;
        if (age >= 18){
            System.out.println("если возраст человека= " + age + ", то он совершеннолетний.");
        } else {
            System.out.println("если возраст человека= " + age + ", то он несовершеннолетний.");
        }
    }
    public static void task2() {
        System.out.println("Задача 2:");
        int temp = 10;
        if (temp <= 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки.");
        }
    }

    public static void task3() {
        System.out.println("Задача 3:");
        int speed = 40;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }
    }

    public static void task4() {
        System.out.println("Задача 4:");
        int age = 18;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен = " + age + " то ему нужно ходить в детский сад.");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен = " + age + " то ему нужно ходить в школу.");
        }
        if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен = " + age + " то его место в университете.");
        }
        if (age > 24) {
            System.out.println("Если возраст человека равен = " + age + " то ему пора ходить на работу.");
        }
    }

    public static void task5() {
        System.out.println("Задача 5:");
        int age = 14;
        boolean inPresenceAdult = age >= 5 && age < 14;
        boolean w_outPresenceAdult = age >= 14;
        if (inPresenceAdult) {
            System.out.println("Если возраст ребенка равен = " + age + ", то он может кататься в сопровождением взрослого.");
        } else {
            if (w_outPresenceAdult) {
                System.out.println("Если возраст ребенка равен = " + age + ", то он может кататься без сопровождения взрослого.");
            } else {
                System.out.println("Если возраст ребенка равен = " + age + ", то он не может кататься на аттракционе.");
            }
        }
    }
    public static void task6() {
        System.out.println("Задача 6:");
        int seatNumber = 103;
        boolean seatPlace = seatNumber <= 60;
        boolean stayPlace = seatNumber > 60 && seatNumber <= 102;
        if(seatPlace) {
            System.out.println("место в вагоне есть, сидячее.");
        }
            if(stayPlace) {
                System.out.println("место в вагоне есть, стоячее.");
            }else {
                System.out.println("Вагон забит, мест нет.");
        }

    }
    public static void task7() {
        System.out.println("Задача 7:");
        int one = 4;
        int two = 30;
        int three = 50;
        boolean oneMax = one > two && one > three;
        boolean twoMax = two > one && two > three;
        boolean threeMax = three > one && three > two;
        if (oneMax) {
            System.out.println(one);
        }
        if (twoMax) {
            System.out.println(two);
        }
        if(threeMax) {
            System.out.println(three);
        }

    }
}