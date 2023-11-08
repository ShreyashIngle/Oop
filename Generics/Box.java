
class Box {
    public static void main(String[] args) {
        Student<String> s = new Student<String>("Shreyash");
        s.show();
        s.StringLength();
        Student<Integer> s2 = new Student<>(23364);
        s2.show();
        s2.StringLength();
        InnerStudent s3 = new InnerStudent("shreyash");
       System.out.println( s3.show());

    }
}