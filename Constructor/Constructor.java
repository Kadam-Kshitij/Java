// If no constructor is provided by user, then default constructor is provided by compiler
// Constructor has same name as class name and no return value

class MyClass {
    // Making constructor private allows its object creation only from within the class
    private MyClass() {
        System.out.println( "Constructor 1" );
    }
    
    MyClass( int i ) {
        System.out.println( "Constructor 2" );
    }
    
    void foo() {
        // Can create since foo is within the class
        MyClass o = new MyClass();
    }
}

class Main {
    public static void main( String[] str ) {
        // MyClass obj1 = new MyClass(); // CTE - because no-arg constructor is private
        MyClass obj2 = new MyClass( 23 );
        
        obj2.foo();
    }
}

// -- Output --
// Constructor 2
// Constructor 1
