/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.CardLayout;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thiago
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        readJTable();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panNave = new javax.swing.JPanel();
        btnVenda = new javax.swing.JLabel();
        btnRegistro = new javax.swing.JLabel();
        btnEstoque = new javax.swing.JLabel();
        btnSair = new javax.swing.JLabel();
        labelNome = new javax.swing.JLabel();
        labelDesenvolvedor = new javax.swing.JLabel();
        panTelas = new javax.swing.JPanel();
        panVenda = new javax.swing.JPanel();
        boxProduto = new javax.swing.JComboBox<>();
        labelProduto = new javax.swing.JLabel();
        selecaoQtd = new javax.swing.JSpinner();
        labelQtd = new javax.swing.JLabel();
        selecaoTipo = new javax.swing.JComboBox<>();
        labelTipo = new javax.swing.JLabel();
        btnVender = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        areaResultado = new javax.swing.JTextArea();
        panEstoque = new javax.swing.JPanel();
        jbtCadastrar = new javax.swing.JButton();
        jbtExibir = new javax.swing.JButton();
        jbtExcluir = new javax.swing.JButton();
        jbtAtualizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtQtd = new javax.swing.JSpinner();
        txtNome = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnPesquisa = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tResult = new javax.swing.JTable();
        txtStatus = new javax.swing.JLabel();
        txtTipo = new javax.swing.JComboBox<>();
        txtId = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        panRegistro = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tResult1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panNave.setBackground(new java.awt.Color(8, 46, 219));
        panNave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102), new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));

        btnVenda.setBackground(new java.awt.Color(255, 255, 255));
        btnVenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnVenda.setText("Registrar Venda");
        btnVenda.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        btnVenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVenda.setOpaque(true);
        btnVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVendaMouseClicked(evt);
            }
        });

        btnRegistro.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegistro.setText("Registro Geral");
        btnRegistro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        btnRegistro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistro.setOpaque(true);
        btnRegistro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistroMouseClicked(evt);
            }
        });

        btnEstoque.setBackground(new java.awt.Color(255, 255, 255));
        btnEstoque.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEstoque.setText("Registrar Estoque");
        btnEstoque.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        btnEstoque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstoque.setOpaque(true);
        btnEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEstoqueMouseClicked(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(255, 255, 255));
        btnSair.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSair.setText("Sair");
        btnSair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        btnSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSair.setOpaque(true);
        btnSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSairMouseClicked(evt);
            }
        });

        labelNome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelNome.setForeground(new java.awt.Color(255, 255, 255));
        labelNome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNome.setText("Loja");

        labelDesenvolvedor.setForeground(new java.awt.Color(255, 255, 255));
        labelDesenvolvedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDesenvolvedor.setText("Desenvolvido por Thiago Lira");

        javax.swing.GroupLayout panNaveLayout = new javax.swing.GroupLayout(panNave);
        panNave.setLayout(panNaveLayout);
        panNaveLayout.setHorizontalGroup(
            panNaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panNaveLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panNaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panNaveLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panNaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelDesenvolvedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panNaveLayout.setVerticalGroup(
            panNaveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panNaveLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(labelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 172, Short.MAX_VALUE)
                .addComponent(labelDesenvolvedor)
                .addGap(20, 20, 20))
        );

        btnRegistro.getAccessibleContext().setAccessibleName("Registro");

        getContentPane().add(panNave, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, -1));

        panTelas.setBackground(new java.awt.Color(255, 255, 255));
        panTelas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102), new java.awt.Color(204, 204, 204), new java.awt.Color(102, 102, 102)));
        panTelas.setLayout(new java.awt.CardLayout());

        panVenda.setBackground(new java.awt.Color(255, 255, 255));
        panVenda.setPreferredSize(new java.awt.Dimension(1210, 516));

        labelProduto.setText("Produto:");

        labelQtd.setText("Quantidade:");

        selecaoTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unidade", "Pacote" }));

        labelTipo.setText("Tipo");

        btnVender.setText("Vender");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });

        areaResultado.setEditable(false);
        areaResultado.setColumns(20);
        areaResultado.setRows(5);
        jScrollPane1.setViewportView(areaResultado);

        javax.swing.GroupLayout panVendaLayout = new javax.swing.GroupLayout(panVenda);
        panVenda.setLayout(panVendaLayout);
        panVendaLayout.setHorizontalGroup(
            panVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panVendaLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panVendaLayout.createSequentialGroup()
                        .addGroup(panVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelProduto))
                        .addGap(96, 96, 96)
                        .addGroup(panVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panVendaLayout.createSequentialGroup()
                                .addComponent(labelQtd)
                                .addGap(22, 22, 22))
                            .addComponent(selecaoQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(121, 121, 121)
                        .addGroup(panVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selecaoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelTipo)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(637, Short.MAX_VALUE))
        );
        panVendaLayout.setVerticalGroup(
            panVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panVendaLayout.createSequentialGroup()
                .addGroup(panVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panVendaLayout.createSequentialGroup()
                        .addGroup(panVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panVendaLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(labelProduto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boxProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panVendaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(labelTipo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(selecaoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panVendaLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(labelQtd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selecaoQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                        .addComponent(btnVender, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        panTelas.add(panVenda, "Venda");

        panEstoque.setBackground(new java.awt.Color(255, 255, 255));
        panEstoque.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtCadastrar.setText("Cadastrar");
        jbtCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtCadastrarActionPerformed(evt);
            }
        });
        panEstoque.add(jbtCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 110, 40));

        jbtExibir.setText("Exibir");
        jbtExibir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtExibir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExibirActionPerformed(evt);
            }
        });
        panEstoque.add(jbtExibir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 120, 40));

        jbtExcluir.setText("Excluir");
        jbtExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtExcluirActionPerformed(evt);
            }
        });
        panEstoque.add(jbtExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 120, 40));

        jbtAtualizar.setText("Atualizar");
        jbtAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtAtualizarActionPerformed(evt);
            }
        });
        panEstoque.add(jbtAtualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, 110, 40));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Tipo:");
        panEstoque.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 120, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Produto:");
        panEstoque.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 100, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Quantidade:");
        panEstoque.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 120, -1));

        txtQtd.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panEstoque.add(txtQtd, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 140, 40));

        txtNome.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panEstoque.add(txtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 140, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Registro de Estoque");
        panEstoque.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, 10, 940, -1));

        btnPesquisa.setText("Pesquisar");
        btnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisaActionPerformed(evt);
            }
        });
        panEstoque.add(btnPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 300, -1));

        tResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Produto", "Tipo", "Quantidade"
            }
        ));
        jScrollPane4.setViewportView(tResult);

        panEstoque.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 300, 240));

        txtStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panEstoque.add(txtStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 340, 30));

        txtTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Unidade", "Pacote" }));
        panEstoque.add(txtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 140, 39));

        txtId.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panEstoque.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 140, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("ID:");
        panEstoque.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 120, -1));

        panTelas.add(panEstoque, "Estoque");

        panRegistro.setBackground(new java.awt.Color(255, 255, 255));
        panRegistro.setPreferredSize(new java.awt.Dimension(1210, 516));
        panRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tResult1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Operação", "Produto", "Quantidade", "Data", "Horário"
            }
        ));
        jScrollPane5.setViewportView(tResult1);

        panRegistro.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 540, 370));

        jButton1.setText("Baixar Registro");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panRegistro.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 300, 40));

        panTelas.add(panRegistro, "Registro");

        getContentPane().add(panTelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 620, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void readJTable() {

        //Chama a classe DaoProduto
        DaoProduto pdao = new DaoProduto();

        //Cria um laço de repetição com os dados do paciente
        for (Produto p : pdao.read()) {
            boxProduto.addItem(p.getNome());
        }
    }
    
    private void btnVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVendaMouseClicked
        //Chama o Layou Clinico Geral
        CardLayout cl = (CardLayout) panTelas.getLayout();
        cl.show(panTelas, "Venda");
        //Quando clicado, o botão muda a cor para cinza
        btnVenda.setBackground(Color.LIGHT_GRAY);
        //e transforma os outros em branco
        btnRegistro.setBackground(Color.WHITE);
        btnEstoque.setBackground(Color.WHITE);
        btnSair.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnVendaMouseClicked

    private void btnRegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistroMouseClicked
        //Chama o Layou Enfermeiro
        CardLayout cl = (CardLayout) panTelas.getLayout();
        cl.show(panTelas, "Registro");
        //Quando clicado, o botão muda a cor para cinza
        btnRegistro.setBackground(Color.LIGHT_GRAY);
        //e transforma os outros em branco
        btnVenda.setBackground(Color.WHITE);
        btnEstoque.setBackground(Color.WHITE);
        btnSair.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnRegistroMouseClicked

    private void btnEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstoqueMouseClicked
        //Chama o Layou Odontologo
        CardLayout cl = (CardLayout) panTelas.getLayout();
        cl.show(panTelas, "Estoque");
        //Quando clicado, o botão muda a cor para cinza
        btnEstoque.setBackground(Color.LIGHT_GRAY);
        //e transforma os outros em branco
        btnRegistro.setBackground(Color.WHITE);
        btnVenda.setBackground(Color.WHITE);
        btnSair.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnEstoqueMouseClicked

    private void btnSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSairMouseClicked
        //Fecha a tela
        this.dispose();

    }//GEN-LAST:event_btnSairMouseClicked

    private void jbtCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtCadastrarActionPerformed
        //Cria um novo objeto/classe "PacienteCG"
        Produto produto = new Produto(txtNome.getText(), (int)txtQtd.getValue(), (String)txtTipo.getSelectedItem());

        //Chama o objeto/classe "CtrlPacienteCG"
        Controler control = new Controler();
        //Chama o método "salvar" na classe "CtrlPacienteCG"
        control.cadastrarProduto(produto);
        control.registrar(produto, "Reposição", getDate(), getTime());
        //Mostra a Mensagem de confirmação
        JOptionPane.showMessageDialog(this, "Paciente cadastrado com sucesso!");
    }//GEN-LAST:event_jbtCadastrarActionPerformed

    private void jbtExibirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExibirActionPerformed
        //Chama o objeto/classe "CtrlPacienteCG"
        Controler control = new Controler();
        
            //Chama o objeto/classe "PacienteCG" e mostra os dados do paciente pelo SUS
            Produto produto = control.getCtrlNome(txtNome.getText());
            //Se retornar um valor vazio é por que o registro não existe no BD
            //Mostra a mensagem dizendo que o paciente não está cadastrado
            if(produto.getNome() == null){
                JOptionPane.showMessageDialog(this, "Paciente Não Cadastrado!");
            }else{
                //Mostra os dados do PacienteCG
                JOptionPane.showMessageDialog(this,
                    "<html>__________________________<br>"
                    + "Nome: " + produto.getNome()
                    + "<br>__________________________<br>"
                    + "Quantidade: " + produto.getQtd()
                    + "<br>__________________________<br>"
                    + "Tipo: " + produto.getTipo()
                    + "<br>__________________________<br>"
                    + "ID: " + produto.getId()
                    + "<br>__________________________<br>" 
                    + "</html>");
            }
        
    }//GEN-LAST:event_jbtExibirActionPerformed

    private void jbtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtExcluirActionPerformed
        //Pergunta se o usuário realmente quer apagar
        Object[] options = { "Confirmar", "Cancelar" };
        int opcao = JOptionPane.showOptionDialog(null, "Deseja mesmo excluir esse registro?", "Confirmação", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, options, options[0]);
        //Se retornar o valor 0 ou seja "Confirmar" então o registro é apagado
        if(opcao == 0){
            //Chama o objeto/classe "CtrlPacienteCG"
            Controler control = new Controler();
            //Variável que recebe o retorno da classe CtrlPacienteCG
            boolean exluiu = control.excluirProduto(txtNome.getText());
            //Se for excluido, mostra essa mensagem
            if(exluiu){
                JOptionPane.showMessageDialog(this, "Excluido");
            }
        }

    }//GEN-LAST:event_jbtExcluirActionPerformed

    private void jbtAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtAtualizarActionPerformed
        //Chama o objeto/classe CtrlPacienteCG
        Controler control = new Controler();
        //Chama o objeto/classe PacienteCG
        Produto produto = new Produto((String)txtNome.getText(), (int)txtQtd.getValue(), (String)txtTipo.getSelectedItem());
        produto.setId((int)txtId.getValue());
        //Variável de retorno da classe
        boolean atualizou = control.updateProduto(produto);
        //Se atualizou, mostra essa mensagem
        if(atualizou){
            JOptionPane.showMessageDialog(this, "Registro atualizado");
        }
    }//GEN-LAST:event_jbtAtualizarActionPerformed

    private void btnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisaActionPerformed

        DaoProduto pdao = new DaoProduto();
        
        int linha = 0;
        int coluna = 0;
        
        for (Produto produto : pdao.readName(txtNome.getText())) {
            tResult.setValueAt(produto.getNome(), linha, coluna);
            coluna += 1;
            tResult.setValueAt(produto.getQtd(), linha, coluna);
            coluna += 1;
            tResult.setValueAt(produto.getTipo(), linha, coluna);
            coluna = 0;
            linha += 1;
        }
        
    }//GEN-LAST:event_btnPesquisaActionPerformed

    private String getDate() { 
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
	Date date = new Date(); 
	return dateFormat.format(date); 
    }
    
    private String getTime() { 
	DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss"); 
	Date date = new Date(); 
	return dateFormat.format(date); 
}
    
    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed

        String nome = (String) boxProduto.getSelectedItem();
        int qtd = (int) selecaoQtd.getValue();
        String tipo = (String) selecaoTipo.getSelectedItem();
        
        Produto produto = new Produto(nome, qtd, tipo);
        
        Controler control = new Controler();
        
        control.vender(produto);
        control.registrar(produto, "Venda", getDate(), getTime());
        
        areaResultado.setText("Venda realizada."+System.lineSeparator()+"Venda Registrada");

    }//GEN-LAST:event_btnVenderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        DaoProduto pdao = new DaoProduto();
        
        int linha = 0;
        int coluna = 0;
        
        for (Registro registro : pdao.readRegistro()) {
            tResult1.setValueAt(registro.getOperacao(), linha, coluna);
            coluna += 1;
            tResult1.setValueAt(registro.getProduto(), linha, coluna);
            coluna += 1;
            tResult1.setValueAt(registro.getQtd(), linha, coluna);
            coluna += 1;
            tResult1.setValueAt(registro.getDate(), linha, coluna);
            coluna += 1;
            tResult1.setValueAt(registro.getTime(), linha, coluna);
            coluna = 0;
            
            linha += 1;
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea areaResultado;
    private javax.swing.JComboBox<String> boxProduto;
    private javax.swing.JLabel btnEstoque;
    private javax.swing.JButton btnPesquisa;
    private javax.swing.JLabel btnRegistro;
    private javax.swing.JLabel btnSair;
    private javax.swing.JLabel btnVenda;
    private javax.swing.JButton btnVender;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton jbtAtualizar;
    private javax.swing.JButton jbtCadastrar;
    private javax.swing.JButton jbtExcluir;
    private javax.swing.JButton jbtExibir;
    private javax.swing.JLabel labelDesenvolvedor;
    private javax.swing.JLabel labelNome;
    private javax.swing.JLabel labelProduto;
    private javax.swing.JLabel labelQtd;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JPanel panEstoque;
    private javax.swing.JPanel panNave;
    private javax.swing.JPanel panRegistro;
    private javax.swing.JPanel panTelas;
    private javax.swing.JPanel panVenda;
    private javax.swing.JSpinner selecaoQtd;
    private javax.swing.JComboBox<String> selecaoTipo;
    private javax.swing.JTable tResult;
    private javax.swing.JTable tResult1;
    private javax.swing.JSpinner txtId;
    private javax.swing.JTextField txtNome;
    private javax.swing.JSpinner txtQtd;
    private javax.swing.JLabel txtStatus;
    private javax.swing.JComboBox<String> txtTipo;
    // End of variables declaration//GEN-END:variables
}
