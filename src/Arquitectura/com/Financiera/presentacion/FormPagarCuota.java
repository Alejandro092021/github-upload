
package Arquitectura.com.Financiera.presentacion;

import Arquitectura.com.Financiera.aplicacion.GenerarPrestamoServicio;
import Arquitectura.com.Financiera.aplicacion.PagarCuotaServicio;
import Arquitectura.com.Financiera.dominio.Cliente;
import Arquitectura.com.Financiera.dominio.Cuota;
import Arquitectura.com.Financiera.dominio.Pago;
import Arquitectura.com.Financiera.dominio.Prestamo;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormPagarCuota extends javax.swing.JDialog {
    DefaultTableModel modelo = new DefaultTableModel();
    String[] titulosTabla = {"Periodo", "Fecha", "Saldo", "Amortizacion", "Interes", "Cuota", "Mora", "Estado", "Total A Pagar"};
    DecimalFormat formato = new DecimalFormat("#.00");
    ValidacionPresentacion validacion = new ValidacionPresentacion();

    Cliente cliente;
    Prestamo prestamo;

    public FormPagarCuota(FormMenu formMenu) {
        super(formMenu, true);
        initComponents();
        inicializar();
    }
    
    public void inicializar(){
        this.setLocationRelativeTo(null);
        modelo.setColumnIdentifiers(titulosTabla);
        tablaCronograma.getTableHeader().setBackground(new Color(102,102,102));
        tablaCronograma.getTableHeader().setForeground(new Color(255,255,255));
//        txtNombres.setEnabled(false);
//        txtApellidos.setEnabled(false);
//        txtVuelto.setEnabled(false);
        txtTotalAPagar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtBuscarDNI = new javax.swing.JTextField();
        btnBuscarClientePorDNI = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCronograma = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        txtTotalAPagar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtVuelto = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JToggleButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/cerrar.png"))); // NOI18N
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCerrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("DNI");

        txtBuscarDNI.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtBuscarDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarDNIKeyTyped(evt);
            }
        });

        btnBuscarClientePorDNI.setBackground(new java.awt.Color(102, 102, 102));
        btnBuscarClientePorDNI.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarClientePorDNI.setText("BUSCAR");
        btnBuscarClientePorDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClientePorDNIActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("NOMBRES");

        txtApellidos.setEditable(false);
        txtApellidos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("APELLIDOS");

        txtNombres.setEditable(false);
        txtNombres.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("CODIGO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCodigo)
                    .addComponent(txtNombres)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "CRONOGRAMA DE PAGOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        tablaCronograma.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablaCronograma.setModel(modelo);
        tablaCronograma.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tablaCronograma.setGridColor(new java.awt.Color(255, 255, 255));
        tablaCronograma.setRowHeight(20);
        tablaCronograma.setSelectionBackground(new java.awt.Color(204, 204, 204));
        tablaCronograma.setShowHorizontalLines(false);
        tablaCronograma.setShowVerticalLines(false);
        jScrollPane2.setViewportView(tablaCronograma);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Ingrese Total");

        txtTotalAPagar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTotalAPagar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTotalAPagarKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Vuelto");

        txtVuelto.setEditable(false);
        txtVuelto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        btnAceptar.setBackground(new java.awt.Color(153, 153, 153));
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("ACEPTAR");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(153, 153, 153));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscarClientePorDNI)
                .addContainerGap(285, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTotalAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtVuelto, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(181, 181, 181)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnBuscarClientePorDNI))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtVuelto, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtTotalAPagar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void btnBuscarClientePorDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClientePorDNIActionPerformed
        GenerarPrestamoServicio generarPrestamoServicio = new GenerarPrestamoServicio();
        txtVuelto.setText("");
        txtTotalAPagar.setText("");
        try {
            String dni = txtBuscarDNI.getText().trim();
            cliente = generarPrestamoServicio.buscarCliente(dni);
            if(cliente != null){
            txtCodigo.setText(String.valueOf(cliente.getCodigo()));
            txtNombres.setText(cliente.getNombre());
            txtApellidos.setText(cliente.getApellidos());
            llenarTablaCronograma();
            activarIngresarTotal();
            }else
                JOptionPane.showMessageDialog(null, "Cliente No Encontrado!");
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnBuscarClientePorDNIActionPerformed

//    private void llenarTablaCronograma() {
//        PagarCuotaServicio pagarCuotaServicio = new PagarCuotaServicio();
//        try {
//            prestamo = pagarCuotaServicio.buscarPrestamo(cliente.getDni());
//            if(prestamo != null){
//            System.out.println(prestamo.getCliente().getNombre());
//            listaCuotas = prestamo.getListaCuotas();
//            System.out.println(listaCuotas.size());
//            cuota = prestamo.obtenerPrimeraCuotaPendiente();
//            Pago pago = new Pago();
//            Object [][]matrizDatos = new Object[listaCuotas.size()+1][9];
//            llenarPrimeraFila(matrizDatos);
//            for (int i = 0; i < listaCuotas.size();i++) {
//                Cuota cuota = listaCuotas.get(i);
//                pago.setCuota(cuota);
//                matrizDatos[i+1][0] =  cuota.getNumero();
//                matrizDatos[i+1][1] =  cuota.getFecha();
//                matrizDatos[i+1][2] =  formato.format(cuota.getSaldo());
//                matrizDatos[i+1][3] =  formato.format(cuota.getAmortizacion());
//                matrizDatos[i+1][4] =  formato.format(cuota.getInteres());
//                matrizDatos[i+1][5] =  formato.format(cuota.getMonto());
//                matrizDatos[i+1][6] =  formato.format(pago.calcularMora());
//                matrizDatos[i+1][7] =  cuota.getEstado();
//                matrizDatos[i+1][8] =  formato.format(pago.calcularTotalAPagar());
//            }
//            modelo.setDataVector(matrizDatos, titulosTabla);
//            seleccionarFilaPrimeraCuotaPendiente(prestamo.obtenerPosicionPrimeraCuotaPendiente()+1);
//            }else{
//                modelo.setNumRows(0);
//                JOptionPane.showMessageDialog(null, "Sin Prestamos Pendientes");
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, e.getMessage());
//        }
//    }

    private void llenarTablaCronograma() {
        PagarCuotaServicio pagarCuotaServicio = new PagarCuotaServicio();
        try {
            prestamo = pagarCuotaServicio.buscarPrestamo(cliente.getDni());
            if(prestamo != null){
            List<Cuota> listaCuotas = prestamo.getListaCuotas();
            Object [][]matrizDatos = new Object[listaCuotas.size()+1][9];
            llenarPrimeraFila(matrizDatos);
            Pago pago = new Pago();
            for (int i = 0; i < listaCuotas.size();i++) {
                Cuota cuota = listaCuotas.get(i);
                pago.setCuota(cuota);
                matrizDatos[i+1][0] =  cuota.getNumero();
                matrizDatos[i+1][1] =  cuota.getFecha();
                matrizDatos[i+1][2] =  formato.format(cuota.getSaldo());
                matrizDatos[i+1][3] =  formato.format(cuota.getAmortizacion());
                matrizDatos[i+1][4] =  formato.format(cuota.getInteres());
                matrizDatos[i+1][5] =  formato.format(cuota.getMonto());
                matrizDatos[i+1][6] =  formato.format(pago.calcularMora());
                matrizDatos[i+1][7] =  cuota.getEstado();
                matrizDatos[i+1][8] =  formato.format(pago.calcularTotalAPagar());
        }
        modelo.setDataVector(matrizDatos, titulosTabla);
        seleccionarFilaPrimeraCuotaPendiente();
        }else{
                modelo.setNumRows(0);
                JOptionPane.showMessageDialog(null, "Sin Prestamos Pendientes!");
            }
        } catch (Exception e) {
        }
    }
    
    private void llenarPrimeraFila(Object[][] matrizDatos) {
        matrizDatos[0][0] =  0;
        matrizDatos[0][1] =  prestamo.getFecha();
        matrizDatos[0][2] =  prestamo.getMontoPrestado();
    }
    
    private void borrarTextos(){
        txtBuscarDNI.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtVuelto.setText("");
        txtTotalAPagar.setText("");
        txtCodigo.setText("");
    }
    
    private void inicializarVariables(){
        cliente = null;
        prestamo = null;
    }

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        PagarCuotaServicio servicio = new PagarCuotaServicio();
        Pago pago = new Pago();
        if(prestamo != null){
            Cuota cuota = prestamo.obtenerPrimeraCuotaPendiente();
            if(txtTotalAPagar.getText().trim().compareTo("") != 0){
            double montoRecibido = Double.parseDouble(txtTotalAPagar.getText());
            pago.setCuota(cuota);
            pago.setMonto(pago.calcularTotalAPagar());
            try {
                servicio.pagarCuota(pago, montoRecibido, cliente.getDni());
                JOptionPane.showMessageDialog(null, "El pago se registro con exito");
                txtVuelto.setText(formato.format(pago.calcularVuelto(montoRecibido)));
                llenarTablaCronograma();
                activarIngresarTotal();
            } catch (Exception e) {
            }
        }else
            JOptionPane.showMessageDialog(null, "Ingrese Total A Pagar!");
        }else
            JOptionPane.showMessageDialog(null, "Sin Cuotas Pendientes!");
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void activarIngresarTotal(){
        if(prestamo != null)
            txtTotalAPagar.setEnabled(true);
        else
            txtTotalAPagar.setEnabled(false);
    } 
    
    private void seleccionarFilaPrimeraCuotaPendiente(){
        int posicion = prestamo.obtenerPosicionPrimeraCuotaPendiente()+1;
        tablaCronograma.setRowSelectionInterval(posicion, posicion);
        tablaCronograma.setEnabled(false);
    }
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        borrarTextos();
        inicializarVariables();
        activarIngresarTotal();
        modelo.setNumRows(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtBuscarDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarDNIKeyTyped
        validacion.permitirSoloNumeros(evt);
    }//GEN-LAST:event_txtBuscarDNIKeyTyped

    private void txtTotalAPagarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTotalAPagarKeyTyped
        validacion.permitirNumerosDecimales(evt, txtTotalAPagar);
    }//GEN-LAST:event_txtTotalAPagarKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAceptar;
    private javax.swing.JToggleButton btnBuscarClientePorDNI;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaCronograma;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBuscarDNI;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTotalAPagar;
    private javax.swing.JTextField txtVuelto;
    // End of variables declaration//GEN-END:variables
}
