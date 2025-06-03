package ex_03_Literals;

public class Lab034_Char_Literal {
    public static void main(String[] args) {
        char c1 = 'A'; // A to Z, a-z, !@#$%^&*()_+
//        char c = "A"; // "" == String = Bunch of Char

        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; //blank space

        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

   /*     System.out.println("VidyaStyappa");
        System.out.println("Vidya"+new_line+"Satyappa");
        System.out.println("Vidya\nSatyappa");
        System.out.println("Vidya"+tab_line+"Satyappa");
        System.out.println("Vidya\tSatyappa");*/
        /*System.out.println("Vidya"+back_space+"Satyappa");
        System.out.println("Vidya\bSatyappa");*/
        System.out.println("Vidya"+carriage_return+"Satyappa");
        System.out.println("Vidya\rSatyappa");



        char c10 = 'A';
        //  // ASCII, (limited numbers) - A -> 65

        char ruppes = '₹';
        System.out.println(ruppes);

        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);

        char c11  = '\u1F60';
    }

}
