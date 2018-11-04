package Homework4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ClasChat extends JFrame {
    private Date date;
    private final SimpleDateFormat dateFormat;

    private String getTime() {
        date = new Date();
        return dateFormat.format(date);
    }
    ClasChat() {
        dateFormat = new SimpleDateFormat("HH:mm");
        setTitle("Chat");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 300, 400, 400);

        JPanel bottomPanel = new JPanel();
        JPanel centerPanel = new JPanel();

        centerPanel.setBackground(Color.gray);
        bottomPanel.setBackground(Color.LIGHT_GRAY);

        bottomPanel.setPreferredSize(new Dimension(1, 40));

        add(bottomPanel, BorderLayout.SOUTH);
        add(centerPanel, BorderLayout.CENTER);

        centerPanel.setLayout(new BorderLayout());
        bottomPanel.setLayout(new FlowLayout());

        JTextArea jta = new JTextArea();
        jta.setBackground(Color.white);
        jta.setEditable(false);
        JScrollPane jsp = new JScrollPane(jta);
        centerPanel.add(jsp, BorderLayout.CENTER);

        JTextField jtf = new JTextField();
        jtf.setPreferredSize(new Dimension(300, 30));
        JButton jb = new JButton("Send");
        bottomPanel.add(jtf);
        bottomPanel.add(jb);

        JMenuBar mainMenu = new JMenuBar();
        JMenu mFile = new JMenu("File");
        JMenuItem miFileNew = new JMenuItem("New");
        JMenuItem miFileExit = new JMenuItem("Exit");
        setJMenuBar(mainMenu);
        mainMenu.add(mFile);
        mFile.add(miFileNew);
        mFile.addSeparator(); // разделительная линия в меню
        mFile.add(miFileExit);

        miFileNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.setText(null);
            }
        });

        miFileExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("BYE");
            }
        });




        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jta.append(jtf.getText() + "\n");
                jtf.setText(null);
                jtf.grabFocus();
            }
        });

        jtf.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = jtf.getText();
                if (!text.isEmpty()) {
                    jta.append("["+getTime()+"]" + " " + jtf.getText() + "\n");
                    jtf.setText(null);
                    jtf.grabFocus();

                    //jta.setText(String.format("%s%s[%s] %s", textArea.getText(), br, getTime(), text));

                }

            }
        });

      /*  jtf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    jta.append(jtf.getText() + "\n");
                    jtf.setText(null);
                    jtf.grabFocus();
                }
                super.keyReleased(e);
            }
        });
        */
        setVisible(true);
    }
}

