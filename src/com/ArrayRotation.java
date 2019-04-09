package com;

public class ArrayRotation {
	void leftRotate(int arr[], int n, int d) {
		for(int i=0; i<d; i++) {
			leftRotatebyOne(arr, n);
		}
	}

	private void leftRotatebyOne(int[] arr, int n) {
		// TODO Auto-generated method stub
		int j;
			int temp= arr[0];
			for(j=0; j<n-1; j++) {
				arr[j]=arr[j+1];
			}
			arr[j]=temp;
	}
	private void printArray(int arr[], int n) {
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayRotation arrayRotation = new ArrayRotation();
		int arr[] = {1,2,3,4,5,6,7};
		arrayRotation.leftRotate(arr, arr.length, 2);
		arrayRotation.printArray(arr, arr.length);

	}

}
