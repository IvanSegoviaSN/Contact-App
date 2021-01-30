
package gui;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

import persistenciadatos.Stream.Agenda;
import persistenciadatos.Stream.GestionDatos;

/**
 *
 * @author Ivan Segovia Sanz
 */

public class MainGUI extends javax.swing.JFrame {
    
    // Gestion de errores mediante enum, mas cómodo
    public enum msgErrores {
        NO_NOMBRE("    ¡ El campo 'Nombre' no puede estar vacío !"),
        NO_TELF("    ¡ El campo 'Teléfono' no puede estar vacío !"),
        NO_SELEC("    ¡ No has seleccionado ninguna fila !"),
        
        NO_FICHERO("    ¡ No se ha encontrado el fichero de contactos !"),
        NO_CONTACTO("    ¡ No se ha podido crear el contacto !"),
        NO_AGENDA("    ¡No se ha podido crear la agenda !"),
        
        ERROR("    ¡ Ha ocurrido un error !"),
        ERROR_CERRAR("    ¡ Ha ocurrido un error mientras se cerraba el programa !"),
        
        RESET("    Autor: Ivan Segovia Sanz");
        
        // Private y su getter para usarlo en otras futuras clases y así reutilizar.
        private final String error;
        
        msgErrores(String u) {
            this.error = u;
        }
        
        public String getError() {
            return error;
        }

    }
    
