class Base {
	int num;

	Base() {
		this( 100 );
	}

	Base( int num ) {
		this.num = num;	// Current object variables
		this.foo();		// Call a function
	}

	public void foo() {
		System.out.println( num );
	}

	// Return instance of current object
	public Base getInstance() {
		return this;
	}
}

public class This {
	public static void main( String[] str ) {
		Base b = new Base( 34 );
		b.foo();

		Base b1 = new Base();
		b1.foo();

		Base b2 = b.getInstance();
		b2.foo();
	}
}

// this is reference to current object

// this cannot be used inside static methods

// -- Output --
// 34
// 34
// 100
// 100
// 34
