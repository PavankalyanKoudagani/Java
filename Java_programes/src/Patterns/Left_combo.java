package Patterns;

public class Left_combo {

	public static void main(String[] args) {
		int i,j;
        for(i=1;i<=6;i++)
        {
            for(j=1;j<=i;j++)
                System.out.print(j+" ");
            System.out.println();
        }
		for(i=5;i>=1;i--)
        {
            for(j=1;j<=i;j++)
                System.out.print(j+" ");
            System.out.println();
        }

	}

}
