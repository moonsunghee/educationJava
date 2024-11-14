import java.util.Scanner;

public class For {
    public static void main(String[] args){
        int i = 0;
        while(i<=10){
            //System.out.println("i의 값 : "+ i);
            i=i+1;
        }
        for(int j = 0; j<=10; j++){
            //System.out.println("j의 값 : "+ j);
        }
        int k = 10;
        while(k>=0){
            //System.out.println("k의 값 : "+ k);
            k=k-1;
        }
        for (int l = 10; l >= 0; l--) {
            //System.out.println("l의 값 : "+ l);
        }
        int m = 3;
        while(m<34){
            //System.out.println(m+"를 3으로 나눴을 때 나머지"+m%3);
            m++;
        }
        for(int n=3; n<34; n++){
            //System.out.println(n+"를 3으로 나눴을 때 나머지"+n%3);
        }

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("나이를 입력하세요.");
            int iNum = scanner.nextInt();
            if(iNum<=0) {
                System.out.println("정상적인 나이를 입력해 주세요. 1~99");
            }else if(iNum < 18){
                System.out.println("입력받은 나이는 : "+iNum+", 미성년자 입니다.");
                break;
            }else{
                System.out.println("입력받은 나이는 : "+iNum+", 성인 입니다.");
                break;
            }
        }
        int sum = 0;
        for (int j = 0; j <= 100; j++) {
            sum = sum + j;
        }
        System.out.println(sum);
    }
}
