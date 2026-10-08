import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
public class DashboardDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Dashboard Demo");
        frame.setLayout(new BorderLayout());
        JPanel header = new JPanel();
        header.setBackground(Color.LIGHT_GRAY);
        header.add(new JLabel("Header Area"));
        JPanel footer = new JPanel();
        footer.setBackground(Color.LIGHT_GRAY);
        footer.add(new JLabel("Footer Area"));
        JPanel menu = new JPanel();
        menu.setBackground(Color.CYAN);
        menu.add(new JLabel("Menu Area"));
        JPanel content = new JPanel();
        content.setBackground(Color.WHITE);
        content.add(new JLabel("Main Content Area", SwingConstants.CENTER));
        JPanel rightSidebar = new JPanel();
        rightSidebar.setBackground(Color.PINK);
        rightSidebar.add(new JLabel("Right Sidebar"));
        frame.add(header, BorderLayout.NORTH);
        frame.add(footer, BorderLayout.SOUTH);
        frame.add(menu, BorderLayout.WEST);
        frame.add(rightSidebar, BorderLayout.EAST);
        frame.add(content, BorderLayout.CENTER);
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
