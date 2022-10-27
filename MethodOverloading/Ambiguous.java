class Base {
	void foo( long l1, int l2 )
	{
		System.out.println( "foo - long" );
	}

	void foo( int i1, long i2 )
	{
		System.out.println( "foo - int" );
	}
}

class Ambiguous {
	public static void main( String[] str ) {
		Base b = new Base();

		b.foo( 20, 20 );
	}
}

// In this case reference to foo is ambiguous
// Leads to CTE
