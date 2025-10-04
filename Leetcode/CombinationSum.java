package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum
{
    public static List<List<Integer>> result = new ArrayList<>();

    public static List<List<Integer>> combinationSum(int[] arr, int target)
    {
        result.clear();
        generateCombi(arr,target,0,new ArrayList<Integer>());
        return result;
    }

    public static void generateCombi(int[] arr,int currTarget,int position,List<Integer> currCombi)
    {

        if(currTarget==0){
            result.add(new ArrayList<>(currCombi));
            return;
        }
        if(position==arr.length){
            return;
        }
        if(arr[position]<=currTarget)
        {
            currCombi.add(arr[position]);
            generateCombi(arr,currTarget-arr[position],position,currCombi);
            currCombi.remove(currCombi.size()-1);
        }
        generateCombi(arr,currTarget,position+1,currCombi);
    }
}











