package demoone;

public class Delete_5 {
	public int solution(int N) {
        // Implement your solution here
        String numStr = String.valueOf(N);
    int maxVal = Integer.MIN_VALUE;
    
    for (int i = 0; i < numStr.length(); i++) {
        if (numStr.charAt(i) == '5') {
            String updatedNumStr = numStr.substring(0, i) + numStr.substring(i + 1);
            int updatedNum = Integer.parseInt(updatedNumStr);
            maxVal = Math.max(maxVal, updatedNum);
        }
    }
    
    return maxVal;

    }


}
