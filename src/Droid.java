public class Droid
{
    String name;
    int batLvl = 100;
    public Droid(String droidName)
    {
        name = droidName;
    }

    public String toString()
    {
        return "Hello my name is "+name;
    }

    public void performTask(String task)
    {
        System.out.println("The robot "+name+" is doing "+task);
        batLvl-=10;
        System.out.println(batLvl);

    }
    public void energyReport()
    {
        System.out.println(batLvl);
    }
    public void energyTransfer(int powerUp)
    {
        int init_lvl;
        init_lvl = batLvl;
        batLvl=batLvl+powerUp;
        System.out.println("The robot "+name  +" was charged from "+init_lvl+"% to "+batLvl+"%");
    }

    public static void main(String[] args)
    {
        Droid myDroid = new Droid("Dan");
        System.out.println(myDroid.toString());
        myDroid.performTask("drugs");
        myDroid.energyReport();
        myDroid.energyTransfer(15);


    }
}