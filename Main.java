public class Main {
    public static void main(String[] args) {
        // New Account
        Account account = new Account();
        account.store();
        account.store("./backend/");
    }
}
