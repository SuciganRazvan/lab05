import java.util.Scanner;
public class DeclarareMonstru {
    public static void main(String[] args) {
        Monstru one=new Monstru();
        Monstru two=new Monstru();
        one = getData(one);
        two=getData(two);
        System.out.println("details of Monster of monster 1 ");
        System.out.println(one.getChColor() + " " +one.getName() + " " + one.geteyes());
        System.out.println("details for Monster 2" );
        System.out.println(two.getChColor()+" "+two.geteyes()+ " "+ two.getName());
    }

    public static Monstru getData(Monstru mn)
    {
        int eyes;
        String Name,Color;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Enter the name");
        Name=keyboard.nextLine();
        System.out.println("Enter the color");
        Color=keyboard.nextLine();
        System.out.println("Enter the numbers of eyes");
        eyes=keyboard.nextInt();
        mn.setName(Name);
        mn.setColor(Color);
        mn.seteyes(eyes);
        return mn;
    }


}
