package MyPackage;

import java.util.*;

public class Zeros {

    public static void main(String args[])
    {
        int num[] = new int[] {5, 6, 0, 5, 0, 3, 4, 0 ,0 ,1, 2};
        int ans[] = new int[] {0, 0, 0, 0, 0, 0, 0 ,0, 0, 0, 0};

        int k=0;

        for(int i=0; i<11; i++)
        {
            if(num[i] != 0)
            {
                ans[k] = num[i];
                k += 1;
            }
        }
        for(int i=k+1; i<11; i++)
        {
            ans[k] = 0;
        }

        for(int i=0; i<11; i++)
        {
            System.out.print(num[i]+" ");
        }
        System.out.print("\n");

        for(int i=0; i<11; i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
