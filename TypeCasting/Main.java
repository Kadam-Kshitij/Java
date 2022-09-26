class Main {
    public static void main( String[] str ) {
        int i = 12;
        double d = 24.561239231231d;
        
        float f = i;    // Automatic
        System.out.println( f );
        
        // f = d;       // CTE - possible lossy conversion
        f = ( float )d; // Manually
        System.out.println( f );
    }
}

// Converting from smaller type to larger type is done automatically
// Converting from larger type to smaller type has to be done Manually

// -- Output --
// 12.0
// 24.56124
