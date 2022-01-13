package Jogo;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Yasmin Souza Camargo
 */
public class JogoDaVelha extends javax.swing.JFrame {

    boolean Jogador1Ativo = true;
    boolean Jogador2Ativo = false;

    int VitoriaDoJogador1 = 0;
    int VitoriaDoJogador2 = 0;
    int PartidasEmpatadas = 0;

    public JogoDaVelha() {
        initComponents();
        getContentPane().setBackground(Color.white);
        vezJogador.setText("JOGADOR 1"); //INDICA QUAL JOGADOR INICIA JOGANDO
    }

    public void JogadorAtivo() {
        if (Jogador1Ativo == true) {         //DEFINE QUEM SERÁ O JOGADOR QUE IRÁ JOGAR
            Jogador1Ativo = false;
            Jogador2Ativo = true;
            vezJogador.setText("JOGADOR 2"); //MOSTRA NA TELA A VEZ DE QUEM VAI JOGAR
        } else {
            Jogador1Ativo = true;
            Jogador2Ativo = false;
            vezJogador.setText("JOGADOR 1"); //MOSTRA NA TELA A VEZ DE QUEM VAI JOGAR
        }

        JogadorVencedor("X"); //Aqui pede para verificar se o jogador de X ganhou
        JogadorVencedor("O"); //Aqui pede para verificar se o jogador da O ganhou

    }

    public void JogadorVencedor(String Jogador) {
        // VERIFICA SE O JOGADOR GANHOU TESTANDO TODAS POSSIBILIDADES

        // **************** linha *************
        if (B1.getText().equals(Jogador) && B2.getText().equals(Jogador) && B3.getText().equals(Jogador)) {
            B1.setBackground(Color.green); //Muda a cor dos botões
            B2.setBackground(Color.green);
            B3.setBackground(Color.green);
            if (B1.getText().equals("X")) {
                Vencedor("Jogador 1"); //Se ele ganhou ele chama a mensagem que venceu

            } else {
                Vencedor("Jogador 2"); //Se ele ganhou ele chama a mensagem que venceu
            }
        }
        if (B4.getText().equals(Jogador) && B5.getText().equals(Jogador) && B6.getText().equals(Jogador)) {
            B4.setBackground(Color.green); //Muda a cor dos botões
            B5.setBackground(Color.green);
            B6.setBackground(Color.green);
            if (B4.getText().equals("X")) {
                Vencedor("Jogador 1"); //Se ele ganhou ele chama a mensagem que venceu
            } else {
                Vencedor("Jogador 2"); //Se ele ganhou ele chama a mensagem que venceu
            }
        }
        if (B7.getText().equals(Jogador) && B8.getText().equals(Jogador) && B9.getText().equals(Jogador)) {
            B7.setBackground(Color.green); //Muda a cor dos botões
            B8.setBackground(Color.green);
            B9.setBackground(Color.green);
            if (B7.getText().equals("X")) {
                Vencedor("Jogador 1"); //Se ele ganhou ele chama a mensagem que venceu
            } else {
                Vencedor("Jogador 2"); //Se ele ganhou ele chama a mensagem que venceu
            }
        }

        // **************** coluna *************
        if (B1.getText().equals(Jogador) && B4.getText().equals(Jogador) && B7.getText().equals(Jogador)) {
            B1.setBackground(Color.green); //Muda a cor dos botões
            B4.setBackground(Color.green);
            B7.setBackground(Color.green);
            if (B1.getText().equals("X")) {
                Vencedor("Jogador 1"); //Se ele ganhou ele chama a mensagem que venceu
            } else {
                Vencedor("Jogador 2"); //Se ele ganhou ele chama a mensagem que venceu
            }
        }
        if (B2.getText().equals(Jogador) && B5.getText().equals(Jogador) && B8.getText().equals(Jogador)) {
            B2.setBackground(Color.green); //Muda a cor dos botões
            B5.setBackground(Color.green);
            B8.setBackground(Color.green);
            if (B2.getText().equals("X")) {
                Vencedor("Jogador 1"); //Se ele ganhou ele chama a mensagem que venceu
            } else {
                Vencedor("Jogador 2"); //Se ele ganhou ele chama a mensagem que venceu
            }
        }
        if (B3.getText().equals(Jogador) && B6.getText().equals(Jogador) && B9.getText().equals(Jogador)) {
            B3.setBackground(Color.green); //Muda a cor dos botões
            B6.setBackground(Color.green);
            B9.setBackground(Color.green);
            if (B3.getText().equals("X")) {
                Vencedor("Jogador 1"); //Se ele ganhou ele chama a mensagem que venceu
            } else {
                Vencedor("Jogador 2"); //Se ele ganhou ele chama a mensagem que venceu
            }
        }

        // **************** diagonais *************
        if (B1.getText().equals(Jogador) && B5.getText().equals(Jogador) && B9.getText().equals(Jogador)) {
            B1.setBackground(Color.green); //Muda a cor dos botões
            B5.setBackground(Color.green);
            B9.setBackground(Color.green);
            if (B1.getText().equals("X")) {
                Vencedor("Jogador 1"); //Se ele ganhou ele chama a mensagem que venceu
            } else {
                Vencedor("Jogador 2"); //Se ele ganhou ele chama a mensagem que venceu
            }
        }
        if (B3.getText().equals(Jogador) && B5.getText().equals(Jogador) && B7.getText().equals(Jogador)) {
            B3.setBackground(Color.green); //Muda a cor dos botões
            B5.setBackground(Color.green);
            B7.setBackground(Color.green);
            if (B3.getText().equals("X")) {
                Vencedor("Jogador 1"); //Se ele ganhou ele chama a mensagem que venceu
            } else {
                Vencedor("Jogador 2"); //Se ele ganhou ele chama a mensagem que venceu
            }
        }

        // **************** empates *************
        if (!B1.getText().equals("") && !B2.getText().equals("") && !B3.getText().equals("")
                && !B4.getText().equals("") && !B5.getText().equals("") && !B6.getText().equals("")
                && !B7.getText().equals("") && !B8.getText().equals("") && !B9.getText().equals("")) {

            B1.setBackground(Color.red); //Muda a cor dos botões
            B2.setBackground(Color.red);
            B3.setBackground(Color.red);
            B4.setBackground(Color.red);
            B5.setBackground(Color.red);
            B6.setBackground(Color.red);
            B7.setBackground(Color.red);
            B8.setBackground(Color.red);
            B9.setBackground(Color.red);
            Vencedor("Empate");

        }

    }

