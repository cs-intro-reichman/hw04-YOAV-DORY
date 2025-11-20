public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String nstr = "";
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) > 64 && str.charAt(i) < 91) {
                nstr += (char)(str.charAt(i) +32);
            }else nstr += str.charAt(i);
        }
        return nstr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if (str2.length() == 0) {
            return true;
        }
        for(int i = 0; i < str1.length(); i++){
            int j = 0;
            if (str1.charAt(i) == str2.charAt(j)) {
                boolean isequal = true;
                while (j < str2.length()) {
                    if (str2.charAt(j) != str1.charAt(i)) {
                        isequal = false;
                    }
                    j++;
                    i++;
                }
                if (isequal) {
                    return true;
                }
            }
        }
        return false;
    }
}
