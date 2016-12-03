package practice.projects.example;

import java.io.UnsupportedEncodingException;

/**
 * 
 */
public class Example {

    /**
     * @param args
     * @throws UnsupportedEncodingException
     */
    public static void main(String[] args) {
        String englishString = "(Note: The total size of work space LUs\n          must be large than the minimum\n          size of work space LU.)";
        String japaneseString = "(注意: 一時格納領域LUサイズの合計値は，\n          一時格納領域を構成できる最低値を\n          超えるように設定してください。)";
        System.out.println(japaneseString);
        System.out.println(englishString);
        // String japaneseName =new String(japaneseString.getBytes(),"UTF-8");
        // String englishName =new String(englishString.getBytes(),"UTF-8");
        // System.out.println(japaneseName);
        // System.out.println(englishName);
    }

}
