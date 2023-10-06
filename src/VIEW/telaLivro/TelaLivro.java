package VIEW.telaLivro;

import DAO.GeneroDAO;
import DAO.LivroBiblioteca;
import MODELS.Genero;
import MODELS.Livro;
import VIEW.telaOpcoes.TelaOpcoes;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaLivro extends javax.swing.JFrame {

    public TelaLivro() {
        initComponents();
        PreenchendoCombo();
        ListarLivros();
        txtCodigo.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        comboGenero = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtPublicacao = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaLivros = new javax.swing.JTable();
        btnCadastrar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnVoltarMenu = new javax.swing.JButton();
        btnLimparCampos = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel1.setText("Titulo");

        txtTitulo.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        txtTitulo.setMargin(new java.awt.Insets(2, 12, 2, 6));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel2.setText("Autor");

        txtAutor.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        txtAutor.setMargin(new java.awt.Insets(2, 12, 2, 6));

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel3.setText("Gênero");

        comboGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel4.setText("Publicação");

        txtPublicacao.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        txtPublicacao.setMargin(new java.awt.Insets(2, 12, 2, 6));

        tabelaLivros.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        tabelaLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo do livro", "Titulo", "Autor", "Gênero", "Publicação", "Data de Cadastro"
            }
        ));
        tabelaLivros.setRowHeight(25);
        tabelaLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaLivrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaLivros);

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnDeletar.setText("Delete");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        jButton3.setText("Atualizar");

        btnVoltarMenu.setFont(new java.awt.Font("Liberation Sans", 0, 16)); // NOI18N
        btnVoltarMenu.setText("Voltar ao menu");
        btnVoltarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarMenuActionPerformed(evt);
            }
        });

        btnLimparCampos.setText("Limpar campos");
        btnLimparCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnVoltarMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtPublicacao, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(comboGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimparCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(comboGenero))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPublicacao, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimparCampos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVoltarMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(txtCodigo))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(750, 501));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarMenuActionPerformed
        TelaOpcoes telaOpcoes = new TelaOpcoes();
        telaOpcoes.setVisible(true);

        dispose();
    }//GEN-LAST:event_btnVoltarMenuActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        CadastrarLivro();
        ListarLivros();
        limparCampos();
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void tabelaLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaLivrosMouseClicked
        // TODO add your handling code here:
        carregarCampos();
    }//GEN-LAST:event_tabelaLivrosMouseClicked

    private void btnLimparCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparCamposActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimparCamposActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        ExcluirLivro();
        ListarLivros();
        limparCampos();
    }//GEN-LAST:event_btnDeletarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLivro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLivro().setVisible(true);
            }
        });
    }

    private void CadastrarLivro() {

        LivroBiblioteca livroBiblioteca = new LivroBiblioteca();
        Livro livro = new Livro();

        String tituloValor = livro.getTitulo();
        String autorValor = livro.getAutor();
        String generoValor = livro.getGenero();

        if (tituloValor == null && autorValor == null && generoValor == null) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos");
        } else {
            String titulo = txtTitulo.getText();
            String autor = txtAutor.getText();
            String genero = comboGenero.getSelectedItem().toString();
            int ano_publicacao = Integer.parseInt(txtPublicacao.getText());

            livro.setTitulo(titulo);
            livro.setAutor(autor);
            livro.setGenero(genero);
            livro.setAno_publicacao(ano_publicacao);

            livroBiblioteca.CadastroLivro(livro);
        }

    }

    private void PreenchendoCombo() {
        GeneroDAO generoDAO = new GeneroDAO();
        for (Genero genero : generoDAO.mostrarGeneros()) {
            comboGenero.addItem(genero);
        }
    }

    private void ListarLivros() {
        try {
            LivroBiblioteca livroBiblioteca = new LivroBiblioteca();

            DefaultTableModel model = (DefaultTableModel) tabelaLivros.getModel();

            model.setNumRows(0);

            for (Livro livro : livroBiblioteca.mostrarLivros()) {
                model.addRow(new Object[]{
                    livro.getId_livro(),
                    livro.getTitulo(),
                    livro.getAutor(),
                    livro.getGenero(),
                    livro.getAno_publicacao(),
                    livro.getData_cadastro(),});
            }

            livroBiblioteca.mostrarLivros();

        } catch (Exception e) {
            System.out.println("Erro " + e);
        }
    }

    private void carregarCampos() {
        int opcao = tabelaLivros.getSelectedRow();

        txtCodigo.setText(tabelaLivros.getValueAt(opcao, 0).toString());
        txtTitulo.setText(tabelaLivros.getValueAt(opcao, 1).toString());
        txtAutor.setText(tabelaLivros.getValueAt(opcao, 2).toString());
        txtPublicacao.setText(tabelaLivros.getValueAt(opcao, 4).toString());
    }

    private void ExcluirLivro() {
        int id_livro;

        int confirm = JOptionPane.showConfirmDialog(null, "Deseja realmente excluir? ");

        if (confirm == JOptionPane.YES_OPTION) {
            id_livro = Integer.parseInt(txtCodigo.getText());

            // Instanciando modelo (classe)
            Livro livros = new Livro();
            livros.setId_livro(id_livro);

            // Instanciado o livro DAO onde ocorre os metodos de CRUD
            LivroBiblioteca livroBiblioteca = new LivroBiblioteca();
            livroBiblioteca.DeletarLivro(id_livro);
        } else {
            JOptionPane.showMessageDialog(null, "Ação Cancelada");
        }

    }

    private void limparCampos() {
        txtCodigo.setText("");
        txtTitulo.setText("");
        txtAutor.setText("");
        txtPublicacao.setText("");
        comboGenero.setSelectedIndex(0);
        txtTitulo.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnLimparCampos;
    private javax.swing.JButton btnVoltarMenu;
    private javax.swing.JComboBox<Object> comboGenero;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaLivros;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtPublicacao;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
