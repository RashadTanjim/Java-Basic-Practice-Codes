/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public final class GUI extends JFrame implements ActionListener, MouseListener, MouseMotionListener, KeyListener {

    static final long serialVersionUID = 0;
    JMenuBar menubar;
    JMenu menu, menu2, submenu;
    JMenuItem mitem, mitem2, mitem3, smitem;
    JPanel basepanel, calcInputPane, calcFuncPane;
    JLabel lblTxt1, lblTxt2, lblResult;
    JTextField txt1, txt2;
    JButton btnAdd, btnSub, btnMul, btnDiv;

    //For Mouse Listener
    private JTextField tfMouseX;
    private JTextField tfMouseY;

    private JTextField tfMousePositionX;
    private JTextField tfMousePositionY;
    JPanel mPanel;

    // For Key Listener
    private JTextField tfInput;
    private JTextArea taDisplay;
    JPanel keyPanel;

    public GUI() {
        this.setup();

    }

    public void setup() {
        this.setJMenuBar(setMenu());
        this.setSize(500, 500);
        basepanel = new JPanel(new BorderLayout());
        basepanel.setVisible(true);
        basepanel.setBackground(Color.CYAN);
        add(basepanel);
        addCalc();

        keyPanel = new JPanel(new FlowLayout());
        keyPanel.setBackground(Color.orange);
        keyPanel.setPreferredSize(new Dimension(500, 200));
        keyPanel.add(new Label("Enter Text: "));
        tfInput = new JTextField(30);
        keyPanel.add(tfInput, JTextField.TOP);
        taDisplay = new JTextArea(5, 40); // 5 rows, 40 columns
        keyPanel.add(taDisplay);

        tfInput.addKeyListener(this);

        calcFuncPane.add(keyPanel, BorderLayout.SOUTH);
        mouseEventDemo();

    }

    @Override
    public void keyTyped(KeyEvent e) {
        taDisplay.append("You have typed " + e.getKeyChar() + "\n");

    }

    public void mouseEventDemo() {
        mPanel = new JPanel();
        mPanel.setLayout(new FlowLayout());
        mPanel.setBackground(Color.yellow);
        mPanel.setPreferredSize(new Dimension(100, 100));

        mPanel.add(new Label("X Click: "));
        tfMouseX = new JTextField(10); // 10 columns
        tfMouseX.setEditable(false);  // read-only
        mPanel.add(tfMouseX);

        mPanel.add(new Label("Y Click: "));
        tfMouseY = new JTextField(10);
        tfMouseY.setEditable(false);  // read-only
        mPanel.add(tfMouseY);

        mPanel.addMouseListener(this);

        mPanel.add(new Label("X-Position: "));
        tfMousePositionX = new JTextField(10);
        tfMousePositionX.setEditable(false);
        mPanel.add(tfMousePositionX);
        mPanel.add(new Label("Y-Position: "));
        tfMousePositionY = new JTextField(10);
        tfMousePositionY.setEditable(false);
        mPanel.add(tfMousePositionY);
        mPanel.addMouseMotionListener(this);

        basepanel.add(mPanel, BorderLayout.SOUTH);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        tfMousePositionX.setText(e.getX() + "");
        tfMousePositionY.setText(e.getY() + "");

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        tfMouseX.setText(e.getX() + "");
        tfMouseY.setText(e.getY() + "");
    }

    public void addCalc() {
        calcInputPane = new JPanel(new FlowLayout());
        calcInputPane.setBackground(Color.green);
        lblTxt1 = new JLabel();
        lblTxt1.setText("Input # 1:");
        calcInputPane.add(lblTxt1);

        txt1 = new JTextField();
        txt1.setPreferredSize(new Dimension(90, 20));
        calcInputPane.add(txt1);

        lblTxt2 = new JLabel();
        lblTxt2.setText("Input # 2:");

        calcInputPane.add(lblTxt2);

        txt2 = new JTextField();
        txt2.setPreferredSize(new Dimension(90, 20));
        calcInputPane.add(txt2);

        lblResult = new JLabel("Result = 0", JLabel.CENTER);
        lblResult.setOpaque(true);
        lblResult.setForeground(Color.WHITE);
        lblResult.setBackground(Color.RED);
        lblResult.setPreferredSize(new Dimension(120, 20));

        calcInputPane.add(lblResult);
        calcInputPane.setVisible(true);
        basepanel.add(calcInputPane, BorderLayout.NORTH);

        calcFuncPane = new JPanel(new FlowLayout());
        calcFuncPane.setBackground(Color.blue);

        btnAdd = new JButton("Add");
        btnAdd.setBackground(Color.magenta);
        btnAdd.setMnemonic(KeyEvent.VK_A);
        btnAdd.setPreferredSize(new Dimension(90, 30));
        btnAdd.addActionListener(this);
        calcFuncPane.add(btnAdd);

        btnSub = new JButton("Subtract");
        btnSub.setPreferredSize(new Dimension(90, 30));

        btnSub.addActionListener(this);
        btnSub.setEnabled(false);
        calcFuncPane.add(btnSub);

        basepanel.add(calcFuncPane, BorderLayout.CENTER);
    }

    public JMenuBar setMenu() {
        menubar = new JMenuBar();
        menu = new JMenu("Menu 1");
        menu.setMnemonic(KeyEvent.VK_M);

        mitem = new JMenuItem("item 1", KeyEvent.VK_T);
        mitem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.CTRL_MASK));
        mitem.addActionListener(this);
        menu.add(mitem);

        mitem2 = new JMenuItem("item 2", new ImageIcon("images/mitemicon.png"));
        menu.add(mitem2);
        menubar.add(menu);

        menu2 = new JMenu("Menu 2");
        menu2.setMnemonic(KeyEvent.VK_2);
        mitem3 = new JMenuItem("item 3");
        menu2.add(mitem3);
        submenu = new JMenu("SubMenu");
        smitem = new JMenuItem("sub menu item");
        submenu.add(smitem);
        menu2.add(submenu);
        menubar.add(menu2);

        return menubar;
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == mitem) {
            JOptionPane.showMessageDialog(null, "I am Item 1 from Menu 1");
        }

        if (event.getSource() == btnAdd) {
            String str1 = txt1.getText();
            String str2 = txt2.getText();
            int result = Integer.parseInt(str1) + Integer.parseInt(str2);
            lblResult.setText(result + "");
        }
    }

    public static void main(String[] args) {

        GUI frame = new GUI();
        frame.setTitle("Lets experiment");

        //frame.setSize(200, 200);
        //frame.setIconImage();
        //frame.setMenuBar(.menubar);
        frame.setVisible(true);

    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseExited(MouseEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mousePressed(MouseEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void mouseDragged(MouseEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyPressed(KeyEvent arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void keyReleased(KeyEvent arg0) {
        // TODO Auto-generated method stub

    }

}
