package practice;
public class practice02 {
    public static <Jlabel> void main(String[] args){
        //크리스마스트리 만들기
        /*
        for(int i=0;i<15;i++){
            System.out.print("*".repeat(1+i));
            System.out.println();
        }
        //직각삼각형
        */

        int num=10;
        for(int i=0;i<num;i++) {
            for (int j=1;j<num-i;j++) {
                System.out.print(" "); //공백
            }
            for(int k=0;k<i*2+1;k++){
                System.out.print("*");// *
            }
                System.out.println();
        } //이등변 삼각형 모양
    }
}
