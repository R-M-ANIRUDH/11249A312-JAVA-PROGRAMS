import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JApplet;
import javax.swing.JFrame;
public class HouseApplet extends JApplet {
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(100, 150, 200, 150);
        g.setColor(Color.RED);
        int[] xRoof = {100, 200, 300};
        int[] yRoof = {150, 80, 150};
        g.fillPolygon(xRoof, yRoof, 3);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(180, 220, 40, 80);
        g.setColor(Color.BLUE);
        g.fillRect(120, 180, 40, 40);
        g.fillRect(240, 180, 40, 40);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("House Applet");
        HouseApplet applet = new HouseApplet();
        frame.add(applet);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        applet.init();
        applet.start();
    }
}
