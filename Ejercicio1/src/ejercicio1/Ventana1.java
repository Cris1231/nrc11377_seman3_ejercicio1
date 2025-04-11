package ejercicio1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana1 extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextField textNum1;
	private JTextField textNum2;
	private JTextField textNum3;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JScrollPane scrollPane;
	private JTextArea textS;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana1 frame = new Ventana1();
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
	public Ventana1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 485, 478);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("Primer Número:");
			lblNewLabel.setBounds(33, 34, 104, 14);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("Segundo Número:");
			lblNewLabel_1.setBounds(33, 69, 104, 14);
			contentPane.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("Tercer Número (Opcional):");
			lblNewLabel_2.setBounds(33, 105, 184, 14);
			contentPane.add(lblNewLabel_2);
		}
		{
			textNum1 = new JTextField();
			textNum1.setBounds(189, 31, 129, 20);
			contentPane.add(textNum1);
			textNum1.setColumns(10);
		}
		{
			textNum2 = new JTextField();
			textNum2.setBounds(189, 66, 129, 20);
			contentPane.add(textNum2);
			textNum2.setColumns(10);
		}
		{
			textNum3 = new JTextField();
			textNum3.setBounds(189, 102, 129, 20);
			contentPane.add(textNum3);
			textNum3.setColumns(10);
		}
		{
			btnNewButton = new JButton("Suma dos Enteros");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(140, 146, 171, 29);
			contentPane.add(btnNewButton);
		}
		{
			btnNewButton_1 = new JButton("Suma tres Enteros");
			btnNewButton_1.addActionListener(this);
			btnNewButton_1.setBounds(140, 186, 171, 31);
			contentPane.add(btnNewButton_1);
		}
		{
			btnNewButton_2 = new JButton("Suma dos Reales");
			btnNewButton_2.addActionListener(this);
			btnNewButton_2.setBounds(140, 226, 171, 30);
			contentPane.add(btnNewButton_2);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(10, 279, 449, 149);
			contentPane.add(scrollPane);
			{
				textS = new JTextArea();
				scrollPane.setViewportView(textS);
			}
		}
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNewButton_2) {
			do_btnNewButton_2_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton_1) {
			do_btnNewButton_1_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		try {
			int n1 = Integer.parseInt(textNum1.getText());
			int n2 = Integer.parseInt(textNum2.getText());
			Calculadora c = new Calculadora(n1,n2);
			textS.append("\nLa suma es: "+ c.Sumar(n1,n2));
			
		}catch(Exception e2) {
			
				JOptionPane.showMessageDialog(this, "Ingrese SOLO números esnteros");
		}
		
	}
	protected void do_btnNewButton_1_actionPerformed(ActionEvent e) {
		try {
			int n1 = Integer.parseInt(textNum1.getText());
			int n2 = Integer.parseInt(textNum2.getText());
			int n3 = Integer.parseInt(textNum3.getText());
			Calculadora c = new Calculadora(n1,n2,n3);
			textS.append("\nLa suma es: "+ c.Sumar(n1,n2,n3));
			
		}catch(Exception e2) {
			
				JOptionPane.showMessageDialog(this, "Ingrese SOLO números esnteros");
		}
	}
	protected void do_btnNewButton_2_actionPerformed(ActionEvent e) {
		try {
			double n1 = Double.parseDouble(textNum1.getText());
			double n2 = Double.parseDouble(textNum2.getText());
			Calculadora c = new Calculadora(n1, n2);
			textS.append("\nLa suma con dos nùmeros reales es: "+ c.Sumar(n1, n2));
			
		}catch(Exception e2) {
			JOptionPane.showMessageDialog(this, "Ingrese SOLO números reales");
		}
	}
}
