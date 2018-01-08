package com.javang;

public class UserException {

	public static void main(String a[]) throws MyException {

		UserException.displayFavNumber();
	}

	public static void displayFavNumber() throws MyException {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7 };

		for (int i : arr) {
			i = i - 1;
			System.out.println("Number is : " + arr[i]);
			if (arr[i] == 7)
				throw new MyException(arr[i] + " is my fav number");

		}

	}

}
