public class Task19super extends Task19{
    // 3. Super
    String name = "Anderson";
    public static void main(String[] args) {
        Task19super var = new Task19super();
        var.printName();
    }
    public void printName(){
        System.out.println("My parent class name is " + super.name);
        System.out.println("My name is " + name);
    }



}
