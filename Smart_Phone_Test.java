package Abstract_Class_And_Interface;
abstract class Phone{
    abstract void ring();
    abstract void left();
    abstract void disconnect();
}
class SmartPhone extends Phone{
    @Override
    void ring() {
        System.out.println("Ringing....");
    }

    @Override
    void left() {
        System.out.println("lifted call...");
    }

    void disconnect(){
        System.out.println("Call disconnect");
    }

    public void Musics(){
        System.out.println("sounding music...");
    }
}


public class Smart_Phone_Test {
    public static void main(String[] args) {
     SmartPhone p1 = new SmartPhone();
     p1.ring();
     p1.Musics();
    }
}
