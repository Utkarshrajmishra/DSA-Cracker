import java.util.HashMap;
import java.util.Map;

public class print_all_duplicate {
    public static void main(String[] args) {
        String str = "test string";
         duplicate(str);
    }
    public static void duplicate(String str)
    {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            if(map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }
            else
            map.put(str.charAt(i),1);
        }
       for(Map.Entry m: map.entrySet())
       {
           char ch=(char)m.getKey();
           int a=(int)m.getValue();
           if(a>1)
           {
               System.out.println(ch+" "+a);
           }
       }
    }

}
