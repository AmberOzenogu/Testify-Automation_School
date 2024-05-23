public class Test extends Task17a {
    public static void main(String[] args) {
        Test var = new Test();
        var.rememberMe(true);
        var.homePage(true);
        var.OAuthBtn(false);
        var.username();
    }

    @Override
    public void username() {
        System.out.println("Amber Ozenogu");
    }

    @Override
    public void password() {
        System.out.println("Testify");
    }

    @Override
    public void forgotPassword() {
        System.out.println("no");
    }

    @Override
    public void signInBtn() {
        System.out.println("Yes");
    }
}
