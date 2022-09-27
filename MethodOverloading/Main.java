// Method overloading is possible via
// 1) Different number of parameters
// 2) Number of parameters
// different return value cannot be used for method overloading

public class Main
{
    static void foo( int i )
    {
        System.out.println( "int" );
    }
    
    static void foo( char c )
    {
        System.out.println( "char" );
    }
    
    static void foo( float f )
    {
        System.out.println( "float" );
    }
    
	public static void main( String[] str ) {
	    int i = 23;
	    float f = 23.5f;
	    char c = 'v';
	    
	    foo( i );
	    foo( c );
	    foo( f );
	}
}

// -- Output --
// int
// char
// float

// if foo-int is commented
// float
// char
// float

// if foo-char is commented
// int
// int
// float

// if foo-float is commented
// CTE - no suitable method found
