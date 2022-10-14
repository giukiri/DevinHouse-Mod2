public class ExpetionProgram {
    public static void main(String [] args){
        try{
            int a = 0;
            int b = a/a;
        } catch (Exception e){
            System.out.println("essa é uma mensagem de exception" + e.getMessage());
        }
    }
}
