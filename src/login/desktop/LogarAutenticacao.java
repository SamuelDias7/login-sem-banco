package login.desktop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LogarAutenticacao {
	private String usuarioC;
	private String senhaC;	
	
	int x = 0;
	
	public LogarAutenticacao() {
		
	}
	
	public LogarAutenticacao(String usuario, String senha) {
		// TODO Auto-generated constructor stub
		this.usuarioC = usuario;
		this.senhaC = senha;
		
		JFrame frameLog = new JFrame("TELA DE LOGIN");
		frameLog.setVisible(true);
		frameLog.setSize(400,400);
		frameLog.setDefaultCloseOperation(frameLog.EXIT_ON_CLOSE);
		frameLog.setLocationRelativeTo(null);
		frameLog.setResizable(false);
		frameLog.setLayout(null);
		
		// Frame com imagem
		JFrame frameInicial = new JFrame("TELA INICIAL");
		frameInicial.setVisible(false);
		frameInicial.setSize(400,400);
		frameInicial.setDefaultCloseOperation(frameLog.EXIT_ON_CLOSE);
		frameInicial.setLocationRelativeTo(null);
		frameInicial.setResizable(false);
		frameInicial.setLayout(null);
		
		JLabel t1 = new JLabel("usuario");
		JLabel t2 = new JLabel("senha");
		
		frameLog.add(t1);
		frameLog.add(t2);
		
		t1.setBounds(50, 120, 150, 30);
		t2.setBounds(50,170,150,30);
		
		JTextField c1 = new JTextField();
		JTextField c2 = new JPasswordField();
		
		frameLog.add(c1);
		frameLog.add(c2);
		
		c1.setBounds(100, 120, 200, 30);
		c2.setBounds(100, 170, 200, 30);
		
		JButton btn1 = new JButton("Login");
		JButton btn2 = new JButton("Cancelar");
		JButton btn3 = new JButton("Cadastrar");
		
		frameLog.add(btn1);
		frameLog.add(btn2);
		frameLog.add(btn3);
		
		btn1.setBounds(120, 230, 150, 30);
		btn2.setBounds(120, 300, 150, 30);
		btn3.setBounds(230, 10, 150, 30);
		
		
		ActionListener btnAl1 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//JOptionPane.showMessageDialog(null, "Acesso liberado");
				String usuarioLog = c1.getText();
				String senhaLog = c2.getText();
				
				c1.setText("");
				c2.setText("");
				
				System.out.println(usuarioLog);
				System.out.println(senhaLog);
				if(usuarioC.equals(usuarioLog) && senhaC.equals(senhaLog)) {
					JOptionPane.showMessageDialog(null, "DADOS CONFEREM");
					frameLog.setVisible(false);
					frameInicial.setVisible(true);
					 
					
				}else {
					JOptionPane.showMessageDialog(null, "DADOS INVALIDOS");
					
					
				}				
				
			}
			
		};btn1.addActionListener(btnAl1);
		
		ActionListener btnExit2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
				
			}
			
		};btn2.addActionListener(btnExit2);
		
		ActionListener btnAlternar2 = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				frameLog.setVisible(false);
				
			}
			
		};
		btn3.addActionListener(btnAlternar2);

		

	}

	

}
