class Base {
	void foo()
	{
		System.out.println( "foo - 1" );
	}

	void foo( int a )
	{
		System.out.println( "foo - 2" );
	}

	void foo( float f )
	{
		System.out.println( "foo - 3" );
	}

	void foo( int a, float b )
	{
		System.out.println( "foo - 4" );
	}
}

class MethodOverloading {
	public static void main( String[] str ) {
		Base b = new Base();

		b.foo();
		b.foo( 23 );
		b.foo( 23.4f );
		b.foo( 12, 34.5f );
	}
}

// Method overloading
// 1 - Type of parameters should be different
// 2 - Number of parameters should be different

// Different return value cannot be used as a way to distinguish

// -- Output --
// foo - 1
// foo - 2
// foo - 3
// foo - 4
