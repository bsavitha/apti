
class Xstar
{
static void pattern(String str,
                    int len)
{ 
    for (int i = 0; i < len; i++)
    {
        int j = len - 1 - i;
        for (int k = 0; k < len; k++)
        {
            if (k == i || k == j)
                System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println("");
    }
}
public static void main (String[] args)
{
    String str = "geeksforgeeks";
    int len = str.length();
    pattern(str, len);
 
}
}
 
// This code is contributed
// by Smitha