package com.transdyn.dynac.gridbagLayout;

import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
/*
 * GridBagLayoutTest.java,source code from java核心技术 卷1 基础知识,P379
 */

public class GridBagLayoutTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        FontFrame frame = new FontFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class FontFrame extends JFrame {
    int DEUAULT_WIDTH = 300;
    int DEUAULT_HEIGHT = 200;
    private JComboBox face;
    private JComboBox size;
    private JCheckBox bold;
    private JCheckBox italic;
    private JTextArea sample;

    public FontFrame() {
        setTitle("GridBagLayoutTest");
        setSize(DEUAULT_WIDTH, DEUAULT_HEIGHT);
        GridBagLayout layout = new GridBagLayout();
        setLayout(layout);

        ActionListener listener = new FontAction();
        JLabel faceLabel = new JLabel("face:");
        face = new JComboBox(new String[] { "serif", "sansSerif", "Monospaced",
                "Dialog", "DialogInput", });
        face.addActionListener(listener);

        JLabel sizeLabel = new JLabel("Size:");
        size = new JComboBox(new String[] { "8", "10", "12", "15", "18", "24",
                "36", "48" });
        size.addActionListener(listener);

        bold = new JCheckBox("Bold");
        bold.addActionListener(listener);

        italic = new JCheckBox("Italic");
        italic.addActionListener(listener);

        sample = new JTextArea();
        sample.setText("The quick brown fox jump over the lazy dog.");
        sample.setEditable(false);
        sample.setLineWrap(true);
        sample.setBorder(BorderFactory.createEtchedBorder());
        
        add(faceLabel, new GBC(0, 0).setAnchor(GBC.EAST));
        add(face, new GBC(1, 0).setFill(GBC.HORIZONTAL).setWeight(100, 0)
                .setInsets(1));
        add(sizeLabel, new GBC(0, 1).setAnchor(GBC.EAST));
        add(size, new GBC(1, 1).setFill(GBC.HORIZONTAL).setWeight(100, 0)
                .setInsets(1));
        add(bold, new GBC(0, 2, 2, 1).setAnchor(GBC.CENTER).setWeight(100, 100));
        add(italic,
                new GBC(0, 3, 2, 1).setAnchor(GBC.CENTER).setWeight(100, 100));
        add(sample, new GBC(2, 0, 1, 4).setFill(GBC.BOTH).setWeight(100, 100));
    }

    private class FontAction implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            String fontFace = face.getSelectedItem().toString();
            int fontStyle = (bold.isSelected() ? Font.BOLD : 0)
                    + (italic.isSelected() ? Font.ITALIC : 0);
            int fontSize = Integer.parseInt(size.getSelectedItem().toString());
            Font font = new Font(fontFace, fontStyle, fontSize);
            sample.setFont(font);
            sample.repaint();
        }
    }
}