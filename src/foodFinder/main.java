package foodFinder;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.LinkedList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;

public class main implements ActionListener {

	/*
	 * implement initializing Frames and each frame's component at main class's constructor
	 * start() function initialize each button's ActionListener
	 */
	public main() {
		addInit();
		findInit();
		firstInit();
		recomInit();
		ansInit();
		rootFindInit();
		start();
	}

	/*
	 * declare Components which need to be used out side of each 'init' function
	 */
	private JFrame addFrame;
	private JTextField storeNameText;
	private JTextField FoodNameText;
	JButton addBtn = new JButton("\uCD94 \uAC00");
	JComboBox addFoodCombo = new JComboBox();
	JSpinner oilyAddSpin = new JSpinner();
	JSpinner chewyAddSpin = new JSpinner();
	JSpinner hotAddSpin = new JSpinner();
	JSpinner hardAddSpin = new JSpinner();
	JSpinner sourAddSpin = new JSpinner();
	JSpinner saltyAddSpin = new JSpinner();
	JSpinner bitterAddSpin = new JSpinner();
	JSpinner sweetAddSpin = new JSpinner();
	JSpinner spicyAddSpin = new JSpinner();

	private JFrame findFrame;
	JButton searchBtn = new JButton("\uCC3E \uAE30");
	JComboBox foodCombo = new JComboBox();
	JSpinner oilySpin = new JSpinner();
	JSpinner chewySpin = new JSpinner();
	JSpinner hotSpin = new JSpinner();
	JSpinner hardSpin = new JSpinner();
	JSpinner sourSpin = new JSpinner();
	JSpinner saltySpin = new JSpinner();
	JSpinner bitterSpin = new JSpinner();
	JSpinner sweetSpin = new JSpinner();
	JSpinner spicySpin = new JSpinner();

	private JFrame firstFrame;
	JButton startFoodBtn = new JButton("\uC74C\uC2DD \uCD94\uCC9C");
	JButton startRootBtn = new JButton("\uACBD\uB85C \uD0D0\uC0C9");
	JButton addFoodBtn = new JButton("\uC74C\uC2DD \uCD94\uAC00");

	private JFrame recomFrame;
	JButton foodReccom3 = new JButton("New button");
	JButton foodReccom2 = new JButton("New button");
	JButton foodReccom1 = new JButton("New button");

	private JFrame rootAnsFrame;
	private JTextField ansFoodNameText;
	JButton rootFindStartBtn = new JButton("\uACBD\uB85C\uD0D0\uC0C9\uC2DC\uC791");

	JComboBox locationCombo = new JComboBox();

