/**1. Define an interface with three methods – earnings(), deductions() and bonus() and define
a Java class ,Manager‟ which uses this interface without implementing bonus() method. Also
define another Java class ,Substaff‟ which extends from ,Manager‟ class and implements
bonus() method. Write the complete program to find out earnings, deduction and bonus of
a sbstaff with basic salary amount entered by the user as per the following guidelines – */

import java.util.Scanner;
 interface Payment { 
     void deduction(); 
     void bonus();
      void earning();
     }
     class Manager implements Payment { 
         Scanner in = new Scanner(System.in);
    double bs, da, hra, earning_val, deduction_val, bonus_val;
        Manager() 
{
    System.out.println("enter your basic salary");
        bs = in.nextInt();
        }
        public void earning() { 
            earning_val = bs + 0.8 * bs + 0.15 * bs; 
            System.out.println("Earning =" + earning_val); 
                    }
    public void deduction()
        {
            deduction_val = 0.12 * bs; 
            System.out.println("Deduction =" + deduction_val);
            }
            public void bonus() {} }
            class Substaff extends Manager {
                public void bonus() { 
                    bonus_val = 0.12 * bs; 
                    System.out.println("Bonus =" + bonus_val); 
                }
                
            }
            class ab {
                    public static void main(String args[]) 
                    {
                        Manager ob1 = new Manager(); 
                        ob1.earning();
                        ob1.deduction(); 
                        Substaff ob2 = new Substaff();
                        ob2.bonus();
                        }
                        }