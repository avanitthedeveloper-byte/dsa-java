
// 6. Insert in Heap
import java.util.*;

public class F {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void insert(int val) {
            arr.add(val);
            int childIdx = arr.size() - 1;
            int parIdx = (childIdx - 1) / 2;
            while (arr.get(childIdx) < arr.get(parIdx)) {
                int temp = arr.get(childIdx);
                arr.set(childIdx, arr.get(parIdx));
                arr.set(parIdx, temp);
                childIdx = parIdx;
                parIdx = (childIdx - 1) / 2;
            }
        }
    }

    public static void main(String[] args) {

    }
}