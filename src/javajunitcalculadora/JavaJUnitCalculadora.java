
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
        System.out.printf("Vamos a modificar\n");
        num1 = n1;
        num2 = n2;
    }
    
    public int suma()
    {
        int resul = 0;
        System.out.printf("Vamos a sumar\n");
        resul = num1 + num2;
        return(resul);
    }

    public int resta()
    {
        System.out.printf("Vamos a restar\n");
        int resul = num1 - num2;
        return(resul);
    }
    
    public int multiplica()
    {
        System.out.printf("Vamos a multiplicar\n");
        int resul = num1 * num2;
        return(resul);
    }
    
    public int divide()
    {
        int resul=0;
        System.out.printf("Vamos a dividir\n");
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
