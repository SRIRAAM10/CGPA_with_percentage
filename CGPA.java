import java.util.Scanner;
class CGPA
{
    int mark_percent;
    Scanner scan=new Scanner(System.in);
    CGPA()
    {
        mark_percent=0;
    
    }
    void input_mark()
    {
        System.out.println("Enter The Marks percent For Grade Calculation:  ");
        mark_percent=scan.nextInt();
    }
    void percent_calculation()
    {
        if(mark_percent>91)
        {
            System.out.println("S");
        }
        else if(mark_percent<=91&&mark_percent>85)
        {
            System.out.println("A+");
        }
          else if(mark_percent<=85&&mark_percent>75)
        {
            System.out.println("A");
        }
          else if(mark_percent<=75&&mark_percent>60)
        {
            System.out.println("B");
        }
          else if(mark_percent<=60&&mark_percent>50)
        {
            System.out.println("C");
        }
        else
        {
            System.out.println("FAIL");
        }
    }
    
}
public class mainin
{
    public static void main(String args[])
    {
        CGPA GPA=new CGPA();
        GPA.input_mark();
        GPA.percent_calculation();
    }
}