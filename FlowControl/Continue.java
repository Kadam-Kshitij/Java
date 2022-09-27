import java.util.*;

// Java does not ssupport goto statement
// Continue and break statement can be used along with labels to jump to a particular loop

public class Main
{
	public static void main( String[] str ) {
	    outer:
	    for( int i = 0; i < 5; ++i )
	    {
	        inner:
	        for( int j = 0; j < 5; ++j )
	        {
	            if ( j == 2 )
	            {
	                continue inner;
	            }
	            else if ( j == 4 )
	            {
	                continue outer;
	            }
	            System.out.println( i + "," + j );
	        }
	    }
	}
}

// -- Output --
// 0,0
// 0,1
// 0,3
// 1,0
// 1,1
// 1,3
// 2,0
// 2,1
// 2,3
// 3,0
// 3,1
// 3,3
// 4,0
// 4,1
// 4,3
