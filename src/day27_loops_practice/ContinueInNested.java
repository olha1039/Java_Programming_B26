package day27_loops_practice;

public class ContinueInNested {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            if(i == 1 || i == 2){
                continue; //skips 1 and 2 in the outer loop
            }
            System.out.println("i " + i);
            for (int j = 0; j < 3; j++) {
//                if(j == 1){
//                    continue; continue here is skipping the iteration when j is 1, so it does not get printed
//                }
                System.out.println("\tj " + j);
            }
        }
    }
}
