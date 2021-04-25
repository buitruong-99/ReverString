package Menu;

public class ReverString {
    public static void main(String[] args) {
        String string="abcdef";
        String reverse = new  StringBuffer(string).reverse().toString();
        System.out.println("\nChuoi trc khi dao nguoc: "+string);
        System.out.println("Chuoi sau khi dao nguoc la "+reverse);
    }
}
