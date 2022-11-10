package Tile;

class Tile {
    private int edge;
    private int area;

    Tile(int edge) {
        this.edge = edge;
        this.area = edge * edge;

    }

    int getArea() {
        return area;
    }

}
