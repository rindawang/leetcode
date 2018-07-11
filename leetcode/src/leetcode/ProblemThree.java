package leetcode;

class ProblemThree {
	public int lengthOfLongestSubstring(String s) {
		if(s.length() == 1){
			return 1;
		}
		int len = s.length(), lenLongest = 0, beginIndex = 0;
		String temp = s.substring(0, 1);

		for (int i = 1; i < len; i++) {
			if (temp.indexOf(s.charAt(i)) > -1) {
				if (lenLongest < temp.length()) {
					lenLongest = temp.length();
				}
				beginIndex = s.indexOf(s.charAt(i), beginIndex) + 1;
				temp = s.substring(beginIndex, i + 1);

			} else {
				temp = s.substring(beginIndex, i + 1);
			}
		}
		return lenLongest;
	}
}
