
package javajunitcalculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class JavaJUnitCalculadoraTest 
{
   
    JavaJUnitCalculadora instance;
    int [] tab1;
    int [] tab2;
    
    public JavaJUnitCalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() 
    {
       instance = new JavaJUnitCalculadora(8,0);    
       tab1 = new int[] {1,2,3,4,5};
       tab2 = new int[] {1,4,1,2,0};             
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of suma method, of class JavaJUnitCalculadora.
     */
    @Test
    public void testSuma() 
    {
        int resu=0;
        int [] tabSuma = {2,6,4,6,5};
        System.out.println("suma");
        for(int i = 0;i < 5; i++)
        {
            instance.modifica(tab1[i], tab2[i]);
            resu = instance.suma();
            assertEquals(tabSuma[i],resu);
        }  
    }

    /**
     * Test of resta method, of class JavaJUnitCalculadora.
     */
    @Test
    public void testResta() 
    {
        int resu=0;
        int [] tabResta = {0,-2,2,2,5};
        System.out.println("resta");
        for(int i = 0;i < 5; i++)
        {
            instance.modifica(tab1[i], tab2[i]);
            resu = instance.resta();
            assertEquals(tabResta[i],resu);
        }  
    }

    /**
     * Test of multiplica method, of class JavaJUnitCalculadora.
     */
    @Test
    public void testMultiplica() 
    {
        int resu=0;
        int [] tabMultiplica = {1,8,3,8,0};
        System.out.println("resta");
        for(int i = 0;i < 5; i++)
        {
            instance.modifica(tab1[i], tab2[i]);
            resu = instance.multiplica();
            assertEquals(tabMultiplica[i],resu);
        }  
    }

    /**
     * Test of divide method, of class JavaJUnitCalculadora.
     */
    @Test
    public void testDivide() 
    {
        System.out.println("divide");
        int [] tabDivide = {1,0,3,2,0};
        int resu = 0;
        for(int i=0; i < 5; i++)
        {
            instance.modifica(tab1[i], tab2[i]);
            try
            {
                resu = instance.divide();
            }
            catch(ArithmeticException e)
                
                
            {
                fail("Error no se controla la división por cero");
            }
            assertEquals(tabDivide[i],resu);
        }
    }

    /**
     * Test of modifica method, of class JavaJUnitCalculadora.
     */
    @Test
    public void testModifica() {

    }
    
}
