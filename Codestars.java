import java.util.*;
public class Codestars
{
    static int jumpingonclouds(int n,int []c)
    {
        int jump=0,k=0;
        while(jump<(n-1))
        {
            if((jump+2)<n && c[jump+2]==0)
            {
                jump=jump+2;
                k++;
            }
            else
            {
                if(c[jump+1]==0)
                {
                jump++;
                k++;
                }
                else
                break;
            }
        }
        return k;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int nn=sc.nextInt();
        int cc[] = new int[nn];
        int i;
        for(i=0;i<nn;i++)
        {
            cc[i]=sc.nextInt();
        }
        int total=jumpingonclouds(nn,cc);
        System.out.println(total);
    }
}