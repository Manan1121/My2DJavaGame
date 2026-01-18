import javax.swing.*;
// Subclass of JPanel, so it shares all the functions of JPanel
public class GamePanel extends JPanel {
    // SCREEN SETTINGS
    final int originalTileSize = 16; // 16x16 size
    final int scale = 3;
    final int tileSize = originalTileSize * scale;
    final int maxScreenCol = 16;
    final int maxScreenRow = 12;
    final int screenWidth = tileSize * maxScreenCol;
    final int screenHeight = tileSize * maxScreenRow;


}
