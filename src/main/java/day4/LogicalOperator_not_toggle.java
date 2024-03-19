package day4;

public class LogicalOperator_not_toggle {
    public static void main(String[] args){

        //not !

        System.out.println();
        boolean s1=true&&true&&true;
        System.out.println("!!s1"+!!s1);
        boolean s2=true&&true&&true;
        System.out.println("!s2"+!s2);
        boolean s3=true&&true&&true;
        System.out.println("s3"+s3);
        System.out.println();

        //toggle 토글: 누르는 거만 가능한 버튼
        //누를 때마다 값이 바뀜
        boolean tg=true;
        tg=!tg;
        System.out.println("tg:"+tg);
        tg=!tg;
        System.out.println("tg:"+tg);
        tg=!tg;
        System.out.println("tg:"+tg);
        tg=!tg;
        System.out.println("tg:"+tg);

    }
}
