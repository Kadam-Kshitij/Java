// Variable names can start with letter, underScore or $. Cannot start with number

class Variables {
	public static void main( String[] arg ) {
		boolean b = true;
		int i = 24;
		int hex = 0xFF;
		int binary = 0b1001;
		int octal = 023;
		float f = 23.5f;	// If f is not written then CTE, possible lossy conversion from double to float
		double d = 23.57;
		char c = 'K';
		String str = "Kshitij Kadam";
		// Other types include byte, short, long

		System.out.println( "b =  " + b );
		System.out.println( "i =  " + i );
		System.out.println( "binary =  " + binary );
		System.out.println( "hex =  " + hex );
		System.out.println( "octal =  " + octal );
		System.out.println( "f =  " + f );
		System.out.println( "d =  " + d );
		System.out.println( "c =  " + c );
		System.out.println( "str =  " + str );
	}
}

// -- Output --
// b =  true
// i =  24
// binary =  9
// hex =  255
// octal =  19
// f =  23.5
// d =  23.57
// c =  K
// str =  Kshitij Kadam
