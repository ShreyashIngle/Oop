class Students {
    String name;
    int age;
    int rollNo;
}

public class overloading {

    public static void main(String[] args) {
        Students s1 = new Students();
        s1.name = "shreyash";
        s1.age = 19;
        s1.rollNo = 64;

        Students s2 = new Students();
        s2.name = "prathamesh";
        s2.age = 19;
        s2.rollNo = 64;

        Students students[] = new Students[10];
        students[0] = s1;
        students[1] = s2;

        
        for (Students stud : students) {
            System.out.println(stud.name +":" +stud.age);
        }
    }
}