    public MainGUI() {
        
        // Diseño de la GUI
        try { 
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel"); 
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {}
        
        // Lanzador
        initComponents();
        
        // Despues de cargar los componentes, carga la estructura de la tabla
        cargarTabla();
        
        // Tamaño auto ajustable **
        super.setSize(super.getWidth(), 145);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        inicioContactos = new javax.swing.JPanel();
        cargarAgendaBoton = new javax.swing.JButton();
        contactosTexto = new javax.swing.JLabel();
        inicioDemo = new javax.swing.JPanel();
        importarDemoBoton = new javax.swing.JButton();
        demoTexto = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        nuevoContacto = new javax.swing.JButton();
        eliminarContacto = new javax.swing.JButton();
        salirBoton = new javax.swing.JButton();
        panelListaContactos = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaContenido = new javax.swing.JTable();
        panelNuevoContacto = new javax.swing.JPanel();
        nombreTexto = new javax.swing.JLabel();
        nombreCampo = new javax.swing.JFormattedTextField();
        telefonoTexto = new javax.swing.JLabel();
        telefonoCampo = new javax.swing.JFormattedTextField();
        guardarContactoBoton = new javax.swing.JButton();
        descartarContactoBoton = new javax.swing.JButton();
        cuadroAvisos = new javax.swing.JFormattedTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PersistenciaDatos");
        setAlwaysOnTop(true);
        setResizable(false);

        inicioContactos.setBackground(new java.awt.Color(255, 255, 255));
        inicioContactos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        inicioContactos.setPreferredSize(new java.awt.Dimension(185, 137));

        cargarAgendaBoton.setText("Cargar Agenda");
        cargarAgendaBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarAgendaBotonActionPerformed(evt);
            }
        });

        contactosTexto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        contactosTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        contactosTexto.setText("CONTACTOS");
        contactosTexto.setToolTipText("");

        javax.swing.GroupLayout inicioContactosLayout = new javax.swing.GroupLayout(inicioContactos);
        inicioContactos.setLayout(inicioContactosLayout);
        inicioContactosLayout.setHorizontalGroup(
            inicioContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioContactosLayout.createSequentialGroup()
                .addGroup(inicioContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inicioContactosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(contactosTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(inicioContactosLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(cargarAgendaBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        inicioContactosLayout.setVerticalGroup(
            inicioContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicioContactosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contactosTexto)
                .addGap(18, 18, 18)
                .addComponent(cargarAgendaBoton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        inicioDemo.setBackground(new java.awt.Color(255, 255, 255));
        inicioDemo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        inicioDemo.setPreferredSize(new java.awt.Dimension(185, 137));

        importarDemoBoton.setText("Importar Datos");
        importarDemoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importarDemoBotonActionPerformed(evt);
            }
        });

        demoTexto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        demoTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        demoTexto.setText("DATOS DEMO");
        demoTexto.setToolTipText("");

        javax.swing.GroupLayout inicioDemoLayout = new javax.swing.GroupLayout(inicioDemo);
        inicioDemo.setLayout(inicioDemoLayout);
        inicioDemoLayout.setHorizontalGroup(
            inicioDemoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inicioDemoLayout.createSequentialGroup()
                .addGroup(inicioDemoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inicioDemoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(demoTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(inicioDemoLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(importarDemoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 8, Short.MAX_VALUE)))
                .addContainerGap())
        );
        inicioDemoLayout.setVerticalGroup(
            inicioDemoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, inicioDemoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(demoTexto)
                .addGap(18, 18, 18)
                .addComponent(importarDemoBoton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelMenu.setVisible(false);
        panelMenu.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.light"));
        panelMenu.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelMenu.setPreferredSize(new java.awt.Dimension(185, 137));

        nuevoContacto.setText("Nuevo Contacto");
        nuevoContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoContactoActionPerformed(evt);
            }
        });

        eliminarContacto.setText("Eliminar Contacto");
        eliminarContacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarContactoActionPerformed(evt);
            }
        });

        salirBoton.setText("Salir");
        salirBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nuevoContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(eliminarContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salirBoton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salirBoton)
                    .addComponent(nuevoContacto)
                    .addComponent(eliminarContacto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelListaContactos.setVisible(false);
        panelListaContactos.setBackground(new java.awt.Color(255, 255, 255));
        panelListaContactos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelListaContactos.setPreferredSize(new java.awt.Dimension(185, 137));

        tablaContenido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombres", "Numeros"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tablaContenido);
        if (tablaContenido.getColumnModel().getColumnCount() > 0) {
            tablaContenido.getColumnModel().getColumn(0).setResizable(false);
            tablaContenido.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout panelListaContactosLayout = new javax.swing.GroupLayout(panelListaContactos);
        panelListaContactos.setLayout(panelListaContactosLayout);
        panelListaContactosLayout.setHorizontalGroup(
            panelListaContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
        );
        panelListaContactosLayout.setVerticalGroup(
            panelListaContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
        );

        panelNuevoContacto.setVisible(false);
        panelNuevoContacto.setBackground(new java.awt.Color(255, 255, 255));
        panelNuevoContacto.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        panelNuevoContacto.setPreferredSize(new java.awt.Dimension(185, 137));

        nombreTexto.setText("Nombre:");

        nombreCampo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreCampoActionPerformed(evt);
            }
        });

        telefonoTexto.setText("Teléfono:");

        telefonoCampo.setText("+34 ");

        guardarContactoBoton.setText("Guardar");
        guardarContactoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarContactoBotonActionPerformed(evt);
            }
        });

        descartarContactoBoton.setText("Volver");
        descartarContactoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descartarContactoBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelNuevoContactoLayout = new javax.swing.GroupLayout(panelNuevoContacto);
        panelNuevoContacto.setLayout(panelNuevoContactoLayout);
        panelNuevoContactoLayout.setHorizontalGroup(
            panelNuevoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNuevoContactoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelNuevoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNuevoContactoLayout.createSequentialGroup()
                        .addComponent(telefonoTexto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(telefonoCampo))
                    .addGroup(panelNuevoContactoLayout.createSequentialGroup()
                        .addComponent(nombreTexto)
                        .addGap(15, 15, 15)
                        .addComponent(nombreCampo)))
                .addGap(18, 18, 18)
                .addGroup(panelNuevoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(descartarContactoBoton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardarContactoBoton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panelNuevoContactoLayout.setVerticalGroup(
            panelNuevoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNuevoContactoLayout.createSequentialGroup()
                .addGroup(panelNuevoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNuevoContactoLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(panelNuevoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreTexto)))
                    .addGroup(panelNuevoContactoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(guardarContactoBoton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelNuevoContactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefonoCampo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(telefonoTexto)
                    .addComponent(descartarContactoBoton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        cuadroAvisos.setEditable(false);
        cuadroAvisos.setVisible(false);
        cuadroAvisos.setText("    Autor: Ivan Segovia Sanz");
        cuadroAvisos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadroAvisosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(panelMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(inicioContactos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(inicioDemo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(panelNuevoContacto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                        .addComponent(cuadroAvisos))
                    .addComponent(panelListaContactos, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inicioContactos, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inicioDemo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelListaContactos, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelNuevoContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(cuadroAvisos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarAgendaBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarAgendaBotonActionPerformed
        // Lanzador principal de la agenda
        cambioDiseno(true);
        
        // Lanzador de datos
        try {
            // Carga los datos y los vuelca en la tabla
            setearDatosTabla(GestionDatos.cargarAgenda());
            
        } catch (FileNotFoundException e) {
            cuadroAvisos.setText(msgErrores.NO_FICHERO.getError());
            
            try {
                // Creo la Agenda vacía en caso de que no exista.
                GestionDatos.crearAgenda();
                
            } catch (ClassNotFoundException | IOException ex) {
                cuadroAvisos.setText(msgErrores.NO_AGENDA.getError());
            }
            
        } catch (IOException | ClassNotFoundException ex) {
            cuadroAvisos.setText(msgErrores.ERROR.getError());
        }
    }//GEN-LAST:event_cargarAgendaBotonActionPerformed

    private void importarDemoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importarDemoBotonActionPerformed
        // Mecanismo para importar otro archivo, en este caso datos demo
        GestionDatos.demoData();
        
        importarDemoBoton.setText("¡ Importado !");
        importarDemoBoton.setEnabled(false);
    }//GEN-LAST:event_importarDemoBotonActionPerformed

    private void salirBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBotonActionPerformed
        // Se reestablece el menu para que haga la funcion de salida
        cambioNuevoContacto(false);
        cambioDiseno(false);
        resetearCampos();
        tablaModelo.setRowCount(0);
    }//GEN-LAST:event_salirBotonActionPerformed

    private void eliminarContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarContactoActionPerformed
        // Primero debemos comprobar si el usuario ha clicado algun registro.
        if (tablaContenido.getSelectedColumnCount() == 0) {
            cuadroAvisos.setText(msgErrores.NO_SELEC.getError());
        } else {
            // Trato una exception que saca cuando no encuentra registros.
            try {
                eliminarContacto();
                tablaModelo.removeRow(tablaContenido.getSelectedRow());
                
                cuadroAvisos.setText(msgErrores.RESET.getError());
                
            } catch (ArrayIndexOutOfBoundsException e) {
                cuadroAvisos.setText(msgErrores.NO_SELEC.getError());
                
            } catch (ClassNotFoundException | IOException ex) {
                cuadroAvisos.setText(msgErrores.ERROR.getError());
            }
        }
    }//GEN-LAST:event_eliminarContactoActionPerformed

    private void nuevoContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoContactoActionPerformed
        // Lanzador del panel contactos
        cambioNuevoContacto(true);
        
        cuadroAvisos.setText(msgErrores.RESET.getError());
    }//GEN-LAST:event_nuevoContactoActionPerformed

    private void cuadroAvisosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadroAvisosActionPerformed
        // Avisos / Errores gestionados por un Enum
    }//GEN-LAST:event_cuadroAvisosActionPerformed

    private void descartarContactoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descartarContactoBotonActionPerformed
        // Hace la misma funcion que salir, pero esta vez dentro de otro panel.
        cambioNuevoContacto(false);
        resetearCampos();
        
        cuadroAvisos.setText(msgErrores.RESET.getError());
    }//GEN-LAST:event_descartarContactoBotonActionPerformed

    private void guardarContactoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarContactoBotonActionPerformed
        // Comprueba lo introducido en los campos, nombre + num
        
        if (comprobarDatosContacto()) {
            try {
                // Envio el nombre y telefono
                GestionDatos.crearContacto(nombreCampo.getText(), telefonoCampo.getText());
                
            } catch (ClassNotFoundException | IOException ex) {
                cuadroAvisos.setText(msgErrores.NO_CONTACTO.getError());
            }
            
            // Reseteo la tabla y recargo datos
            // Esto lo hago para evitar un error, donde ocurre un evento extraño,
            // de esta forma recargo los datos al completo y no tengo que hacer mil
            // sistemas para insertar y recuperar datos en una tabla.
            
            tablaModelo.setRowCount(0);
            resetearCampos();
            
            try {
                setearDatosTabla(GestionDatos.cargarAgenda());
            } catch (ClassNotFoundException | IOException ex) {
                cuadroAvisos.setText(msgErrores.ERROR.getError());
            }
            
            cambioNuevoContacto(false);
        }
    }//GEN-LAST:event_guardarContactoBotonActionPerformed

    private void nombreCampoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreCampoActionPerformed

    }//GEN-LAST:event_nombreCampoActionPerformed
   
    public void setearDatosTabla(Agenda a) {
        a.getAgenda().forEach((c) -> {
            tablaModelo.addRow(new Object[]{c.getNombre(),c.getTelf()});
        });
    }
    
    public void eliminarContacto() throws ClassNotFoundException, IOException {
        GestionDatos.eliminarContacto(tablaModelo.getValueAt(tablaContenido.getSelectedRow(), tablaContenido.getSelectedColumn()).toString());
    }
    
    // Creo el modelo para editar la tabla
    private DefaultTableModel tablaModelo = new DefaultTableModel();
    
    // Genero las columnas y seteo el modelo
    private void cargarTabla(){
        tablaModelo.addColumn("Nombre");
        tablaModelo.addColumn("Numero");
        
        tablaContenido.setModel(tablaModelo);
    }
    
    private void resetearCampos() {
        nombreCampo.setText("");
        telefonoCampo.setText("+34 ");
    }
    
    // Los 3 siguientes métodos se encargan de todo el diseño, de ir ocultando y
    // mostrando los paneles, estan diseñados con '!(Valor Booleano)' para que sean
    // tanto recursivos como reutilizables para los distintos paneles
    
    private void cambioDiseno(Boolean d) {
        // Oculta antes de la carga de contactos
        inicioContactos.setVisible(!d);
        inicioDemo.setVisible(!d);
        
        // Modifica el panel (Solo hace de bonito) ** Auto ajusta el tamaño
        super.setSize(super.getWidth(), !d ? 145 : 300);
        
        // Muestra despues de la carga de contactos
        panelMenu.setVisible(d);
        panelListaContactos.setVisible(d);
        cuadroAvisos.setVisible(d);
    }
    
    private void cambioNuevoContacto(Boolean d) {
        panelNuevoContacto.setVisible(d);
        panelListaContactos.setVisible(!d);
        eliminarContacto.setEnabled(!d);
    }

    private void cambioEliminarContacto(Boolean d) {
        panelListaContactos.setVisible(!d);
        panelNuevoContacto.setVisible(!d);
    }
    
    // Simplemente, verifica que no esten los campos vacios
    private boolean comprobarDatosContacto() {
        if (nombreCampo.getText().isEmpty()) {
            cuadroAvisos.setText(msgErrores.NO_NOMBRE.getError());
        } else if (telefonoCampo.getText().isEmpty()) {
            cuadroAvisos.setText(msgErrores.NO_TELF.getError());
        } else {
            cuadroAvisos.setText(msgErrores.RESET.getError());
            return true;
        }
        return false;
    }
    
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cargarAgendaBoton;
    private javax.swing.JLabel contactosTexto;
    private javax.swing.JFormattedTextField cuadroAvisos;
    private javax.swing.JLabel demoTexto;
    private javax.swing.JButton descartarContactoBoton;
    private javax.swing.JButton eliminarContacto;
    private javax.swing.JButton guardarContactoBoton;
    private javax.swing.JButton importarDemoBoton;
    private javax.swing.JPanel inicioContactos;
    private javax.swing.JPanel inicioDemo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JFormattedTextField nombreCampo;
    private javax.swing.JLabel nombreTexto;
    private javax.swing.JButton nuevoContacto;
    private javax.swing.JPanel panelListaContactos;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelNuevoContacto;
    private javax.swing.JButton salirBoton;
    private javax.swing.JTable tablaContenido;
    private javax.swing.JFormattedTextField telefonoCampo;
    private javax.swing.JLabel telefonoTexto;
    // End of variables declaration//GEN-END:variables

}
