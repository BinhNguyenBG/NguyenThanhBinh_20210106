package hust.soict.dsai.lab01;
import java.util.Scanner;

public class Ex_6_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = 0;
        System.out.print("Enter month: ");
        String strMonth = sc.next();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if ((strMonth.equals("January")) || (strMonth.equals("Jan")) || (strMonth.equals("Jan.")) || (strMonth.equals("1"))){
            month = 1;
        }
        if ((strMonth.equals("February")) || (strMonth.equals("Feb")) || (strMonth.equals("Feb.")) || (strMonth.equals("2"))){
            month = 2;
        }
        if ((strMonth.equals("March")) || (strMonth.equals("Mar")) || (strMonth.equals("Mar.")) || (strMonth.equals("3"))){
            month = 3;
        }
        if ((strMonth.equals("April")) || (strMonth.equals("Apr")) || (strMonth.equals("Apr.")) || (strMonth.equals("4"))){
            month = 4;
        }
        if ((strMonth.equals("May")) || (strMonth.equals("5"))){
            month = 5;
        }
        if ((strMonth.equals("June")) || (strMonth.equals("Jun")) || (strMonth.equals("6"))){
            month = 6;
        }
        if ((strMonth.equals("July")) || (strMonth.equals("Jul")) || (strMonth.equals("7"))){
            month = 7;
        }
        if ((strMonth.equals("August")) || (strMonth.equals("Aug")) || (strMonth.equals("Aug.")) || (strMonth.equals("8"))){
            month = 8;
        }
        if ((strMonth.equals("September")) || (strMonth.equals("Sep")) || (strMonth.equals("Sep.")) || (strMonth.equals("9"))){
            month = 9;
        }
        if ((strMonth.equals("October")) || (strMonth.equals("Oct")) || (strMonth.equals("Oct.")) || (strMonth.equals("10"))){
            month = 10;
        }
        if ((strMonth.equals("November")) || (strMonth.equals("Nov")) || (strMonth.equals("Nov.")) || (strMonth.equals("11"))){
            month = 11;
        }
        if ((strMonth.equals("December")) || (strMonth.equals("Dec")) || (strMonth.equals("Dec.")) || (strMonth.equals("12"))){
            month = 12;
        }
        
        
        if (month == 0 || year < 0){
            System.out.println("Error");
        }
        else{
            if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)){
                System.out.println(31);
            }
            else if((month == 4) || (month == 6) || (month == 9) || (month == 11)){
                System.out.println(30);
            }
            else if(month == 2){
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                    System.out.println(29);
                }
                else{
                    System.out.println(28);
                }
            }
        }
        sc.close();
    }
}