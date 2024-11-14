import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("신호등 색을 입력하세요. (r/y/g)");
        char light = scanner.next().charAt(0);
//        if(light == 'r'){
//            System.out.println("R입니다.");
//        }else if(light == 'y'){
//            System.out.println("Y입니다.");
//        }else{
//            System.out.println("G입니다.");
//        }
        if(light == 'r'){
            System.out.println("R입니다.");
        }else{
            if(light == 'y'){
                System.out.println("Y입니다.");
            }else{
                System.out.println("G입니다.");
            }
        }
//        System.out.println("사이즈를 입력해 주세요.");
//        char size = scanner.next().charAt(0);
//        boolean isHost = scanner.nextBoolean();
//        int basePrice = 30000;
//        int resultPrice = basePrice;
//        if(size == 's' || size == 'm' || size == 'l' ){
//            if(isHost){
//                resultPrice = resultPrice + 500;
//            }
//            if(size == 'm'){}
//        }
        System.out.println("나이를 입력하세요.");
        int age = scanner.nextInt();
    }
}
