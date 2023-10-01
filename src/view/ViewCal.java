package view;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ViewCal {

	boolean Troca = false;
	private String TotalV1 = "",TotalV2="";
	int escolha;
	private JFrame frame;
	JLabel panel ;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCal window = new ViewCal();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewCal() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(26, 95, 180));
		frame.setBackground(new Color(26, 95, 180));
		frame.setBounds(200, 200, 310, 230);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		/*Tela*/
		panel = new JLabel("");
		panel.setBackground(new Color(0,0,0));
		panel.setFont(new Font("Arial", Font.BOLD,25));		
		panel.setBounds(12, 12, 271, 49);
		frame.getContentPane().add(panel);

		//Numeros
		//btn1
		JButton btn1 = new JButton("1");
		btn1.setToolTipText("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumero("1");
			}	
		});
		btn1.setBounds(10, 73, 68, 25);
		frame.getContentPane().add(btn1);
		
		//btn2
		JButton btn2 = new JButton("2");
		btn2.setBounds(78, 73, 68, 25);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumero("2");
			}	
		});
		frame.getContentPane().add(btn2);
		
		//btn3
		JButton btn3 = new JButton("3");
		btn3.setBounds(146, 73, 68, 25);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumero("3");
			}
		});
		frame.getContentPane().add(btn3);
		
		//btn4
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumero("4");
			}
		});
		btn4.setBounds(10, 99, 68, 25);
		frame.getContentPane().add(btn4);
		
		//btn5
		JButton btn5 = new JButton("5");
		btn5.setBounds(78, 99, 68, 25);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumero("5");
			}
		});
		frame.getContentPane().add(btn5);
		
		//btn6
		JButton btn6 = new JButton("6");
		btn6.setBounds(146, 99, 68, 25);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumero("6");
			}
		});
		frame.getContentPane().add(btn6);
		
		//btn7
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumero("7");
			}
		});
		btn7.setBounds(10, 125, 68, 25);
		frame.getContentPane().add(btn7);
		
		//btn8
		JButton btn8 = new JButton("8");
		btn8.setBounds(78, 125, 68, 25);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumero("8");
			}
		});
		frame.getContentPane().add(btn8);
		
		//bnt9
		JButton btn9 = new JButton("9");
		btn9.setBounds(146, 125, 68, 25);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumero("9");
			}
		});
		frame.getContentPane().add(btn9);
		
		//btn0
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addNumero("0");
			}
		});
		btn0.setBounds(10, 151, 68, 25);
		frame.getContentPane().add(btn0);
		
		//Resultado
		JButton btnResultado = new JButton("= Linpar");
		btnResultado.setBounds(78, 151, 136, 25);
		btnResultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (TotalV1 != "" && TotalV2 != "" && Troca == true) {
					calculos cal = new calculos(Double.valueOf(TotalV1),Double.valueOf(TotalV2),escolha);
					panel.setText(cal.soma());
					TotalV1 = ""; TotalV2 = "";Troca = false;
				}
				else {
					TotalV1 = ""; TotalV2 = ""; panel.setText("");Troca = false;
				}
			}
		});
		frame.getContentPane().add(btnResultado);
		
		//Operadores
		//soma
		JButton button_0 = new JButton("+");
		button_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Troca = true;
				escolha = 1;
			}
		});
		button_0.setBounds(215, 73, 68, 25);
		frame.getContentPane().add(button_0);
		
		//subtracao
		JButton button_1 = new JButton("-");
		button_1.setBounds(215, 99, 68, 25);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Troca = true;
				escolha = 2;
			}
		});
		frame.getContentPane().add(button_1);
		
		//multiplicacao
		JButton button_2 = new JButton("*");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Troca = true;
				escolha = 3;
			}
		});
		button_2.setBounds(215, 125, 68, 25);
		frame.getContentPane().add(button_2);
		
		//divisao
		JButton button_3 = new JButton("/");
		button_3.setBounds(215, 151, 68, 25);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Troca = true;
				escolha = 4;
			}
		});
		frame.getContentPane().add(button_3);
	}
	
	public void addNumero(String numero) {
		
		if (Troca == true) {
			TotalV2 += numero;
			panel.setText(TotalV2);
		}
		else {
			TotalV1 += numero;
			panel.setText(TotalV1);
		}
		
	}
}
