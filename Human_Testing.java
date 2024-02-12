package Abstract_Class_And_Interface;
interface Simple_Animal{
     void eat();
     void sleep();
}
class Monkey{
    public void jump(){
        System.out.println("Monkey is jumping here and where...");
    }

    public void bite(){
        System.out.println("Monkey is biting the fruit");
    }
}
class Human extends Monkey implements Simple_Animal{
    @Override
    public void eat() {
        System.out.println("Eating food...");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping all time....");
    }
}

public class Human_Testing {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.eat();
        h1.sleep();
        h1.bite();
        h1.jump();
    }
}
