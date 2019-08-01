//package com;
//
//public class Demo {
//
//    public static void main(String[] args) {
//        Demo demo = new Demo();
//        //OneNode n = demo.convertToList(new int[]{1, 2, 3, 4, 5});
//        demo.printArray(new int[]{1, 2, 3, 4, 5},0);
//        //demo.print2(n);
//    }
//
//    private OneNode head;
//
//    public OneNode convertToList(int[] arr) {
//        OneNode zero = new OneNode(-1);
//        OneNode current = zero;
//        for(int i = 0; i <= arr.length - 1; i++) {
//            int n = arr[i];
//            OneNode newNode = new OneNode(n);
//            current.setNextNode(newNode);
//            current = current.nextNode;
//        }
//        return zero.nextNode;
//    }
//
//    public void print1(OneNode head) {
//        OneNode current = head;
//        while(current != null) {
//            System.out.println(current.value);
//            current = current.nextNode;
//        }
//    }
//
//    public void printArray(int a[],int first){
//      // for(i)
//        first ++;
//        if(a.length== 0)
//        {
//            return;
//        }
//
//       printArray(a , size-first);
//        System.out.println(a[first-1]);
//    }
//
//    public void revprintArray(int a[], int first){
//        if(first < 0 || first > a.length - 1) {
//            throw  new IllegalArgumentException();
//        }
//        if(a == null || a.length == 0) {
//            //return;
//            throw  new IllegalArgumentException();
//        }
//        if(first + 1 <= a.length - 1) {
//            revprintArray(a, first + 1);
//        }
//        System.out.println(a[first]);
//    }
//
//
//}
