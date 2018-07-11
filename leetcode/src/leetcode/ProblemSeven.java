package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ProblemSeven {
	public int reverse(int x) {
		int remainNum = x;
		int result = 0;
		int divide = 10;
		List<Integer> number = new ArrayList<>();
		while (remainNum >= 1 || remainNum <= -1) {
			number.add(0, remainNum % divide);
			remainNum = remainNum / divide;
		}
		divide = 1;
		for (Integer digit : number) {
			if(Integer.MAX_VALUE / divide < digit || Integer.MAX_VALUE - result < digit * divide ){
				return 0;
			}
			result += digit * divide;
			divide *= 10;
		}
		return result;

	}

	public static void main(String[] args) {
		System.out.println(new ProblemSeven().reverse(1534236462));
	}
}