	private JFrame rootFindFrame;
	JTextArea otherMenuText = new JTextArea();
	JTextArea rootText = new JTextArea();
	JTextArea storeNameText2 = new JTextArea();
	JScrollPane scrollPaneRoot;

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main window = new main();
					window.firstFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	/*
	 * declare Frame that is used to add new food
	 */
	private void addInit() {

		addFrame = new JFrame();
		addFrame.setResizable(false);
		addFrame.setTitle("\uC74C\uC2DD \uCD94\uAC00");
		addFrame.setBounds(100, 100, 785, 562);
		addFrame.getContentPane().setLayout(null);
		spicyAddSpin.setModel(new SpinnerNumberModel(3, 1, 5, 1));
		addFrame.setLocationRelativeTo(null);

		spicyAddSpin.setBounds(97, 179, 46, 22);
		addFrame.getContentPane().add(spicyAddSpin);

		JLabel lblNewLabel = new JLabel("\uB9E4\uC6B4\uB9DB");
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		lblNewLabel.setBounds(33, 179, 57, 22);
		addFrame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("\uB2E8 \uB9DB");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(160, 179, 57, 22);
		addFrame.getContentPane().add(lblNewLabel_1);
		sweetAddSpin.setModel(new SpinnerNumberModel(3, 1, 5, 1));

		sweetAddSpin.setBounds(215, 179, 46, 22);
		addFrame.getContentPane().add(sweetAddSpin);

		JLabel lblNewLabel_2 = new JLabel("\uC4F4 \uB9DB");
		lblNewLabel_2.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(285, 179, 57, 22);
		addFrame.getContentPane().add(lblNewLabel_2);
		bitterAddSpin.setModel(new SpinnerNumberModel(3, 1, 5, 1));

		bitterAddSpin.setBounds(340, 179, 46, 22);
		addFrame.getContentPane().add(bitterAddSpin);

		JLabel lblNewLabel_3 = new JLabel("\uC9E0 \uB9DB");
		lblNewLabel_3.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(412, 179, 57, 22);
		addFrame.getContentPane().add(lblNewLabel_3);
		saltyAddSpin.setModel(new SpinnerNumberModel(3, 1, 5, 1));

		saltyAddSpin.setBounds(467, 179, 46, 22);
		addFrame.getContentPane().add(saltyAddSpin);

		JLabel lblNewLabel_4 = new JLabel("\uC2E0 \uB9DB");
		lblNewLabel_4.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(545, 179, 57, 22);
		addFrame.getContentPane().add(lblNewLabel_4);
		sourAddSpin.setModel(new SpinnerNumberModel(3, 1, 5, 1));

		sourAddSpin.setBounds(600, 179, 46, 22);
		addFrame.getContentPane().add(sourAddSpin);

		JLabel lblNewLabel_5 = new JLabel("\uB9DB \uACE0\uB974\uAE30");
		lblNewLabel_5.setFont(new Font("±¼¸²", Font.BOLD, 25));
		lblNewLabel_5.setBounds(32, 124, 217, 41);
		addFrame.getContentPane().add(lblNewLabel_5);

		JLabel lblNewLabel_5_1 = new JLabel("\uC2DD\uAC10 \uACE0\uB974\uAE30");
		lblNewLabel_5_1.setFont(new Font("±¼¸²", Font.BOLD, 25));
		lblNewLabel_5_1.setBounds(33, 233, 217, 41);
		addFrame.getContentPane().add(lblNewLabel_5_1);

		JLabel lblNewLabel_6 = new JLabel("\uB531\uB531\uD568");
		lblNewLabel_6.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(34, 288, 57, 22);
		addFrame.getContentPane().add(lblNewLabel_6);
		hardAddSpin.setModel(new SpinnerNumberModel(3, 1, 5, 1));

		hardAddSpin.setBounds(97, 288, 46, 22);
		addFrame.getContentPane().add(hardAddSpin);

		JLabel lblNewLabel_1_1 = new JLabel("¶ß°Å¿ò");
		lblNewLabel_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(161, 288, 72, 22);
		addFrame.getContentPane().add(lblNewLabel_1_1);
		hotAddSpin.setModel(new SpinnerNumberModel(3, 1, 5, 1));

		hotAddSpin.setBounds(234, 288, 46, 22);
		addFrame.getContentPane().add(hotAddSpin);

		JLabel lblNewLabel_2_1 = new JLabel("\uCAC4\uAE43\uD568");
		lblNewLabel_2_1.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(300, 288, 57, 22);
		addFrame.getContentPane().add(lblNewLabel_2_1);
		chewyAddSpin.setModel(new SpinnerNumberModel(3, 1, 5, 1));

		chewyAddSpin.setBounds(363, 288, 46, 22);
		addFrame.getContentPane().add(chewyAddSpin);

		JLabel lblNewLabel_3_1 = new JLabel("±â¸§Áü");
		lblNewLabel_3_1.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		lblNewLabel_3_1.setBounds(427, 288, 57, 22);
		addFrame.getContentPane().add(lblNewLabel_3_1);
		oilyAddSpin.setModel(new SpinnerNumberModel(3, 1, 5, 1));

		oilyAddSpin.setBounds(490, 288, 46, 22);
		addFrame.getContentPane().add(oilyAddSpin);

		addFoodCombo.setBackground(Color.WHITE);
		addFoodCombo.setFont(new Font("±¼¸²", Font.BOLD, 18));
		addFoodCombo.setBounds(33, 390, 130, 32);
		addFrame.getContentPane().add(addFoodCombo);
		addFoodCombo.setModel(new DefaultComboBoxModel(new String[] { "Meal", "Dessert" }));

		JLabel lblNewLabel_5_1_1 = new JLabel("\uC2DD\uC0AC \uC885\uB958");
		lblNewLabel_5_1_1.setFont(new Font("±¼¸²", Font.BOLD, 25));
		lblNewLabel_5_1_1.setBounds(33, 333, 217, 41);
		addFrame.getContentPane().add(lblNewLabel_5_1_1);

		addBtn.setFont(new Font("±¼¸²", Font.BOLD, 18));
		addBtn.setBounds(550, 468, 166, 41);
		addFrame.getContentPane().add(addBtn);

		JLabel lblNewLabel_5_2 = new JLabel("\uC74C\uC2DD \uC774\uB984: ");
		lblNewLabel_5_2.setFont(new Font("±¼¸²", Font.BOLD, 25));
		lblNewLabel_5_2.setBounds(32, 56, 217, 41);
		addFrame.getContentPane().add(lblNewLabel_5_2);

		FoodNameText = new JTextField();
		FoodNameText.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		FoodNameText.setBounds(169, 58, 173, 41);
		addFrame.getContentPane().add(FoodNameText);
		FoodNameText.setColumns(10);

		JLabel lblNewLabel_5_2_1 = new JLabel("\uAC00\uAC8C \uC774\uB984: ");
		lblNewLabel_5_2_1.setFont(new Font("±¼¸²", Font.BOLD, 25));
		lblNewLabel_5_2_1.setBounds(375, 56, 217, 41);
		addFrame.getContentPane().add(lblNewLabel_5_2_1);

		storeNameText = new JTextField();
		storeNameText.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		storeNameText.setColumns(10);
		storeNameText.setBounds(518, 56, 173, 41);
		addFrame.getContentPane().add(storeNameText);
	}

