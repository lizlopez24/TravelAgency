/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.desarrollo.vista;

import com.desarrollo.controlador.ControladorTravels;
import com.desarrollo.model.TravelsDTO;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javax.swing.JOptionPane;

public class WindowTravelPackage extends javax.swing.JFrame {

    private ControladorTravels controlador = new ControladorTravels();

    private Validations validate = new Validations();

    public WindowTravelPackage() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public void changeHotel() {
        jCBHotel.removeAllItems();
        if (jCBDestination.getSelectedIndex() == 1) {
            jCBHotel.addItem("Seleccione");
            jCBHotel.addItem("Selina Cancun");
            jCBHotel.addItem("Mayan Monkey");
            jCBHotel.addItem("Aquamarina Beach");
        }
        if (jCBDestination.getSelectedIndex() == 2) {
            jCBHotel.addItem("Seleccione");
            jCBHotel.addItem("The Clock Hostel");
            jCBHotel.addItem("Ibis Hotel Cartagena");
            jCBHotel.addItem("Charleston Santa Teresa");
        }
        if (jCBDestination.getSelectedIndex() == 3) {
            jCBHotel.addItem("Seleccione");
            jCBHotel.addItem("Skully's");
            jCBHotel.addItem("Wyndham Garden");
            jCBHotel.addItem("Hotel Riu Plaza");
        }
    }

    public double valorHotel() {
        double valorHotel, valorHA = 0, valorHC = 0, valorHJ = 0;
        if (jCBDestination.getSelectedIndex() == 1 && jCBHotel.getSelectedIndex() == 1) {
            valorHA = TravelsDTO.GET_VALUE_DESTINATION(0, 0) * (int) jSpinnerAdults.getValue();
            valorHC = TravelsDTO.GET_VALUE_DESTINATION(0, 1) * (int) jSpinnerChildren.getValue();
            valorHJ = TravelsDTO.GET_VALUE_DESTINATION(0, 2) * (int) jSpinnerJubilate.getValue();
        }
        if (jCBDestination.getSelectedIndex() == 1 && jCBHotel.getSelectedIndex() == 2) {
            valorHA = TravelsDTO.GET_VALUE_DESTINATION(1, 0) * (int) jSpinnerAdults.getValue();
            valorHC = TravelsDTO.GET_VALUE_DESTINATION(1, 1) * (int) jSpinnerChildren.getValue();
            valorHJ = TravelsDTO.GET_VALUE_DESTINATION(1, 2) * (int) jSpinnerJubilate.getValue();
        }
        if (jCBDestination.getSelectedIndex() == 1 && jCBHotel.getSelectedIndex() == 3) {
            valorHA = TravelsDTO.GET_VALUE_DESTINATION(2, 0) * (int) jSpinnerAdults.getValue();
            valorHC = TravelsDTO.GET_VALUE_DESTINATION(2, 1) * (int) jSpinnerChildren.getValue();
            valorHJ = TravelsDTO.GET_VALUE_DESTINATION(2, 2) * (int) jSpinnerJubilate.getValue();
        }
        if (jCBDestination.getSelectedIndex() == 2 && jCBHotel.getSelectedIndex() == 1) {
            valorHA = TravelsDTO.GET_VALUE_DESTINATION(3, 0) * (int) jSpinnerAdults.getValue();
            valorHC = TravelsDTO.GET_VALUE_DESTINATION(3, 1) * (int) jSpinnerChildren.getValue();
            valorHJ = TravelsDTO.GET_VALUE_DESTINATION(3, 2) * (int) jSpinnerJubilate.getValue();
        }
        if (jCBDestination.getSelectedIndex() == 2 && jCBHotel.getSelectedIndex() == 2) {
            valorHA = TravelsDTO.GET_VALUE_DESTINATION(4, 0) * (int) jSpinnerAdults.getValue();
            valorHC = TravelsDTO.GET_VALUE_DESTINATION(4, 1) * (int) jSpinnerChildren.getValue();
            valorHJ = TravelsDTO.GET_VALUE_DESTINATION(4, 2)* (int) jSpinnerJubilate.getValue();
        }
        if (jCBDestination.getSelectedIndex() == 2 && jCBHotel.getSelectedIndex() == 3) {
            valorHA = TravelsDTO.GET_VALUE_DESTINATION(5, 0) * (int) jSpinnerAdults.getValue();
            valorHC = TravelsDTO.GET_VALUE_DESTINATION(5, 1) * (int) jSpinnerChildren.getValue();
            valorHJ = TravelsDTO.GET_VALUE_DESTINATION(5, 2)* (int) jSpinnerJubilate.getValue();
        }
        if (jCBDestination.getSelectedIndex() == 3 && jCBHotel.getSelectedIndex() == 1) {
            valorHA = TravelsDTO.GET_VALUE_DESTINATION(6, 0) * (int) jSpinnerAdults.getValue();
            valorHC = TravelsDTO.GET_VALUE_DESTINATION(6, 1) * (int) jSpinnerChildren.getValue();
            valorHJ = TravelsDTO.GET_VALUE_DESTINATION(6, 2)* (int) jSpinnerJubilate.getValue();
        }
        if (jCBDestination.getSelectedIndex() == 3 && jCBHotel.getSelectedIndex() == 2) {
            valorHA = TravelsDTO.GET_VALUE_DESTINATION(7, 0) * (int) jSpinnerAdults.getValue();
            valorHC = TravelsDTO.GET_VALUE_DESTINATION(7, 1) * (int) jSpinnerChildren.getValue();
            valorHJ = TravelsDTO.GET_VALUE_DESTINATION(7, 2)* (int) jSpinnerJubilate.getValue();
        }
        if (jCBDestination.getSelectedIndex() == 3 && jCBHotel.getSelectedIndex() == 3) {
            valorHA = TravelsDTO.GET_VALUE_DESTINATION(8, 0) * (int) jSpinnerAdults.getValue();
            valorHC = TravelsDTO.GET_VALUE_DESTINATION(8, 1) * (int) jSpinnerChildren.getValue();
            valorHJ = TravelsDTO.GET_VALUE_DESTINATION(8, 2)* (int) jSpinnerJubilate.getValue();
        }

        valorHotel = valorHA + valorHC + valorHJ;
        return valorHotel;
    }

