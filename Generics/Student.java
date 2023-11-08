public class Student<T> {
    T name;

    Student(T name) {
        this.name = name;
    }

    void StringLength(){
        if (name instanceof String) {
            System.out.println("The length of "+name+" is "+((String) this.name).length());
        }else if (name instanceof Integer) {
            System.out.println("This is integer "+name);
        }
    }
    void show() {
        System.out.println(name);
    }

}

