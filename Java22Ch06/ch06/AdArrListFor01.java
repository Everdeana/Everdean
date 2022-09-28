package ch06;

public class AdArrListFor01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] oldIntArr = {11, 13, 15};
		int[] newIntArr = new int[5];
		for (int i = 0; i < oldIntArr.length; i++) {
			newIntArr[i] = oldIntArr[i];
		}
		for (int i = 0; i < newIntArr.length; i++) {
			System.out.print(newIntArr[i] + "  ");
		}
	}
}