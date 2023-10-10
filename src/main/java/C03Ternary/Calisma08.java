package C03Ternary;

public class Calisma08 {

    public static void main(String[] args) {

//       int y = 112;
//       System.out.println( y>5 ? "inek" : "Koyun"); //inek


//        int y = 112;
//        System.out.println((y < 91) ? 9 : 11); //11

 //       y++; -> decrement z--; -> increment

        int y  = 1;
        int z = 2;

        int a = y < 10 ? ++y : --z; // 2

        System.out.println(y +","+ z + ","+ a); //2-2  //2-2 //2-2
        int k = a;
        System.out.println(k);
    }
}
