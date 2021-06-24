
package Arquitectura.com.Financiera.presentacion;

import Arquitectura.com.Financiera.aplicacion.GenerarPrestamoServicio;
import Arquitectura.com.Financiera.dominio.Cliente;
import Arquitectura.com.Financiera.dominio.Cuota;
import Arquitectura.com.Financiera.dominio.Prestamo;
import java.awt.Color;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormGenerarPrestamo extends javax.swing.JDialog {
    Cliente cliente; 
    Prestamo prestamo;
    DefaultTableModel modelo = new DefaultTableModel();
    String[] cabecera = {"Periodo","Fecha","Saldo","Amortizacion","Interes","Cuota"};
    DecimalFormat formato = new DecimalFormat("#.00");
    ValidacionPresentacion validacion = new ValidacionPresentacion();

    public FormGenerarPrestamo(FormMenu formMenu) {
        super(formMenu, true);
        initComponents();
        inicializar();
    }
    
    public void inicializar(){
        this.setLocationRelativeTo(null);
        modelo.setColumnIdentifiers(cabecera);
        tablaCronograma.getTableHeader().setBackground(new Color(102,102,102));
        tablaCronograma.getTableHeader().setForeground(new Color(255,255,255));
        tablaCronograma.getTableHeader().setEnabled(false);
//        txtNombres.setEnabled(false);
//        txtApellidos.setEnabled(false);
        inicializarVariables();
        desactivarBotones();
    }
    
    public void borrarTextos(){
        txtMonto.setText("");
        txtTEA.setText("");
        txtPeiodo.setText("");
        txtCodigo.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtBuscarDNI.setText("");
    }
    
    public void inicializarVariables(){
        cliente = null;
        prestamo = null;
    }
    
    public void desactivarBotones(){
        txtMonto.setEnabled(false);
        txtTEA.setEnabled(false);
        txtPeiodo.setEditable(false);
        btnGenerarCronograma.setEnabled(false);
        btnGuardar.setEnabled(false);
    }
    
    public void activarBotones(){
        if(!cliente.getPrestamoPendiente()){
            txtMonto.setEnabled(true);
            txtTEA.setEnabled(true);
            txtPeiodo.setEditable(true);
            btnGenerarCronograma.setEnabled(true);
            btnGuardar.setEnabled(true);
        }else{
            desactivarBotones();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBuscarDNI = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCronograma = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtTEA = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtPeiodo = new javax.swing.JTextField();
        btnGenerarCronograma = new javax.swing.JToggleButton();
        btnBuscarClientePorDNI = new javax.swing.JToggleButton();
        btnGuardar = new javax.swing.JToggleButton();
        btnCancelar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "CLIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("NOMBRES");

        txtApellidos.setEditable(false);
        txtApellidos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("APELLIDOS");

        txtNombres.setEditable(false);
        txtNombres.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("CODIGO");

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(38, 38, 38)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(txtApellidos))))
                .addContainerGap(293, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("DNI");

        txtBuscarDNI.setBackground(new java.awt.Color(240, 240, 240));
        txtBuscarDNI.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtBuscarDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarDNIActionPerformed(evt);
            }
        });
        txtBuscarDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarDNIKeyTyped(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "CRONOGRAMA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        tablaCronograma.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablaCronograma.setModel(modelo);
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
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)), "PRESTAMO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("MONTO");

        txtTEA.setBackground(new java.awt.Color(240, 240, 240));
        txtTEA.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtTEA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTEAKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("TEA");

        txtMonto.setBackground(new java.awt.Color(240, 240, 240));
        txtMonto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtMonto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontoKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("PERIODO");

        txtPeiodo.setBackground(new java.awt.Color(240, 240, 240));
        txtPeiodo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtPeiodo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPeiodoKeyTyped(evt);
            }
        });

        btnGenerarCronograma.setBackground(new java.awt.Color(102, 102, 102));
        btnGenerarCronograma.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarCronograma.setText("GENERAR CRONOGRAMA");
        btnGenerarCronograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarCronogramaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9))
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtTEA, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMonto, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPeiodo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(btnGenerarCronograma)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(btnGenerarCronograma))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTEA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPeiodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnBuscarClientePorDNI.setBackground(new java.awt.Color(102, 102, 102));
        btnBuscarClientePorDNI.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarClientePorDNI.setText("BUSCAR");
        btnBuscarClientePorDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClientePorDNIActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(102, 102, 102));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("GUARDAR");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(102, 102, 102));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Iconos/cerrar.png"))); // NOI18N
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)))
                .addContainerGap())
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txtBuscarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscarClientePorDNI)
                .addContainerGap(270, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnBuscarClientePorDNI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarClientePorDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClientePorDNIActionPerformed
        GenerarPrestamoServicio servicio = new GenerarPrestamoServicio();
        try {
            cliente = servicio.buscarCliente(txtBuscarDNI.getText().trim());
            txtCodigo.setText(String.valueOf(cliente.getCodigo()));
            txtNombres.setText(cliente.getNombre());
            txtApellidos.setText(cliente.getApellidos());
            activarBotones();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnBuscarClientePorDNIActionPerformed

    private void btnGenerarCronogramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarCronogramaActionPerformed
        if(!estanVaciosCamposPrestamo()){
            GenerarPrestamoServicio servicio = new GenerarPrestamoServicio();
            List<Cuota> listaCuotas;
            double monto = Double.parseDouble(txtMonto.getText().trim());
            double tea = Double.parseDouble(txtTEA.getText());
            int periodo = Integer.parseInt(txtPeiodo.getText());
            prestamo = new Prestamo(monto, tea, periodo, cliente);
            try {
                listaCuotas = servicio.generarCronograma(prestamo);
                int numeroCuotas = listaCuotas.size();
                Object [][]matrizDatos = new Object[numeroCuotas+1][6];
                llenarPrimeraFila(matrizDatos);
                for (int i = 0; i < numeroCuotas;i++) {
                    Cuota cuota = listaCuotas.get(i);
                    matrizDatos[i+1][0] =  cuota.getNumero();
                    matrizDatos[i+1][1] =  cuota.getFecha();
                    matrizDatos[i+1][2] =  formato.format(cuota.getSaldo());
                    matrizDatos[i+1][3] =  formato.format(cuota.getAmortizacion());
                    matrizDatos[i+1][4] =  formato.format(cuota.getInteres());
                    matrizDatos[i+1][5] =  formato.format(cuota.getMonto());
                }
                modelo.setDataVector(matrizDatos, cabecera);
            } catch (Exception ex) {
                
            }
        }else
            JOptionPane.showMessageDialog(null, "Faltan llenar datos");
    }//GEN-LAST:event_btnGenerarCronogramaActionPerformed

    private void llenarPrimeraFila(Object matrizDatos[][]){
        matrizDatos[0][0] =  0;
        matrizDatos[0][1] =  prestamo.getFecha();
        matrizDatos[0][2] =  prestamo.getMontoPrestado();
    }
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(prestamo!=null){
            GenerarPrestamoServicio servicio = new GenerarPrestamoServicio();
            try {
                servicio.guardarPrestamo(prestamo);
            } catch (Exception e) {
            }
            inicializarVariables();
            borrarTextos();
            desactivarBotones();
            modelo.setNumRows(0);
         }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private boolean estanVaciosCamposPrestamo(){
        return txtMonto.getText().trim().compareTo("") == 0 && txtTEA.getText().trim().compareTo("") == 0 && txtPeiodo.getText().trim().compareTo("") == 0;
    }
    
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        inicializarVariables();
        borrarTextos();
        modelo.setNumRows(0);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btnCerrarMouseClicked

    private void txtMontoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontoKeyTyped
            validacion.permitirSoloNumeros(evt);
    }//GEN-LAST:event_txtMontoKeyTyped

    private void txtTEAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTEAKeyTyped
            validacion.permitirNumerosDecimales(evt, txtTEA);
    }//GEN-LAST:event_txtTEAKeyTyped

    private void txtPeiodoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPeiodoKeyTyped
            validacion.permitirSoloNumeros(evt);
    }//GEN-LAST:event_txtPeiodoKeyTyped

    private void txtBuscarDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarDNIKeyTyped
            validacion.permitirSoloOchoNumeros(evt, txtBuscarDNI);
    }//GEN-LAST:event_txtBuscarDNIKeyTyped

    private void txtBuscarDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarDNIActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBuscarClientePorDNI;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JToggleButton btnGenerarCronograma;
    private javax.swing.JToggleButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaCronograma;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBuscarDNI;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtMonto;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtPeiodo;
    private javax.swing.JTextField txtTEA;
    // End of variables declaration//GEN-END:variables
}
