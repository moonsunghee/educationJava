import java.util.Scanner;

public class UpAndDown {
    public static void main(String[] args){
        int rNum = (int)(Math.random()*100+1);
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("1~100사이 숫자를 입력하세요.");
            int iNum = scanner.nextInt();
            if(rNum > iNum ){
                System.out.println(iNum+" 보다 큰 수를 입력 해 주세요.");
            }else if(rNum < iNum){
                System.out.println(iNum+" 보다 적은 수를 입력 해 주세요.");
            }else{
                System.out.println("짝짝짝 맞았습니다. 정답은 "+ rNum+" 입니다.");
                break;
            }
        }
    }
}
