package o8ExampleOfMapAndFlatMap;

import java.util.Arrays;

public class ArraySwapping {
	public static void main(String[] args) {
	int arr[] = {10,20,30,40};
	System.out.println("First list "+Arrays.toString(arr));
	int x = arr[0];
	arr[0] = arr[arr.length-1];
	arr[arr.length-1]=x;
	System.out.println("Second list "+Arrays.toString(arr));
	}
}
