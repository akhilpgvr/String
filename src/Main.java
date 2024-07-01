public class Main {
    public static void main(String[] args) {
        System.out.println("String operations \n ----------------------------- \n");
        String_DS str = new String_DS();
        str.stringFunctions();
        System.out.println("String operations \n ----------------------------- \n");
        StringBuffer_DS strBuffer = new StringBuffer_DS();
        strBuffer.stringBufferFunctions();
        System.out.println("String operations \n ----------------------------- \n");
        StringBuilder_DS strBuilder = new StringBuilder_DS();
        strBuilder.stringBuilderFunctions();
    }
}