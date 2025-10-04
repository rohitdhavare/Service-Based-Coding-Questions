package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> subsets(int[] arr) {
        result.clear();
        DFS(arr,0,new ArrayList<>());
        return result;
    }
    public void DFS(int[] arr,int position,List<Integer> sublist)
    {
        if(position==arr.length)
        {
            result.add(new ArrayList<>(sublist));
            return;
        }
        sublist.add(arr[position]);
        DFS(arr,position+1,sublist);
        sublist.remove(sublist.size()-1);
        DFS(arr,position+1,sublist);
    }
}
