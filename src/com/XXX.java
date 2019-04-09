package com;

import java.util.ArrayList;
import java.util.List;

public class XXX {
    public static void preCompute(int arr[], int n, int pre[])
    {
        pre[0] = arr[0];
        for (int i = 1; i < n; i++)
            pre[i] = arr[i] + pre[i - 1];
    }


    // Returns sum of elements in arr[i..j]
    // It is assumed that i <= j
    public static int rangeSum(int i, int j, int pre[])
    {
        if (i == 0)
            return pre[j];

        return pre[j] - pre[i-1];
    }

    public static void main(String[] args)
    {
        int arr[] = { 9,4, 2 };
        int n = arr.length;

        int pre[] = new int[n];

        preCompute(arr, n, pre);
        List<Integer> l = new ArrayList<>();
        l.add(0);
        l.add(1);
        l.add(0);
        List<Integer> r = new ArrayList<>();
        r.add(1);
        r.add(2);
        r.add(2);
        for(int i= 0; i<l.size(); i++){
            System.out.println(rangeSum(l.get(i), r.get(i), pre));
        }


    }
}
