package ex_03_Literals;

public class Lab034_Char_Literal {
    public static void main(String[] args)
    {
        // A to Z, a-z, !@#$%^&*()_+
        char c1 = 'A';
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';

        //Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r'; //Carriage return (overwrites beginning of line)

        System.out.println("Dream World");
        System.out.println("Dream"+new_line+"World");
        System.out.println("Dream"+tab_line+"World");
        System.out.println("Dream"+back_space+"World");
        System.out.println("Dream"+carriage_return+"World");


        System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is Third line");

        char c10 = 'A';
        //  // ASCII, (limited numbers) - A -> 65

        char c11  = '\u1F60';
        char my_laugh_smily = '\u1f60'; // :)
        System.out.println(my_laugh_smily);

    }
}