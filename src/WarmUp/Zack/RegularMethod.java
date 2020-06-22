package WarmUp.Zack;

public class RegularMethod {
    public static void main(String[] args) {
//        String str = "HannaDatsko";
//        String reversName = "";
//
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reversName += str.charAt(i);
//        }
//        System.out.println(reversName);
//

        String str1 = "America";
        System.out.println(reverseName1(str1));

        String str2 = reverseName1("HannaBananna");
        System.out.println(str2);

    }

  public static String reverseName1 (String str){

        String result ="";

        for(int i = str.length()-1; i>=0; i--){
            result+=str.charAt(i);
        }
        return result;
    }
}

