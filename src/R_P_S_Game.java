import java.util.Scanner;

public class R_P_S_Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rNum = (int)(Math.random()*3);
        int iNum = 0;
        System.out.println("'가위' / '바위' / '보' 를 입력해주세요.");
        while(true){
            String game = scanner.nextLine();
            if(game.equals("가위")){
                iNum = 0;
                break;
            }else if(game.equals("바위")){
                iNum = 1;
                break;
            }else if(game.equals("보")){
                iNum = 2;
                break;
            }else{
                System.out.println("'가위', '바위', '보' 를 정확하게 입력해주세요.");
            }
        }

        if(rNum == 0){
            if(iNum == 0){
                System.out.println("자바:가위 vs 당신:가위 = 비김");
            }else if(iNum == 1){
                System.out.println("자바:가위 vs 당신:바위 = 이김");
            }else{
                System.out.println("자바:가위 vs 당신:보 = 짐");
            }
        }else if(rNum == 1){
            if(iNum == 0){
                System.out.println("자바:바위 vs 당신:가위 = 짐");
            }else if(iNum == 1){
                System.out.println("자바:바위 vs 당신:바위 = 비김");
            }else{
                System.out.println("자바:바위 vs 당신:보 = 이김");
            }
        }else if(rNum == 2){
            if(iNum == 0){
                System.out.println("자바:보 vs 당신:가위 = 이김");
            }else if(iNum == 1){
                System.out.println("자바:보 vs 당신:바위 = 짐");
            }else{
                System.out.println("자바:보 vs 당신:보 = 비김");
            }
        }
    }
}
