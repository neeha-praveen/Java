public class leap_year {
    public static void main(String args[]) {
        int year = 2024;
        if (year%100==0){
            if (year%400==0){
                System.out.println("leap year");
            }
            else {
                System.out.println("not leap year");
            }
        }
        else {
            if (year%4 == 0){
                System.out.println("leap year");
            }
            else {
                System.out.println("not a leap year");
            }
        }
    }
}