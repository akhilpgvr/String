public class StringBuilder_DS {

    public void stringBuilderFunctions() {

        StringBuilder sb = new StringBuilder("Hello");
        long startTime = System.currentTimeMillis();
        for(int i=0; i<10000; i++) {

            sb.append(" World ");
        }
        System.out.println("Total time taken = "+ (System.currentTimeMillis() - startTime)+ " ms");
    }
}
