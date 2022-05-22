import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {
    InterfaceImplementation interfaceImp = new InterfaceImplementation();

    InterfaceImplementationTwice interfaceImpTwice = new InterfaceImplementationTwice();

    @Test
    public void testMultiply() {
        assertEquals(4, interfaceImp.firstInterfaceMethod(2,2),     
                4);  
    }
    @Test
    public void testAdd() {
        assertEquals(4, interfaceImp.firstInterfaceMethod(2,2),     
                4);  
    }
    @Test
    public void testSubtract() {
        assertEquals(0, interfaceImpTwice.firstInterfaceMethod(2,2),     
                0);  
    }
    @Test
    public void testDivide() {
        assertEquals(1, interfaceImpTwice.firstInterfaceMethod(2,2),     
                1);  
    }


}
