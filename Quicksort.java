package com.test;

public class Quicksort {
	
	public static int[] qs(int[] ar,int start,int end)
	{
		if(start<end) {
			int pI = partition(ar,start,end);
			qs(ar,start,pI-1);
			qs(ar,pI+1,end);
		}
		return ar;
	}
	
	
	private static int partition(int[] ar, int start, int end) {
		int pivot = ar[end];
		int pI = start;
		for(int i=start;i<end;i++) {
			if(ar[i]<=pivot) {
				System.out.println(i+" damkn "+pI);
				
				swap(ar,i,pI);
				for(int x:ar)
					System.out.print(x+" ");
				System.out.println();
				pI++;
			}
		}
		swap(ar,pI,end);
		return pI;
	}


	private static void swap(int[] ar, int i, int pI) {
		int t = ar[pI];
		ar[pI] = ar[i];
		ar[i] = t;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {3,2,10,9,8,5,6,7,2,4};
		qs(ar,0,9);
		System.out.println("res");
		for(int x:ar)
			System.out.print(x+" ");
	}

}
