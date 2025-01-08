package location;

public class Island {
    private Location[][] locations;
    private int width;
    private int height;

    public Island(int width, int height) {
        this.width = width;
        this.height = height;
        locations = new Location[width][height];
        initializeLocations();
    }

    private void initializeLocations() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                locations[i][j] = new Location();
            }
        }
    }

    public void update() {
        for (int i=0; i < width; i++) {
            for (int j=0; j < height; j++) {
                locations[i][j].update();
            }
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Location getLocation(int x, int y) {
        if (x >=0 && x < width && y > 0 && y < height) {
            return locations[x][y];
        }
        return null;
    }
}
