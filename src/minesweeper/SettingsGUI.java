package minesweeper;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SettingsGUI extends JPanel implements ActionListener{

	static JFrame frame = new JFrame("Board Settings");
	JPanel panel = new JPanel(new GridLayout(0, 1));
	ButtonGroup bg;
	JRadioButton easy = new JRadioButton("Easy (9x9, 10 mines)");
	JRadioButton meh = new JRadioButton("Easy Large (25x25, 85 mines)");
	JRadioButton medium = new JRadioButton("Medium (16x16, 40 mines)");
	JRadioButton hard = new JRadioButton("Hard (16x32, 99 mines)");
	JRadioButton custom = new JRadioButton("Custom. Enter the height, length, and number of mines below:");
	JButton confirm = new JButton("Start");
	JTextField height = new JTextField(10);
	JTextField length = new JTextField(10);
	JTextField bombs = new JTextField(10);
	
	SettingsGUI() {
		bg = new ButtonGroup();
		bg.add(easy);
		bg.add(meh);
		bg.add(medium);
		bg.add(hard);
		bg.add(custom);
		panel.add(easy);
		panel.add(meh);
		panel.add(medium);
		panel.add(hard);
		panel.add(custom);
		add(panel);
		add(height);
		add(length);
		add(bombs);
		add(confirm);
		confirm.addActionListener(this);
	}
	
	public static void main(String[] args) {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		SettingsGUI window = new SettingsGUI();
		frame.add(window);
		frame.setVisible(true);
		frame.setResizable(false);
	}

	@SuppressWarnings("static-access")
	@Override
	public void actionPerformed(ActionEvent arg0) {
		frame.dispose();
		if(easy.isSelected()) {
			MinesweeperGUI.X = 9;
			MinesweeperGUI.Y = 9;
			MinesweeperGUI.numOfMines = 10;
			MinesweeperGUI.minesArray = new int[MinesweeperGUI.X*MinesweeperGUI.Y];
			MinesweeperGUI.flagArray = new int[MinesweeperGUI.X*MinesweeperGUI.Y];
			MinesweeperGUI.pickedArray = new int[MinesweeperGUI.X*MinesweeperGUI.Y];
			MinesweeperGUI.board = new JButton[MinesweeperGUI.X*MinesweeperGUI.Y];
			new MinesweeperGUI().main(null);
		} else if(meh.isSelected()) {
			MinesweeperGUI.X = 25;
			MinesweeperGUI.Y = 25;
			MinesweeperGUI.numOfMines = 85;
			MinesweeperGUI.minesArray = new int[MinesweeperGUI.X*MinesweeperGUI.Y];
			MinesweeperGUI.flagArray = new int[MinesweeperGUI.X*MinesweeperGUI.Y];
			MinesweeperGUI.pickedArray = new int[MinesweeperGUI.X*MinesweeperGUI.Y];
			MinesweeperGUI.board = new JButton[MinesweeperGUI.X*MinesweeperGUI.Y];
			new MinesweeperGUI().main(null);
		} else if(medium.isSelected()) {
			MinesweeperGUI.X = 16;
			MinesweeperGUI.Y = 16;
			MinesweeperGUI.numOfMines = 40;
			MinesweeperGUI.minesArray = new int[MinesweeperGUI.X*MinesweeperGUI.Y];
			MinesweeperGUI.flagArray = new int[MinesweeperGUI.X*MinesweeperGUI.Y];
			MinesweeperGUI.pickedArray = new int[MinesweeperGUI.X*MinesweeperGUI.Y];
			MinesweeperGUI.board = new JButton[MinesweeperGUI.X*MinesweeperGUI.Y];
			new MinesweeperGUI().main(null);
		} else if(hard.isSelected()) {
			MinesweeperGUI.X = 16;
			MinesweeperGUI.Y = 32;
			MinesweeperGUI.numOfMines = 99;
			MinesweeperGUI.minesArray = new int[MinesweeperGUI.X*MinesweeperGUI.Y];
			MinesweeperGUI.flagArray = new int[MinesweeperGUI.X*MinesweeperGUI.Y];
			MinesweeperGUI.pickedArray = new int[MinesweeperGUI.X*MinesweeperGUI.Y];
			MinesweeperGUI.board = new JButton[MinesweeperGUI.X*MinesweeperGUI.Y];
			new MinesweeperGUI().main(null);
		} else if(custom.isSelected()){
			MinesweeperGUI.X = Integer.parseInt(height.getText());
			MinesweeperGUI.Y = Integer.parseInt(length.getText());
			MinesweeperGUI.numOfMines = Integer.parseInt(bombs.getText());
			MinesweeperGUI.minesArray = new int[MinesweeperGUI.X*MinesweeperGUI.Y];
			MinesweeperGUI.flagArray = new int[MinesweeperGUI.X*MinesweeperGUI.Y];
			MinesweeperGUI.pickedArray = new int[MinesweeperGUI.X*MinesweeperGUI.Y];
			MinesweeperGUI.board = new JButton[MinesweeperGUI.X*MinesweeperGUI.Y];
			new MinesweeperGUI().main(null);
		}
	}
}