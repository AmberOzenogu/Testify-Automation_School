package packageOne;

import packageTwo.Task12b;

public class Task12a {
    public static void main(String[] args) {
        Task12b variable = new Task12b();
        variable.noAccess();
    }
    public void myAccess(){
        System.out.println("Java Task 12");
    }
}
