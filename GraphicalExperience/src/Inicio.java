import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTextArea;
import java.awt.Label;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.Panel;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Inicio extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private Integer dato1;
	private Integer dato2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inicio frame = new Inicio();
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
	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnIntroducirDatos = new JButton("Introducir datos");
		btnIntroducirDatos.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (isInteger(textField.getText()) && isInteger(textField_1.getText())){
					dato1=Integer.parseInt(textField.getText());
					dato2=Integer.parseInt(textField_1.getText());
				}
				else if (textField.getText().equals("") || textField_1.getText().equals("")){
					JOptionPane.showMessageDialog(null,"Rellene todos los campos");
				}
				else{
					JOptionPane.showMessageDialog(null,"Introduzca valores permitidos");
				}
			}
		});
		btnIntroducirDatos.setBounds(10, 214, 170, 37);
		contentPane.add(btnIntroducirDatos);
		
		textField = new JTextField();
		textField.setBounds(10, 60, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDato = new JLabel("Dato1");
		lblDato.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDato.setBounds(10, 40, 70, 20);
		contentPane.add(lblDato);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 118, 86, 20);
		contentPane.add(textField_1);
		
		JButton btnSumar = new JButton("Sumar");
		btnSumar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (dato1!=null && dato2!=null ){
					JOptionPane.showMessageDialog(null,"El resultado de la suma es "+String.valueOf(suma(dato1,dato2)));
				}
				else{
					JOptionPane.showMessageDialog(null,"Rellene los campos");
				}
				Label label = new Label();
				label.setBounds(212, 91, 148, 33);
				contentPane.add(label);
			}
		});
		btnSumar.setBounds(254, 214, 170, 37);
		contentPane.add(btnSumar);
		
		JLabel lblDato_1 = new JLabel("Dato2");
		lblDato_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDato_1.setBounds(10, 99, 70, 20);
		contentPane.add(lblDato_1);
		
		JButton button = new JButton("Restar");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (dato1!=null && dato2!=null ){
					JOptionPane.showMessageDialog(null,"El resultado de la resta es "+String.valueOf(resta(dato1,dato2)));
				}
				else{
					JOptionPane.showMessageDialog(null,"Rellene los campos");
				}
				Label label = new Label();
				label.setBounds(212, 91, 148, 33);
				contentPane.add(label);
			}
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setBounds(254, 166, 170, 37);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Multiplicar");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (dato1!=null && dato2!=null ){
					JOptionPane.showMessageDialog(null,"El resultado de la multiplicación es "+String.valueOf(multiplicacion(dato1,dato2)));
				}
				else{
					JOptionPane.showMessageDialog(null,"Rellene los campos");
				}
				Label label = new Label();
				label.setBounds(212, 91, 148, 33);
				contentPane.add(label);
			}
		});
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setBounds(254, 118, 170, 37);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("Dividir");
		button_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (dato1!=null && dato2!=null ){
					JOptionPane.showMessageDialog(null,"El resultado de la división es "+String.valueOf(division(dato1,dato2)));
				}
				else{
					JOptionPane.showMessageDialog(null,"Rellene los campos");
				}
				Label label = new Label();
				label.setBounds(212, 91, 148, 33);
				contentPane.add(label);
			}
		});
		button_2.setBounds(254, 70, 170, 37);
		contentPane.add(button_2);
	}
	
	public static int suma(int dato1, int dato2){
		int resultado = dato1 + dato2;
		return resultado;
	}
	public static int resta(int dato1,int dato2){
		int resultado = dato1 - dato2;
		return resultado;
	}
	public static int multiplicacion(int dato1,int dato2){
		int resultado = dato1 * dato2;
		return resultado;
	}
	public static int division(int dato1,int dato2){
		int resultado = dato1 / dato2;
		return resultado;
	}
	public static boolean isInteger(String s) {
	    return isInteger(s,10);
	}
	public static boolean isInteger(String s, int radix) {
	    if(s.isEmpty()) return false;
	    for(int i = 0; i < s.length(); i++) {
	        if(i == 0 && s.charAt(i) == '-') {
	            if(s.length() == 1) return false;
	            else continue;
	        }
	        if(Character.digit(s.charAt(i),radix) < 0) return false;
	    }
	    return true;
	}
}
