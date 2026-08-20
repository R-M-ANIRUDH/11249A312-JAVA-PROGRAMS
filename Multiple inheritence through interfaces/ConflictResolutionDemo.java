interface InterfaceA {
    default void show() {
        System.out.println("Implementation from InterfaceA");
    }
}

interface InterfaceB {
    default void show() {
        System.out.println("Implementation from InterfaceB");
    }
}

class CombinedClass implements InterfaceA, InterfaceB {
    
    @Override
    public void show() {
        InterfaceA.super.show();
        InterfaceB.super.show();
        System.out.println("Custom implementation in CombinedClass");
    }
}

public class ConflictResolutionDemo {
    public static void main(String[] args) {
        CombinedClass obj = new CombinedClass();
        obj.show();
    }
}
