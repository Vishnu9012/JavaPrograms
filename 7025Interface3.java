
interface Flyable {
    void fly_obj();
}

class Spacecraft implements Flyable {
    public void fly_obj() {
        System.out.println("Spacecraft is flying in outer space.");
    }
}


class Airplane implements Flyable {
    public void fly_obj() {
        System.out.println("Airplane is flying in the sky.");
    }
}

class Helicopter implements Flyable {
    public void fly_obj() {
        System.out.println("Helicopter is flying in the air.");
    }
}

 class A {
    public static void main(String[] args) {
        Flyable obj1 = new Spacecraft();
        Flyable obj2 = new Airplane();
        Flyable obj3 = new Helicopter();

        obj1.fly_obj();
        obj2.fly_obj();
        obj3.fly_obj();
    }
}
