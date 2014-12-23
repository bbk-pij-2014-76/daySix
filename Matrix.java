public class Matrix
{
	private int[][] matrix;
	public Matrix (int rows, int columns)
	{
		matrix = new int [rows][columns];
		for ( int i=0 ; i<rows; i++)
		{
			for (int j=0; j<columns; j++)
			{
				matrix[i][j] = 1;
			}
		}
	}
	public void setElement ( int row, int column, int value)
	{
		if (row >= matrix.length || column >= matrix[0].length)
			return;
		else
			matrix[row][column] = value;
	}
	public void setRow ( int row, String numbers)
	{
		String[] eachNumber = numbers.split(",");



	}
}