
package Arquitectura.com.Financiera.presentacion;
public class FormMenu extends javax.swing.JFrame {

    public FormMenu() {
        initComponents();
        this.setSize(600, 500);
        this.setLocationRelativeTo(null);
        subMenuGenerarPrestamo.setVisible(false);
        lblGenerarPrestamo.setVisible(false);
        subMenuPagarCuota.setVisible(false);
        lblPagarCuota.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        subMenuPagarCuota = new javax.swing.JPanel();
        lblPagarCuota = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();
        menuPrestamo = new javax.swing.JLabel();
        menuCuota = new javax.swing.JLabel();
        subMenuGenerarPrestamo = new javax.swing.JPanel();
        lblGenerarPrestamo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        subMenuPagarCuota.setBackground(new java.awt.Color(0, 0, 0));
        subMenuPagarCuota.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                subMenuPagarCuotaMouseMoved(evt);
            }
        });
        subMenuPagarCuota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                subMenuPagarCuotaMouseExited(evt);
            }
        });

        lblPagarCuota.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPagarCuota.setForeground(new java.awt.Color(255, 255, 255));
        lblPagarCuota.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPagarCuota.setText("PAGAR CUOTA");
        lblPagarCuota.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lblPagarCuota.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblPagarCuotaMouseMoved(evt);
            }
        });
        lblPagarCuota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPagarCuotaMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPagarCuotaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout subMenuPagarCuotaLayout = new javax.swing.GroupLayout(subMenuPagarCuota);
        subMenuPagarCuota.setLayout(subMenuPagarCuotaLayout);
        subMenuPagarCuotaLayout.setHorizontalGroup(
            subMenuPagarCuotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(subMenuPagarCuotaLayout.createSequentialGroup()
                .addComponent(lblPagarCuota, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        subMenuPagarCuotaLayout.setVerticalGroup(
            subMenuPagarCuotaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subMenuPagarCuotaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblPagarCuota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(subMenuPagarCuota, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 150, 30));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setAlignmentX(0.0F);
        jPanel6.setAlignmentY(0.0F);

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/cerrar.png"))); // NOI18N
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/minimizar.png"))); // NOI18N
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });

        menuPrestamo.setBackground(new java.awt.Color(0, 0, 0));
        menuPrestamo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        menuPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        menuPrestamo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuPrestamo.setText("PRESTAMO");
        menuPrestamo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                menuPrestamoMouseMoved(evt);
            }
        });
        menuPrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuPrestamoMouseExited(evt);
            }
        });

        menuCuota.setBackground(new java.awt.Color(0, 0, 0));
        menuCuota.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        menuCuota.setForeground(new java.awt.Color(255, 255, 255));
        menuCuota.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuCuota.setText("CUOTA");
        menuCuota.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                menuCuotaMouseMoved(evt);
            }
        });
        menuCuota.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                menuCuotaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(menuCuota, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 376, Short.MAX_VALUE)
                .addComponent(btnMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMinimizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(menuPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(menuCuota, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 40));

        subMenuGenerarPrestamo.setBackground(new java.awt.Color(0, 0, 0));
        subMenuGenerarPrestamo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                subMenuGenerarPrestamoMouseMoved(evt);
            }
        });
        subMenuGenerarPrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                subMenuGenerarPrestamoMouseExited(evt);
            }
        });

        lblGenerarPrestamo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblGenerarPrestamo.setForeground(new java.awt.Color(255, 255, 255));
        lblGenerarPrestamo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGenerarPrestamo.setText("GENERAR PRESTAMO");
        lblGenerarPrestamo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lblGenerarPrestamo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                lblGenerarPrestamoMouseMoved(evt);
            }
        });
        lblGenerarPrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblGenerarPrestamoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblGenerarPrestamoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout subMenuGenerarPrestamoLayout = new javax.swing.GroupLayout(subMenuGenerarPrestamo);
        subMenuGenerarPrestamo.setLayout(subMenuGenerarPrestamoLayout);
        subMenuGenerarPrestamoLayout.setHorizontalGroup(
            subMenuGenerarPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subMenuGenerarPrestamoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblGenerarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        subMenuGenerarPrestamoLayout.setVerticalGroup(
            subMenuGenerarPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, subMenuGenerarPrestamoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblGenerarPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(subMenuGenerarPrestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
       dispose();
       FormIniciarSesion formMenuPrincipal = new FormIniciarSesion();
       formMenuPrincipal.setVisible(true);
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        this.setState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void lblGenerarPrestamoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGenerarPrestamoMouseClicked
        FormGenerarPrestamo formGenerarPrestamo = new FormGenerarPrestamo(this);
        formGenerarPrestamo.setVisible(true);
    }//GEN-LAST:event_lblGenerarPrestamoMouseClicked

    private void menuPrestamoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPrestamoMouseMoved
        if(subMenuPagarCuota.isVisible() && lblPagarCuota.isVisible()){
            subMenuPagarCuota.setVisible(false);
            lblPagarCuota.setVisible(false);
        }
        subMenuGenerarPrestamo.setVisible(true);
        lblGenerarPrestamo.setVisible(true);
    }//GEN-LAST:event_menuPrestamoMouseMoved

    private void menuPrestamoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuPrestamoMouseExited
                
    }//GEN-LAST:event_menuPrestamoMouseExited

    private void subMenuPagarCuotaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subMenuPagarCuotaMouseMoved

    }//GEN-LAST:event_subMenuPagarCuotaMouseMoved

    private void lblGenerarPrestamoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGenerarPrestamoMouseExited
        if(subMenuGenerarPrestamo.isVisible() && lblGenerarPrestamo.isVisible()){
            subMenuGenerarPrestamo.setVisible(false);
            lblGenerarPrestamo.setVisible(false);
        }
    }//GEN-LAST:event_lblGenerarPrestamoMouseExited

    private void lblGenerarPrestamoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblGenerarPrestamoMouseMoved
        
    }//GEN-LAST:event_lblGenerarPrestamoMouseMoved

    private void subMenuPagarCuotaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subMenuPagarCuotaMouseExited

    }//GEN-LAST:event_subMenuPagarCuotaMouseExited

    private void menuCuotaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCuotaMouseMoved
        if(subMenuGenerarPrestamo.isVisible() && lblGenerarPrestamo.isVisible()){
            subMenuGenerarPrestamo.setVisible(false);
            lblGenerarPrestamo.setVisible(false);
        }
        subMenuPagarCuota.setVisible(true);
        lblPagarCuota.setVisible(true);
    }//GEN-LAST:event_menuCuotaMouseMoved

    private void menuCuotaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCuotaMouseExited
       
    }//GEN-LAST:event_menuCuotaMouseExited

    private void subMenuGenerarPrestamoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subMenuGenerarPrestamoMouseMoved
        
    }//GEN-LAST:event_subMenuGenerarPrestamoMouseMoved

    private void subMenuGenerarPrestamoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_subMenuGenerarPrestamoMouseExited
        
    }//GEN-LAST:event_subMenuGenerarPrestamoMouseExited

    private void lblPagarCuotaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPagarCuotaMouseMoved
        
    }//GEN-LAST:event_lblPagarCuotaMouseMoved

    private void lblPagarCuotaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPagarCuotaMouseClicked
        FormPagarCuota formPagarCuota = new FormPagarCuota(this);
        formPagarCuota.setVisible(true);
    }//GEN-LAST:event_lblPagarCuotaMouseClicked

    private void lblPagarCuotaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPagarCuotaMouseExited
        if(subMenuPagarCuota.isVisible() && lblPagarCuota.isVisible()){
            subMenuPagarCuota.setVisible(false);
            lblPagarCuota.setVisible(false);
        }
    }//GEN-LAST:event_lblPagarCuotaMouseExited

//    public static void main(String args[]) {
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FormMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FormMenu().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblGenerarPrestamo;
    private javax.swing.JLabel lblPagarCuota;
    private javax.swing.JLabel menuCuota;
    private javax.swing.JLabel menuPrestamo;
    private javax.swing.JPanel subMenuGenerarPrestamo;
    private javax.swing.JPanel subMenuPagarCuota;
    // End of variables declaration//GEN-END:variables
}
