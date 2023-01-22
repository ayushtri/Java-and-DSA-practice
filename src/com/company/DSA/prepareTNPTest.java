package com.company.DSA;

import java.util.*;

public class prepareTNPTest {
    public static int kthLargest(int[] arr, int k){
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            q.add(arr[i]);
            if(q.size()>k){
                q.poll();
            }
        }
        return q.peek();
    }
    public static int kthSmallest(int[] arr, int k){
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            q.add(arr[i]);
            if(q.size()>arr.length-k+1){
                q.poll();
            }
        }
        return q.peek();
    }
    public static void halfHalfSort(int[] arr){
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr.length/2;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            for(int j=arr.length/2;j<arr.length-1;j++){
                if(arr[j]<arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i : arr){
            System.out.print(i+", ");
        }
        System.out.println();
    }
    public static void frequency(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }
    }
    public static void sortFreq(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int currKey = entry.getKey();
            int currValue = entry.getValue();
            for(int i=0;i<currKey;i++){
                list.add(currValue);
            }
            int j=0;
            for(int i = list.size()-1;i>=0;i--){
                arr[j]=list.get(i);
                j++;
            }
        }
        for(int i =0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static boolean isPalindrome(int num){
        int temp = num;
        int rev=0;
        int rem;
        while(temp!=0){
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        return rev == num;
    }
    public static int lengthNum(int num){
        int length=0;
        while(num!=0){
            num=num/10;
            length++;
        }
        return length;
    }
    public static void longestPalindromeArray(int[] arr){
        int longest = -1;
        for(int i=0;i<arr.length;i++){
            if(isPalindrome(arr[i])){
                if(lengthNum(arr[i])>lengthNum(longest)){
                    longest=arr[i];
                }
            }
        }
        System.out.println(longest);
    }
    public static void symmetricPairNaive(int[][] arr2D){
        for(int i=0;i<arr2D.length;i++){
            for(int j=i+1;j<arr2D.length;j++){
                if(arr2D[i][0]==arr2D[j][1] && arr2D[i][1]==arr2D[j][0]){
                    System.out.println("("+arr2D[i][0]+", "+arr2D[i][1]+")");
                }
            }
        }
        System.out.println();
    }
    public static void symmetricPairHM(int[][] arr2D){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr2D.length;i++){
            int first = arr2D[i][0];
            int second = arr2D[i][1];
            Integer val = map.get(second);
            if(val!=null && val==first){
                System.out.println("("+second+", "+first+")");
            }
            else{
                map.put(first, second);
            }
        }
    }

    //maximum scaler product of arrays k liye dono array ko ascending order me sort karo aur product+=a1[i]*a2[i]
    //minimum k liye ascending sort descending sort

    public static void maximumSubArrayProduct(int[] arr){
        int product;
        int temp = arr[0];
         for(int i=0;i<arr.length;i++){
             product=1;
             for(int j=i;j<arr.length;j++){
                 product *= arr[j];
                 if(product>temp){
                     temp=product;
                 }
             }
         }
        System.out.println(temp);
    }
    public static void maximumSubArrayProductOptimal(int[] nums){
        int ma=nums[0];
        int mi=nums[0];
        int ans=nums[0];
        for(int i = 1;i<nums.length;i++){
            if(nums[i]<0){
                int temp=ma;
                ma=mi;
                mi=temp;
            }
            ma=Math.max(nums[i],ma*nums[i]);
            mi=Math.min(nums[i],mi*nums[i]);
            ans=Math.max(ans,ma);
        }
        System.out.println(ans);
    }
    public static boolean disjoint(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                return false;
            }
        }
        return true;
    }
    public static boolean subsetCheck(int[] arr1, int[] arr2){
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr1){
            set.add(i);
        }
        for(int i : arr2){
            if(!set.contains(i)){
                return false;
            }
        }
        return true;
    }
    public static void sumMinDifference(int[] arr){
        int result = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr.length;j++){
                sum = sum + Math.abs(arr[i]-arr[j]);
            }
            result = Math.min(result,sum);
        }
        System.out.println(result);
        /*Sort the array using inbuilt sort() function.
          For the element at 0 index of array its min absolute difference is calculated using the element at index 1.
          For the element at last index its min absolute difference is calculated using the 2nd last array element.
          For the rest of the array elements, 1 <= i <= n-2, minimum absolute difference for an element at index i is
          calculated as: minAbsDiff = min( abs(arr[i] – arr[i-1]), abs(ar[i] – arr[i+1]) ).
         */
    }

    public static void main(String[] args) {
        int[] arr = {5,3,1,2,4,70,-1,0};
        System.out.println(kthLargest(arr,2));
        System.out.println(kthSmallest(arr,2));
        halfHalfSort(arr);
        int[] arr1 = {1,2,3,1,2,3,3,3,4,2,2,1,9,4};
        frequency(arr1);
        sortFreq(new int[]{1,1,1,2,2,2,2,4,4,3});
        longestPalindromeArray(new int[]{121,2322,54545,999990});
        int[][] arr2D = new int[5][2];
        arr2D[0][0] = 1;
        arr2D[0][1] = 2;
        arr2D[1][0] = 3;
        arr2D[1][1] = 4;
        arr2D[2][0] = 5;
        arr2D[2][1] = 1;
        arr2D[3][0] = 4;
        arr2D[3][1] = 3;
        arr2D[4][0] = 1;
        arr2D[4][1] = 5;
        symmetricPairNaive(arr2D);
        symmetricPairHM(arr2D);
        maximumSubArrayProduct(new int[]{2,3,-2,4});
        maximumSubArrayProductOptimal(new int[]{2,3,-2,4});
        int[] arrr1 = {10, 51, 3, 43, 6};
        int[] arrr2 = {80, 71, 29, 7};
        System.out.println(disjoint(arrr1,arrr2));
        System.out.println(subsetCheck(arrr1,arrr2));
        sumMinDifference(new int[]{2, 4, 5, 3});
    }
}
