package java_20240215;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysFunction {

	public static void main(String[] args) {

		int[] arr = new int[10];
		int[] arr2;

		Arrays.fill(arr, 10);
		Arrays.setAll(arr, i -> (int) (Math.random() * 45 + 1));
		System.out.println(Arrays.toString(arr));

		arr2 = Arrays.copyOf(arr, 5);
		System.out.println(Arrays.toString(arr2));

		// ArrayList는 선언과 동시에 초기화 불가
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		System.out.println(list);


		list = Arrays.asList(10, 20, 30, 40, 50); // 리스트 초기화, 단, 값추가 못함.
		System.out.println(list);

		// list.add(60); 값 추가 불가

		// 값을 추가하고 싶으면 다시 ArrayList로 변경해야한다.
		list = new ArrayList(list);
		list.add(60);
		list.add(70);
		System.out.println(list);

	}

}
