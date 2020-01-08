import javax.swing.*;
import java.awt.*;

public class FrameWithAPanel1 {
    public static void main(String[] args) {
        FrameWithAPanel2 f = new FrameWithAPanel2();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}

class FrameWithAPanel2 extends JFrame {
    public FrameWithAPanel2() {
        setTitle("613 Rocks!");
        setSize(300, 200);
        setLocation(100, 200);

        FrameWithAPanel3 panel = new FrameWithAPanel3();
        Container cp = getContentPane();
        cp.add(panel);
    }
}

class FrameWithAPanel3 extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Hi", 75, 100);
    }
}