import java.util.Scanner;

public class nr {
    private static final String PIN = "0000";
    private static final String PUK = "12345678";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pinAttempts = 0;
        int pukAttempts = 0;
        boolean isPinCorrect = false;
        boolean isPukCorrect = false;

       
        while (pinAttempts < 3) {
            System.out.println("===== Sir Jay Telecom =====");
            System.out.print("Please Enter your SIM card PIN Number: ");
            String enteredPin = scanner.nextLine();
            
            if (enteredPin.equals(PIN)) {
                isPinCorrect = true;
                break;
            } else {
                System.out.println("Invalid PIN");
            }
            pinAttempts++;
        }
        
        if (isPinCorrect) {
            System.out.println("=====Welcome to Sir Jay Telecom=====");
            System.out.println("****A Telecom that Always On-Line****");
            System.out.println("╔═════════════════════════════════╗");
            System.out.println("║ 10: 00 AM                   <<< ║");
            System.out.println("║                                 ║");
            System.out.println("║                                 ║");
            System.out.println("║        A Telecom that           ║");
            System.out.println("║        Always On-Line           ║");
            System.out.println("║        Call and Text Na!        ║");
            System.out.println("║                                 ║");
            System.out.println("║                                 ║");
            System.out.println("╚═════════════════════════════════╝");
            System.out.println("║                                 ║");
            System.out.println("║                                 ║");
            System.out.println("║  [1]         [2]          [3]   ║");
            System.out.println("║  [4]         [5]          [6]   ║");
            System.out.println("║  [7]         [8]          [9]   ║");
            System.out.println("║  [*]         [0]          [#]   ║");
            System.out.println("╚═════════════════════════════════╝");
        } else {
            
            while (pukAttempts < 3) {
                System.out.print("****************************************************\nPlease Enter your PUK Code: ");
                String enteredPuk = scanner.nextLine();
                
                if (enteredPuk.equals(PUK)) {
                    isPukCorrect = true;
                    System.out.println("=====Welcome to Sir Jay Telecom=====");
                    System.out.println("****A Telecom that Always On-Line****");
                    System.out.println("╔═════════════════════════════════╗");
                    System.out.println("║ 10: 00 AM                   <<< ║");
                    System.out.println("║                                 ║");
                    System.out.println("║                                 ║");
                    System.out.println("║        A Telecom that           ║");
                    System.out.println("║        Always On-Line           ║");
                    System.out.println("║        Call and Text Na!        ║");
                    System.out.println("║                                 ║");
                    System.out.println("║                                 ║");
                    System.out.println("╚═════════════════════════════════╝");
                    System.out.println("║                                 ║");
                    System.out.println("║                                 ║");
                    System.out.println("║  [1]         [2]          [3]   ║");
                    System.out.println("║  [4]         [5]          [6]   ║");
                    System.out.println("║  [7]         [8]          [9]   ║");
                    System.out.println("║  [*]         [0]          [#]   ║");
                    System.out.println("╚═════════════════════════════════╝");
                    break;
                } else {
                    System.out.println("Invalid PUK Code");
                }
                pukAttempts++;
            }
            
            if (!isPukCorrect) {
            	 System.out.println("=====Welcome to Sir Jay Telecom=====");
                 System.out.println("****A Telecom that Always On-Line****");
                 System.out.println("╔═════════════════════════════════╗");
                 System.out.println("║ 10: 00 AM                   <<< ║");
                 System.out.println("║                                 ║");
                 System.out.println("║                                 ║");
                 System.out.println("║        YOU ARE BUSTED           ║");
                 System.out.println("║                                 ║");
                 System.out.println("║       ☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺☺         ║");
                 System.out.println("║                                 ║");
                 System.out.println("║                                 ║");
                 System.out.println("╚═════════════════════════════════╝");
                 System.out.println("║                                 ║");
                 System.out.println("║                                 ║");
                 System.out.println("║  [1]         [2]          [3]   ║");
                 System.out.println("║  [4]         [5]          [6]   ║");
                 System.out.println("║  [7]         [8]          [9]   ║");
                 System.out.println("║  [*]         [0]          [#]   ║");
                 System.out.println("╚═════════════════════════════════╝");
            }
        }
        scanner.close();
    }
}