public class Task15b extends Task15a {
    public static void main(String[] args) {
        Task15a var = new Task15a();
        var.firstName("Mike");
        var.fruits("Mango");
        var.aged(34);

        Task15b varry = new Task15b();
        varry.myObject();
        varry.myGame();
    }

    public void myObject(){
        System.out.println("White Board");
    }
    public void myGame(){
        System.out.println("Ludo");
    }

}
