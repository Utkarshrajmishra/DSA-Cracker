public class numeric_keyboard {

    public static void main(String args[]) {
        String number[] = {"2", "22", "222",
                "3", "33", "333",
                "4", "44", "444",
                "5", "55", "555",
                "6", "66", "666",
                "7", "77", "777", "7777",
                "8", "88", "888",
                "9", "99", "999", "9999"};
        String arrang = "GEEKSFORGEEKS";
        System.out.println(geek(number, arrang));
    }

    private static String geek(String[] number, String arrang) {
        String pattern="";
        for(int i=0;i<arrang.length();i++)
        {
            char ch=arrang.charAt(i);
            if(ch==' ')
            {
                pattern+="0";
            }
            else
            {
                int k=Math.abs(65-(int)ch);
                pattern+=number[k];
            }
        }
        return pattern;



    }

}

