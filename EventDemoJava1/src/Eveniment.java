import java.util.Scanner;

public class Eveniment {
    public static void invitati ()
    {
        int inv, z;
        System.out.print("Adaugati nr de invitati=   \n ");
        Scanner inputDevice = new Scanner(System.in);
        inv = inputDevice.nextInt();
        z = inv;
        pret(z);
        System.out.print("Nr de invitati este = " + inv);

    }
    public static void pret ( int a2)
    {

        int p2 = a2 * 35;
        System.out.print("Pretul este  ");
        System.out.println(p2);
        System.out.print("ESTE UN EVENIMENT MARE?=  ");
        System.out.println(a2 > 50);
    }

    public static void nrevenimente ()
    {
        int numarevenimente;
        System.out.print("Adaugati nr de Evenimente=  \n ");
        Scanner inputDevice = new Scanner(System.in);
        numarevenimente = inputDevice.nextInt();
        for (int i = 1; i < numarevenimente; i++) {
            System.out.println(" \n Evenimentul " + i);
            invitati();

        }

    }
    public static void motto ()
    {

        System.out.print(" \n MOTTTTTTTTTTTOOOOOOOOOOO LAB 1 \n");
    }


}
