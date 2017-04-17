package main;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Calculator extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	String firstnumber, secondnumber;
	int num1, num2, check;
	int index;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 380, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btnOne = new JButton("1");
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText().toString();
				textField.setText(text + "1");
			}
		});
		btnOne.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnOne.setBounds(71, 268, 53, 23);
		contentPane.add(btnOne);

		JButton btnTwo = new JButton("2");
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText().toString();
				textField.setText(text + "2");
			}
		});
		btnTwo.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnTwo.setBounds(134, 268, 53, 23);
		contentPane.add(btnTwo);

		JButton btnThree = new JButton("3");
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText().toString();
				textField.setText(text + "3");
			}
		});
		btnThree.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnThree.setBounds(197, 268, 53, 23);
		contentPane.add(btnThree);

		JButton btnFour = new JButton("4");
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText().toString();
				textField.setText(text + "4");
			}
		});
		btnFour.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnFour.setBounds(71, 223, 53, 23);
		contentPane.add(btnFour);

		JButton btnFive = new JButton("5");
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText().toString();
				textField.setText(text + "5");
			}
		});
		btnFive.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnFive.setBounds(134, 223, 53, 23);
		contentPane.add(btnFive);

		JButton btnSix = new JButton("6");
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText().toString();
				textField.setText(text + "6");
			}
		});
		btnSix.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnSix.setBounds(197, 223, 53, 23);
		contentPane.add(btnSix);

		JButton btnSeven = new JButton("7");
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText().toString();
				textField.setText(text + "7");
			}
		});
		btnSeven.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnSeven.setBounds(71, 176, 53, 23);
		contentPane.add(btnSeven);

		JButton btnEight = new JButton("8");
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText().toString();
				textField.setText(text + "8");
			}
		});
		btnEight.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnEight.setBounds(134, 176, 53, 23);
		contentPane.add(btnEight);

		JButton btnNine = new JButton("9");
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText().toString();
				textField.setText(text + "9");
			}
		});
		btnNine.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNine.setBounds(197, 176, 53, 23);
		contentPane.add(btnNine);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(71, 72, 249, 36);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnMulti = new JButton("*");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check = 3;
				String text = textField.getText().toString();
				
				if (textField.getText().toString().contains("*")) {

				} else {
					textField.setText(text + "*");
				}
				index = textField.getText().toString().indexOf("*");
				firstnumber = text.toString().substring(0, index);
			}
		});
		btnMulti.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnMulti.setBounds(263, 223, 53, 23);
		contentPane.add(btnMulti);

		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check = 4;
				String text = textField.getText().toString();
				
				if (textField.getText().toString().contains("/")) {

				} else {
					textField.setText(text + "/");
				}
				index = textField.getText().toString().indexOf("/");
				firstnumber = text.toString().substring(0, index);
			}
		});
		btnDivide.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnDivide.setBounds(263, 176, 53, 23);
		contentPane.add(btnDivide);

		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				check = 2;
				String text = textField.getText().toString();
				
				if (textField.getText().toString().contains("-")) {

				} else {
					textField.setText(text + "-");
				}
				index = textField.getText().toString().indexOf("-");
				firstnumber = text.toString().substring(0, index);
			}
		});
		btnMinus.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnMinus.setBounds(263, 268, 53, 23);
		contentPane.add(btnMinus);

		JButton btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText().toString();
				if (text.length() == 0) {

				} else {
					textField.setText(text + "0");
				}

			}
		});
		btnZero.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnZero.setBounds(71, 313, 53, 23);
		contentPane.add(btnZero);

		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText().toString();
				if (text.toLowerCase().contains(".")) {

				} else {
					textField.setText(text + ".");
				}
			}
		});
		btnDot.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnDot.setBounds(134, 313, 53, 23);
		contentPane.add(btnDot);

		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondnumber = textField.getText().toString().substring(index+1,
						textField.getText().toString().length());
				if (check == 1) {
//					System.out.println("First = "+firstnumber);
//					System.out.println("Second = "+secondnumber);
					num1 = Integer.parseInt(firstnumber);
					num2 = Integer.parseInt(secondnumber);
					float n = num1 + num2;
					textField.setText(Float.toString(n));
				}
				else if(check == 2)
				{
					num1 = Integer.parseInt(firstnumber);
					num2 = Integer.parseInt(secondnumber);
					int n = num1 - num2;
					textField.setText(Integer.toString(n));
				}
				else if(check == 3)
				{
					num1 = Integer.parseInt(firstnumber);
					num2 = Integer.parseInt(secondnumber);
					int n = num1 * num2;
					textField.setText(Integer.toString(n));
				}
				else if(check == 4)
				{
					num1 = Integer.parseInt(firstnumber);
					num2 = Integer.parseInt(secondnumber);
					try {
						float n = num1 / num2;
						textField.setText(Float.toString(n));
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}

			}
		});
		btnEqual.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnEqual.setBounds(197, 313, 53, 23);
		contentPane.add(btnEqual);

		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				check = 1;
				String text = textField.getText().toString();
				
				if (textField.getText().toString().contains("+")) {

				} else {
					textField.setText(text + "+");
				}
				index = textField.getText().toString().indexOf("+");
				firstnumber = text.toString().substring(0, index);
			}
		});
		btnPlus.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnPlus.setBounds(263, 313, 53, 23);
		contentPane.add(btnPlus);

		JButton btnClear = new JButton("clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(textField.getText().length() > 0)
				{
					String text = String.valueOf(textField.getText().toString().substring(0, textField.getText().length() - 1));
					textField.setText(text);
				}
			}
		});
		btnClear.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnClear.setBounds(263, 142, 53, 23);
		contentPane.add(btnClear);
	}

}
