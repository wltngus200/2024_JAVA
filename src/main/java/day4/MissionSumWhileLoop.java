package day4;

import java.util.Scanner;

public class MissionSumWhileLoop {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);

        int sum=0;
        int input=0;
        //입력한 숫자를 모두 더한 값 출력
        while(true){//
            System.out.print("숫자를 입력해주세요.(종료:0)");
            input=scan.nextInt();
            if (input == 0) {
                break;
        } else {
                sum=sum+input;
            }
        System.out.println("종료");
        System.out.println(sum);
        //
    }
}
