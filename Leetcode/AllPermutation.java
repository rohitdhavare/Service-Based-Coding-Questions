package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class AllPermutation {
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(arr,result,new ArrayList());
        return result;
    }
    public void dfs(int[] arr,List<List<Integer>> result,List<Integer> li)
    {
        if(li.size()==arr.length)
        {
            result.add(new ArrayList(li));
            return;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(li.contains(arr[i]))continue;
            li.add(arr[i]);
            dfs(arr,result,li);
            li.remove(li.size()-1);
        }
    }
}