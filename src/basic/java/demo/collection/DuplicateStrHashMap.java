package basic.java.demo.collection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

public class DuplicateStrHashMap {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Map hashMap = new HashMap<String, Integer>();
        try {
            File file = new File("D:\\JavaWorkSpace\\BasicJava_Demos\\src\\basic\\java\\demo\\collection\\java.txt");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            StringBuffer stringBuffer = new StringBuffer();
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuffer.append(line).append(" ");
            }
            String str = stringBuffer.toString().replaceAll("[^a-zA-Z ]", " ").toLowerCase();
//            String str = "java is java but it is not java";
            StringTokenizer stringTokenizer = new StringTokenizer(str," ");
            
            while(stringTokenizer.hasMoreTokens()){
                int count = 1;
                String strStringTokenizer = stringTokenizer.nextToken();
                if(hashMap.containsKey(strStringTokenizer)){
                    Iterator<Map.Entry<String, Integer>> iterator = hashMap.entrySet().iterator() ;
                    while(iterator.hasNext()){
                        Map.Entry<String, Integer> studentEntry = iterator.next();
                        if(studentEntry.getKey().equalsIgnoreCase(strStringTokenizer)){
                            count = studentEntry.getValue() + count;
                        }
                    }
                }
                hashMap.put(strStringTokenizer.toString(), count);
            }
            
            Iterator<Map.Entry<String, Integer>> iterator = hashMap.entrySet().iterator() ;
            while(iterator.hasNext()){
                Map.Entry<String, Integer> studentEntry = iterator.next();
                System.out.println(studentEntry.getKey() +" :: "+ studentEntry.getValue());
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }  catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       

    }

}
