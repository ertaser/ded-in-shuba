import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(System.in,"Cp866");
        boolean help = true;
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает,тот слезы проливает.");

        for (int game = 0; game < 3;){
            
            String str = scanner.nextLine();
            
            System.out.println("Введено "+ str);
            switch (str) {
                case("Заархивированный вирус"):
                System.out.println("Правильно!");
                game = 3;
                break;
                case("Подсказка"):
                    help = false;
                    if (game == 0 ){
                    System.out.println("Заархивированный вирус");
                    game = 2;
                    }else if (game > 0 ){
                        System.out.println("Подсказка уже не доступна");
                    }
                    break;
                
                default:
                    if (help == false ) {
                        System.out.println("Обидно приходи в другой раз");
                        game = 5;
                    }else
                    if (help == true ) {
                        System.out.println("Подумай ещё!");
                        game++;
                    }
                    break;
                
            }
        }
    }
}
