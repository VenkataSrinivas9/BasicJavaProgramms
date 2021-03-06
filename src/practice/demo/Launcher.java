
package practice.demo;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.jar.Attributes;
import java.util.jar.JarFile;
import java.util.jar.Manifest;


/**
 * 
 */
public class Launcher {

    /**
     * @param args
     */
    public static void main(String args[]) throws Exception {
        File jarfile = new File("D:\\model.jar");
        JarFile jar = new JarFile(jarfile);
        Manifest manifest = jar.getManifest();
        Attributes attrs = manifest.getMainAttributes();
        String mainClassName = attrs.getValue("Main-Class");
        URL url = new URL("file", null, jarfile.getAbsolutePath());
        ClassLoader cl = new URLClassLoader(new URL[] {url});
        Class mainClass = cl.loadClass(mainClassName);
        Method mainMethod = mainClass.getMethod("main", new Class[] {String[].class});
        String[] args2 = new String[args.length - 1];
        System.arraycopy(args, 1, args2, 0, args.length - 1);
        mainMethod.invoke(mainClass, new Object[] {args2});
      }

}

