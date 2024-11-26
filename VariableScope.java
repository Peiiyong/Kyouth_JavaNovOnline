public class VariableScope {

    int instanceVaribale = 10;
    //cant be changed in any case
    static int staticVariable = 20;

    public void showLocalVariable(){
        int localVariable = 30;
        System.out.println("Local Variable:" + localVariable);
        System.out.println("Instance Variable:"+instanceVaribale);
        System.out.println("Static Varibale:" + staticVariable);
    }

    public void showInstanceVariable(){
        System.out.println("Instance variable:" + instanceVaribale);
        System.out.println("static variable:" + staticVariable);
    }

    public static void main(String[] args) {
        VariableScope vs = new VariableScope();
        vs.showLocalVariable();
        vs.showInstanceVariable();
        System.out.println("Instance variable:" + vs); // Instance variable:VariableScope@1fb3ebeb
        System.out.println("static variable:" + staticVariable);
    }
}
