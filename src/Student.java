public class Student extends Person {
    //Thừa hưởng toàn bộ các thuôc tính, phương thức của lớp cha
    //Có thêm các thuộc tính và phương thức riêng của nó
    //this - super: this --> của lớp, super--> của cha mà được kế thừa
    //Thuộc tính riêng
    private float mark;
    private String classStudent;
    //Constructor

    public Student() {
    }

    public Student(String id, String name, int age, String address, float mark, String classStudent) {
        super(id, name, age, address);
        this.mark = mark;
        this.classStudent = classStudent;
    }

    public float getMark() {
        return mark;
    }

    public void setMark(float mark) {
        this.mark = mark;
    }

    public String getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }
    public void inputStudentData(){
        //id,name,age,address,mark,classStudent
        super.inputData();//Nhập các thuộc tính về người
        System.out.println("Nhập thêm các thuộc tính riêng của sinh viên");
    }

    public void inputData(){
        System.out.println("Phương thức ghi đè phương thức inputData của Person");
    }

    //Ghi đè phương thức toString() của Object
    public String toString() {
        return "Thông tin sinh viên";
    }
}
