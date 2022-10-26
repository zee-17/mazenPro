package utilities;

public class Utilities {

    public static boolean same(String word1, String word2){
        boolean ans = true;

        for (int i = 0; i < word2.length(); i++){

            if (word1.contains(word2.substring(i, i +1))){

            }else {
                ans = false;
            }

        }
        return ans;

    }
    public static String removeDup(String str){
        String ans = "";
        String ans2 = "";
        int count = 0;
        for (int i = 0; i < str.length() - 1;i++){
            ans = str.substring(i, i+1);
            for (int j = 1; j < str.length() - 1;j++){
                if ( ans.contains(str.substring(j,j+1)) && !ans2.contains(ans)){
                    ans2 += ans;
                } else if (ans.contains(str.substring(str.length()-1))&& !ans2.contains(ans)) {
                    ans2 += ans;
                }if (ans2.isEmpty()){
                    ans2 += ans;
                }
            }
        }


        return ans2;
    }
}
