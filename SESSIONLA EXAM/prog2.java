import java.util.*;

//Write a program to create class Tower which defines two array named num & loc which hold 5 values each. Then declare interface Mobile which has two abstract methods named getdata() and validateData(). getdata() takes mobile no and location. validateData() validate corresponding mobile no and location (for example, the num[0] and loc[0] are mapped and should be matched). If not then manage with proper user defined Exception to know which one is not matched.
class Tower
{
    int num[]=new int[5];
    String loc[]=new String[5];

    public void getdata(int num[],String loc[])
    {
        for(int i=0;i<5;i++)
        {
            this.num[i]=num[i];
            this.loc[i]=loc[i];
        }
    }
    public void validateData(int num[],String loc[]) throws Exception
    {
        for(int i=0;i<5;i++)
        {
            if(this.num[i]!=num[i])
            {
                throw new Exception("Mobile no not matched");
            }
            if(this.loc[i]!=loc[i])
            {
                throw new Exception("Location not matched");
            }
        }
    }
}
abstract interface Mobile
{
    void getdata();
    void validateData();
}
class TowerClass implements Mobile {
    Scanner sc = new Scanner(System.in);
    @Override
    public void getdata()
    {
        Tower t=new Tower();
        int num[]=new int[5];
        String loc[]=new String[5];
        System.out.println("Get data");
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter mobile no and location for tower " + i);
            num[i]=Integer.parseInt(sc.nextLine());
            loc[i]=sc.nextLine();
        }
        t.getdata(num,loc);
    }

    @Override
    public void validateData() {
        Tower t=new Tower();
        int num[]=new int[5];
        String loc[]=new String[5];
        System.out.println("Validate data");
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter mobile no and location for tower " + i);
            num[i]=Integer.parseInt(sc.nextLine());
            loc[i]=sc.nextLine();
        }
        try {
            t.validateData(num, loc);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

public class prog2 {
    public static void main(String[] args) {
        TowerClass tc=new TowerClass();
        tc.getdata();
        tc.validateData();
    }
}