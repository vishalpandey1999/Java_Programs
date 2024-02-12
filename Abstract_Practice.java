package Abstract_Class_And_Interface;
abstract class Pan{
    abstract void write();
    abstract void refill();
}
class Foundation_Pan extends Pan{
    @Override
    void write() {
        System.out.println("write....");
    }
    void refill(){
        System.out.println("refill...");
    }

    public void changeNib(){
        System.out.println("Please change the Nib");
    }
}
public class Abstract_Practice {
    public static void main(String[] args) {
        Foundation_Pan fp = new Foundation_Pan();
        fp.write();
        fp.refill();
        fp.changeNib();
    }
}
