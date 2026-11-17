public class UserBeanDemo {
    public static void main(String[] args) {
        UserBean user = new UserBean();
        user.setPassword("Java@123");

        System.out.println("Correct password: " + user.authenticate("Java@123"));
        System.out.println("Wrong password: " + user.authenticate("hello"));
    }
}
