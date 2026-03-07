// 3. Priority Queue for Objects

import java.util.Comparator;
import java.util.PriorityQueue;

public class C {
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        // PriorityQueue<Student> pq = new PriorityQueue<>();
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(new Student("Avanit", 15));
        pq.add(new Student("Kumar", 1));
        pq.add(new Student("Roy", 30));
        pq.add(new Student("Bittu", 12));
        pq.add(new Student("Rohan", 15));
        pq.add(new Student("Puja", 8));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().rank);
            pq.remove();
        }
    }
}