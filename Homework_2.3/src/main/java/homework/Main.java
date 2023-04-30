package homework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        // int c = in.nextInt();
        // Sum3Nr s3 = new Sum3Nr(a, b, c);

        Sum3Nr s3 = new Sum3Nr(a, b, 0);
        AdapterSum3NrToSum2Nr adapterSum3NrToSum2Nr = new AdapterSum3NrToSum2Nr(s3);
        System.out.println(adapterSum3NrToSum2Nr.sum(a, b));

    }

}