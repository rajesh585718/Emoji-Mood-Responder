import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmojiMoodGUI extends JFrame {
    private JTextField moodInput;
    private JLabel responseLabel;
    private MoodResponder responder;

    public EmojiMoodGUI() {
        responder = new MoodResponder();

        setTitle("😊 Emoji Mood Responder");
        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel heading = new JLabel("How are you feeling today?");
        heading.setHorizontalAlignment(SwingConstants.CENTER);
        heading.setFont(new Font("Arial", Font.BOLD, 16));
        add(heading, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel();
        moodInput = new JTextField(15);
        JButton respondButton = new JButton("Respond");

        respondButton.setBackground(new Color(100, 149, 237));
        respondButton.setForeground(Color.WHITE);
        respondButton.setFocusPainted(false);

        centerPanel.add(moodInput);
        centerPanel.add(respondButton);
        add(centerPanel, BorderLayout.CENTER);

        responseLabel = new JLabel("😊");
        responseLabel.setHorizontalAlignment(SwingConstants.CENTER);
        responseLabel.setFont(new Font("SansSerif", Font.BOLD, 18));
        add(responseLabel, BorderLayout.SOUTH);

        respondButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String mood = moodInput.getText().toLowerCase().trim();
                String response = responder.getResponse(mood);
                responseLabel.setText(response);
            }
        });

        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(EmojiMoodGUI::new);
    }
}