	/*
	 * declare Frame that is used to find food what user wants with several values
	 */
	private void findInit() {
		findFrame = new JFrame();
		findFrame.setResizable(false);
		findFrame.setTitle("\uC74C\uC2DD\uACE0\uB974\uAE30");
		findFrame.setBounds(100, 100, 784, 439);
		findFrame.setLocationRelativeTo(null);
		findFrame.getContentPane().setLayout(null);
		spicySpin.setModel(new SpinnerNumberModel(1, 0, 5, 1));

		spicySpin.setBounds(97, 92, 46, 22);
		findFrame.getContentPane().add(spicySpin);

		JLabel lblNewLabel = new JLabel("\uB9E4\uC6B4\uB9DB");
		lblNewLabel.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		lblNewLabel.setBounds(34, 92, 57, 22);
		findFrame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("\uB2E8 \uB9DB");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(161, 92, 57, 22);
		findFrame.getContentPane().add(lblNewLabel_1);
		sweetSpin.setModel(new SpinnerNumberModel(1, 0, 5, 1));

		sweetSpin.setBounds(216, 92, 46, 22);
		findFrame.getContentPane().add(sweetSpin);

		JLabel lblNewLabel_2 = new JLabel("\uC4F4 \uB9DB");
		lblNewLabel_2.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(286, 92, 57, 22);
		findFrame.getContentPane().add(lblNewLabel_2);
		bitterSpin.setModel(new SpinnerNumberModel(1, 0, 5, 1));

		bitterSpin.setBounds(341, 92, 46, 22);
		findFrame.getContentPane().add(bitterSpin);

		JLabel lblNewLabel_3 = new JLabel("\uC9E0 \uB9DB");
		lblNewLabel_3.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(413, 92, 57, 22);
		findFrame.getContentPane().add(lblNewLabel_3);
		saltySpin.setModel(new SpinnerNumberModel(1, 0, 5, 1));

		saltySpin.setBounds(468, 92, 46, 22);
		findFrame.getContentPane().add(saltySpin);

		JLabel lblNewLabel_4 = new JLabel("\uC2E0 \uB9DB");
		lblNewLabel_4.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(546, 92, 57, 22);
		findFrame.getContentPane().add(lblNewLabel_4);
		sourSpin.setModel(new SpinnerNumberModel(1, 0, 5, 1));

		sourSpin.setBounds(601, 92, 46, 22);
		findFrame.getContentPane().add(sourSpin);

		JLabel lblNewLabel_5 = new JLabel("\uB9DB \uACE0\uB974\uAE30");
		lblNewLabel_5.setFont(new Font("±¼¸²", Font.BOLD, 25));
		lblNewLabel_5.setBounds(33, 37, 217, 41);
		findFrame.getContentPane().add(lblNewLabel_5);

		JLabel lblNewLabel_5_1 = new JLabel("\uC2DD\uAC10 \uACE0\uB974\uAE30");
		lblNewLabel_5_1.setFont(new Font("±¼¸²", Font.BOLD, 25));
		lblNewLabel_5_1.setBounds(34, 146, 217, 41);
		findFrame.getContentPane().add(lblNewLabel_5_1);

		JLabel lblNewLabel_6 = new JLabel("\uB531\uB531\uD568");
		lblNewLabel_6.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(35, 201, 57, 22);
		findFrame.getContentPane().add(lblNewLabel_6);
		hardSpin.setModel(new SpinnerNumberModel(1, 0, 5, 1));

		hardSpin.setBounds(98, 201, 46, 22);
		findFrame.getContentPane().add(hardSpin);

		JLabel lblNewLabel_1_1 = new JLabel("¶ß°Å¿ò");
		lblNewLabel_1_1.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(162, 201, 72, 22);
		findFrame.getContentPane().add(lblNewLabel_1_1);
		hotSpin.setModel(new SpinnerNumberModel(1, 0, 5, 1));

		hotSpin.setBounds(235, 201, 46, 22);
		findFrame.getContentPane().add(hotSpin);

		JLabel lblNewLabel_2_1 = new JLabel("\uCAC4\uAE43\uD568");
		lblNewLabel_2_1.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(301, 201, 57, 22);
		findFrame.getContentPane().add(lblNewLabel_2_1);
		chewySpin.setModel(new SpinnerNumberModel(1, 0, 5, 1));

		chewySpin.setBounds(364, 201, 46, 22);
		findFrame.getContentPane().add(chewySpin);

		JLabel lblNewLabel_3_1 = new JLabel("±â¸§Áü");
		lblNewLabel_3_1.setFont(new Font("±¼¸²", Font.PLAIN, 16));
		lblNewLabel_3_1.setBounds(428, 201, 57, 22);
		findFrame.getContentPane().add(lblNewLabel_3_1);
		oilySpin.setModel(new SpinnerNumberModel(1, 0, 5, 1));

		oilySpin.setBounds(491, 201, 46, 22);
		findFrame.getContentPane().add(oilySpin);

		foodCombo.setBackground(Color.WHITE);
		foodCombo.setFont(new Font("±¼¸²", Font.BOLD, 18));
		foodCombo.setBounds(34, 303, 130, 32);
		findFrame.getContentPane().add(foodCombo);
		foodCombo.setModel(new DefaultComboBoxModel(new String[] { "Meal", "dessert" }));

		JLabel lblNewLabel_5_1_1 = new JLabel("\uC2DD\uC0AC \uC885\uB958");
		lblNewLabel_5_1_1.setFont(new Font("±¼¸²", Font.BOLD, 25));
		lblNewLabel_5_1_1.setBounds(34, 246, 217, 41);
		findFrame.getContentPane().add(lblNewLabel_5_1_1);

		searchBtn.setFont(new Font("±¼¸²", Font.BOLD, 18));
		searchBtn.setBounds(546, 337, 166, 41);
		findFrame.getContentPane().add(searchBtn);

		JLabel lblNewLabel_7 = new JLabel("\uB9DB\uC758 \uB2E8\uACC4: 1~5, »ó°ü¾øÀ½: 0");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(491, 37, 246, 48);
		findFrame.getContentPane().add(lblNewLabel_7);
	}

