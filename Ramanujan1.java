public class Ramanujan1 {
    public static void main(String[] args) {
    int N = Integer.parseInt(args[0]);
        for (int a = 1; a*a*a <= N; a++)
        {
            for (int b = a+1; b*b*b <= N-a*a*a; b++)
            {
                for (int c = a+1; c*c*c <= N; c++)
                {
                    for (int d = c+1; d*d*d <= N-c*c*c; d++)
                    {
                        if (a*a*a+b*b*b == c*c*c+d*d*d)
                        {
                            System.out.println(a*a*a+b*b*b + " = " +a
                            +"^3 + "+b+"^3 = "+c+"^3 + "+d+"^3");
                        }
                    }
                }
             }
    }
}
}
