public class subSString {
    public static void main(String[] args) {
        String email = "Sharannandakumar@gmail.com";
        String user = email.substring(0, 16);
        String domain = email.substring(email.indexOf("g"));

        System.out.println(domain);

    }
}