	/*
	 * declare the first Frame, if this frame is closed, program stops 
	 */
	private void firstInit() {
		firstFrame = new JFrame();
		firstFrame.setTitle("\uC2DC\uC791\uD654\uBA74");
		firstFrame.setResizable(false);
		firstFrame.setBounds(100, 100, 702, 355);
		firstFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		firstFrame.getContentPane().setLayout(null);
		firstFrame.setLocationRelativeTo(null);

		startFoodBtn.setFont(new Font("±¼¸²", Font.BOLD, 30));
		startFoodBtn.setBounds(185, 127, 304, 68);
		firstFrame.getContentPane().add(startFoodBtn);

		startRootBtn.setFont(new Font("±¼¸²", Font.BOLD, 30));
		startRootBtn.setBounds(185, 205, 304, 68);
		firstFrame.getContentPane().add(startRootBtn);

		addFoodBtn.setFont(new Font("±¼¸²", Font.BOLD, 12));
		addFoodBtn.setBounds(462, 283, 184, 23);
		firstFrame.getContentPane().add(addFoodBtn);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(29, 27, 622, 83);
		firstFrame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel(
				"\uC74C\uC2DD \uCD94\uCC9C \uBC0F \uACBD\uB85C \uD0D0\uC0C9 \uD504\uB85C\uADF8\uB7A8");
		lblNewLabel.setFont(new Font("±¼¸²", Font.ITALIC, 34));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(12, 10, 598, 68);
		panel.add(lblNewLabel);
	}

