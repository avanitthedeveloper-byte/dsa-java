// 17. Union & Intersection

import java.util.LinkedHashSet;

public class Q {

    public static void main(String[] args) {
        int arr1[] = { 7, 3, 9 };
        int arr2[] = { 6, 3, 9, 2, 9, 4 };

        // Union
        LinkedHashSet<Integer> union = new LinkedHashSet<>();
        for (int i = 0; i < arr1.length; i++) {
            union.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            union.add(arr2[i]);
        }
        System.out.println("Union: " + union);

        // Intersection
        union.clear();
        for (int i = 0; i < arr1.length; i++) {
            union.add(arr1[i]);
        }
        LinkedHashSet<Integer> intersection = new LinkedHashSet<>();
        for (int i = 0; i < arr2.length; i++) {
            if (union.contains(arr2[i])) {
                intersection.add(arr2[i]);
                union.remove(arr2[i]);
            }
        }
        System.out.println("Intersection: " + intersection);
    }
}