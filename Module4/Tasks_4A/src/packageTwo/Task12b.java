package packageTwo;

import packageOne.Task12a;

public class Task12b {
    public static void main(String[] args) {
        Task12a myVariable = new Task12a();
        myVariable.myAccess();

        Task12b variable = new Task12b();
        variable.noAccess();
    }

    private void noAccess(){
        System.out.println("Cannot access outside this class");
    }
}