    public double valorTransport() {
        double valorTransportA = 0, valorTransportC = 0, valorTransportJ = 0, valorTransport;
        if (jRBTicketsY.isSelected()) {
            if (jCBDestination.getSelectedIndex() == 1) {
                valorTransportA = TravelsDTO.GET_VALUE_TICKET(0, 0) * (int) jSpinnerAdults.getValue();
                valorTransportC = TravelsDTO.GET_VALUE_TICKET(0, 1)  * (int) jSpinnerChildren.getValue();
                valorTransportJ = TravelsDTO.GET_VALUE_TICKET(0, 2)  * (int) jSpinnerJubilate.getValue();
            }
            if (jCBDestination.getSelectedIndex() == 2) {
                valorTransportA = TravelsDTO.GET_VALUE_TICKET(1, 0) * (int) jSpinnerAdults.getValue();
                valorTransportC = TravelsDTO.GET_VALUE_TICKET(1, 1)  * (int) jSpinnerChildren.getValue();
                valorTransportJ = TravelsDTO.GET_VALUE_TICKET(1, 2)  * (int) jSpinnerJubilate.getValue();
            }
            if (jCBDestination.getSelectedIndex() == 3) {
                valorTransportA = TravelsDTO.GET_VALUE_TICKET(2, 0) * (int) jSpinnerAdults.getValue();
                valorTransportC = TravelsDTO.GET_VALUE_TICKET(2, 1)  * (int) jSpinnerChildren.getValue();
                valorTransportJ = TravelsDTO.GET_VALUE_TICKET(2, 2)  * (int) jSpinnerJubilate.getValue();
            }
        }
        valorTransport = valorTransportA + valorTransportC + valorTransportJ;
        return valorTransport;
    }

