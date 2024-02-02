public class Practice_Set {
    public static void main(String[] args) {
        // Problem 1 & Problem 2
        System.out.println("Problem 1 & Problem 2");
        FountainPen fountainPen = new FountainPen();
        fountainPen.write();
        fountainPen.refill();
        System.out.println();

        // Problem 3
        System.out.println("Problem 3");
        Human human = new Human();
        human.jump();
        human.bite();
        human.eat();
        human.sleep();
        System.out.println();

        // Problem 4
        System.out.println("Problem 4");
        SmartTelephone smartTelephone = new SmartTelephone();
        smartTelephone.dial();
        smartTelephone.lift();
        smartTelephone.disconnect();
        System.out.println();

        // Problem 5
        System.out.println("Problem 5");
        PolymorphismDemo demo = new PolymorphismDemo();
        Monkey monkey = new Monkey();
        demo.performActions(monkey);
        System.out.println();

        // Problem 6
        System.out.println("Problem 6");
        SmartTVRemote smartTVRemote = new SmartTVRemote() {
            @Override
            public void turnOn() {
                System.out.println("Turning on Smart TV");
            }

            @Override
            public void turnOff() {
                System.out.println("Turning off Smart TV");
            }

            @Override
            public void browseInternet() {
                System.out.println("Browsing internet on Smart TV");
            }
        };
        smartTVRemote.turnOn();
        smartTVRemote.turnOff();
        smartTVRemote.browseInternet();
        System.out.println();

        // Problem 7
        System.out.println("Probelm 7");
        TV tv = new TV();
        tv.turnOn();
        tv.turnOff();
        System.out.println();
    }
}

abstract class Pen {
    abstract void write();

    abstract void refill();
}

class FountainPen extends Pen {
    void changeNib() {
        System.out.println("Changing nib of Fountain Pen");
    }

    @Override
    void write() {
        System.out.println("Writing with Fountain Pen");
    }

    @Override
    void refill() {
        System.out.println("Refilling Fountain Pen");
    }
}

class Monkey {
    void jump() {
        System.out.println("Monkey is jumping");
    }

    void bite() {
        System.out.println("Monkey is biting");
    }
}

interface Animal {
    void eat();

    void sleep();
}

class Human extends Monkey implements Animal {
    @Override
    public void eat() {
        System.out.println("Human is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Human is sleeping");
    }
}

abstract class Telephone {
    abstract void dial();

    abstract void lift();

    abstract void disconnect();
}

class SmartTelephone extends Telephone {
    @Override
    void dial() {
        System.out.println("Dialing a number in Smart Telephone");
    }

    @Override
    void lift() {
        System.out.println("Lifting Smart Telephone");
    }

    @Override
    void disconnect() {
        System.out.println("Disconnecting Smart Telephone");
    }
}

class PolymorphismDemo {
    void performActions(Monkey monkey) {
        monkey.jump();
        monkey.bite();
    }
}

interface TVRemote {
    void turnOn();

    void turnOff();
}

interface SmartTVRemote extends TVRemote {
    void browseInternet();
}

class TV implements TVRemote {
    @Override
    public void turnOn() {
        System.out.println("Turning on the TV");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off the TV");
    }
}