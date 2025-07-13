package ex_04_Operators;

public class Lab041_Logical_Operators
{
    public static void main(String[] args)
    {
        boolean a = true;
        System.out.println(!a); //NOT OPERATOR

        boolean b = true;
        System.out.println(!!b);

        boolean c= true || false; //OR OPERATOR
        System.out.println(c);

        boolean c1= true && false; //AND OPERATOR
        System.out.println(c1);
    }
}
