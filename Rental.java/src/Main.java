import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Seashore one = new Seashore();
        one = getData(one);
        System.out.println("Datele evenimentului ");
        System.out.println("Numele evinemtului = "+one.getContractNumber()+ " Orele "+one.getHoursAndMinutes() +"Pretul "+one.getpret()+ "ore "+one.getnumarOre());
    }


public static Seashore getData(Seashore ss)
{
    String nume;
    int ore;
Scanner keyboard=new Scanner(System.in);
    System.out.println("Numele evenimentului");
    nume= keyboard.nextLine();
    System.out.println("numarul de minute");
    ore=keyboard.nextInt();
    ss.setContractNumber(nume);
    ss.setHoursAndMinutes(ore);
    return ss;
        }
    }
