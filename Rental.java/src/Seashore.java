public class Seashore {
final static int ora,rata;
static{
ora=60;
        rata=40;
        }
        private  String ContractNumber;
    private int numarOre;
    private int HoursAndMinutes;
    private int pret;


    public void setContractNumber(String name)
    {
        ContractNumber=name;

    }
    public void setHoursAndMinutes(int ss)
    {
        HoursAndMinutes=ss;
    }
    public String getContractNumber()
    {
        return ContractNumber;
    }
    public int getHoursAndMinutes()
    {
        return HoursAndMinutes;
    }
    public int getpret()
    {
        int inchiriere = 0, inchiriereextra = 0, inchiereMeh, inchiereextra1;
        inchiriere = HoursAndMinutes * 40;
        if (inchiriere > 240) {
            for (int i = 60; i < HoursAndMinutes; i++) {
                inchiriereextra++;

            }
        }
        System.out.print("Pretul fara orele extra e ");
        System.out.println(inchiriere);

        System.out.print("Pretul minute suplimentare este ");
        System.out.println(inchiriereextra);


        inchiereMeh = inchiriere + inchiriereextra ;
      return inchiereMeh;

    }
    public int getnumarOre()
    {
        int timp;
        timp=HoursAndMinutes/ora;
        System.out.println("orele");
        return timp;
    }
    }



