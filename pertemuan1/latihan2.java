import javax.swing.*;
import java.awt.*;

public class latihan2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Latihan 2");
            frame.add(new JLabel("Hello PP2!", JLabel.CENTER), BorderLayout.CENTER);
            frame.setSize(300, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
        
    }
}
