
public class removeDuplicateString {
    public static void duplicate(String str,int idx,StringBuilder newStr,boolean map[ ])
    {
        if(idx==str.length())
        {
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar = 'a'])
        {
            //duplicate
            duplicate(str,idx+1,newStr,map);
        }
        else {
            map[currChar='a']=true;
            duplicate(str,idx+1,newStr.append(currChar),map);
        }
    }
    public static void main(String[] args)
    {
        String str="ApnaCollege";

        duplicate(str,0,new StringBuilder(" "),new boolean[26]);
    }
}
