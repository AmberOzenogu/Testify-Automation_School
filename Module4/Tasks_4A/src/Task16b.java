public class Task16b extends Task16a {
    public static void main(String[] args) {
        Task16b var = new Task16b();
        var.myMethod("Limited");
        var.myMethod(15, "time");
    }


    public void myMethod(String name){
        System.out.println("Testify limited");
    }
    public void myMethod(int number, String word){
        System.out.println("The number and word chosen are 15 and time"); //Task16B
    }
}
