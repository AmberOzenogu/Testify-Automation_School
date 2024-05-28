public class Task19 {
    // 2. Static
    static String myName = "Amber";

    // 3. Super
    String name = "Ronke";

    public static void main(String[] args) {
        // 1. Final
        final String ballSize = "Small";
        String ballColor = "Blue";
        String ballTexture = "Fluffy";

//        ballSize = "Big";
//        ballColor = "White";
//        ballTexture = "Soft";
        System.out.println("The properties of my ball are, size: " +ballSize+ ", color: "+ballColor
        + ", texture: "+ballTexture);

        // 4. This
        Task19 var = new Task19();
        var.printName("Venice");
    }

    // 4. This
    public void printName(String name){
        System.out.println("Names: " +name+ " and " +this.name);
    }

}
