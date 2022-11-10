package Tile;

import java.util.Scanner;

public class Test {
    public static void main( String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the length of Tile:");
        int TileLength = sc.nextInt();

        Tile t= new Tile(TileLength);

        System.out.println("Enter the length and width of Floor:");
        int flength = sc.nextInt();
        int fwidth = sc.nextInt();

        Floor f = new Floor(flength,fwidth);
        f.totalTiles(t);

    }

}
