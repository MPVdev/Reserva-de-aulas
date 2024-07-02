/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.login;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.MysqlDataTruncation;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.awt.Color;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

/**
 *
 * @author Yusak
 */
public class Usuarios extends javax.swing.JFrame {

    int xMouse, yMouse;

    public Usuarios() {
        initComponents();
        mostrar();

    }

    public void mostrar() {
        try {
            // Conectar a la base de datos
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/reservadeaulas", "root", "");

            // Realiza el comando Mysql
            String sql = "Select * from usuario";
            Statement st = null;
            DefaultTableModel model = new DefaultTableModel();
            //añadir el nombre de la columna
            model.addColumn("Cedula");
            model.addColumn("Nombre");
            model.addColumn("Apellido");
            model.addColumn("Correo");
            model.addColumn("Usuario");
            model.addColumn("Contraseña");
            TablaUsuario.setModel(model);

            String[] datos = new String[6];
            try {
                st = (Statement) conn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    datos[0] = rs.getString(1);
                    datos[1] = rs.getString(2);
                    datos[2] = rs.getString(3);
                    datos[3] = rs.getString(4);
                    datos[4] = rs.getString(5);
                    datos[5] = rs.getString(6);
                    model.addRow(datos);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            // Cerrar la conexión
            st.close();
            conn.close();
        } catch (SQLException e) {
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblEscudo2 = new javax.swing.JLabel();
        lblNomColegio = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblExit2 = new javax.swing.JLabel();
        lblCrearusuario = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblCrcontra = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lblCrNombre = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblCrcorreo = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        lblCrusuario = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lblCrapellido = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCedula = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JTextField();
        ButtonRegistroUsu = new javax.swing.JButton();
        ButtonEliminacionUsu = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaUsuario = new javax.swing.JTable();
        ButtonModificarUsuarios = new javax.swing.JButton();
        ButtonSalidaUsuarios = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(250, 243, 243));
        jPanel1.setPreferredSize(new java.awt.Dimension(930, 530));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(225, 229, 234));

        lblEscudo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/urcuqui (1).png"))); // NOI18N

        lblNomColegio.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 14)); // NOI18N
        lblNomColegio.setText("UNIDAD EDUCATIVA 'URCUQUI'");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblEscudo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNomColegio)
                .addGap(0, 708, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEscudo2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblNomColegio))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 29, 990, -1));

        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        lblExit2.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        lblExit2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit2.setText("X");
        lblExit2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExit2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExit2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExit2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblExit2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblExit2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        lblCrearusuario.setFont(new java.awt.Font("PMingLiU-ExtB", 1, 24)); // NOI18N
        lblCrearusuario.setForeground(new java.awt.Color(63, 183, 188));
        lblCrearusuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCrearusuario.setText("CREAR USUARIO");
        jPanel1.add(lblCrearusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        jPanel4.setBackground(new java.awt.Color(167, 187, 199));
        jPanel4.setPreferredSize(new java.awt.Dimension(56, 18));

        lblCrcontra.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 14)); // NOI18N
        lblCrcontra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCrcontra.setText("CONTRASEÑA");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCrcontra, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCrcontra, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 390, 100, 30));

        jPanel5.setBackground(new java.awt.Color(167, 187, 199));
        jPanel5.setPreferredSize(new java.awt.Dimension(56, 18));

        jLabel2.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("CEDULA");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 100, 30));

        jPanel6.setBackground(new java.awt.Color(167, 187, 199));
        jPanel6.setPreferredSize(new java.awt.Dimension(56, 18));

        lblCrNombre.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 14)); // NOI18N
        lblCrNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCrNombre.setText("NOMBRE");
        lblCrNombre.setToolTipText("");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCrNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCrNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 100, 30));

        jPanel7.setBackground(new java.awt.Color(167, 187, 199));
        jPanel7.setPreferredSize(new java.awt.Dimension(56, 18));

        lblCrcorreo.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 14)); // NOI18N
        lblCrcorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCrcorreo.setText("CORREO");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCrcorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCrcorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 100, 30));

        jPanel8.setBackground(new java.awt.Color(167, 187, 199));
        jPanel8.setPreferredSize(new java.awt.Dimension(56, 18));

        lblCrusuario.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 14)); // NOI18N
        lblCrusuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCrusuario.setText("USUARIO");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCrusuario, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCrusuario, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 100, 30));

        jPanel9.setBackground(new java.awt.Color(167, 187, 199));
        jPanel9.setPreferredSize(new java.awt.Dimension(56, 18));

        lblCrapellido.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 14)); // NOI18N
        lblCrapellido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCrapellido.setText("APELLIDO");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCrapellido, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCrapellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 100, 30));

        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 200, 30));

        txtCedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCedulaMousePressed(evt);
            }
        });
        jPanel1.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 200, 30));

        txtApellido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtApellidoMousePressed(evt);
            }
        });
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 200, 30));

        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCorreoMousePressed(evt);
            }
        });
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 200, 30));

        txtUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsuarioMousePressed(evt);
            }
        });
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 200, 30));

        txtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraseñaMousePressed(evt);
            }
        });
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 200, 30));

        ButtonRegistroUsu.setBackground(new java.awt.Color(218, 127, 143));
        ButtonRegistroUsu.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 14)); // NOI18N
        ButtonRegistroUsu.setText("REGISTRAR USUARIO");
        ButtonRegistroUsu.setBorder(null);
        ButtonRegistroUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRegistroUsuActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonRegistroUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 160, 30));

        ButtonEliminacionUsu.setBackground(new java.awt.Color(218, 127, 143));
        ButtonEliminacionUsu.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 14)); // NOI18N
        ButtonEliminacionUsu.setText("ELIMINAR");
        ButtonEliminacionUsu.setBorder(null);
        ButtonEliminacionUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEliminacionUsuActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonEliminacionUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 100, 30));

        TablaUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Cedula", "Nombre", "Apellido", "Correo", "Usuario", "Contraseña"
            }
        ));
        jScrollPane1.setViewportView(TablaUsuario);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 510, 240));

        ButtonModificarUsuarios.setBackground(new java.awt.Color(218, 127, 143));
        ButtonModificarUsuarios.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 14)); // NOI18N
        ButtonModificarUsuarios.setText("MODIFICAR");
        ButtonModificarUsuarios.setBorder(null);
        ButtonModificarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonModificarUsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonModificarUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 450, 100, 30));

        ButtonSalidaUsuarios.setBackground(new java.awt.Color(218, 127, 143));
        ButtonSalidaUsuarios.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 14)); // NOI18N
        ButtonSalidaUsuarios.setText("REGRESAR");
        ButtonSalidaUsuarios.setBorder(null);
        ButtonSalidaUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalidaUsuariosActionPerformed(evt);
            }
        });
        jPanel1.add(ButtonSalidaUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 992, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel3MousePressed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel3MouseDragged

    private void lblExit2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExit2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExit2MouseClicked

    private void lblExit2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExit2MouseEntered
        jPanel3.setBackground(Color.red);
        lblExit2.setForeground(Color.white);
    }//GEN-LAST:event_lblExit2MouseEntered

    private void lblExit2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExit2MouseExited
        jPanel3.setBackground(Color.white);
        lblExit2.setForeground(Color.black);
    }//GEN-LAST:event_lblExit2MouseExited

    private void txtCedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCedulaMousePressed


    }//GEN-LAST:event_txtCedulaMousePressed

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed

    }//GEN-LAST:event_txtNombreMousePressed

    private void txtApellidoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtApellidoMousePressed

    }//GEN-LAST:event_txtApellidoMousePressed

    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMousePressed

    }//GEN-LAST:event_txtCorreoMousePressed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtUsuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsuarioMousePressed

    }//GEN-LAST:event_txtUsuarioMousePressed

    private void txtContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMousePressed

    }//GEN-LAST:event_txtContraseñaMousePressed

    private void ButtonRegistroUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRegistroUsuActionPerformed
        try {
            // Conectar a la base de datos
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/reservadeaulas", "root", "");

            // Realiza el comando Mysql
            String sqlRegistro = "Insert Into usuario values (?,?,?,?,?,?)";
            PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sqlRegistro);
            stmt.setString(1, txtCedula.getText());
            stmt.setString(2, txtNombre.getText());
            stmt.setString(3, txtApellido.getText());
            stmt.setString(4, txtCorreo.getText());
            stmt.setString(5, txtUsuario.getText());
            stmt.setString(6, txtContraseña.getText());
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                // Mensaje de confirmación
                JOptionPane.showMessageDialog(null, "Registro Ingresado exitosamente");
            } else {
                // Mensaje de error
                JOptionPane.showMessageDialog(null, "La cedula no existe");
            }

            // Cerrar la conexión
            stmt.close();
            conn.close();
        } catch (MysqlDataTruncation e) {
            JOptionPane.showMessageDialog(null, "el valor cedula debe ser un numero");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        mostrar();
    }//GEN-LAST:event_ButtonRegistroUsuActionPerformed

    private void ButtonEliminacionUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEliminacionUsuActionPerformed
        try {
            // Conectar a la base de datos
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/reservadeaulas", "root", "");

            // Realiza el comando Mysql
            String sqlEliminacion = "delete from usuario where usu_id=?";
            PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sqlEliminacion);
            stmt.setString(1, txtCedula.getText());
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                // Mensaje de confirmación
                JOptionPane.showMessageDialog(null, "Registro Eliminado exitosamente");
            } else {
                // Mensaje de error
                JOptionPane.showMessageDialog(null, "La cedula no existe");
            }

            // Cerrar la conexión
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        mostrar();
    }//GEN-LAST:event_ButtonEliminacionUsuActionPerformed

    private void ButtonModificarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonModificarUsuariosActionPerformed
        try {
            // Conectar a la base de datos
            Connection conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/reservadeaulas", "root", "");

            // Realiza el comando Mysql
            String sqlUpdate = "update usuario set usu_nombre=?, usu_apellido=?, usu_correo=?, usu_usuario=?,usu_clave=? where usu_id=?";
            PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sqlUpdate);
            stmt.setString(1, txtNombre.getText());
            stmt.setString(2, txtApellido.getText());
            stmt.setString(3, txtCorreo.getText());
            stmt.setString(4, txtUsuario.getText());
            stmt.setString(5, txtContraseña.getText());
            stmt.setString(6, txtCedula.getText());
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                // Mensaje de confirmación
                JOptionPane.showMessageDialog(null, "Registro actualizado exitosamente");
            } else {
                // Mensaje de error
                JOptionPane.showMessageDialog(null, "La cedula no existe");
            }
            // Cerrar la conexión
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        mostrar();
    }//GEN-LAST:event_ButtonModificarUsuariosActionPerformed

    private void ButtonSalidaUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalidaUsuariosActionPerformed
        MenuAdmin nf3 = new MenuAdmin();
        nf3.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ButtonSalidaUsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEliminacionUsu;
    private javax.swing.JButton ButtonModificarUsuarios;
    private javax.swing.JButton ButtonRegistroUsu;
    private javax.swing.JButton ButtonSalidaUsuarios;
    private javax.swing.JTable TablaUsuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCrNombre;
    private javax.swing.JLabel lblCrapellido;
    private javax.swing.JLabel lblCrcontra;
    private javax.swing.JLabel lblCrcorreo;
    private javax.swing.JLabel lblCrearusuario;
    private javax.swing.JLabel lblCrusuario;
    private javax.swing.JLabel lblEscudo2;
    private javax.swing.JLabel lblExit2;
    private javax.swing.JLabel lblNomColegio;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
