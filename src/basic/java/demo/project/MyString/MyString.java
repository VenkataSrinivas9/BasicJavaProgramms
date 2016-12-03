
/*****************************************************************************/
/*      SCI                                                                  */
/*      All Rights Reserved. Copyright (C) 2008, Hitachi, Ltd.               */
/*      Licensed Material of Hitachi, Ltd.                                   */
/*      Reproduction, use, modification or disclosure otherwise than         */
/*      permitted in the License Agreement is strictly prohibited.           */
/*****************************************************************************/ 

package basic.java.demo.project.MyString;

/**
 * 
 */
public final class MyString {

    /**
     * 
     */
    public String addString(String mainStr, String afterStr, String addStr) {

        StringBuffer contentToWrite = new StringBuffer();
        String sWords[] = mainStr.split(" ");
        for (String sWrd : sWords) {
            contentToWrite.append(sWrd + " ");
            if (sWrd.equals(afterStr)) {
                contentToWrite.append(addStr + " ");
            }
        }

        return contentToWrite.toString();
    }

    /**
     * 
     */
    public String addString(String mainStr, int atPos, String addStr) {

        StringBuffer contentToWrite = new StringBuffer();
        String sWords[] = mainStr.split(" ");
        int i = 0;
        for (String sWrd : sWords) {
            contentToWrite.append(sWrd + " ");
            if (i == atPos) {
                contentToWrite.append(addStr + " ");
            }
            for (int j = 0; j < sWrd.length(); j++) {
                i++;
            }
            i++;
        }

        return contentToWrite.toString();
    }

    /**
     * 
     */
    public String replaceString(String mainStr, int atPos, String newStr) {

        StringBuffer contentToWrite = new StringBuffer();
        String sWords[] = mainStr.split(" ");
        int i = 0;
        for (String sWrd : sWords) {
            if (i == atPos) {
                contentToWrite.append(newStr + " ");
            }
            else {
                contentToWrite.append(sWrd + " ");
            }
            for (int j = 0; j < sWrd.length(); j++) {
                i++;
            }
            i++;
        }

        
        return contentToWrite.toString();
    }

    /**
     * 
     */
    public String replaceString(String mainStr, String oldStr, String newStr) {

        StringBuffer contentToWrite = new StringBuffer();
        String sWords[] = mainStr.split(" ");
        for (String sWrd : sWords) {
            if (sWrd.equals(oldStr)) {
                contentToWrite.append(newStr + " ");
            }
            else {
                contentToWrite.append(sWrd + " ");
            }
        }

        return contentToWrite.toString();
    }

    /**
     * 
     */
    public String removeString(String mainStr, String removeStr) {

        StringBuffer contentToWrite = new StringBuffer();
        String sWords[] = mainStr.split(" ");
        for (String sWrd : sWords) {
            if (sWrd.equals(removeStr)) {
                contentToWrite.append("");
            }
            else {
                contentToWrite.append(sWrd + " ");
            }
        }

        return contentToWrite.toString();
    }

    /**
     * 
     */
    public String removeString(String mainStr, int atPos) {

        StringBuffer contentToWrite = new StringBuffer();
        String sWords[] = mainStr.split(" ");
        int i = 0;
        for (String sWrd : sWords) {
            if (i == atPos) {
                contentToWrite.append("");
            }
            else {
                contentToWrite.append(sWrd + " ");
            }
            for (int j = 0; j < sWrd.length(); j++) {
                i++;
            }
            i++;
        }

        return contentToWrite.toString();
    }

}