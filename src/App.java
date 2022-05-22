public class App {
    public static void main(String[] args) {
        InterfaceImplementation interfaceObj = new InterfaceImplementation();
        System.out.println(interfaceObj.firstInterfaceMethod(2,2));
        System.out.println(interfaceObj.secondInterfaceMethod(2,2));

        InterfaceImplementationTwice interfaceObj2 = new InterfaceImplementationTwice();
        System.out.println(interfaceObj2.firstInterfaceMethod(2,2));
        System.out.println(interfaceObj2.secondInterfaceMethod(2,2));
    }

}
