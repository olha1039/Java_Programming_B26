package day07_03_08_2022;

public class P01_FotLoopIntro {
    public static void main(String[] args) {
        /* for(init;condition;frequency of iteration){
        // statements
        if(){
            if(){
                    switch(){
                }
                  }
                    }
        }

      init ----> int i=8  (i-j-k) double-float-short-byte
      condition ---> true / false   i<5
      iteration ---> inc / dec    i++, i--   i+=2 i+=10.....
         */
        String word = "Cydeo School";
        // C y d e o
        // 0 1 2 3 4

        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i) + " ");

        }
        System.out.println("Hello B26");

        System.out.println("====== with variable ======");
        String result = word.charAt(0) + " ";
        System.out.println();
        for (int i = 0; i < word.length(); i++) {
            result += word.charAt(i) + " ";
        }
        System.out.println(result);

        System.out.println("======== Reverse ===============");

        for (int j = word.length() - 1; j >= 0; j--) {
            System.out.print(word.charAt(j));

        }
        System.out.println();
        System.out.println("======== Print out only Cydeo ==========");
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i) == ' '){
                break;
            }
            System.out.print(word.charAt(i));

        }
        System.out.println();
        System.out.println("======== Print out word without space ==========");
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {
                continue; // skip rest of the part
            }
            System.out.print(word.charAt(i));
        }




    }
}
