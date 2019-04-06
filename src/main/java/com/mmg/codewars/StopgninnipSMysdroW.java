package com.mmg.codewars;


/*
        輸入字串，反轉字串中超過5個字的單字
        Examples:
spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
spinWords( "This is a test") => returns "This is a test"
spinWords( "This is another test" )=> returns "This is rehtona test"
 */
public class StopgninnipSMysdroW {
    public static void main(String[] args) {
        String word = "emocleW";
        String word2 = "Hey wollef sroirraw";
        System.out.println(spinWords(word2));
        System.out.println(spinWordsGodWrite2(word2));

        //String.replace 輸出入說明測試
        String Str = new String("hello");
        System.out.print("返回值 :" );
        Str = Str.replace('o', 'T').replace('h','Q');
        System.out.println(Str);
        //System.out.println(Str.replace('o', 'T').replace('h','Q'));
        System.out.print("返回值 :" );
        Str = Str.replace('l', 'D');
        //System.out.println(Str.replace('l', 'D'));
        System.out.println(Str);
        System.out.print("返回值 :" );
        System.out.println(Str.replace('e', 'G'));
    }
    public static String spinWords(String word){
        if (word.equals(""))return word;
        String[] wordArray = word.split(" ");
        StringBuffer sf = new StringBuffer();
        for (String s:wordArray){
            if (s.length()>4){
                word = word.replace(s,new StringBuffer(s).reverse());
                sf.setLength(0); //清空效率最高，這邊沒用到了純紀錄
            }
            //else {
            //    sb.append(s+" ");
            //}
        }
        return word;
    }
    public static String spinWordsGodWrite2(String sentence) {
        for (String a : sentence.split(" ")) {
            if (a.length()> 4) {
                sentence = sentence.replace(a, new  StringBuffer(a).reverse());
            }
        }
        return sentence;
    }

    public static String spinWordsGodWrite(String sentence) {
        String[] words = sentence.split(" ");
            for (int i=0; i<words.length; i++) {
                    if (words[i].length() >= 5) {
                            words[i] = new StringBuilder(words[i]).reverse().toString();
                        }
                }
            return String.join(" ",words);
        }
}
