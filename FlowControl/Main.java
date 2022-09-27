import java.util.*;

public class Main
{
	public static void main( String[] str ) {
	    Scanner scan = new Scanner( System.in );
	    System.out.println( "a = " );
	    int a = scan.nextInt();
	    
	    // if , else if, else
	    if ( 0 == a )
	    {
	        System.out.println( "if" );
	    }
	    else if ( 1 == a )
	    {
	        System.out.println( "else if" );
	    }
	    else
	    {
	        System.out.println( "else" );
	    }
	    
	    // while
	    while ( 10 != a )
	    {
	        System.out.print( a + "," );
	        ++a;
	    }
	    System.out.println();
	    
	    // do while
	    do
	    {
	        System.out.print( a + "," );
	        ++a;
	    } while ( 20 != a );
	    System.out.println();
	    
	    // for
	    for( int i = 0; i < 5; ++i )
	    {
	        System.out.print( i + "," );
	    }
	    System.out.println();
	    
	    System.out.println( "b = " );
	    int b = scan.nextInt();
        
        // switch-case
	    switch ( b ) 
	    {
	        case 1:
	            System.out.println( "case 1" ); // No break. Will execute case 2
	        case 2:
	            System.out.println( "case 2" );
	            break;
	        default:
	            System.out.println( "default" );
	    }
	}
}

// -- Output --
// a = 
// 2
// else
// 2,3,4,5,6,7,8,9,
// 10,11,12,13,14,15,16,17,18,19,
// 0,1,2,3,4,
// b = 
// 1
// case 1
// case 2
