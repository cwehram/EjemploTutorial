
package javajunitcalculadora;


public class Inicio 
{
    public static void main(String[] args) 
    {
        JavaJUnitCalculadora valor;
        int resu;
        valor = new JavaJUnitCalculadora(8, 2);
        resu = valor.suma();
        System.out.printf("Suma: %d\n", resu);
        resu = valor.resta();
        System.out.printf("Resta: %d\n", resu);
        resu = valor.multiplica();
        System.out.printf("Multiplica: %d\n", resu);
        resu = valor.divide();
        System.out.printf("Divide: %d\n", resu);
    }
}
