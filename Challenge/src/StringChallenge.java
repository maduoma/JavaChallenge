public class StringChallenge {

    public static void stringDemo() {

        String str = "abc";
        String c = str.substring(2,3);
        System.out.println(c);

        char[] data = {'a', 'b', 'c'};
        String str2 = new String(data);
        System.out.println(str2);

        String cde = "cde";
        String d = cde.substring(1, 2);
        System.out.println(d);
    }
}
