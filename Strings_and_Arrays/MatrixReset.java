import java.util.*;

public class MatrixReset {
	public static void main(String args[])
	{
		int[][] matrix = {{3, 0, 5}, {1, 1, 1}, {1, 1, 1}};
		/*
		Scanner input = new Scanner(System.in);
		System.out.println("Please fill in the matrix: ");
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[i].length; j++)
			{
				
				matrix[i][j] = input.nextInt();
			}
		}
		*/
		
		int[][] matrixToPrint = ResetMatrix(matrix);
		PrintMatrix(matrixToPrint);
	}
	
	public static void PrintMatrix(int[][] matrix)
	{
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[i].length; j++)
			{
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}
	
	public static int[][] ResetMatrix(int[][] matrix)
	{
		int[][] finalMatrix = new int[matrix.length][matrix[0].length];
		//int[][] finalMatrix = matrix;
		
		int jHolder = -1; 
		for (int i = 0; i < matrix.length; i++)
		{
			for (int j = 0; j < matrix[i].length; j++)
			{
				
				if (jHolder == j)
				{
					continue;
				}
				if (matrix[i][j] == 0)
				{
					finalMatrix[i] = generateNumberArray(matrix.length, 0);
					assignColumn(finalMatrix,finalMatrix[i], j);
					jHolder = j;
					break;
				}
				else
				{
					finalMatrix[i][j] = matrix[i][j];
				}
			}
		}
		
		return finalMatrix;
		
	}
	
	public static void assignColumn(int[][] matrixForAssignment, int[] vectorToAssign, int columnLocation)
	{
		for (int i = 0; i < vectorToAssign.length; i++)
		{	
			
			matrixForAssignment[i][columnLocation] = vectorToAssign[i];
		}
					
		
	}
	
	public static int[] generateNumberArray(int length, int rowValue)
	{
		int[] returnValue = new int[length];
		
		for (int i = 0; i < length; i++)
		{
			returnValue[i] = rowValue;
		}
		
		return returnValue;
	}
}

