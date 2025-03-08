public class lower_or_upper {
    public static void main(String[] args){
        char x = 'Z';
        if (x>= 65 && x <= 90){
            System.out.println("uppercase");
        }
        else if (x>= 97 && x <= 122){
            System.out.println("lowercase");
        }
        else {
            System.out.println("none");
        }
    }
}
