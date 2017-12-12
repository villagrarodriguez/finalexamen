/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gvillena;

import com.google.gson.Gson;
import com.google.gson.stream.JsonWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractListModel;
import javax.swing.DefaultListModel;
import javax.swing.ListModel;
import javax.swing.SpinnerListModel;

/**
 *
 * @author alumno
 */
public class Tiendita extends javax.swing.JFrame {

    ArrayList<TelefonoMovil> ListaTelefonosMoviles;
    ArrayList<PlanPostPago> ListaPlanesPostPago;
                
    
    private void test() {            
        
        
        // Lista de Planes Post Pago
        ArrayList<PlanPostPago> listaPlanes = new ArrayList<PlanPostPago>();
        
        // Declaracion 
        PlanPostPago plan01; 
        PlanPostPago plan02; 
        PlanPostPago plan03; 
        
        // Inicializacion
        plan01 = new PlanPostPago();        
        plan02 = new PlanPostPago();
        plan03 = new PlanPostPago();
        
        // CLARO MAX 99        
        plan01.setCodigoPlan("CMX89");
        plan01.setNombrePlan("Claro MAX 99");
        plan01.setInternet(500);
        plan01.setMinutos(1000);        
        plan01.setRpc(10000);   
        plan01.setSms(500);
        
        // CLARO MAX 149        
        plan02.setCodigoPlan("CMX149");
        plan02.setNombrePlan("Claro MAX 149");
        plan02.setInternet(1000);
        plan02.setMinutos(3000);        
        plan02.setRpcIlimitado(true);        
        plan02.setSms(1000);
        
        // CLARO MAX 189        
        plan03.setCodigoPlan("CMX189");
        plan03.setNombrePlan("Claro MAX 189");
        plan03.setInternet(3000);
        plan03.setMinutosIlimitado(true);
        plan03.setRpcIlimitado(true);        
        plan03.setSmsIlimitado(true);        
        
        listaPlanes.add(plan01);
        listaPlanes.add(plan02);
        listaPlanes.add(plan03);
        
        for (PlanPostPago listaPlan : listaPlanes) 
        {
            System.out.println("NOMBRE PLAN: " + listaPlan.getNombrePlan());
        }
                
        Gson gson = new Gson();        
        String json = gson.toJson(listaPlanes);
        System.out.println(json);        
        
        JsonWriter writer;
        try         
        {
            writer = new JsonWriter(new FileWriter("D:\\jsonPlanes.txt"));
            writer.jsonValue(json);
            writer.flush();
        } catch (IOException ex) {
            Logger.getLogger(Tiendita.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
      //          
    /**
     * Creates new form MainForm
     */
    public Tiendita() {
        
        initComponents();
            
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Bienvenido ");
        // Inicializando
        ListaTelefonosMoviles = new ArrayList<TelefonoMovil>();
        ListaPlanesPostPago = new ArrayList<PlanPostPago>();                                      
                
        String jsonClaro = "";
        String jsonPlanes = "";
        
        Scanner scannerClaro;
        Scanner scannerPlanes;
                
        // 2
        try 
        {
            scannerClaro = new Scanner(new FileReader("D:\\jsonClaro.txt"));                                    
            scannerPlanes = new Scanner(new FileReader("D:\\jsonPlanes.txt"));
            
            StringBuilder sbClaro = new StringBuilder();                         
            
            while (scannerClaro.hasNext()) {                
                sbClaro.append(scannerClaro.next());
            }
            
            StringBuilder sbPlanes = new StringBuilder();            
            while (scannerPlanes.hasNext()) {
                sbPlanes.append(scannerPlanes.next());                
            }
            
            jsonClaro = sbClaro.toString();
            jsonPlanes = sbPlanes.toString();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tiendita.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // 
        Gson gson = new Gson();
        
        // 
        TelefonoMovil[] listaClaro = null;
        PlanPostPago[] listaPlanes = null;
        
        //
        listaClaro = gson.fromJson(jsonClaro, TelefonoMovil[].class);         
        listaPlanes = gson.fromJson(jsonPlanes, PlanPostPago[].class);         
        
        // 
        for (int i = 0; i < listaClaro.length; i++) {                        
            ListaTelefonosMoviles.add(listaClaro[i]);
        }
        
        //
        for (int i = 0; i < listaPlanes.length; i++) {                        
            ListaPlanesPostPago.add(listaPlanes[i]);
        }        
        
        // 
        for (PlanPostPago listaPlan : ListaPlanesPostPago) {                        
            
            System.out.println("");
            System.out.println("CODIGO      : " + listaPlan.getCodigoPlan());
            System.out.println("NOMBRE      : " + listaPlan.getNombrePlan());
            System.out.println("INTERNET    : " + listaPlan.getInternet());
            System.out.println("MINUTOS     : " + listaPlan.getMinutos());
            System.out.println("RPC         : " + listaPlan.getRpc());
            System.out.println("SMS         : " + listaPlan.getSms());            
            System.out.println("");
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        pblEquiposMovilles = new javax.swing.JScrollPane();
        lstEquiposMoviles = new javax.swing.JList();
        lblTEquiposMoviles = new javax.swing.JLabel();
        niidea = new javax.swing.JLabel();
        spPlanesPostpago = new javax.swing.JSpinner();
        lblDescripcion = new javax.swing.JLabel();
        plCaracteristicas = new javax.swing.JPanel();
        plPantalla = new javax.swing.JPanel();
        lblPantallaImg = new javax.swing.JLabel();
        lblPantalla = new javax.swing.JLabel();
        lblTPantalla = new javax.swing.JLabel();
        plCamara = new javax.swing.JPanel();
        lblCamara = new javax.swing.JLabel();
        lblCamaraImg = new javax.swing.JLabel();
        lblTCamara = new javax.swing.JLabel();
        plProcesador = new javax.swing.JPanel();
        lblProcesador = new javax.swing.JLabel();
        lblTProcesador = new javax.swing.JLabel();
        lblProcesadorImg = new javax.swing.JLabel();
        lblbebeficio = new javax.swing.JLabel();
        plBeneficiosPlan = new javax.swing.JPanel();
        plMinutos = new javax.swing.JPanel();
        lblMinutosT = new javax.swing.JLabel();
        lblMinutos = new javax.swing.JLabel();
        plInternet = new javax.swing.JPanel();
        lblInternetT = new javax.swing.JLabel();
        lblInternet = new javax.swing.JLabel();
        plRPC = new javax.swing.JPanel();
        lblRPCT = new javax.swing.JLabel();
        lblRPC = new javax.swing.JLabel();
        plSMS = new javax.swing.JPanel();
        lblSMST = new javax.swing.JLabel();
        lblSMS = new javax.swing.JLabel();
        jbCompra = new javax.swing.JButton();
        labelprecio = new javax.swing.JLabel();
        jnombreprecio = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(166, 37, 37));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lstEquiposMoviles.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstEquiposMoviles.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lstEquiposMovilesAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        lstEquiposMoviles.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEquiposMovilesValueChanged(evt);
            }
        });
        pblEquiposMovilles.setViewportView(lstEquiposMoviles);

        lblTEquiposMoviles.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lblTEquiposMoviles.setText("EQUIPOS DISPONIBLES");

        niidea.setFont(new java.awt.Font("Dialog", 1, 40)); // NOI18N
        niidea.setText("TIENDA CLARO");

        spPlanesPostpago.setFont(new java.awt.Font("Dialog", 1, 30)); // NOI18N
        spPlanesPostpago.setModel(new javax.swing.SpinnerListModel(new String[] {"Claro MAX 99", "Claro MAX 149", "Claro MAX 189"}));
        spPlanesPostpago.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spPlanesPostpagoStateChanged(evt);
            }
        });

        lblDescripcion.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        lblDescripcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDescripcion.setText("TELEFONO MOVIL");
        lblDescripcion.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                lblDescripcionAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        plPantalla.setPreferredSize(new java.awt.Dimension(250, 159));
        plPantalla.setLayout(new java.awt.GridBagLayout());

        lblPantallaImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPantallaImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon-pantalla.png"))); // NOI18N
        lblPantallaImg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 3, 0, 3);
        plPantalla.add(lblPantallaImg, gridBagConstraints);

        lblPantalla.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblPantalla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPantalla.setText("-");
        lblPantalla.setFocusable(false);
        lblPantalla.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        plPantalla.add(lblPantalla, new java.awt.GridBagConstraints());

        lblTPantalla.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTPantalla.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTPantalla.setText("PANTALLA");
        lblTPantalla.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTPantalla.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        plPantalla.add(lblTPantalla, gridBagConstraints);

        plCaracteristicas.add(plPantalla);

        plCamara.setPreferredSize(new java.awt.Dimension(250, 159));
        plCamara.setLayout(new java.awt.GridBagLayout());

        lblCamara.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblCamara.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCamara.setText("          -");
        plCamara.add(lblCamara, new java.awt.GridBagConstraints());

        lblCamaraImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon-camara.png"))); // NOI18N
        plCamara.add(lblCamaraImg, new java.awt.GridBagConstraints());

        lblTCamara.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTCamara.setText("CAMARA");
        plCamara.add(lblTCamara, new java.awt.GridBagConstraints());

        plCaracteristicas.add(plCamara);

        plProcesador.setPreferredSize(new java.awt.Dimension(250, 159));
        plProcesador.setLayout(new java.awt.GridBagLayout());

        lblProcesador.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblProcesador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProcesador.setText("-");
        lblProcesador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 6, 0, 0);
        plProcesador.add(lblProcesador, gridBagConstraints);

        lblTProcesador.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblTProcesador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTProcesador.setText("PROCESADOR");
        lblTProcesador.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        plProcesador.add(lblTProcesador, gridBagConstraints);

        lblProcesadorImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icon-procesador.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        plProcesador.add(lblProcesadorImg, gridBagConstraints);

        plCaracteristicas.add(plProcesador);

        lblbebeficio.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lblbebeficio.setText("¡Elige el mejor plan para ti!");

        java.awt.GridBagLayout plBeneficiosPlanLayout = new java.awt.GridBagLayout();
        plBeneficiosPlanLayout.columnWidths = new int[] {0, 4, 0};
        plBeneficiosPlanLayout.rowHeights = new int[] {0, 4, 0};
        plBeneficiosPlan.setLayout(plBeneficiosPlanLayout);

        plMinutos.setLayout(new java.awt.BorderLayout());

        lblMinutosT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblMinutosT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinutosT.setText("MINUTOS");
        plMinutos.add(lblMinutosT, java.awt.BorderLayout.CENTER);

        lblMinutos.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblMinutos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinutos.setText("Ilimitado");
        plMinutos.add(lblMinutos, java.awt.BorderLayout.PAGE_START);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(21, 29, 21, 29);
        plBeneficiosPlan.add(plMinutos, gridBagConstraints);

        plInternet.setLayout(new java.awt.BorderLayout());

        lblInternetT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblInternetT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInternetT.setText("INTERNET");
        plInternet.add(lblInternetT, java.awt.BorderLayout.PAGE_END);

        lblInternet.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblInternet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInternet.setText("Ilimitado");
        plInternet.add(lblInternet, java.awt.BorderLayout.PAGE_START);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(21, 29, 21, 29);
        plBeneficiosPlan.add(plInternet, gridBagConstraints);

        plRPC.setLayout(new java.awt.BorderLayout());

        lblRPCT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblRPCT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRPCT.setText("RPC");
        plRPC.add(lblRPCT, java.awt.BorderLayout.CENTER);

        lblRPC.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblRPC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRPC.setText("Ilimitado");
        plRPC.add(lblRPC, java.awt.BorderLayout.PAGE_START);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(21, 29, 21, 29);
        plBeneficiosPlan.add(plRPC, gridBagConstraints);

        plSMS.setLayout(new java.awt.BorderLayout());

        lblSMST.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblSMST.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSMST.setText("SMS");
        plSMS.add(lblSMST, java.awt.BorderLayout.CENTER);

        lblSMS.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblSMS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSMS.setText("Ilimitado");
        plSMS.add(lblSMS, java.awt.BorderLayout.PAGE_START);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(21, 29, 21, 29);
        plBeneficiosPlan.add(plSMS, gridBagConstraints);

        jbCompra.setText("Comprar");
        jbCompra.setBorder(null);
        jbCompra.setBorderPainted(false);
        jbCompra.setContentAreaFilled(false);
        jbCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbCompra.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbCompra.setIconTextGap(-3);
        jbCompra.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jbCompra.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCompraActionPerformed(evt);
            }
        });

        labelprecio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jnombreprecio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(niidea)
                .addGap(158, 158, 158)
                .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTEquiposMoviles)
                    .addComponent(pblEquiposMovilles, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(plCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(lblbebeficio, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(spPlanesPostpago, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(plBeneficiosPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(labelprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jnombreprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(niidea)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTEquiposMoviles, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(pblEquiposMovilles, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(plCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(lblbebeficio)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(spPlanesPostpago, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(plBeneficiosPlan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jnombreprecio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jbCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        //
        DefaultListModel<String> listaEquiposClaroModel = new DefaultListModel<String>();                
        for (TelefonoMovil telefonoMovil : ListaTelefonosMoviles) {
            listaEquiposClaroModel.addElement(telefonoMovil.getDescripcion());
        }                                
        lstEquiposMoviles.setModel(listaEquiposClaroModel);                
        
        //
        ArrayList<String> listaPlanesString = new ArrayList<String>();        
        for (PlanPostPago planPostPago : ListaPlanesPostPago) {
            listaPlanesString.add(planPostPago.getNombrePlan());
        }
        spPlanesPostpago.setModel(new SpinnerListModel(listaPlanesString));           
        
    }//GEN-LAST:event_formWindowOpened

    private void lstEquiposMovilesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEquiposMovilesValueChanged
        
        if (!evt.getValueIsAdjusting()) {
            int indiceSeleccionado = lstEquiposMoviles.getSelectedIndex();
            if (indiceSeleccionado != -1) {
                
                TelefonoMovil telMovSel = ListaTelefonosMoviles.get(indiceSeleccionado);                
                
                String descripcion = telMovSel.getDescripcion();
                String pantalla = telMovSel.getPantalla();
                String camara = telMovSel.getCamara();
                String procesador = telMovSel.getProcesador();
                
                lblDescripcion.setText(descripcion);
                lblPantalla.setText(pantalla);
                lblCamara.setText(camara);
                lblProcesador.setText(procesador);
            switch (indiceSeleccionado){
                
                  case 0:
                      labelprecio.setText("Precio :");
                    labelprecio.setText("S/ 3.200");
                    break;
                  case 1:
                       labelprecio.setText("Precio :");
                    labelprecio.setText("S/ 2.530");
                    break;
                    
            }
             
            }
        }
        

//        
//        if (!evt.getValueIsAdjusting()) {
//            if (btnClaro.isSelected()) {                
//                switch (lstEquiposMoviles.getSelectedIndex()) {
//                    case 0:
//                        System.out.println("CLARO 0");
//                        lblPantalla.setText("4.3\"");
//                        lblCamara.setText("6MP");
//                        lblProcesador.setText("1.3GHz");       
//                        lblDescripcion.setText("Galaxy S7 (Claro)");
//                        break;
//                    case 1:
//                        System.out.println("CLARO 1");
//                        lblPantalla.setText("6.2\"");
//                        lblCamara.setText("8MP");
//                        lblProcesador.setText("2.3GHz");                                                
//                        lblDescripcion.setText("iPhone 7 (Claro)");
//                        break;
//                    case 2:
//                        System.out.println("CLARO 2");
//                        lblPantalla.setText("7.3\"");
//                        lblCamara.setText("10MP");
//                        lblProcesador.setText("2.7GHz");                                                
//                        lblDescripcion.setText("LG k8 (Claro)");
//                        break;                    
//                }
//            }
//            else if (btnMovistar.isSelected())
//            {
//                switch (lstEquiposMoviles.getSelectedIndex()) {
//                    case 0:
//                        System.out.println("MOVISTAR 0");
//                        lblPantalla.setText("6.3\"");
//                        lblCamara.setText("5MP");
//                        lblProcesador.setText("1.7GHz");                                                
//                        lblDescripcion.setText("Galaxy S7 (Movistar)");
//                        break;
//                    case 1:
//                        System.out.println("MOVISTAR 1");
//                        lblPantalla.setText("4.3\"");
//                        lblCamara.setText("4MP");
//                        lblProcesador.setText("2.2GHz");                                                
//                        lblDescripcion.setText("iPhone 7 (Movistar)");
//                        break;
//                    case 2:
//                        System.out.println("MOVISTAR 2");
//                        lblPantalla.setText("5.1\"");
//                        lblCamara.setText("7MP");
//                        lblProcesador.setText("1.2GHz");          
//                        lblDescripcion.setText("LG k8 (Movistar)");
//                        break;                    
//                }
//            }
//        }
        
        
    }//GEN-LAST:event_lstEquiposMovilesValueChanged

    private void spPlanesPostpagoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spPlanesPostpagoStateChanged
                
        String planSeleccionado = String.valueOf(spPlanesPostpago.getValue());        
        
        for (PlanPostPago planPostPago : ListaPlanesPostPago) {
            if (planPostPago.getNombrePlan().equals(planSeleccionado)) {
                lblMinutos.setText(planPostPago.getMinutos());
                lblInternet.setText(planPostPago.getInternet());
                lblRPC.setText(planPostPago.getRpc());                
                lblSMS.setText(planPostPago.getSms());                        
            }
        }
        
                
        
    }//GEN-LAST:event_spPlanesPostpagoStateChanged

    private void jbCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCompraActionPerformed


pago p=new pago();
p.setVisible(true);
 dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jbCompraActionPerformed

    private void lblDescripcionAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lblDescripcionAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_lblDescripcionAncestorAdded

    private void lstEquiposMovilesAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_lstEquiposMovilesAncestorAdded
    



// TODO add your handling code here:
    }//GEN-LAST:event_lstEquiposMovilesAncestorAdded

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
            java.util.logging.Logger.getLogger(Tiendita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tiendita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tiendita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tiendita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Tiendita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jbCompra;
    private javax.swing.JLabel jnombreprecio;
    public static javax.swing.JLabel labelprecio;
    public static javax.swing.JLabel lblCamara;
    private javax.swing.JLabel lblCamaraImg;
    public static javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblInternet;
    private javax.swing.JLabel lblInternetT;
    private javax.swing.JLabel lblMinutos;
    private javax.swing.JLabel lblMinutosT;
    public static javax.swing.JLabel lblPantalla;
    private javax.swing.JLabel lblPantallaImg;
    public static javax.swing.JLabel lblProcesador;
    private javax.swing.JLabel lblProcesadorImg;
    private javax.swing.JLabel lblRPC;
    private javax.swing.JLabel lblRPCT;
    private javax.swing.JLabel lblSMS;
    private javax.swing.JLabel lblSMST;
    private javax.swing.JLabel lblTCamara;
    private javax.swing.JLabel lblTEquiposMoviles;
    private javax.swing.JLabel lblTPantalla;
    private javax.swing.JLabel lblTProcesador;
    private javax.swing.JLabel lblbebeficio;
    private javax.swing.JList lstEquiposMoviles;
    private javax.swing.JLabel niidea;
    private javax.swing.JScrollPane pblEquiposMovilles;
    private javax.swing.JPanel plBeneficiosPlan;
    private javax.swing.JPanel plCamara;
    private javax.swing.JPanel plCaracteristicas;
    private javax.swing.JPanel plInternet;
    private javax.swing.JPanel plMinutos;
    private javax.swing.JPanel plPantalla;
    private javax.swing.JPanel plProcesador;
    private javax.swing.JPanel plRPC;
    private javax.swing.JPanel plSMS;
    private javax.swing.JSpinner spPlanesPostpago;
    // End of variables declaration//GEN-END:variables

    
}
