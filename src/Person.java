public class Person {
    private String id;
    private String name;
    private int age;
    private String address;

    public Person() {
    }

    public Person(String id, String name, int age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void inputData(){
        System.out.println("Nhập dữ liệu cho đối tượng người");
    }
    public void displayData(){
        System.out.println("Hiển thị thông tin đối tượng người");
    }

    public int add(int number1,int number2){
        return number1+number2;
    }
    public int add(int number1,int number2,int number3){
        return number1+number2+number3;
    }
    public float add(float number1,float number2){
        return number1+number2;
    }
    public void test(int a, String b){
        System.out.println("abc");
    }
    public void test(String b, int a){
        System.out.println("cba");
    }

}
