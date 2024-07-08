package combo.gui;


import combo.bo.BoConexao;
import combo.controller.CoCombo;
import javax.swing.JComboBox;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;



public class GuiComboNew extends JFrame {
	
	private CoCombo co;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPesquisa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiComboNew frame = new GuiComboNew();
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
	public GuiComboNew() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("PROJETO INTEGRADOR III-B");

		
		txtPesquisa = new JTextField();
		txtPesquisa.setHorizontalAlignment(SwingConstants.LEFT);
		txtPesquisa.setBounds(10, 197, 300, 22);
		contentPane.add(txtPesquisa);
		txtPesquisa.setColumns(10);
		txtPesquisa.setVisible(false);
		
		JLabel lblPesquisa = new JLabel("Insira texto para pesquisa:");
		lblPesquisa.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblPesquisa.setBounds(10, 182, 135, 14);
		contentPane.add(lblPesquisa);
		lblPesquisa.setVisible(false);
		
		JButton btnPesquisa = new JButton("Confirmar");
		btnPesquisa.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnPesquisa.setBounds(312, 197, 100, 23);
		contentPane.add(btnPesquisa);
		btnPesquisa.setVisible(false);	

		JButton btnAbrirLista = new JButton("Abrir lista");
		btnAbrirLista.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnAbrirLista.setBounds(10, 219, 89, 23);
		contentPane.add(btnAbrirLista);
		btnAbrirLista.setVisible(false);
		
		JLabel lblTitulo = new JLabel("BIBLIOTECA DE LIVROS");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblTitulo.setToolTipText("");
		lblTitulo.setBounds(230, 11, 235, 30);
		contentPane.add(lblTitulo);
		
		JLabel lblopcoes = new JLabel("Opções disponíveis:");
		lblopcoes.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblopcoes.setBounds(10, 60, 196, 14);
		contentPane.add(lblopcoes);
		
		JLabel lblOpc1 = new JLabel("1 - Pesquisa por Título.");
		lblOpc1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblOpc1.setBounds(10, 77, 135, 14);
		contentPane.add(lblOpc1);
		
		JLabel lblOpc2 = new JLabel("2 - Pesquisa por autor.");
		lblOpc2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblOpc2.setBounds(10, 91, 135, 14);
		contentPane.add(lblOpc2);
		
		JLabel lblOpc3 = new JLabel("3 - Lista com todos os livros( NÃO RECOMENDADO)");
		lblOpc3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblOpc3.setBounds(10, 105, 264, 14);
		contentPane.add(lblOpc3);
		
		JLabel lblOpcaoDesejada = new JLabel("Selecione a opção desejada:");
		lblOpcaoDesejada.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblOpcaoDesejada.setBounds(10, 130, 196, 14);
		contentPane.add(lblOpcaoDesejada);
		
		JComboBox cbOpcoes = new JComboBox();
		cbOpcoes.setBounds(10, 147, 160, 22);
		contentPane.add(cbOpcoes);
		cbOpcoes.setFont(new Font("Tahoma", Font.BOLD, 11)); // NOI18N
		cbOpcoes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Opção 1", "Opção 2", "Opção 3" }));
				
		cbOpcoes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedOption = (String) cbOpcoes.getSelectedItem();
				if (selectedOption.equals("")) {
					lblPesquisa.setVisible(false);
					txtPesquisa.setVisible(false);
					btnPesquisa.setVisible(false);
					btnAbrirLista.setVisible(false);
				
				}if (selectedOption.equals("Opção 1")|| selectedOption.equals("Opção 2")) {
					lblPesquisa.setVisible(true);
					txtPesquisa.setVisible(true);
					btnPesquisa.setVisible(true);
					btnAbrirLista.setVisible(false);
				
				}if (selectedOption.equals("Opção 3")) {
					//JOptionPane.showMessageDialog(null, "Teste" );
					lblPesquisa.setVisible(false);
					txtPesquisa.setVisible(false);
					btnPesquisa.setVisible(false);
					btnAbrirLista.setVisible(true);
			        btnAbrirLista.addActionListener(new java.awt.event.ActionListener() {
			            public void actionPerformed(java.awt.event.ActionEvent evt) {
			            	btnAbrirListaExcluirClienteActionPerformed(evt);
			            }});
					
				}
			}
		});
	
		
	}
		private void btnAbrirListaExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirClienteActionPerformed
	       // TODO add your handling code here:
	       this.getCo().obterLista();
	   }//GEN-LAST:event_jButtonExcluirClienteActionPerformed

	   public CoCombo getCo() {
	        return co;
	    }

	    public JComboBox getjComboBoxCliente() {
	        return cbOpcoes;
	    }
	private javax.swing.JComboBox cbOpcoes;
}