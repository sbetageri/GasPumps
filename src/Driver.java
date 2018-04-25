import pumps.GasPump1;
import pumps.GasPump2;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select 1 for GasPump1");
        System.out.println("Select 2 for GasPump2");
        int choice = sc.nextInt();
        if (choice == 0) {
            GasPump1Driver(sc);
        } else {
            GasPump2Driver(sc);
        }
    }

    public static void GasPump1Driver(Scanner sc) {
        System.out.println("GasPump 1 Selected");
        GasPump1 gp1 = new GasPump1();
        while (true) {
            System.out.println("Actions available");
            System.out.print("1. Activate\t");
            System.out.print("2. Start\t");
            System.out.print("3. PayCredit\t");
            System.out.println("4. PayDebit\t"); // has pin op in it
            System.out.print("5. Approved\t");
            System.out.print("6. Reject\t");
            System.out.print("7. Cancel\t");
            System.out.println("8. Regular\t");
            System.out.print("9. Diesel\t");
            System.out.print("10. StartPump\t");
            System.out.print("11. PumpGallon\t");
            System.out.println("12. StopPump\t");
            System.out.print("13. FullTank\t");
            System.out.println("-1 : quit");

            int ip = sc.nextInt();

            switch (ip) {
                case 1:
                    System.out.println("Enter prices Regular, Diesel fuel");
                    float reg = sc.nextFloat();
                    float diesel = sc.nextFloat();
                    gp1.Activate(reg, diesel);
                    break;

                case 2:
                    gp1.Start();
                    break;

                case 3:
                    gp1.PayCredit();
                    break;

                case 4:
                    System.out.println("Debit pin");
                    String pin = sc.next();
                    gp1.PayDebit(pin);

                    System.out.println("Enter pin");
                    String userPin = sc.next();
                    gp1.Pin(userPin);
                    break;

                case 5:
                    gp1.Approved();
                    break;

                case 6:
                    gp1.Reject();
                    break;

                case 7:
                    gp1.Cancel();
                    break;

                case 8:
                    gp1.Regular();
                    break;

                case 9:
                    gp1.Diesel();
                    break;

                case 10:
                    gp1.StartPump();
                    break;

                case 11:
                    gp1.PumpGallon();
                    break;

                case 12:
                    gp1.StopPump();
                    break;

                case 13:
                    gp1.StopPump();
                    break;

                case -1:
                    return;

                default:
                    return;

            }
        }
    }

    public static void GasPump2Driver(Scanner sc) {
        System.out.println("GasPump 2 Selected");
        GasPump2 gp2 = new GasPump2();
        while (true) {
            System.out.println("Actions available");
            System.out.print("1. Activate\t");
            System.out.print("2. PayCash\t");
            System.out.print("3. PayCredit\t");
            System.out.println("4. Approved\t"); // has pin op in it
            System.out.print("5. Rejec\t");
            System.out.print("6. Cancel\t");
            System.out.print("7. Premium\t");
            System.out.println("8. Regular\t");
            System.out.print("9. Super\t");
            System.out.print("10. StartPump\t");
            System.out.print("11. PumpLiter\t");
            System.out.println("12. Stop\t");
            System.out.print("13. Receipt\t");
            System.out.print("14. NoReceipt\t");
            System.out.println("-1 : quit");

            int ip = sc.nextInt();

            switch (ip) {
                case 1:
                    System.out.println("Enter prices Super, Regular and Premium fuel");
                    float sup = sc.nextFloat();
                    float reg = sc.nextFloat();
                    float premium = sc.nextFloat();
                    gp2.Activate(sup, reg, premium);
                    break;

                case 2:
                    System.out.println("Enter Cash Amount");
                    int cash = sc.nextInt();
                    gp2.PayCash(cash);
                    break;

                case 3:
                    gp2.PayCredit();
                    break;

                case 4:
                    gp2.Approved();
                    break;

                case 5:
                    gp2.Reject();
                    break;

                case 6:
                    gp2.Cancel();
                    break;

                case 7:
                    gp2.Premium();
                    break;

                case 8:
                    gp2.Regular();
                    break;

                case 9:
                    gp2.Super();
                    break;

                case 10:
                    gp2.StartPump();
                    break;

                case 11:
                    gp2.PumpLiter();
                    break;

                case 12:
                    gp2.Stop();
                    break;

                case 13:
                    gp2.Receipt();
                    break;

                case 14:
                    gp2.NoReceipt();
                    break;

                case -1:
                    return;

                default:
                    return;

            }
        }
    }
}
