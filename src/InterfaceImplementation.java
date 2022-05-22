public class InterfaceImplementation implements FirstInterface, SecondInterface {

    //first interface method implementation including body
    public int firstInterfaceMethod( int a, int b) {
        return a*b;
    }

    //second interface implementation including body
    public int secondInterfaceMethod(int a, int b) {
        return a+b;
    }

}
