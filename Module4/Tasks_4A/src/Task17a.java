public abstract class Task17a {

    public abstract void username();
    public abstract void password();
    public abstract void forgotPassword();
    public abstract void signInBtn();

    public void rememberMe(boolean checkBox){
        System.out.println("Remember me?");
    }
    public void homePage(boolean conT){
        System.out.println("Continue");
    }
    public void OAuthBtn(boolean button){
        System.out.println("Click");
    }
}
