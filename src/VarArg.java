public class VarArg {

    public static void main(String[] args){
        System.out.println(concatinate("Deepak" , "kumar"));
    }

    public static String concatinate(String...str){
        StringBuilder sb = new StringBuilder();
        for (String s : str) {
            sb.append(s).append(" ");
        }
        return sb.toString();
    }
}
