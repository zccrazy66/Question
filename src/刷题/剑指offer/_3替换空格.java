package 刷题.剑指offer;

/**
 * 题目： 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 *
 * 例如：
 * 输入：We Are Happy.
 * 输出：We%20Are%20Happy。
 *
 */



public class _3替换空格 {

    public String replaceSpace(StringBuffer str) {

        // 没啥意思

        if(str==null)
        {
            return null;
        }

        for(int i=0; i<str.length(); i++)
        {
            char c = str.charAt(i);
            if(c==' ')
            {
                str.replace(i,i+1,"%20");
            }
        }
        String newstr = str.toString();

        return newstr;
    }


}
