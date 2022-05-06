import javax.swing.*;

public class SampleSwing {
  private static JFrame frame;

  public static void main(String[] args) {
    frame = new JFrame();
    frame.setTitle("SampleSwing");
    frame.setSize(640, 480);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}