    public double valorFood() {
        double valorFood, valorFA = 0, valorFC = 0, valorJ = 0;
        if (jCBFood.getSelectedIndex() == 1) {
            valorFA = TravelsDTO.GET_VALUE_FOOD(0, 0) * (int) jSpinnerAdults.getValue();
            valorFC = TravelsDTO.GET_VALUE_FOOD(0, 1) * (int) jSpinnerChildren.getValue();
            valorJ = TravelsDTO.GET_VALUE_FOOD(0, 2)* (int) jSpinnerJubilate.getValue();
        }
        if (jCBFood.getSelectedIndex() == 2) {
            valorFA = TravelsDTO.GET_VALUE_FOOD(0, 0) * (int) jSpinnerAdults.getValue();
            valorFC = TravelsDTO.GET_VALUE_FOOD(0, 1) * (int) jSpinnerChildren.getValue();
            valorJ = TravelsDTO.GET_VALUE_FOOD(0, 2)* (int) jSpinnerJubilate.getValue();
        }
        if (jCBFood.getSelectedIndex() == 3) {
            valorFA = TravelsDTO.GET_VALUE_FOOD(0, 0) * (int) jSpinnerAdults.getValue();
            valorFC = TravelsDTO.GET_VALUE_FOOD(0, 1) * (int) jSpinnerChildren.getValue();
            valorJ = TravelsDTO.GET_VALUE_FOOD(0, 2)* (int) jSpinnerJubilate.getValue();
        }
        if (jCBFood.getSelectedIndex() == 4) {
            valorFA = TravelsDTO.GET_VALUE_FOOD(0, 0) * (int) jSpinnerAdults.getValue();
            valorFC = TravelsDTO.GET_VALUE_FOOD(0, 1) * (int) jSpinnerChildren.getValue();
            valorJ = TravelsDTO.GET_VALUE_FOOD(0, 2)* (int) jSpinnerJubilate.getValue();
        }
        valorFood = valorFC + valorFA + valorJ;
        return valorFood;
    }

    public double valorAditional() {
        double valorAditional, valor1 = 0, valor2 = 0, valor3 = 0;
        if (jCheckBoxLocalTransport.isSelected()) {
            valor1 = TravelsDTO.GET_VALUE_ADITIONAL(0);
        }
        if (jCheckBoxPlaces.isSelected()) {
            valor2 = TravelsDTO.GET_VALUE_ADITIONAL(1);
        }
        if (jCheckBoxTourGuide.isSelected()) {
            valor3 = TravelsDTO.GET_VALUE_ADITIONAL(2);
        }
        valorAditional = valor1 + valor2 + valor3;

        return valorAditional;
    }

    public int totalDays() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        LocalDate dateBefore = LocalDate.parse(sdf.format(jDateChooserSalida.getDate()));
        LocalDate dateAfter = LocalDate.parse(sdf.format(jDateChooserRegreso.getDate()));

