package calculadora;

public class Calculadora extends javax.swing.JFrame {

    private String cadenaNumeros = "";
    private String operacion = "nula";
    private double primerNumero, resultado;
    private boolean activado = true;
    private boolean punto = true;

    public Calculadora() {
        initComponents();
        this.setTitle("Calculadora");
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        botonC = new javax.swing.JButton();
        botonRaiz = new javax.swing.JButton();
        botonDivicion = new javax.swing.JButton();
        botonCE = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        bontonMultiplicar = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        botonRestar = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        botonSumar = new javax.swing.JButton();
        b = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        bontonPunto = new javax.swing.JButton();
        botonIgual = new javax.swing.JButton();
        etiquetaNumeros = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        etiquetaMuestra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(310, 464));

        Panel.setLayout(new java.awt.GridLayout(5, 4));

        botonC.setBackground(new java.awt.Color(255, 102, 51));
        botonC.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botonC.setForeground(new java.awt.Color(0, 0, 0));
        botonC.setText("C");
        botonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCActionPerformed(evt);
            }
        });
        Panel.add(botonC);

        botonRaiz.setBackground(new java.awt.Color(102, 153, 255));
        botonRaiz.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botonRaiz.setForeground(new java.awt.Color(0, 0, 0));
        botonRaiz.setText("√");
        botonRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRaizActionPerformed(evt);
            }
        });
        Panel.add(botonRaiz);

        botonDivicion.setBackground(new java.awt.Color(102, 153, 255));
        botonDivicion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botonDivicion.setForeground(new java.awt.Color(0, 0, 0));
        botonDivicion.setText("/");
        botonDivicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDivicionActionPerformed(evt);
            }
        });
        Panel.add(botonDivicion);

        botonCE.setBackground(new java.awt.Color(255, 102, 51));
        botonCE.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botonCE.setForeground(new java.awt.Color(0, 0, 0));
        botonCE.setText("CE");
        botonCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCEActionPerformed(evt);
            }
        });
        Panel.add(botonCE);

        jButton6.setBackground(new java.awt.Color(204, 204, 204));
        jButton6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(0, 0, 0));
        jButton6.setText("7");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        Panel.add(jButton6);

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 0));
        jButton3.setText("8");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        Panel.add(jButton3);

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setText("9");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        Panel.add(jButton4);

        bontonMultiplicar.setBackground(new java.awt.Color(102, 153, 255));
        bontonMultiplicar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        bontonMultiplicar.setForeground(new java.awt.Color(0, 0, 0));
        bontonMultiplicar.setText("X");
        bontonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bontonMultiplicarActionPerformed(evt);
            }
        });
        Panel.add(bontonMultiplicar);

        jButton7.setBackground(new java.awt.Color(204, 204, 204));
        jButton7.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(0, 0, 0));
        jButton7.setText("4");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        Panel.add(jButton7);

        jButton8.setBackground(new java.awt.Color(204, 204, 204));
        jButton8.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 0, 0));
        jButton8.setText("5");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        Panel.add(jButton8);

        jButton9.setBackground(new java.awt.Color(204, 204, 204));
        jButton9.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 0, 0));
        jButton9.setText("6");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        Panel.add(jButton9);

        botonRestar.setBackground(new java.awt.Color(102, 153, 255));
        botonRestar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botonRestar.setForeground(new java.awt.Color(0, 0, 0));
        botonRestar.setText("-");
        botonRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestarActionPerformed(evt);
            }
        });
        Panel.add(botonRestar);

        jButton12.setBackground(new java.awt.Color(204, 204, 204));
        jButton12.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 0, 0));
        jButton12.setText("1");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        Panel.add(jButton12);

        jButton13.setBackground(new java.awt.Color(204, 204, 204));
        jButton13.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton13.setForeground(new java.awt.Color(0, 0, 0));
        jButton13.setText("2");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        Panel.add(jButton13);

        jButton14.setBackground(new java.awt.Color(204, 204, 204));
        jButton14.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton14.setForeground(new java.awt.Color(0, 0, 0));
        jButton14.setText("3");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        Panel.add(jButton14);

        botonSumar.setBackground(new java.awt.Color(102, 153, 255));
        botonSumar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botonSumar.setForeground(new java.awt.Color(0, 0, 0));
        botonSumar.setText("+");
        botonSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSumarActionPerformed(evt);
            }
        });
        Panel.add(botonSumar);

        b.setBackground(new java.awt.Color(255, 102, 51));
        b.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        b.setForeground(new java.awt.Color(0, 0, 0));
        b.setText("+/-");
        b.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bActionPerformed(evt);
            }
        });
        Panel.add(b);

        jButton18.setBackground(new java.awt.Color(204, 204, 204));
        jButton18.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton18.setForeground(new java.awt.Color(0, 0, 0));
        jButton18.setText("0");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        Panel.add(jButton18);

        bontonPunto.setBackground(new java.awt.Color(102, 153, 255));
        bontonPunto.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        bontonPunto.setForeground(new java.awt.Color(0, 0, 0));
        bontonPunto.setText(".");
        bontonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bontonPuntoActionPerformed(evt);
            }
        });
        Panel.add(bontonPunto);

        botonIgual.setBackground(new java.awt.Color(102, 153, 255));
        botonIgual.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        botonIgual.setForeground(new java.awt.Color(0, 0, 0));
        botonIgual.setText("=");
        botonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIgualActionPerformed(evt);
            }
        });
        Panel.add(botonIgual);

        etiquetaNumeros.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        etiquetaNumeros.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        etiquetaNumeros.setText("0");

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        etiquetaMuestra.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        etiquetaMuestra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiquetaMuestra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(139, 139, 139))
                    .addComponent(etiquetaNumeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(etiquetaMuestra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(etiquetaNumeros, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //INICIO DEL CODIGO DE BOTONES*********************************************
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "7";
        } else {
            cadenaNumeros += "7";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "8";
        } else {
            cadenaNumeros += "8";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "9";
        } else {
            cadenaNumeros += "9";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "4";
        } else {
            cadenaNumeros += "4";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "5";
        } else {
            cadenaNumeros += "5";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "6";
        } else {
            cadenaNumeros += "6";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "1";
        } else {
            cadenaNumeros += "1";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "2";
        } else {
            cadenaNumeros += "2";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "3";
        } else {
            cadenaNumeros += "3";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        if (etiquetaNumeros.getText().equals("0")) {
            cadenaNumeros = "0";
        } else {
            cadenaNumeros += "0";
        }
        etiquetaNumeros.setText(cadenaNumeros);
        activado = true;
    }//GEN-LAST:event_jButton18ActionPerformed

    private void botonSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSumarActionPerformed
        if (activado == true) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + " + ");
            cadenaNumeros = "";
            operacion = "sumar";
            activado = false;
        }
    }//GEN-LAST:event_botonSumarActionPerformed

    private void botonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIgualActionPerformed
        double segundoNumero;

        if (operacion.equals("nula")) {
            etiquetaNumeros.setText(cadenaNumeros);
        } else if (operacion.equals("sumar")) {
            segundoNumero = Double.parseDouble(cadenaNumeros);
            resultado = primerNumero + segundoNumero;
            etiquetaNumeros.setText(String.format("% .2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "null";
        } else if (operacion.equals("restar")) {
            segundoNumero = Double.parseDouble(cadenaNumeros);
            resultado = primerNumero - segundoNumero;
            etiquetaNumeros.setText(String.format("% .2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "null";
        } else if (operacion.equals("multiplicar")) {
            segundoNumero = Double.parseDouble(cadenaNumeros);
            resultado = primerNumero * segundoNumero;
            etiquetaNumeros.setText(String.format("% .2f", resultado));
            cadenaNumeros = String.valueOf(resultado);
            operacion = "null";
        } else if (operacion.equals("dividir")) {
            segundoNumero = Double.parseDouble(cadenaNumeros);
            if (segundoNumero == 0) {
                etiquetaNumeros.setText("NoSeDividePor0");
            } else {
                resultado = primerNumero / segundoNumero;
                etiquetaNumeros.setText(String.format("% .2f", resultado));
                cadenaNumeros = String.valueOf(resultado);
                operacion = "null";
            }
            
            
        }
        etiquetaMuestra.setText("");
        activado = true;
    }//GEN-LAST:event_botonIgualActionPerformed

    private void bontonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bontonMultiplicarActionPerformed
        if (activado == true) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + " x ");
            cadenaNumeros = "";
            operacion = "multiplicar";
            activado = false;
        }
    }//GEN-LAST:event_bontonMultiplicarActionPerformed

    private void botonRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestarActionPerformed
        if (activado == true) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + " - ");
            cadenaNumeros = "";
            operacion = "restar";
            activado = false;
        }
    }//GEN-LAST:event_botonRestarActionPerformed

    private void botonDivicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDivicionActionPerformed
        if (activado == true) {
            primerNumero = Double.parseDouble(cadenaNumeros);
            etiquetaMuestra.setText(cadenaNumeros + " / ");
            cadenaNumeros = "";
            operacion = "dividir";
            activado = false; 
        }
    }//GEN-LAST:event_botonDivicionActionPerformed

    private void botonRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRaizActionPerformed
        primerNumero = Double.parseDouble(cadenaNumeros);
        etiquetaMuestra.setText("sqrt("+cadenaNumeros+")");
        resultado = Math.sqrt(primerNumero);
        etiquetaNumeros.setText(String.format("% .2f", resultado));
        cadenaNumeros = String.valueOf(resultado);
    }//GEN-LAST:event_botonRaizActionPerformed

    private void bontonPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bontonPuntoActionPerformed
        if(punto == true){
            if(cadenaNumeros.equals("")){
                cadenaNumeros = "0.";
            }else{
                cadenaNumeros += ".";
            }
            etiquetaNumeros.setText(cadenaNumeros);
            punto = false;
        }       
    }//GEN-LAST:event_bontonPuntoActionPerformed

    private void bActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bActionPerformed
        if(cadenaNumeros.charAt(0) != '-'){
            cadenaNumeros = "-" + cadenaNumeros;
        }else{
            cadenaNumeros = cadenaNumeros.substring(1, cadenaNumeros.length());
        }
        etiquetaNumeros.setText(cadenaNumeros);
    }//GEN-LAST:event_bActionPerformed

    private void botonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCActionPerformed
        etiquetaMuestra.setText("");
        etiquetaNumeros.setText("0");
        cadenaNumeros ="";
        operacion= "nula";
        activado = true;
        punto = true;
    }//GEN-LAST:event_botonCActionPerformed

    private void botonCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCEActionPerformed
        int tamaño = cadenaNumeros.length();
        if(tamaño > 0){
            if(tamaño == 1){
                cadenaNumeros = "0";
            }else{
                cadenaNumeros = cadenaNumeros.substring(0,cadenaNumeros.length() -1);
            }
            etiquetaNumeros.setText(cadenaNumeros);
        }
    }//GEN-LAST:event_botonCEActionPerformed

//FIN DEMII CODIGO DE LOS BOTONES******************************
    
    
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JButton b;
    private javax.swing.JButton bontonMultiplicar;
    private javax.swing.JButton bontonPunto;
    private javax.swing.JButton botonC;
    private javax.swing.JButton botonCE;
    private javax.swing.JButton botonDivicion;
    private javax.swing.JButton botonIgual;
    private javax.swing.JButton botonRaiz;
    private javax.swing.JButton botonRestar;
    private javax.swing.JButton botonSumar;
    private javax.swing.JLabel etiquetaMuestra;
    private javax.swing.JLabel etiquetaNumeros;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
