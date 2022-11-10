package Tile;

class Floor {
    private  int length;
    private int width;
    Floor(int length, int width){

        this.length = length;
        this.width = width;

    }
    void totalTiles(Tile t){
        double tileArea= t.getArea();
        double floorArea = length*width;
        double noOfTiles = floorArea/tileArea;
        System.out.println("Number of Tiles: "+ noOfTiles);
    }
}
