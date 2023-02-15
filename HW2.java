package home_work2;

public class HW2 {
    
    public static void main(String[] args) {
//tests
        System.out.println("Test01");
        System.out.println();
        String text1 = "   how are you doing?  i'm    freaked out  by java :X   Sorry   ";
        System.out.println(text1);
        System.out.println(makeCorrectString(text1));
        System.out.println();
        System.out.println("Test02");
        System.out.println();
        String text2 = "   hello!  i'm a bit  worried   :[]   Who are you? hey?   ";
        System.out.println(text2);
        System.out.println(makeCorrectString(text2));
        System.out.println();
        String text3 = "   Кто здесь? зачем? я так устал от всего этого    Хочу уснуть и не проснуться  ";
        System.out.println("Test03");
        System.out.println();
        System.out.println(text3);
        System.out.println(makeCorrectString(text3));
    }


    static String makeCorrectString(String str) {
        StringBuilder strBuild = new StringBuilder(str.trim());
        char start = strBuild.charAt(0);
        String symbols = "?,.!;:";
        if (Character.isLowerCase(start))
            strBuild.setCharAt(0, Character.toUpperCase(start));
        for (int i = 1; i < strBuild.length() - 1; i++) {
            if (strBuild.charAt(i) == ' ' & strBuild.charAt(i + 1) == ' ') {
                strBuild.deleteCharAt(i + 1);
                i--;
            }
            if (strBuild.charAt(i) == ' ' && Character.isUpperCase(strBuild.charAt(i + 1))
             && symbols.contains(String.valueOf(strBuild.charAt(i - 1))) == false) {
                strBuild.insert(i, '.');
                i++;
            }
            if (strBuild.charAt(i) == ' ' && symbols.contains(String.valueOf(strBuild.charAt(i - 1))) &&
            Character.isLowerCase(strBuild.charAt(i + 1))){
                strBuild.setCharAt(i + 1, Character.toUpperCase(strBuild.charAt(i + 1)));
                i++;
            }
        }
        if (symbols.contains(String.valueOf(strBuild.charAt(strBuild.length() - 1))) == false)
        {
        strBuild.append('.');}

        return str = strBuild.toString();
    }



}