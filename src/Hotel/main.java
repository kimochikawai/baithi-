package Hotel;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        ArrayList<Hotel> hotels = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            hotels.add(new Hotel());
        }

        int j = 1;
        for (Hotel ht : hotels) {
            System.out.println("Nhap hotel " + j + " :");
            Scanner info = new Scanner(System.in);
            System.out.println("Nhap ten hotel:");
            ht.setName(info.nextLine());

            System.out.print("NHap nguoi so huu: ");
            ht.setOwnerName(info.nextLine());

            System.out.print("Nhap vi tri :  ");
            ht.setLocation(info.nextLine());
            j++;
        }


        System.out.println("Tim ten : ");
        Scanner search = new Scanner(System.in);
        String str = search.nextLine();

        for (Hotel ht : hotels) {
            if (ht.getOwnerName().equalsIgnoreCase(str)) {
                ht.KetQua();
            }

        }
    }


}
