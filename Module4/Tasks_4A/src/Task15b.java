public class Task15b extends Task15a {
    public static void main(String[] args) {
        Task15b var = new Task15b();
        var.firstName("Mike");
        var.fruits("Mango");
        var.aged(34);

        var.myObject();
        var.myGame();
    }

    public void myObject(){
        System.out.println("White Board");
    }
    public void myGame(){
        System.out.println("Ludo");
    }

}
