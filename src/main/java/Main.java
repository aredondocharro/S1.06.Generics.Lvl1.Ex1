public class Main {
    public static void main(String[] args) {

        NoGenericMethods nogenerics = new NoGenericMethods("Hello", "World", "Nice to meet you");

        System.out.println(nogenerics.getObj1()+", "+nogenerics.getObj2()+", "+nogenerics.getObj3());

        nogenerics.setObj1("Good Bye");
        System.out.println(nogenerics.getObj1()+", "+nogenerics.getObj2()+", "+nogenerics.getObj3());

        NoGenericMethods nogenerics2 = new NoGenericMethods("Nice to meet you", "Hello", "World");

        System.out.println(nogenerics2.getObj1()+", "+nogenerics2.getObj2()+", "+nogenerics2.getObj3());

    }
}
