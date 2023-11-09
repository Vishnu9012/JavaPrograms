class Parent {
    String message;

    Parent(String txt) {
        message = txt;
    }

    void printMessage() {
        System.out.println(message);
    }
}

class Child extends Parent {
    Child(String txt) {
        super(txt);
    }
}

class A {
    public static void main(String[] args) {
        Child x = new Child("Hello, and welcome!");
        x.printMessage();
    }
}
