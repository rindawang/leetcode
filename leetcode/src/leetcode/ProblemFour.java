package leetcode;
//add comment
import java.io.IOException;

public class ProblemFour {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double median;
		int num1 = 0, num2 = 0;
		int currentIndex = 0, sumLen = nums1.length + nums2.length;
		int s1Index = 0, s2Index = 0;
		while (s1Index < nums1.length && s2Index < nums2.length && currentIndex <= sumLen / 2) {

			if (nums1[s1Index] <= nums2[s2Index]) {
				if (currentIndex == sumLen / 2 - 1) {
					num1 = nums1[s1Index];
				}
				if (currentIndex == sumLen/2) {
					num2 = nums1[s1Index];
				}
				s1Index++;
				currentIndex++;
			} else {
				if (currentIndex == sumLen / 2 - 1) {
					num1 = nums2[s2Index];
				}
				if (currentIndex == sumLen/2) {
					num2 = nums2[s2Index];
				}
				s2Index++;
				currentIndex++;
			}
		}
		while (s1Index < nums1.length && currentIndex <= sumLen / 2) {
			if (currentIndex == sumLen / 2 - 1) {
				num1 = nums1[s1Index];
			}
			if (currentIndex == sumLen/2) {
				num2 = nums1[s1Index];
			}
			s1Index++;
			currentIndex++;
		}
		while (s2Index < nums2.length && currentIndex <= sumLen / 2) {
			if (currentIndex == sumLen / 2 - 1) {
				num1 = nums2[s2Index];
			}
			if (currentIndex == sumLen/2) {
				num2 = nums2[s2Index];
			}
			s2Index++;
			currentIndex++;
		}

		if (sumLen % 2 == 0) {
			median = (num1 + num2) / 2.0;
		} else {
			median = num2;
		}
		return median;

	}

	public static void main(String[] args) throws IOException {
		int[] num1 = { 1, 2 };
		int[] num2 = { 3, 4 };
		double ret = new ProblemFour().findMedianSortedArrays(num1, num2);
		System.out.println(ret);
	}
}
