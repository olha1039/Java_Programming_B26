package day24_05_04_2022.browserTask;

public final class Chrome extends Browser {

//    public Chrome() {
//        super("101");
//    }

    @Override
    public void open(){
        System.out.println("Opening Chrome Browser");
    }
    @Override
    public void close(){
        System.out.println("Closing Chrome Browser");
    }
}
