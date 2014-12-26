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
		if (row >= matrix.length || eachNumber.length > matrix[0].length)
			return;
		else
		{
			int[] insertRow = new int [eachNumber.length];
			for (int i=0; i<eachNumber.length ; i++)
			{
				insertRow[i] = Integer.parseInt(eachNumber[i]);
			}
			for (int i=0; i<matrix[0].length; i++)
			{
				matrix[row][i] = insertRow[i];
			}
		}

	}

	public void setColumn ( int column , String numbers)
	{
		String[] eachNumber = numbers.split(",");
		if (column >= matrix.length || eachNumber.length > matrix[0].length)
			return;
		else
		{
			int[] insertColumn = new int [eachNumber.length];
			for (int i=0 ; i<eachNumber.length ; i++)
			{
				insertColumn[i] = Integer.parseInt(eachNumber[i]);
			}
			for (int i=0;i <matrix[0].length; i++)
			{
				matrix[i][column] = insertColumn[i];

			}
		}
	}
}