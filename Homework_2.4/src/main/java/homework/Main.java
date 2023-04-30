package homework;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Subject subject = new Subject();

        new TvObserver(subject);
        new FridgeObserver(subject);
        new MicrowaveObserver(subject);

        int initialState = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter 1(on) or 0(off): ");
        if (scan.nextInt() == 1) {
            System.out.print("\nThe extension cord is connected!\n");
            subject.setState(1);
        } else {
            System.out.print("\nThe extension cord is not connected!");
        }
    }

}
