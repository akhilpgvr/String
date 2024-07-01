public class StringBuffer_DS {

    public void stringBufferFunctions() {

        StringBuffer bs = new StringBuffer("Hello");
        long startTime = System.currentTimeMillis();
        for(int i=0; i<10000; i++) {
            bs.append(" World ");
        }
        System.out.println("Total time taken = "+ (System.currentTimeMillis() - startTime)+ " ms");
    }
}
