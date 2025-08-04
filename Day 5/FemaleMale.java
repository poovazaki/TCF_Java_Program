

public class FemaleMale {
    public static void main(String[] args) {
        String str = "fmfmfmfmf";
        int f=0;
        int m=0;
        for (char ch : str.toCharArray()) {
            if (ch == 'f'){
               f++;
            }

            
             else if (ch == 'm') {
               m++;
            }
        }
        System.out.println("Female:"+f);
        System.out.println("male:"+m);
}
}
