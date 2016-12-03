package practice.projects.example;

import java.util.StringTokenizer;


/**
 * 
 */
public class browser {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String userAgent = "MSIE 10";
        String unsupportedBrowsersPropertyString = "MSIE 10;EDGE 12";
        StringTokenizer allBrowserTokens = new StringTokenizer(unsupportedBrowsersPropertyString,";"); //$NON-NLS-1$
        String browsertoken = "";  //$NON-NLS-1$
        while(allBrowserTokens.hasMoreTokens()){
            browsertoken = allBrowserTokens.nextToken();
            int indexofopen = browsertoken.indexOf('[');
            String browserVersion = ""; //$NON-NLS-1$
            //get each browser version from the property file
            if(indexofopen!=-1){
                browserVersion = browsertoken.substring(0, indexofopen);
            } else{
                browserVersion = browsertoken;
            }
            if(userAgent.indexOf(browserVersion)!=-1){
                if(indexofopen!=-1){
                }
            }
        }
    }

}

