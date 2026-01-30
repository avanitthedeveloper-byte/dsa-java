// 22. Static Keyword

import java.util.*;

public class V {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Avanit Kumar";
        s1.rallNo = 365;
        s1.setSchoolName("R. H. School, Samartha");
        Student s2 = new Student();
        System.out.println(s2.getSchoolName());
        System.out.println(s2.percentageMarks(98, 97, 96));
    }
}

class Student {
    String name;
    int rallNo;

    static float percentageMarks(int math, int phy, int che) {
        return (float) (math + phy + che) / 3;
    }

    static String schoolName;

    void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    String getSchoolName() {
        return schoolName;
    }
}