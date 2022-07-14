package day24_05_04_2022.browserTask;

public class Browser {

//    public String version;
//
//    public Browser(String version) {
//        this.version = version;
//    }

    public void open(){
        System.out.println("Opening Browser");
    }
    public void close(){
        System.out.println("Closing Browser");
    }
    public void navigate(String url){
        System.out.println("Type " + url);
        System.out.println("Press Enter");
    }
    // final method can not be overriden
    // I wil not implement them again
    public final void refresh(){
        System.out.println("Refreshing....");
    }
    public final void backward() {
        System.out.println("backward");
    }
    public final void forward() {
            System.out.println("forward");
        }
}
