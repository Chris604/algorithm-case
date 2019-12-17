package alg_cource;

// 删除重复元素
public class Exp_1128 {

    public static void main(String []args){
        noDup("accbg11");
    }
    private static String noDup(String s){

        char[] as = s.toCharArray();
        char[] ass = new char[200];
        String s0 = "";

        for (int i=0; i< as.length; i++){
            if(ass[as[i]] != as[i]){
                ass[as[i]] = as[i];
                s0 = s0 + as[i];
            }
        }
        System.out.println(s0);
        return s0;
    }

}
