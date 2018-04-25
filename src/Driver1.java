import pumps.GasPump2;

import java.util.Scanner;

public class Driver1 {
    public static void main(String[] args) {
        GasPump2 gp2 = new GasPump2();
        float a, b, c;
        int c1;
        char ch;
//Menu
        System.out.println("\t\t\t\t\tGasPump-2");
        System.out.println("\t\tMENU of Operations");
        System.out.println("\t\t0. Activate(float, float, float)");
        System.out.println("\t\t1. PayCash(int)");
        System.out.println("\t\t2. PayCredit()");
        System.out.println("\t\t3. Approved()");
        System.out.println("\t\t4. Reject()");
        System.out.println("\t\t5. Cancel()");
        System.out.println("\t\t6. Premium()");
        System.out.println("\t\t7. Regular()");
        System.out.println("\t\t8. Super()");
        System.out.println("\t\t9. StartPump()");
        System.out.println("\t\ta. PumpLiter()");
        System.out.println("\t\tb. Stop()");
        System.out.println("\t\tc. Receipt()");
        System.out.println("\t\td. NoReceipt()");
        System.out.println("\t\tq. Quit the program");
        System.out.println("\t\tPlease make a note of these operations");
        System.out.println("\t\tGasPump-2 Execution");
        Scanner reader = new Scanner(System.in);
        ch = '1';
        while (ch != 'q') {
            System.out.println(" Select Operation: ");
            System.out.println("0-Activate,1-PayCash,2- PayCredit,3-Approved,4-Reject,5-Cancel,6-Premium,");
            System.out.println("7-Regular,8-Super,9-StartPump,a- PumpLiter,b-Stop,c-Receipt,d-NoReceipt,q-quit");
            System.out.println("enter your choice1");
            ch = (char) reader.next().charAt(0);
            switch (ch) {
                case '0': { //Activate()
                    System.out.println(" Operation:");
                    System.out.println(" Enter value:");
                    a = reader.nextFloat();
                    System.out.println(" Enter value");
                    b = reader.nextFloat();
                    System.out.println(" Enter value");
                    c = reader.nextFloat();
                    gp2.Activate(a, b, c);
                    break;
                }
                case '2': { //PayCredit
                    System.out.println(" Operation: PayCredit()");
                    gp2.PayCredit();
                    break;
                }
                case '3': { //Approved
                    System.out.println(" Operation: Approved()");
                    gp2.Approved();
                    break;
                }
                case '4': {//Reject
                    System.out.println(" Operation: Reject()");
                    gp2.Reject();
                    break;
                }
                case '5': {//Cancel
                    System.out.println("Operation: Cancel()");
                    gp2.Cancel();
                    break;
                }
                case '6': {//Premium
                    System.out.println(" Operation: Premium()");
                            gp2.Premium();
                    break;
                }
                case '7': { //Regular
                    System.out.println(" Operation: Regular()");
                            gp2.Regular();
                    break;
                }
                case '8': { //Super
                    System.out.println("Operation: Super()");
                    gp2.Super();
                    break;
                }
                case '1': { //PayCash
                    System.out.println("Operation:PayCash( int c)");
                    System.out.println("Enter value of the parameter c:");
                    gp2.Super();
                    break;
                }
                case '9': {//StartPump
                    System.out.println(" Operation: StartPump()");
                            gp2.StartPump();
                    break;
                }
                case 'a': {
                    //PumpLiter
                    System.out.println(" Operation: PumpLiter()");
                            gp2.PumpLiter();
                    break;
                }
                case 'b': { //Stop
                    System.out.println(" Operation: Stop()");
                    gp2.Stop();
                    break;
                }
                case 'c': { //Receipt
                    System.out.println(" Operation: Receipt()");
                    gp2.NoReceipt();
                    break;
                }
                case 'd': { //NoReceipt
                    System.out.println(" Operation: NoReceipt()");
                            gp2.NoReceipt();
                    break;
                }
                case 'q':
                    break;
            }// endswitch
        } //endwhile
    }//main
}