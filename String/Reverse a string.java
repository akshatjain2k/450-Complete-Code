class ReverseS {
    static String ReverseString(String str) {
        String ch = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            ch += str.charAt(i);
        }
        return ch;
    }

    public static void main(String[] args) {
        String str = "abcde";
        System.out.println(ReverseString(str));
    }
}