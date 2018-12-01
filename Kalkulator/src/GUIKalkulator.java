import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class GUIKalkulator extends JFrame {

	private JPanel contentPane;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn0;
	private JButton btnZarez;
	private JButton btnDeljenje;
	private JButton btnMnozenje;
	private JButton btnOduzimanje;
	private JButton btnSabiranje;
	private JButton btnJednako;
	public double x;
	public double y;
	public String znak;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnObrisi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIKalkulator frame = new GUIKalkulator();
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
	public GUIKalkulator() {
		createContents();
	}
	private void createContents() {
		setTitle("Kalkulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 329, 388);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtn1());
		contentPane.add(getBtn2());
		contentPane.add(getBtn3());
		contentPane.add(getBtn4());
		contentPane.add(getBtn5());
		contentPane.add(getBtn6());
		contentPane.add(getBtn7());
		contentPane.add(getBtn8());
		contentPane.add(getBtn9());
		contentPane.add(getBtn0());
		contentPane.add(getBtnZarez());
		contentPane.add(getBtnDeljenje());
		contentPane.add(getBtnMnozenje());
		contentPane.add(getBtnOduzimanje());
		contentPane.add(getBtnSabiranje());
		contentPane.add(getBtnJednako());
		contentPane.add(getScrollPane());
		contentPane.add(getBtnObrisi());
	}
	private JButton getBtn1() {
		if (btn1 == null) {
			btn1 = new JButton("1");
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String s=textArea.getText();
					textArea.setText(s+"1");
				}
			});
			btn1.setBounds(40, 75, 44, 41);
		}
		return btn1;
	}
	private JButton getBtn2() {
		if (btn2 == null) {
			btn2 = new JButton("2");
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String s=textArea.getText();
					textArea.setText(s+"2");
				}
			});
			btn2.setBounds(94, 75, 44, 41);
		}
		return btn2;
	}
	private JButton getBtn3() {
		if (btn3 == null) {
			btn3 = new JButton("3");
			btn3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String s=textArea.getText();
					textArea.setText(s+"3");
				}
			});
			btn3.setBounds(148, 75, 44, 41);
		}
		return btn3;
	}
	private JButton getBtn4() {
		if (btn4 == null) {
			btn4 = new JButton("4");
			btn4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String s=textArea.getText();
					textArea.setText(s+"4");
				}
			});
			btn4.setBounds(40, 127, 44, 41);
		}
		return btn4;
	}
	private JButton getBtn5() {
		if (btn5 == null) {
			btn5 = new JButton("5");
			btn5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String s=textArea.getText();
					textArea.setText(s+"5");
				}
			});
			btn5.setBounds(94, 127, 44, 41);
		}
		return btn5;
	}
	private JButton getBtn6() {
		if (btn6 == null) {
			btn6 = new JButton("6");
			btn6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String s=textArea.getText();
					textArea.setText(s+"6");
				}
			});
			btn6.setBounds(148, 127, 44, 41);
		}
		return btn6;
	}
	private JButton getBtn7() {
		if (btn7 == null) {
			btn7 = new JButton("7");
			btn7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String s=textArea.getText();
					textArea.setText(s+"7");
				}
			});
			btn7.setBounds(40, 179, 44, 41);
		}
		return btn7;
	}
	private JButton getBtn8() {
		if (btn8 == null) {
			btn8 = new JButton("8");
			btn8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String s=textArea.getText();
					textArea.setText(s+"8");
				}
			});
			btn8.setBounds(94, 179, 44, 41);
		}
		return btn8;
	}
	private JButton getBtn9() {
		if (btn9 == null) {
			btn9 = new JButton("9");
			btn9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String s=textArea.getText();
					textArea.setText(s+"9");
				}
			});
			btn9.setBounds(148, 179, 44, 41);
		}
		return btn9;
	}
	private JButton getBtn0() {
		if (btn0 == null) {
			btn0 = new JButton("0");
			btn0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String s=textArea.getText();
					textArea.setText(s+"0");
				}
			});
			btn0.setBounds(40, 230, 98, 41);
		}
		return btn0;
	}
	private JButton getBtnZarez() {
		if (btnZarez == null) {
			btnZarez = new JButton(",");
			btnZarez.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String s=textArea.getText();
					textArea.setText(s+",");
				}
			});
			btnZarez.setBounds(148, 231, 44, 41);
		}
		return btnZarez;
	}
	private JButton getBtnDeljenje() {
		if (btnDeljenje == null) {
			btnDeljenje = new JButton("/");
			btnDeljenje.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String a = textArea.getText();
					znak="/";
					x= Double.parseDouble(a);
					textArea.setText(a+"/\n");
				}
			});
			btnDeljenje.setBounds(202, 75, 44, 41);
		}
		return btnDeljenje;
	}
	private JButton getBtnMnozenje() {
		if (btnMnozenje == null) {
			btnMnozenje = new JButton("*");
			btnMnozenje.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String a = textArea.getText();
					znak="*";
					x= Double.parseDouble(a);
					textArea.setText(a+"*\n");
				}
			});
			btnMnozenje.setBounds(202, 127, 44, 41);
		}
		return btnMnozenje;
	}
	private JButton getBtnOduzimanje() {
		if (btnOduzimanje == null) {
			btnOduzimanje = new JButton("-");
			btnOduzimanje.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String a = textArea.getText();
					znak="-";
					x= Double.parseDouble(a);
					textArea.setText(a+"-\n");
				}
			});
			btnOduzimanje.setBounds(202, 179, 44, 41);
		}
		return btnOduzimanje;
	}
	private JButton getBtnSabiranje() {
		if (btnSabiranje == null) {
			btnSabiranje = new JButton("+");
			btnSabiranje.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String a = textArea.getText();
					znak="+";
					x= Double.parseDouble(a);
					textArea.setText(a+"+\n");
				}
			});
			btnSabiranje.setBounds(202, 230, 44, 41);
		}
		return btnSabiranje;
	}
	private JButton getBtnJednako() {
		if (btnJednako == null) {
			btnJednako = new JButton("=");
			btnJednako.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String b = textArea.getText();
					int d=b.length();
					int i=b.indexOf(znak);
					String c=b.substring(i+1,d);
					y=Double.parseDouble(c);
					switch(znak) {
					case "+":
						double zbir=x+y;
						textArea.setText(""+zbir);
						break;
					case "-":
						double razlika=x-y;
						textArea.setText(""+razlika);
						break;
					case "*":
						double proizvod=x*y;
						textArea.setText(""+proizvod);
						break;
					case "/":
						double kolicnik=x/y;
						textArea.setText(""+kolicnik);
						break;
					}
					
				}
			});
			btnJednako.setBounds(40, 290, 212, 40);
		}
		return btnJednako;
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(40, 11, 206, 41);
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("C");
			btnObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					znak="";
					textArea.setText("");
					x=0;
					y=0;
				}
			});
			btnObrisi.setBounds(256, 13, 47, 39);
		}
		return btnObrisi;
	}
}
