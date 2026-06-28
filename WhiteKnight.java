import java.io.File;
import java.io.IOException;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JComponent;

public class WhiteKnight extends JComponent {
    private BufferedImage image;
    
    public WhiteKnight() {
        try {
            image = ImageIO.read(new File("assets/white-knight.png"));
        } catch (IOException e) {
            System.err.println("Failed to load knight asset: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        
        // Enable anti-aliasing for smoother graphics
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, 
                            RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                            RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        g2d.drawImage(image, 300, 50, image.getWidth() / 6, image.getHeight() / 6, this);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(400, 300);
    }
}