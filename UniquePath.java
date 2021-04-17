import java.util.*;
class Solution {
    HashMap <String,Integer> hm  = new HashMap<String,Integer>();
    public int uniquePaths(int m, int n) {
        return path(0,0,m,n,0);
        
    }
     
  public int path(int i,int j, int m, int n, int count)
    {
        int a=0, b=0;
        String temp;
        boolean flag1 = false;
        boolean flag2 = false;
        if (i==m-1 && j==n-1)
            return 1;
        else if(i==m-1 && j<n-1){
            b=j+1;
            a=i;
            flag1 = true;
        }
            
        else if(j==n-1 && i<m-1){
            b=j;
            a=i+1;
            flag2 = true;
        }
            
        else {
            a=i+1;
            b=j+1;
        }
        temp = Integer.toString(i)+"."+Integer.toString(j);
        if(!hm.containsKey(temp))
        {
        if(!flag1)
        {
            temp = Integer.toString(a)+"."+Integer.toString(j);
            if(!hm.containsKey(temp))
            {
           // System.out.println("Going to: "+a+j);
            int k = path (a,j,m,n,0);
            count += k;
            hm.put(temp,k);
                
            }
            else 
                count+= hm.get(temp);
                
        }
            
        if (!flag2)
        {
            temp = Integer.toString(i)+"."+Integer.toString(b);
            if(!hm.containsKey(temp))
            {
            //    System.out.println("Going to: "+i+b);
                int k =  path (i,b,m,n,0);
                count += k;
                hm.put(temp,k);
            }   
            else 
                count+= hm.get(temp);
        }
        temp = Integer.toString(i)+"."+Integer.toString(j);
        hm.put(temp,count) ;
        }
        else 
            count = hm.get(temp);
        return count;
    }

}

