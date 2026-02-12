// 6. Maximum Rectangular Area in Histogram (Code)

import java.util.Stack;

public class F {
    public static void maximumArea(int arr[]) {
        int maxArea = 0;
        int nSR[] = new int[arr.length];
        int nSL[] = new int[arr.length];
        // Next Smaller Right
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nSR[i] = arr.length;
            } else {
                nSR[i] = s.peek();
            }
            s.push(i);
        }

        // Next Smaller Left
        s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nSL[i] = -1;
            } else {
                nSL[i] = s.peek();
            }
            s.push(i);
        }
        // Current Rea
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nSR[i] - nSL[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }
        System.out.println("Maximum area of Histogram: " + maxArea);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 5, 6, 2, 3 };
        maximumArea(arr);
    }
}