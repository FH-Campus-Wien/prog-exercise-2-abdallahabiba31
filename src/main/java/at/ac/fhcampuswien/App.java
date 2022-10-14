package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {
    /*Primitive Types vs. Reference Types
    - primitive:
    int, float,
    long, bool,

    z.B. int x = 0;

    - reference:
    String, Scanner,...

    z.B. Scanner s = new Scanner()
    z.B. string s = "hallo"; --> s.toLowerCase();

    Unterschied bei der Speicherung */
    //todo Task 1
    public void largestNumber() {
        // input your solution here
        double nummer;
        int c = 1; //count zählt die Zahlen, die eingegeben werden
        double maxZahl = 0; //hier wird die größte Zahl gespeichert

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Number " + c + ": ");
            nummer = scanner.nextLong();

            if (c == 1 && nummer <= 0) {
                System.out.println("No number entered.");
                break;
            } else if (nummer > maxZahl) {
                maxZahl = nummer;
            } else if (nummer <= 0) {
                System.out.println("The largest number is " + maxZahl + "0");
            }
            c++;
        } while (nummer > 0);
    }

    //todo Task 2
    public void stairs() {
        // input your solution here
        int zahl = 1; //mit der Zahl beginnt die Treppe
        System.out.print("n: ");
        Scanner scanner = new Scanner(System.in);
        int stairRows = scanner.nextInt();

        if (stairRows <= 0) {
            System.out.println("Invalid number!");
        } else {
            for (int i = 1; i <= stairRows; i++) {
                for (int j = 0; j < i; j++) {
                    int x = zahl++;
                    System.out.print(x + " ");

                }
                System.out.println();
            }
        }
    }

    //todo Task 3
    public void printPyramid() {
        // input your solution here
        int nummer = 6; //hier definiere ich die Anzahl der Reihen, die mit Sternen "befüllt" werden

        for (int i = 1; i <= nummer; i++) {
            for (int j = nummer - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus() {
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.print("h: ");
        int h = scanner.nextInt();
        System.out.print("c: ");
        char c = scanner.next().charAt(0);

        if (h % 2 == 1) {
            //Print obere Hälfte
            for (int row = 0; row <= h / 2; row++) {
                for (int row2 = row; row2 < h/2; row2++) {
                    System.out.print(" ");
                }
                for (int diff = 0 - row; diff <= row ; diff++) {
                    // c ist character
                    System.out.print((char) (c - Math.abs(diff)));//Math.abs() liefert einen integer zurück
                }
                System.out.println();
            }
            //Print die untere Hälfte
            for (int row = h / 2; row > 0; row--) {
                for (int row2 = row; row2 <= h / 2; row2++) {
                    System.out.print(" ");
                }
                for (int diff = 0 - row + 1; diff < row; diff++) {
                    System.out.print((char) (c - Math.abs(diff)));
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Invalid number!");
        }
    }


    //todo Task 5
    public void marks(){
        // input your solution here
        int summeDerNoten = 0;
        int countNegativ = 0; //negative Noten
        int anzahlDerNoten = 1; //zählt mit, wie viele Noten eingegeben werden
        Scanner scanner = new Scanner(System.in);
        int note;

        do {
            System.out.print("Mark " + anzahlDerNoten + ": ");
            note = scanner.nextInt();
            if (note > 5 || (note < 1 && note != 0)) {
                System.out.println("Invalid mark!");

            } else if (note != 0) {
                if (note == 5) {
                    countNegativ ++;
                }
                summeDerNoten += note;
                anzahlDerNoten++;
            }
        } while (note != 0); {
            float avg;
            if (anzahlDerNoten == 1) {
                avg = (float) summeDerNoten / (anzahlDerNoten);
            }else {
                avg = (float) summeDerNoten / (anzahlDerNoten -1);
            }
            System.out.printf("Average: " + "%1.2f", avg);
            System.out.println();
            System.out.println("Negative marks: " + countNegativ);
        }


        /*while(true){
            System.out.print("Mark " + anzahlDerNoten + ": ");
            int note = scanner.nextInt();

            if (note > 0 && note <= 5) {
                summeDerNoten = summeDerNoten + note;
                anzahlDerNoten++;

                if (note == 5) {
                    countNegativ++;
                }
            } else if (note < 0 || note > 5) {
                System.out.println("Invalid mark!");
            } else if (note == 0) {
                float avg;
                if (anzahlDerNoten == 1) {
                    avg = (float) summeDerNoten / (anzahlDerNoten);
                }else {
                    avg = (float) summeDerNoten / (anzahlDerNoten -1);
                }
                System.out.printf("Average: " + "%1.2f", avg);
                System.out.println();
                System.out.println("Negative marks: " + countNegativ);
                break;
            }
        }*/
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        int number; //Beispiel mit number = 31
        int sum = 0;
        System.out.print("n: ");
        number = scanner.nextInt();

        while (number != 1 && number != 4){
            while (number != 0){ //1.number: 31 // 2.number: 3 //3.number: 0
                sum += Math.pow(number % 10, 2); //31%10 hier wird es rest geben --> 1 dann 1^2 = 1 also sum = 1
                number /= 10; //31/10 = 3,1 also number = 3 //3/10 = 0.xy, also number = 0
            }
            number = sum; //
            sum = 0; //
        }
        if (number == 1) {
            System.out.println("Happy number!");
        }else {
            System.out.println("Sad number!"); //31 ist eine sad number
        }
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}