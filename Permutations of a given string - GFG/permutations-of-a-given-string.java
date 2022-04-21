// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
                        
        }
	}
}

// } Driver Code Ends


class Solution {
    public List<String> find_permutation(String S) {
        // Code here
        List<String> res = new ArrayList<>();
        find_perm(S, "", res);
        Collections.sort(res);
        return res;
    }
    
    void find_perm(String s, String asf, List<String> res){
        if(s.length()==0){
            // System.out.println(asf);
            res.add(asf);
            return;
        }
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            String s1 = s.substring(0,i);
            String s2 = s.substring(i+1);
            String ros = s1 + s2;
            // s=
            find_perm(ros, asf + ch+ "", res);
        }
    }
}