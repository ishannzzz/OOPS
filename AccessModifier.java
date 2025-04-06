class AccessExample {
    public String publicVar = "I am Public";
    private String privateVar = "I am Private";
    protected String protectedVar = "I am Protected";
    String defaultVar = "I am Default";
    public void showAccess() {
        System.out.println(publicVar);
        System.out.println(privateVar);
        System.out.println(protectedVar);
        System.out.println(defaultVar);
    }
}
public class AccessModifier {
    public static void main(String[] args) {
        AccessExample obj = new AccessExample();
        System.out.println(obj.publicVar);
        System.out.println(obj.protectedVar);
        System.out.println(obj.defaultVar);
        obj.showAccess();
    }
}
