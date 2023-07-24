public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

public class Dog {
    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay ) {
       if (hourOfDay < 0 || hourOfDay > 23) {
           return false;
       } else if (isBarking  && (hourOfDay <8 || hourOfDay >= 22)){
           return true;
    } else {
           return   false;
       }
}

    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 1));
        System.out.println(shouldWakeUp(false, 2));
        System.out.println(shouldWakeUp(true, 8));
        System.out.println(shouldWakeUp(true, -1));
    }
}

public class Age {
    public static boolean isTeen(int age1, int age2, int age3) {
        return isTeen(age1) || isTeen(age2) || isTeen(age3);
    }
    public static boolean isTeen(int age) {
        return age >= 13 && age <= 19;
    }

    public static void main(String[] args) {
        System.out.println(isTeen(9,99,19));
        System.out.println(isTeen(23, 15,42));
        System.out.println(isTeen(22,23,34));
    }

}

public class Cat {
    public static boolean isCatPlaying(boolean isSummer, int temperature) {
        int upperLimit = isSummer ? 45 : 35;
        return temperature >= 25 && temperature <= upperLimit;

    }

        public static void main(String[] args) {
            System.out.println(isCatPlaying(true, 10));
            System.out.println(isCatPlaying(false, 36));
            System.out.println(isCatPlaying(false,35));
        }

}

public class ShapeCalculator {
    public static double rectangleArea(double length, double width) {
        if (length < 0 || width < 0) {
            return -1;
        }
        return length * width;
    }
    public static   void main(String[] args) {
        System.out.println(rectangleArea(5.0, 4.0));
        System.out.println(rectangleArea(-1.0, 4.0));
    }
}

public class ShapeCalculator {
    public static double circleArea(double radius) {
        if (radius <0) {
            return -1;
        }
        return radius * radius * Math.PI;
    }
    public static void main(String[] args) {
        System.out.println(circleArea(5.0));
        System.out.println(circleArea(-1));
    }
}