        //Se calcula los días mediante la clase ChronoUnit, mediante el metodo between
        int noOfDaysBetween = (int) ChronoUnit.DAYS.between(dateBefore, dateAfter);
        return noOfDaysBetween;
    }

    public double total() {
        double total;
        total = ((valorAditional() + valorFood() + valorHotel()) * totalDays()) + valorTransport();
        return total;
    }

    public void cleanAll() {
        jTextFieldName.setText("");
        jTextFieldLastName.setText("");
        jTextFieldCardID.setText("");
        jTextFieldEmail.setText("");
        jTextFieldPhoneNum.setText("");
        jCBDestination.setSelectedIndex(0);
        jRBTicketsN.setSelected(false);
        jRBTicketsY.setSelected(false);
        jCBFood.setSelectedIndex(0);
        jSpinnerAdults.setValue(0);
        jSpinnerChildren.setValue(0);
        jSpinnerJubilate.setValue(0);
        jCheckBoxLocalTransport.setSelected(false);
        jCheckBoxPlaces.setSelected(false);
        jCheckBoxTourGuide.setSelected(false);
    }

    public boolean validateInfo() {
        return !(jTextFieldName.getText().equals("")
                || jTextFieldLastName.getText().equals("")
                || jTextFieldCardID.getText().equals("")
                || jTextFieldEmail.getText().equals("")
                || (jRBTicketsY.isSelected() == false && jRBTicketsN.isSelected() == false)
                || jDateChooserRegreso.getDate() == null
                || jDateChooserSalida.getDate() == null
                || ((int) jSpinnerAdults.getValue() == 0 && (int) jSpinnerChildren.getValue() == 0 && (int) jSpinnerJubilate.getValue() == 0)
                || jCBHotel.getSelectedIndex() == 0
                || jCBFood.getSelectedIndex() == 0);
    }

    public boolean validateDate() {
        int valorDate = (jDateChooserSalida.getDate()).compareTo(jDateChooserRegreso.getDate());
        if (valorDate > 0) {
            JOptionPane.showMessageDialog(null, "NO PUEDE INGRESAR UNA FECHA DE REGRESO ANTERIOR A LA DE SALIDA", "FECHAS INCORRECTAS", JOptionPane.ERROR_MESSAGE);
        } else if (valorDate == 0) {
            JOptionPane.showMessageDialog(null, "AL MENOS TIENE QUE ELEGIR UN DÍA DE DIFERENCIA ENTRE FECHAS", "FECHAS INCORRECTAS", JOptionPane.ERROR_MESSAGE);
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jCBDestination = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSpinnerAdults = new javax.swing.JSpinner();
        jLabel17 = new javax.swing.JLabel();
        jSpinnerChildren = new javax.swing.JSpinner();
        jSpinnerJubilate = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jCBHotel = new javax.swing.JComboBox<>();
        jLabel20 = new javax.swing.JLabel();
        jCBFood = new javax.swing.JComboBox<>();
        jLabel21 = new javax.swing.JLabel();
        jRBTicketsY = new javax.swing.JRadioButton();
        jRBTicketsN = new javax.swing.JRadioButton();
        jDateChooserRegreso = new com.toedter.calendar.JDateChooser();
        jDateChooserSalida = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jCheckBoxLocalTransport = new javax.swing.JCheckBox();
        jCheckBoxPlaces = new javax.swing.JCheckBox();
        jCheckBoxTourGuide = new javax.swing.JCheckBox();
        jLabelTotal = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldCardID = new javax.swing.JTextField();
        jTextFieldLastName = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jTextFieldPhoneNum = new javax.swing.JTextField();
        jBtnCleanAll = new javax.swing.JButton();
        jBtnInvoice = new javax.swing.JButton();
        jBtnTotal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Subtotal:");

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PAQUETE DE VIAJE");

        jPanel1.setBackground(new java.awt.Color(215, 228, 236));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Viaje", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jLabel13.setText("Lugar de Destino:");

        jCBDestination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione ", "Cancún-México", "Cartagena-Colombia", "Panamá-Panamá" }));
        jCBDestination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBDestinationActionPerformed(evt);
            }
        });

        jLabel14.setText("Fecha de Salida:");

        jLabel15.setText("Fecha de Regreso:");

        jLabel16.setText("Adultos:");

        jSpinnerAdults.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel17.setText("Niños:");

        jSpinnerChildren.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jSpinnerJubilate.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel18.setText("Adultos de la tercera edad:");

        jLabel19.setText("Hotel:");

        jLabel20.setText("Alimentación:");

        jCBFood.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Desayuno", "Almuerzo", "Merienda", "Todas las comidas", "Ninguna comida" }));

        jLabel21.setText("Tickets Aéreos:");

        buttonGroup1.add(jRBTicketsY);
        jRBTicketsY.setText("SI");

        buttonGroup1.add(jRBTicketsN);
        jRBTicketsN.setText("NO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooserSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addComponent(jSpinnerJubilate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooserRegreso, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRBTicketsY)
                                .addGap(39, 39, 39)
                                .addComponent(jRBTicketsN)
                                .addGap(40, 40, 40))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSpinnerAdults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSpinnerChildren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel20)))
                        .addGap(18, 18, 18)
                        .addComponent(jCBFood, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jCBDestination, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(jRBTicketsY)
                    .addComponent(jRBTicketsN))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jDateChooserRegreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooserSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jSpinnerAdults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(jSpinnerChildren, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerJubilate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jCBHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jCBFood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(215, 228, 236));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Extras", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jCheckBoxLocalTransport.setText("Transporte Local");

        jCheckBoxPlaces.setText("Lugares de Recreación");

        jCheckBoxTourGuide.setText("Guía Turística");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jCheckBoxLocalTransport)
                .addGap(65, 65, 65)
                .addComponent(jCheckBoxPlaces)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBoxTourGuide)
                .addGap(49, 49, 49))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxLocalTransport)
                    .addComponent(jCheckBoxPlaces)
                    .addComponent(jCheckBoxTourGuide))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabelTotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nombre:");

        jTextFieldName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNameKeyTyped(evt);
            }
        });

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cédula:");

        jTextFieldCardID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldCardIDKeyTyped(evt);
            }
        });

        jTextFieldLastName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldLastNameKeyTyped(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Apellido:");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Correo electrónico:");

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Celular:");

        jTextFieldPhoneNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldPhoneNumKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldEmail))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 203, Short.MAX_VALUE)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldCardID, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldPhoneNum)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel9)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(284, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel11)
                        .addComponent(jTextFieldCardID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(jTextFieldPhoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(34, Short.MAX_VALUE)))
        );

        jBtnCleanAll.setBackground(new java.awt.Color(5, 65, 66));
        jBtnCleanAll.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtnCleanAll.setForeground(new java.awt.Color(255, 255, 255));
        jBtnCleanAll.setText("Limpiar Todo");
        jBtnCleanAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnCleanAllActionPerformed(evt);
            }
        });

        jBtnInvoice.setBackground(new java.awt.Color(5, 65, 66));
        jBtnInvoice.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtnInvoice.setForeground(new java.awt.Color(255, 255, 255));
        jBtnInvoice.setText("GENERAR FACTURA");
        jBtnInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnInvoiceActionPerformed(evt);
            }
        });

        jBtnTotal.setBackground(new java.awt.Color(5, 65, 66));
        jBtnTotal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jBtnTotal.setForeground(new java.awt.Color(255, 255, 255));
        jBtnTotal.setText("Calcular Subtotal");
        jBtnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(21, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jBtnCleanAll, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(156, 156, 156)
                                .addComponent(jBtnTotal)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelTotal))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jBtnInvoice)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnCleanAll)
                    .addComponent(jBtnTotal)
                    .addComponent(jLabel2)
                    .addComponent(jLabelTotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBtnInvoice)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNameKeyTyped
        // TODO add your handling code here:
        validate.validateLetters(evt);
    }//GEN-LAST:event_jTextFieldNameKeyTyped

    private void jTextFieldCardIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldCardIDKeyTyped
        // TODO add your handling code here:
        validate.validateNum(evt);
    }//GEN-LAST:event_jTextFieldCardIDKeyTyped

    private void jTextFieldLastNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldLastNameKeyTyped
        // TODO add your handling code here:
        validate.validateLetters(evt);
    }//GEN-LAST:event_jTextFieldLastNameKeyTyped

    private void jCBDestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBDestinationActionPerformed
        // TODO add your handling code here:
        changeHotel();
    }//GEN-LAST:event_jCBDestinationActionPerformed

    private void jTextFieldPhoneNumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldPhoneNumKeyTyped
        // TODO add your handling code here:
        validate.validateNum(evt);
    }//GEN-LAST:event_jTextFieldPhoneNumKeyTyped

    private void jBtnCleanAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnCleanAllActionPerformed
        // TODO add your handling code here:
        cleanAll();
    }//GEN-LAST:event_jBtnCleanAllActionPerformed

    private void jBtnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTotalActionPerformed
        if (validateInfo() && validateDate()) {
            jLabelTotal.setText(Double.toString(total()));
        } else {
            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS DEBEN ESTAR LLENOS", "CAMPOS VACÍOS", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jBtnTotalActionPerformed

    private void jBtnInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnInvoiceActionPerformed
        if (validateInfo() && validateDate()) {
            String name = jTextFieldName.getText();
            String lastName = jTextFieldLastName.getText();
            String cardID = jTextFieldCardID.getText();
            String email = jTextFieldEmail.getText();
            String phoneNum = jTextFieldPhoneNum.getText();
            String destinationPlace = jCBDestination.getSelectedItem().toString();
            boolean ticketsA = jRBTicketsY.isSelected();

            java.util.Date initialDate = jDateChooserSalida.getDate();
            long transformDate = initialDate.getTime();
            Date startDate = new Date(transformDate);

            java.util.Date finalDate = jDateChooserRegreso.getDate();
            long transformFinalDate = finalDate.getTime();
            Date endDate = new Date(transformFinalDate);

            int adults = (int) jSpinnerAdults.getValue();
            int children = (int) jSpinnerChildren.getValue();
            int jubilate = (int) jSpinnerJubilate.getValue();
            int daysTravel = totalDays();
            String hotel = jCBHotel.getSelectedItem().toString();
            String food = jCBFood.getSelectedItem().toString();
            boolean aditionalTransport = jCheckBoxLocalTransport.isSelected();
            boolean aditionalGuide = jCheckBoxTourGuide.isSelected();
            boolean aditionalPlaces = jCheckBoxPlaces.isSelected();
            double subtotal = total();

            int register = controlador.insertTravel(name, lastName, cardID, phoneNum, email, destinationPlace, ticketsA, startDate, endDate, adults, children, jubilate, daysTravel, hotel, food, aditionalTransport, aditionalGuide, aditionalPlaces, subtotal);

            if (register != 0) {
                WindowsInvoice windowsI = new WindowsInvoice();
                windowsI.setVisible(true);
                windowsI.detailTravel(register);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "EXISTIÓ UN PROBLEMA AL GENERAR LA FACTURA", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "TODOS LOS CAMPOS DEBEN ESTAR LLENOS", "CAMPOS VACÍOS", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jBtnInvoiceActionPerformed

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
            java.util.logging.Logger.getLogger(WindowTravelPackage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WindowTravelPackage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WindowTravelPackage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WindowTravelPackage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WindowTravelPackage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBtnCleanAll;
    private javax.swing.JButton jBtnInvoice;
    private javax.swing.JButton jBtnTotal;
    private javax.swing.JComboBox<String> jCBDestination;
    private javax.swing.JComboBox<String> jCBFood;
    private javax.swing.JComboBox<String> jCBHotel;
    private javax.swing.JCheckBox jCheckBoxLocalTransport;
    private javax.swing.JCheckBox jCheckBoxPlaces;
    private javax.swing.JCheckBox jCheckBoxTourGuide;
    private com.toedter.calendar.JDateChooser jDateChooserRegreso;
    private com.toedter.calendar.JDateChooser jDateChooserSalida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelTotal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRBTicketsN;
    private javax.swing.JRadioButton jRBTicketsY;
    private javax.swing.JSpinner jSpinnerAdults;
    private javax.swing.JSpinner jSpinnerChildren;
    private javax.swing.JSpinner jSpinnerJubilate;
    private javax.swing.JTextField jTextFieldCardID;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldPhoneNum;
    // End of variables declaration//GEN-END:variables
}
