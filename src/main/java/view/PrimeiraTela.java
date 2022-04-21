package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import exemploPdf.Exemplo1;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

public class PrimeiraTela extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeiraTela frame = new PrimeiraTela();
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
	public PrimeiraTela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 573, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JEditorPane BlocoTxt = new JEditorPane();
		BlocoTxt.setBounds(27, 58, 490, 204);
		contentPane.add(BlocoTxt);
		
		JLabel lblNewLabel = new JLabel("Gerando PDFs");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setBounds(225, 14, 104, 33);
		contentPane.add(lblNewLabel);
		
		JButton btnGerarPdf = new JButton("Gerar PDF");
		btnGerarPdf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Exemplo1 arquivopdf = new Exemplo1(BlocoTxt.getText());
				JOptionPane.showInternalMessageDialog(null, "PDF criado com sucesso!", "Alerta", 1);
				System.exit(0); 
			}
		});
		btnGerarPdf.setBounds(416, 287, 89, 23);
		contentPane.add(btnGerarPdf);
		
	}
}
