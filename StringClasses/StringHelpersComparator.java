package StringClasses;

public class StringHelpersComparator {
    public static void main(String[] args) throws Exception{
        long startTime = System.currentTimeMillis();
        StringBuffer buffer= new StringBuffer("Testing String");
        for(int i=0;i<100000;i++){
            buffer.append(" Hello");
        }
        System.out.println("Time Elapsed Buffering: "+(System.currentTimeMillis() - startTime));
        startTime = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("Testing String");
        for(int i=0;i<100000;i++){
            builder.append(" Hello");
        }
        System.out.println("Time Elapsed Building: "+(System.currentTimeMillis() - startTime));
    }
}
