import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
     Catering one=new Catering();
    one=getData(one);
  System.out.print("Datele evenimentului ");
          System.out.println("Numele evenimentului este"+ one.getEventNumber()+"Pretul per invitat este "+one.getGuests()+" ");
    }
    public static Catering getData(Catering ca)
    {
        int guest;
        String numeeven;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Numele evenimentului");
        numeeven= keyboard.nextLine();
        System.out.println("numarul de invitati");
        guest=keyboard.nextInt();
        ca.setEventNumber(numeeven);
        ca.setGuests(guest);
        return ca;
    }
}