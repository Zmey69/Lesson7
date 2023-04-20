import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("\t\t\t **** Добро пожалвать в программу рецептов элексиров. ***");
        int toadEyesCount = 0;          //Жабьи глаза
        int ghoulTearsCount = 0;        //Слезы вурдалака
        int ravenBonesCount = 0;        //Кости ворона
        int dumplingsCount = 0;         //Пельмени(а почему, собственно нет? xD )
        Boolean canCook = false;
        System.out.println("Введите количество Жабьих глаз");
        toadEyesCount = new Scanner(System.in).nextInt();

        System.out.println("Введите количество Слез вурдалака");
        ghoulTearsCount = new Scanner(System.in).nextInt();

        System.out.println("Введите количество Костей вороны");
        ravenBonesCount = new Scanner(System.in).nextInt();

        System.out.println("Введите количество пельмений");
        dumplingsCount = new Scanner(System.in).nextInt();

        // todo

        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

        if (toadEyesCount >= 3 && ravenBonesCount >= 1) {
            System.out.println("Вы можите получить эликсир зоркости");
           canCook = true;
        }
        if (ravenBonesCount >= 2 && dumplingsCount >= 4) {
            System.out.println("Вы можите получить эликсир стойкости");
            canCook = true;
        }
        if (ghoulTearsCount >= 7 && dumplingsCount >= 1 && toadEyesCount >= 2) {
            System.out.println("Вы можите получить эликсир скрытности");
            canCook = true;
        }
        if (ghoulTearsCount >= 5 && dumplingsCount >= 1 && toadEyesCount >= 4 && ravenBonesCount >= 3) {
            System.out.println("Вы можите получить запретный эликсир");
            canCook = true;
        }
        if (canCook = false){
            System.out.println("Вы не можите получить эликсир");
        }

    }
}


