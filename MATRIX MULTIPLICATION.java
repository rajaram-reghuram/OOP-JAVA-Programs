import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{	
	   Scanner read=new Scanner(System.in);
	   int r1,r2,c1,c2;
	   System.out.println("Enter the number of rows and columns of Matrix 1 :");
	   r1=read.nextInt();
	   c1=read.nextInt();
	   int a[][]=new int[r1][c1];
	   System.out.println("\nEnter the elements of Matrix 1");
	   readMat(a,r1,c1);
	   System.out.println("\nEnter the number of rows and columns of Matrix 2 :");
	   r2=read.nextInt();
	   c2=read.nextInt();
	   int b[][]=new int[r2][c2];
	   System.out.println("\nEnter the elements of Matrix 1");
	   readMat(b,r2,c2);
	   System.out.println("\nMatrix 1 :");
	   printMat(a,r1,c1);
	   System.out.println("\nMatrix 2 :");
	   printMat(b,r2,c2);
	   multiply(a,r1,c1,b,r2,c2);
	}
    static void readMat(int m[][],int r,int c)
    {
        Scanner read=new Scanner(System.in);
        for(int i=0;i<r;i++)
		{
			 for(int j=0;j<c;j++)
			 {
				 System.out.print("At position ("+i+","+j+") :");
				 m[i][j]=read.nextInt();
			 }
		}
    }
    static void printMat(int m[][],int r,int c)
    {
       for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
				 System.out.print("\t"+m[i][j]);
			System.out.println();
		}
    }
    static void multiply(int a[][],int r1,int c1,int b[][],int r2,int c2)
    {
        if(c1!=r2)
        {
            System.out.println("\nCan't multiply matrixes!!!....check the dimensions");
            return;
        }
        int p[][]=new int[r1][c2];
        for(int i=0;i<r1;i++)
		{
			 for(int j=0;j<c2;j++)
			 {
				 for(int k=0;k<c1;k++)
					 p[i][j]+=a[i][k]*b[k][j];
			 }
		}  
        System.out.println("\nMatrix 1 * Matrix 2 :");
	    printMat(p,r1,c2);
    }
}
