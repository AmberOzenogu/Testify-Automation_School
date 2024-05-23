public class Task19 {
    // 2. Static
    static String myName = "Amber";

    // 3. Super
    String name = "Ronke";

    public static void main(String[] args) {
        // 1. Final
        final double ballSize = 20.81;
        String ballColor = "Blue";
        String ballTexture = "Fluffy";

//        ballSize = 31.9;
//        ballColor = "White";
//        ballTexture = "Soft";
//        System.out.println("The properties of my ball are, size: " +ballSize+ ", color: "+ballColor
//        + ", texture: "+ballTexture);

        // 4. This
        Task19 var = new Task19();
        var.printName("Venice");
    }

    // 4. This
    public void printName(String name){
        System.out.println("Names: " +name+ " and " +this.name);
    }

}
