package 刷题.笔试题;

import java.util.Scanner;

public class 携程_表达式解析 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String arr = in.nextLine();
        System.out.println(arr);

        String test = re(arr);

        System.out.println(test);

    }

    private static String re(String a){
        String back = null;
//        for (int i=0; i<a.length();i++){
//            while(a.charAt(i) == ')'){
//                while (a.charAt(i) != '('){
//                    back += a.charAt(i);
//                      i--;
//                }
//            }
//        }

        return back;


    }


}
