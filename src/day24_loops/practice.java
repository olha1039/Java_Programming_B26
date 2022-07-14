package day24_loops;

public class practice {
    public static void main(String[] args) {

        int fir, sec = 1;
        fir = (sec > 1) ? 2:1;
        switch(fir){
            case 0:
                System.out.print(0);
                break;
            case 1:
                System.out.print(1);
            case 2:
                System.out.print(2);
                break;
            case 3:
                System.out.print(3);
                break;
        }
    }
}
