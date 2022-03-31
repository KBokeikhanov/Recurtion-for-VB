public class MyClass {
    public static void main(String args[]) {
        String str = "asdf";
        System.out.println(lenStr(str));
    }

    public static int lenStr(String str) {
        int res = 0;

        if (str == "") {
            return res;
        } else {
            res++;
        }

        res = res + lenStr(str.substring(1));
        return res;

    }

}