    public void Vencedor(String JogadorVencedor) {
        //MENSAGEM AVISANDO QUAL JOGADOR GANHOU
        if (JogadorVencedor.equals("Jogador 1")) {
            JOptionPane.showMessageDialog(null, "Parabéns Jogador 1 \nVocê venceu o Jogo");
            VitoriaDoJogador1++; //incrementa o numero de vitorias do jogador 1
            NumeroDeVitoriasDoJogador1.setText("Número de vitórias: " + VitoriaDoJogador1);
            LimparCampos();
        }

        if (JogadorVencedor.equals("Jogador 2")) {
            JOptionPane.showMessageDialog(null, "Parabéns Jogador 2\nVocê venceu o Jogo");
            VitoriaDoJogador2++; //incrementa o numero de vitorias do jogador 2
            NumeroDeVitoriasDoJogador2.setText("Número de vitórias: " + VitoriaDoJogador2);
            LimparCampos();
        }

        if (JogadorVencedor.equals("Empate")) {
            JOptionPane.showMessageDialog(null, "Jogo Empatado\nJoguem Novamente!");
            PartidasEmpatadas++; //incrementa o numero de empates
            NumeroDeEmpates.setText("Número de empates: " + PartidasEmpatadas);
            LimparCampos();
        }

    }

