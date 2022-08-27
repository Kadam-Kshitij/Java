class MultiDim {
	public static void main( String[] args ) {
		// In this case the memory required is automatically calculated by compiler
		float[] farr = { 23.4f, 45.8f, 41.5f, 52.34f, 91.9f, 688.3f };
		for( int i = 0; i < farr.length; ++i )
		{
			System.out.print( farr[i] + " " );
		}
		System.out.println();


		// 2D array
		int[][] mat = new int[2][3];

		for( int i = 0; i < 2; ++i )
		{
			for( int j = 0; j < 3; ++j )
			{
				mat[i][j] = i * j + i + j;
			}
		}

		for( int i = 0; i < 2; ++i )
		{
			for( int j = 0; j < 3; ++j )
			{
				System.out.print( mat[i][j] + " " );
			}
			System.out.println();
		}
	}
}

// -- Output --
// 23.4 45.8 41.5 52.34 91.9 688.3 
// 0 1 2 
// 1 3 5
