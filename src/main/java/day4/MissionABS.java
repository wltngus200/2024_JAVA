package day4;

public class MissionABS {
    public static void main(String[] args){
        int val=(int)(Math.random()*21)-10;
        //0~20의 값이 나와서 10빼면>-10~10
        if(val<0){
            val=val*(-1);
            //val=-val
            //val=val-val-val
            /*
            1. val=>-val 원본이 수정된다는 아쉬움(대입이 되니까)
            2. 양과 음을 if else로 나눠 -val,val
            3. 삼항식 (val<0?-val:val)
             */
        }
        System.out.println(val);
    }
}