    //LIMPA OS CAMPOS PARA INICIAR UM NOVO JOGO
    public void LimparCampos() {
        B1.setText("");
        B2.setText("");
        B3.setText("");
        B4.setText("");
        B5.setText("");
        B6.setText("");
        B7.setText("");
        B8.setText("");
        B9.setText("");

        Jogador1Ativo = true;
        Jogador2Ativo = false;
        vezJogador.setText("JOGADOR 1");

        B1.setBackground(Color.white);
        B2.setBackground(Color.white);
        B3.setBackground(Color.white);
        B4.setBackground(Color.white);
        B5.setBackground(Color.white);
        B6.setBackground(Color.white);
        B7.setBackground(Color.white);
        B8.setBackground(Color.white);
        B9.setBackground(Color.white);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        areaJogo = new javax.swing.JPanel();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        x = new javax.swing.JLabel();
        NumeroDeVitoriasDoJogador1 = new javax.swing.JLabel();
        o = new javax.swing.JLabel();
        NumeroDeVitoriasDoJogador2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        NumeroDeEmpates = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        nome1 = new javax.swing.JLabel();
        nome2 = new javax.swing.JLabel();
        NovoJogo = new javax.swing.JButton();
        SairDoJogo = new javax.swing.JButton();
        vezJogador = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Velha");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(489, 370));
        setResizable(false);
        getContentPane().setLayout(null);

        areaJogo.setBackground(new java.awt.Color(255, 255, 255));
        areaJogo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 102), 2, true));
        areaJogo.setForeground(new java.awt.Color(255, 51, 102));
        areaJogo.setLayout(null);

        B1.setBackground(new java.awt.Color(255, 255, 255));
        B1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        areaJogo.add(B1);
        B1.setBounds(11, 12, 73, 69);

        B2.setBackground(new java.awt.Color(255, 255, 255));
        B2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        areaJogo.add(B2);
        B2.setBounds(90, 12, 73, 69);

        B3.setBackground(new java.awt.Color(255, 255, 255));
        B3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        areaJogo.add(B3);
        B3.setBounds(169, 12, 77, 69);

        B4.setBackground(new java.awt.Color(255, 255, 255));
        B4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        areaJogo.add(B4);
        B4.setBounds(11, 87, 73, 66);

        B5.setBackground(new java.awt.Color(255, 255, 255));
        B5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });
        areaJogo.add(B5);
        B5.setBounds(90, 87, 73, 66);

        B6.setBackground(new java.awt.Color(255, 255, 255));
        B6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });
        areaJogo.add(B6);
        B6.setBounds(169, 87, 77, 66);

        B7.setBackground(new java.awt.Color(255, 255, 255));
        B7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });
        areaJogo.add(B7);
        B7.setBounds(11, 159, 73, 64);

        B8.setBackground(new java.awt.Color(255, 255, 255));
        B8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });
        areaJogo.add(B8);
        B8.setBounds(90, 159, 73, 64);

        B9.setBackground(new java.awt.Color(255, 255, 255));
        B9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });
        areaJogo.add(B9);
        B9.setBounds(173, 159, 73, 64);

        getContentPane().add(areaJogo);
        areaJogo.setBounds(210, 40, 260, 240);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações do jogo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Open Sans", 1, 14), new java.awt.Color(255, 51, 102))); // NOI18N
        jPanel2.setToolTipText("");
        jPanel2.setFont(new java.awt.Font("Open Sans", 1, 11)); // NOI18N

        x.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        x.setText("Simbolo: X");

        NumeroDeVitoriasDoJogador1.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        NumeroDeVitoriasDoJogador1.setText("Número de vitórias: 0");

        o.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        o.setText("Símbolo: O");

        NumeroDeVitoriasDoJogador2.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        NumeroDeVitoriasDoJogador2.setText("Número de vitórias: 0");

        jSeparator2.setBackground(new java.awt.Color(255, 51, 102));
        jSeparator2.setForeground(new java.awt.Color(255, 51, 102));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 102)));

        NumeroDeEmpates.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        NumeroDeEmpates.setText("Número de empates: 0");

        jSeparator3.setBackground(new java.awt.Color(255, 51, 102));
        jSeparator3.setForeground(new java.awt.Color(255, 51, 102));
        jSeparator3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 51, 102), 1, true));

        nome1.setFont(new java.awt.Font("Open Sans", 1, 11)); // NOI18N
        nome1.setText("Jogador 1");

        nome2.setFont(new java.awt.Font("Open Sans", 1, 11)); // NOI18N
        nome2.setText("Jogador 2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NumeroDeVitoriasDoJogador1)
                    .addComponent(NumeroDeVitoriasDoJogador2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 42, Short.MAX_VALUE))
            .addComponent(jSeparator3)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NumeroDeEmpates, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(nome1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(nome2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(o, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(x)
                    .addComponent(nome1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NumeroDeVitoriasDoJogador1)
                .addGap(9, 9, 9)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(o, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nome2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NumeroDeVitoriasDoJogador2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NumeroDeEmpates, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(20, 40, 180, 180);

        NovoJogo.setBackground(new java.awt.Color(204, 204, 204));
        NovoJogo.setFont(new java.awt.Font("Open Sans", 1, 11)); // NOI18N
        NovoJogo.setForeground(new java.awt.Color(255, 51, 102));
        NovoJogo.setText("Novo Jogo");
        NovoJogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                NovoJogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                NovoJogoMouseExited(evt);
            }
        });
        NovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoJogoActionPerformed(evt);
            }
        });
        getContentPane().add(NovoJogo);
        NovoJogo.setBounds(30, 220, 150, 30);

        SairDoJogo.setBackground(new java.awt.Color(255, 255, 255));
        SairDoJogo.setFont(new java.awt.Font("Open Sans", 1, 11)); // NOI18N
        SairDoJogo.setForeground(new java.awt.Color(255, 0, 102));
        SairDoJogo.setText("Sair");
        SairDoJogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SairDoJogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SairDoJogoMouseExited(evt);
            }
        });
        SairDoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairDoJogoActionPerformed(evt);
            }
        });
        getContentPane().add(SairDoJogo);
        SairDoJogo.setBounds(30, 250, 150, 30);

        vezJogador.setFont(new java.awt.Font("Open Sans", 1, 12)); // NOI18N
        vezJogador.setForeground(new java.awt.Color(0, 102, 255));
        vezJogador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                vezJogadorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                vezJogadorMouseExited(evt);
            }
        });
        getContentPane().add(vezJogador);
        vezJogador.setBounds(300, 290, 73, 20);

        getAccessibleContext().setAccessibleDescription("");

        setSize(new java.awt.Dimension(505, 372));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        if (Jogador1Ativo == true) {
            if (B1.getText().equals("")) { //TESTA PARA VER SE JA FOI PREENCHIDO
                B1.setText("X");
                JogadorAtivo(); //chama o método trocar de jogador
            }
        } else if (B1.getText().equals("")) {
            B1.setText("O");
            JogadorAtivo(); //chama o método trocar de jogador
        }

    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        if (Jogador1Ativo == true) {
            if (B2.getText().equals("")) { //TESTA PARA VER SE JA FOI PREENCHIDO
                B2.setText("X");
                JogadorAtivo(); //chama o método trocar de jogador
            }
        } else if (B2.getText().equals("")) {
            B2.setText("O");
            JogadorAtivo(); //chama o método trocar de jogador
        }

    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed

        if (Jogador1Ativo == true) {
            if (B3.getText().equals("")) { //TESTA PARA VER SE JA FOI PREENCHIDO
                B3.setText("X");
                JogadorAtivo(); //chama o método trocar de jogador
            }
        } else if (B3.getText().equals("")) {
            B3.setText("O");
            JogadorAtivo(); //chama o método trocar de jogador
        }

    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        if (Jogador1Ativo == true) {
            if (B4.getText().equals("")) { //TESTA PARA VER SE JA FOI PREENCHIDO
                B4.setText("X");
                JogadorAtivo(); //chama o método trocar de jogador
            }
        } else if (B4.getText().equals("")) {
            B4.setText("O");
            JogadorAtivo(); //chama o método trocar de jogador
        }

    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        if (Jogador1Ativo == true) {
            if (B5.getText().equals("")) { //TESTA PARA VER SE JA FOI PREENCHIDO
                B5.setText("X");
                JogadorAtivo(); //chama o método trocar de jogador
            }
        } else if (B5.getText().equals("")) {
            B5.setText("O");
            JogadorAtivo(); //chama o método trocar de jogador
        }
    }//GEN-LAST:event_B5ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        if (Jogador1Ativo == true) {
            if (B6.getText().equals("")) { //TESTA PARA VER SE JA FOI PREENCHIDO
                B6.setText("X");
                JogadorAtivo(); //chama o método trocar de jogador
            }
        } else if (B6.getText().equals("")) {
            B6.setText("O");
            JogadorAtivo(); //chama o método trocar de jogador
        }
    }//GEN-LAST:event_B6ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        if (Jogador1Ativo == true) {
            if (B7.getText().equals("")) { //TESTA PARA VER SE JA FOI PREENCHIDO
                B7.setText("X");
                JogadorAtivo(); //chama o método trocar de jogador
            }
        } else if (B7.getText().equals("")) {
            B7.setText("O");
            JogadorAtivo(); //chama o método trocar de jogador
        }

    }//GEN-LAST:event_B7ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        if (Jogador1Ativo == true) {
            if (B8.getText().equals("")) { //TESTA PARA VER SE JA FOI PREENCHIDO
                B8.setText("X");
                JogadorAtivo(); //chama o método trocar de jogador
            }
        } else if (B8.getText().equals("")) {
            B8.setText("O");
            JogadorAtivo(); //chama o método trocar de jogador
        }

    }//GEN-LAST:event_B8ActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        if (Jogador1Ativo == true) {
            if (B9.getText().equals("")) { //TESTA PARA VER SE JA FOI PREENCHIDO
                B9.setText("X");
                JogadorAtivo(); //chama o método trocar de jogador
            }
        } else if (B9.getText().equals("")) {
            B9.setText("O");
            JogadorAtivo(); //chama o método trocar de jogador
        }

    }//GEN-LAST:event_B9ActionPerformed

    private void NovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoJogoActionPerformed
        // TODO add your handling code here:
        LimparCampos();
        VitoriaDoJogador2 = 0;
        NumeroDeVitoriasDoJogador2.setText("Número de vitórias: " + VitoriaDoJogador2);
        VitoriaDoJogador1 = 0;
        NumeroDeVitoriasDoJogador1.setText("Número de vitórias: " + VitoriaDoJogador1);
        PartidasEmpatadas = 0;
        NumeroDeEmpates.setText("Número de empates: " + PartidasEmpatadas);

    }//GEN-LAST:event_NovoJogoActionPerformed

    private void SairDoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairDoJogoActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SairDoJogoActionPerformed

    private void NovoJogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NovoJogoMouseEntered
        // TODO add your handling code here:
        NovoJogo.setBackground(new Color(0, 102, 0));
        NovoJogo.setForeground(Color.white);
    }//GEN-LAST:event_NovoJogoMouseEntered

    private void NovoJogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NovoJogoMouseExited
        // TODO add your handling code here:
        NovoJogo.setBackground(Color.white);
        NovoJogo.setForeground(new Color(255, 0, 102));

    }//GEN-LAST:event_NovoJogoMouseExited

    private void SairDoJogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairDoJogoMouseEntered
        // TODO add your handling code here:
        SairDoJogo.setBackground(Color.red);
        SairDoJogo.setForeground(Color.white);
    }//GEN-LAST:event_SairDoJogoMouseEntered

    private void SairDoJogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairDoJogoMouseExited
        // TODO add your handling code here:
        SairDoJogo.setBackground(Color.white);
        SairDoJogo.setForeground(new Color(255, 0, 102));
    }//GEN-LAST:event_SairDoJogoMouseExited

    private void vezJogadorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vezJogadorMouseEntered
        // TODO add your handling code here:
        vezJogador.setForeground(Color.red);
    }//GEN-LAST:event_vezJogadorMouseEntered

    private void vezJogadorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vezJogadorMouseExited
        // TODO add your handling code here:
        vezJogador.setForeground(new Color(0, 102, 255));
    }//GEN-LAST:event_vezJogadorMouseExited

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
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaVelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JButton NovoJogo;
    private javax.swing.JLabel NumeroDeEmpates;
    private javax.swing.JLabel NumeroDeVitoriasDoJogador1;
    private javax.swing.JLabel NumeroDeVitoriasDoJogador2;
    private javax.swing.JButton SairDoJogo;
    private javax.swing.JPanel areaJogo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel nome1;
    private javax.swing.JLabel nome2;
    private javax.swing.JLabel o;
    private javax.swing.JLabel vezJogador;
    private javax.swing.JLabel x;
    // End of variables declaration//GEN-END:variables
}