	/*
	 * declare Frame that shows highest scored 3 foods 
	 */
	private void recomInit() {
		recomFrame = new JFrame();
		recomFrame.setResizable(false);
		recomFrame.setTitle("\uC74C\uC2DD\uCD94\uCC9C\uACB0\uACFC");
		recomFrame.setBounds(100, 100, 782, 370);
		recomFrame.getContentPane().setLayout(null);
		recomFrame.setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 177, 766, 97);
		recomFrame.getContentPane().add(panel);
		panel.setLayout(null);

		foodReccom1.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		foodReccom1.setBounds(12, 28, 219, 59);
		panel.add(foodReccom1);

		foodReccom2.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		foodReccom2.setBounds(273, 28, 219, 59);
		panel.add(foodReccom2);

		foodReccom3.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		foodReccom3.setBounds(535, 28, 219, 59);
		panel.add(foodReccom3);

		JLabel lblNewLabel = new JLabel("\uC74C\uC2DD \uCD94\uCC9C \uACB0\uACFC");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 38));
		lblNewLabel.setBounds(0, 80, 766, 73);
		recomFrame.getContentPane().add(lblNewLabel);
	}

	/*
	 * declare Frame that is used to input informations to find shortest route
	 */
	private void ansInit() {
		rootAnsFrame = new JFrame();
		rootAnsFrame.setResizable(false);
		rootAnsFrame.setTitle("\uACBD\uB85C\uD0D0\uC0C9");
		rootAnsFrame.setBounds(100, 100, 651, 373);
		rootAnsFrame.getContentPane().setLayout(null);
		rootAnsFrame.setLocationRelativeTo(null);

		JLabel lblNewLabel = new JLabel("\uC74C\uC2DD \uC774\uB984: ");
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 23));
		lblNewLabel.setBounds(48, 68, 121, 54);
		rootAnsFrame.getContentPane().add(lblNewLabel);

		ansFoodNameText = new JTextField();
		ansFoodNameText.setFont(new Font("±¼¸²", Font.BOLD, 23));
		ansFoodNameText.setBounds(181, 68, 342, 54);
		rootAnsFrame.getContentPane().add(ansFoodNameText);
		ansFoodNameText.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("\uD604\uC7AC \uC704\uCE58: ");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.BOLD, 23));
		lblNewLabel_1.setBounds(48, 159, 121, 54);
		rootAnsFrame.getContentPane().add(lblNewLabel_1);
		locationCombo.setBackground(Color.WHITE);
		locationCombo.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		locationCombo.setBounds(181, 171, 342, 36);
		startPositionCombo();
		rootAnsFrame.getContentPane().add(locationCombo);

		rootFindStartBtn.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		rootFindStartBtn.setBounds(197, 258, 227, 47);
		rootAnsFrame.getContentPane().add(rootFindStartBtn);
	}

	/*
	 * declare Frame that shows information of store that has shortest distance with starting point
	 */
	private void rootFindInit() {
		rootFindFrame = new JFrame();
		rootFindFrame.setResizable(false);
		rootFindFrame.setBounds(100, 100, 748, 395);
		rootFindFrame.getContentPane().setLayout(null);
		rootFindFrame.setLocationRelativeTo(null);

		JLabel lblNewLabel = new JLabel("\uC74C\uC2DD\uC810 \uC774\uB984: ");
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 18));
		lblNewLabel.setBounds(37, 68, 133, 32);
		rootFindFrame.getContentPane().add(lblNewLabel);

		storeNameText2.setEditable(false);
		storeNameText2.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		storeNameText2.setBounds(162, 68, 306, 32);
		rootFindFrame.getContentPane().add(storeNameText2);

		JLabel lblNewLabel_1 = new JLabel("\uAC00\uB294 \uAE38: ");
		lblNewLabel_1.setFont(new Font("±¼¸²", Font.BOLD, 18));
		lblNewLabel_1.setBounds(37, 130, 133, 32);
		rootFindFrame.getContentPane().add(lblNewLabel_1);

		scrollPaneRoot = new JScrollPane();
		scrollPaneRoot.setBounds(162, 130, 534, 92);
		rootFindFrame.getContentPane().add(scrollPaneRoot);

		rootText.setEditable(false);
		rootText.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		rootText.setLineWrap(true);
		scrollPaneRoot.setViewportView(rootText);

		JLabel otherMenu = new JLabel("¸Þ´º: ");
		otherMenu.setFont(new Font("±¼¸²", Font.BOLD, 18));
		otherMenu.setBounds(37, 246, 133, 32);
		rootFindFrame.getContentPane().add(otherMenu);

		otherMenuText.setEditable(false);
		otherMenuText.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		otherMenuText.setBounds(162, 246, 534, 83);
		rootFindFrame.getContentPane().add(otherMenuText);
	}

	/*
	 * function that declares each button's actionlistener
	 */
	private void start() {
		addBtn.addActionListener(this);
		searchBtn.addActionListener(this);
		startFoodBtn.addActionListener(this);
		startRootBtn.addActionListener(this);
		addFoodBtn.addActionListener(this);
		foodReccom3.addActionListener(this);
		foodReccom2.addActionListener(this);
		foodReccom1.addActionListener(this);
		rootFindStartBtn.addActionListener(this);
	}

	/*
	 * function that take a action when each buttons are clicked
	 */
	public void actionPerformed(ActionEvent e) {
		try {
			/*
			 * when 'add new food' button is clicked
			 */
			if (e.getSource() == addBtn) {
				actionAdd();
				addFrame.setVisible(false);
			}
			/* 
			 * when 'search food' button is clicked,
			 * with each 'Taste' (value's name, value's level) are added in an array if the level is not 0
			 * load each food's information with 'sql' class and calculate the score with 'distanceAlgo' class(edited minimum edit algorithm)
			 * recommends foods which have 3 highest score
			 */
			else if (e.getSource() == searchBtn) {

				ArrayList<food> menu = new ArrayList<food>();
				sql mySql = new sql();
				menu = mySql.getFood((String) foodCombo.getModel().getSelectedItem());
				String[] name = new String[3];
				int[] point = new int[3];
				int result;
				int numOfArr = 0;
				point[0] = -100;
				point[1] = -100;
				point[2] = -100;

				Taste[] selected = new Taste[10];
				selected[0] = new Taste("EMPTY", 0);
				if ((int) spicySpin.getModel().getValue() != 0) {
					selected[++numOfArr] = new Taste("spicy", (int) spicySpin.getModel().getValue());
				}
				if ((int) sweetSpin.getModel().getValue() != 0) {
					selected[++numOfArr] = new Taste("sweet", (int) sweetSpin.getModel().getValue());
				}
				if ((int) bitterSpin.getModel().getValue() != 0) {
					selected[++numOfArr] = new Taste("bitter", (int) bitterSpin.getModel().getValue());
				}
				if ((int) saltySpin.getModel().getValue() != 0) {
					selected[++numOfArr] = new Taste("salty", (int) saltySpin.getModel().getValue());
				}
				if ((int) sourSpin.getModel().getValue() != 0) {
					selected[++numOfArr] = new Taste("sour", (int) sourSpin.getModel().getValue());
				}
				if ((int) hardSpin.getModel().getValue() != 0) {
					selected[++numOfArr] = new Taste("hard", (int) hardSpin.getModel().getValue());
				}
				if ((int) hotSpin.getModel().getValue() != 0) {
					selected[++numOfArr] = new Taste("hot", (int) hotSpin.getModel().getValue());
				}
				if ((int) chewySpin.getModel().getValue() != 0) {
					selected[++numOfArr] = new Taste("chewy", (int) chewySpin.getModel().getValue());
				}
				if ((int) oilySpin.getModel().getValue() != 0) {
					selected[++numOfArr] = new Taste("oily", (int) oilySpin.getModel().getValue());
				}

				for (food a : menu) {
					result = getDistance(a, selected, numOfArr);
					System.out.println(a.name + " " + result);
					if (result > point[0]) {
						point[2] = point[1];
						point[1] = point[0];
						point[0] = result;
						name[2] = name[1];
						name[1] = name[0];
						name[0] = a.name;
					} else if (result > point[1]) {
						point[2] = point[1];
						point[1] = result;
						name[2] = name[1];
						name[1] = a.name;
					} else if (result > point[2]) {
						point[2] = result;
						name[2] = a.name;
					}
				}
				foodReccom1.setText(name[0]);
				foodReccom2.setText(name[1]);
				foodReccom3.setText(name[2]);
				findFrame.setVisible(false);
				recomFrame.setVisible(true);
			}
			// open 'find food' frame
			else if (e.getSource() == startFoodBtn) {
				findInit();
				findFrame.setVisible(true);
			}
			// open 'search distance' frame
			else if (e.getSource() == startRootBtn) {
				ansInit();
				rootAnsFrame.setVisible(true);
			}
			// open 'add new food' frame
			else if (e.getSource() == addFoodBtn) {
				addInit();
				addFrame.setVisible(true);
			}
			// when the third highest score food's button is clicked, set 'search distance' frame's name of food text that food's name and open that frame
			else if (e.getSource() == foodReccom3) {
				selectRecomFood(foodReccom3.getText());
			}
			// when the second highest score food's button is clicked, set 'search distance' frame's name of food text that food's name and open that frame
			else if (e.getSource() == foodReccom2) {
				selectRecomFood(foodReccom2.getText());
			}
			// when the highest score food's button is clicked, set 'search distance' frame's name of food text that food's name and open that frame
			else if (e.getSource() == foodReccom1) {
				selectRecomFood(foodReccom1.getText());

			}
			/* 
			 * a button that starts searching route, find the store that has shortest distance with starting point with 'getRoute' function
			 * print that store's information to result frame, and close current frame
			 */
			else if (e.getSource() == rootFindStartBtn) {
				getRoute();
				rootAnsFrame.setVisible(false);
				rootFindFrame.setVisible(true);

			}
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

	/* 
	 * a function that adds new food, read each flavor's level and save at DB.
	 * at this moment, if checkStore function(check if the store's name exists)is true, save to DB or alert
	 */
	public void actionAdd() {
		sql userSql = new sql();
		int[] taste = new int[9];
		String foodName = FoodNameText.getText();
		String storeName = storeNameText.getText();
		taste[0] = (int) spicyAddSpin.getModel().getValue();
		taste[1] = (int) sweetAddSpin.getModel().getValue();
		taste[2] = (int) bitterAddSpin.getModel().getValue();
		taste[3] = (int) saltyAddSpin.getModel().getValue();
		taste[4] = (int) sourAddSpin.getModel().getValue();
		taste[5] = (int) hardAddSpin.getModel().getValue();
		taste[6] = (int) hotAddSpin.getModel().getValue();
		taste[7] = (int) chewyAddSpin.getModel().getValue();
		taste[8] = (int) oilyAddSpin.getModel().getValue();
		String value = (String) foodCombo.getModel().getSelectedItem();
		if (userSql.checkStore(storeName)) {
			try {
				userSql.insertFood(foodName, value, taste[0], taste[1], taste[2], taste[3], taste[4], taste[5],
						taste[6], taste[7], taste[8]);
				userSql.insertMenu(storeName, foodName);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}else {
			JOptionPane.showMessageDialog(null, "¾ø´Â °¡°ÔÀÌ¸§ÀÔ´Ï´Ù.", "¾Ë¸²", JOptionPane.ERROR_MESSAGE);
		}
		FoodNameText.setText("");
		storeNameText.setText("");

	}

	/*
	 * if one of recommended food's button is clicked, set recomName to that button's name
	 * set 'searching route' frame's food's name to  recomName
	 */
	public void selectRecomFood(String recomName) {
		ansInit();
		ansFoodNameText.setText(recomName);
		rootAnsFrame.setVisible(true);
		recomFrame.setVisible(false);
	}

	/*
	 * set 'searching route' frame's starting point(combobox) to points that read from DB
	 * sql.getPoints1 is function that output points that are in school area
	 */
	public void startPositionCombo() {

		sql userSQL = new sql();
		locationCombo.removeAllItems();
		ArrayList<String> positions = new ArrayList<String>();
		positions = userSQL.getPoints1();
		for (String position : positions) {
			locationCombo.addItem(position);
		}
	}

	/*
	 * function that get scores with 'editted minimum edit distance'
	 * food a is one of DB's food's information and selected is what user wants
	 */
	public int getDistance(food a, Taste[] selected, int numOfArr) {

		Taste[] menuTaste = new Taste[10];

		menuTaste[0] = new Taste("Empty", 0);
		menuTaste[1] = new Taste("spicy", a.taste[0]);
		menuTaste[2] = new Taste("sweet", a.taste[1]);
		menuTaste[3] = new Taste("bitter", a.taste[2]);
		menuTaste[4] = new Taste("salty", a.taste[3]);
		menuTaste[5] = new Taste("sour", a.taste[4]);
		menuTaste[6] = new Taste("hard", a.taste[5]);
		menuTaste[7] = new Taste("hot", a.taste[6]);
		menuTaste[8] = new Taste("chewy", a.taste[7]);
		menuTaste[9] = new Taste("oily", a.taste[8]);

		distanceAlgo dis = new distanceAlgo();
		return dis.findTasteResult(selected, menuTaste, numOfArr);

	}


	int[] result;
	String[] name;
	/*
	 * save every store which has selected menu to variable 'store'
	 * loop each stores and if the store is in school area, execute (searching route, Dijkstra) from the starting point to store
	 * if the store is in taepyeong-dong, execute from starting point to 'vision tower main door' and from 'Go to Taepyeong' to the store
	 * if the store is in bokjeong-dong, execute from starting point to 'side door' and from 'Go to Bokjeong' to the store	 * 
	 */
	public void getRoute() {

		sql mySql = new sql();
		ArrayList<String> stores = new ArrayList<String>();
		stores = mySql.getStores(ansFoodNameText.getText());

		int num = stores.size();
		result = new int[num]; 
		name = new String[num];
		String[] endPoint = new String[num];

		int index = 0;

		for (String store : stores) {
			result[index] = 0;
			name[index] = "";
			String startPoint = (String) locationCombo.getModel().getSelectedItem();
			if (mySql.getPlace(store) == 1) {
				getRoute2(store, startPoint, 1, index);
			} else if (mySql.getPlace(store) == 2) {
				getRoute2("SideDoor", startPoint, 1, index);
				getRoute2(store, "GoToBokJeong", 2, index);
			} else if (mySql.getPlace(store) == 3) {
				getRoute2("VisionTowerMainDoor", startPoint, 1, index);
				getRoute2(store, "GoToTaePyeong", 3, index);
			}
			endPoint[index] = store;
			index++;
		}
		index = 0;

		for (int i = 0; i < num; i++) {
			if (result[i] < result[index]) {
				index = i;
			}
		}
		String routes = name[index].substring(0, name[index].length() - 3);

		rootText.setText(routes);
		storeNameText2.setText(endPoint[index]);
		ArrayList<String> menus = new ArrayList<String>();
		menus = mySql.getMenu(endPoint[index]);
		String addText = "";
		for (String menu : menus) {
			addText += (menu + "\n");
		}
		if (addText != "") {
			otherMenuText.setText(addText);
		} else {
			otherMenuText.setText("´Ù¸¥ ¸Þ´º ¾øÀ½.\nÃß°¡¿ä¸Á");
		}
	}

	/*
	 * In practice, this is the function which calculate distance between two points
	 * if the variable 'val' is 1, it means school area, 2 means bokjeong, 3 means teapyeong
	 * with two loops, input every point's distance if the distance is in DB
	 * and input to Dijkstra class
	 */
	public void getRoute2(String store, String startPoint, int val, int index) {
		sql mySql = new sql();
		int numOfDots; 
		String[] dots;
		int dist; 
		ArrayList<String> points1 = new ArrayList<String>();
		ArrayList<String> points2 = new ArrayList<String>();
		int start = 0;
		int end = 0;
		int i = 1, j = 1;
		if (val == 1) {
			numOfDots = mySql.getPlaceNum(1);
			points1 = mySql.getPoints1();
			points2 = mySql.getPoints1();
		} else if (val == 2) {
			numOfDots = mySql.getPlaceNum(2);
			points1 = mySql.getPoints2();
			points2 = mySql.getPoints2();
		} else {
			numOfDots = mySql.getPlaceNum(3);
			points1 = mySql.getPoints3();
			points2 = mySql.getPoints3();
		}
		dots = new String[numOfDots + 1];
		Dijkstra g = new Dijkstra(numOfDots);

		for (String point1 : points1) {
			dots[i] = point1;
			if (store.equals(point1)) {
				end = i;
			} else if (startPoint.equals(point1)) {
				start = i;
			}
			j = 1;
			for (String point2 : points2) {
				if (!point1.equals(point2)) {
					if (val == 1) {
						dist = mySql.getDistance1(point1, point2);
					} else if (val == 2) {
						dist = mySql.getDistance2(point1, point2);
					} else {
						dist = mySql.getDistance3(point1, point2);
					}
					if (dist != -1) {
						g.input(i, j, dist);
					}
				}
				j++;
			}
			i++;
		}

		g.createGraph(start);
		LinkedList<Integer> l;
		l = g.getPath(start, end);
		if (start <= end) {
			for (int k = 0; k < l.size(); k++) {
				name[index] += (dots[l.get(k)] + "-> ");
			}
		} else {
			for (int k = l.size() - 2; k >= 0; k--) {
				name[index] += (dots[l.get(k)] + "-> ");
			}
		}

		result[index] += g.getDistance(end);
	}

}
