
package javajunitcalculadora;

public class JavaJUnitCalculadora 
{
    private int num1;
    private int num2;
 
     
    public JavaJUnitCalculadora(int a, int b)
    {
        num1 = a;
        num2 = b;
    }
    
    public void modifica(int n1, int n2)
    {
        num1 = n1;
        num2 = n2;
    }
    
    public int suma()
    {
        int resul = 0;
        resul = num1 + num2;
        return(resul);
    }

    public int resta()
    {
        int resul = num1 - num2;
        return(resul);
    }
    
    public int multiplica()
    {
        int resul = num1 * num2;
        return(resul);
    }
    
    public int divide()
    {
        int resul=0;
        try
        {
            resul = num1 / num2;
        }
        catch(ArithmeticException e)
        {
            System.out.printf("Error en división por 0\n");
            System.out.printf("Ponemos resultado a 0\n");
            resul = 0;
        }
        return(resul);
    }
}
