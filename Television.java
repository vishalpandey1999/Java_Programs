package Abstract_Class_And_Interface;
interface TVRemote{
     void onTV();
     void offTV();
}
interface SmartTVRemote extends TVRemote{
    void musicOn();
}

class TV implements SmartTVRemote{
    @Override
    public void onTV() {
        System.out.println("Just TV on");
    }

    @Override
    public void offTV() {
        System.out.println("Off TV");
    }

    @Override
    public void musicOn() {
        System.out.println("music on now");
    }

    public void channel(){
        System.out.println("Cricket channel...");
    }
}
public class Television {
    public static void main(String[] args) {
        SmartTVRemote tv = new TV();
        tv.onTV();
        tv.offTV();
        tv.musicOn();
    }
}
