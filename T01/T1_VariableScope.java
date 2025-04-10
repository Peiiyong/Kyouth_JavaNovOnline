package T01;
public class T1_VariableScope {

    //This is unique to each object instance and can be accessed via an object reference.
    int instanceVaribale = 10;
    //Shared among all objects. A static variable can be modified.
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
        T1_VariableScope vs = new T1_VariableScope();
        vs.showLocalVariable();
        vs.showInstanceVariable();
        System.out.println("Instance variable:" + vs); // Instance variable:VariableScope@1fb3ebeb
        System.out.println("static variable:" + staticVariable);
    }
}

/*public class T1_VariableScope {
    int instanceVariable = 10; // 普通变量
    static int staticVariable = 20; // 静态变量

    public static void main(String[] args) {
        T1_VariableScope obj1 = new T1_VariableScope();
        T1_VariableScope obj2 = new T1_VariableScope();

        // 修改普通变量
        obj1.instanceVariable = 15;
        obj2.instanceVariable = 25;

        // 修改静态变量
        obj1.staticVariable = 30; // 可以通过对象访问
        T1_VariableScope.staticVariable = 40; // 推荐通过类名访问

        // 输出普通变量（每个对象独立）
        System.out.println("obj1 instanceVariable: " + obj1.instanceVariable); // 15
        System.out.println("obj2 instanceVariable: " + obj2.instanceVariable); // 25

        // 输出静态变量（共享）
        System.out.println("obj1 staticVariable: " + obj1.staticVariable); // 40
        System.out.println("obj2 staticVariable: " + obj2.staticVariable); // 40
        System.out.println("Class staticVariable: " + T1_VariableScope.staticVariable); // 40
    }
}
*/