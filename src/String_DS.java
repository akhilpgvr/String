import com.sun.security.jgss.GSSUtil;

import java.nio.charset.StandardCharsets;

public class String_DS {

    public void stringFunctions() {

        String st = "Hello World";
        String st1 = "Welcome to Java";
        String st2 = new String("Hello World");
        String st3 = "Hello World";

        System.out.println("st + st1 = "+ st+st1);
        System.out.println(st.contentEquals(st2));  //true
        System.out.println(st == st2); //false
        System.out.println(st.equals(st2)); //true
        System.out.println(st.equalsIgnoreCase(st2)); //true
        System.out.println(st.substring(0, 5)); //Hello
        System.out.println(st.toUpperCase()); // to uppercase
        System.out.println(st.toLowerCase()); //to lowercase
        System.out.println(st.charAt(0)); //H
        System.out.println(st.compareTo(st3)); // compares the string o/p:-0(same)
        System.out.println(st.contains("Hello")); //true
        System.out.println(st.indexOf("World")); //6
        System.out.println(st.indent(3));
        System.out.println(" ".isBlank()); //true
        System.out.println(" ".isEmpty()); //false - it consider empty spaces as a value
        System.out.println(st.lastIndexOf("o")); //7 - to the last used index of a character
        System.out.println(st.endsWith("ld"));//true
        System.out.println(st.length()); //11
        System.out.println(st.repeat(3)); //to repeat the string 3 times
        System.out.println(st.replace("He", "Hi"));//Hillo World
        System.out.println(st.replaceFirst("l", "i")); //Hillo World
        System.out.println("Hello Hello Hello".replace("ll", "i"));
        System.out.println("asdasdasd".split("s")); //["a", "da", "da" "d"]
        System.out.println("asdasdasd".split("s",3)); //["a", "da", "dasd"]
        System.out.println(" asdasd  ".strip()); //asdasd - removes space in beginning and end
        System.out.println("---------------------------------------------");
        byte[] bte = st.getBytes(StandardCharsets.UTF_8); // byte conversion
        System.out.println(new String(bte)); // byte to String


    }
}
