public class Patterns {
    public static void Square(int a)
    {
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=a;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void Rectange(int b,int c)
    {
         for(int i=1;i<=b;i++)
        {
            for(int j=1;j<=c;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void Numbertraingle()
    {
        int a=1;
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }

    }
    public static void Reversetriangle(){
        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void Hollowsquare(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1 || i==n || j==1 || j==n)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }
    public static void hollowrectangle(int m,int s)
    {
        for(int i=1;i<=m;i++)
        {
            for(int j=1;j<=s;j++)
            {
                if(i==1 || i==m || j==1 || j==s)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }

    }
    public static void equilateralpyramid(int t)
    {
        for(int i = 1; i <= t; i++)
             {
    for(int j = 1; j <= t-i; j++)
        System.out.print(" ");

    for(int j = 1; j <=i; j++)
        System.out.print("* ");

    System.out.println();
}
    }
    public static void ReverseEquilateral(int r)
    {
         for(int i = 1; i <= r; i++)
             {
    for(int j = r; j >= r-i; j--)
        System.out.print(" ");

    for(int j = r; j >= i; j--)
        System.out.print("* ");

    System.out.println();
}
        
    }
    public static void main(String[] args) {
        System.out.println("Square Pattern ");
        Square(4);
        System.out.println("Rectangle pattern ");
        Rectange(3, 5);
        System.out.println("Number Triangle ");
        Numbertraingle();
        System.out.println("Reverse Triangle");
        Reversetriangle();
        System.out.println("Hollow Square Pattern ");
        Hollowsquare(4);
        System.out.println(" Hollow Rectangle Pattern ");
        hollowrectangle(3,5);
        System.out.println(" Equilateral Triangle ");
        equilateralpyramid(5);
        System.out.println("Reverse Equilateral Triangle ");
        ReverseEquilateral(5);
    }
    
}
