package view;

import desk_drink.americano;
import desk_drink.ice_cream;
import desk_drink.latte;
import desk_drink.lt;
import desk_drink.macha;
import desk_drink.milk_shake;
import desk_food.bolognese;
import desk_food.carbonara;
import desk_food.cinnamon;
import desk_food.croffle;
import desk_food.lasagna;
import desk_food.tiramisu;
import java.awt.Color;
import java.awt.print.PrinterException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muham
 */
public class order extends javax.swing.JPanel {

    /**
     * Creates new form menu
     */
    public order() {
        initComponents();
        JTable.getColumnModel().getColumn(0).setPreferredWidth(30);
        JTable.getColumnModel().getColumn(1).setPreferredWidth(200);
    }
    public void addtable(int id, String name, int qty, double price) {
       
     DefaultTableModel dt = (DefaultTableModel) JTable.getModel();

        // Create an ArrayList to store the row data
        List<Object> row = new ArrayList<>();
        row.add(id);
        row.add(name);
        row.add(qty);
        row.add(price);

        // Add the row to the table model
        dt.addRow(row.toArray());
    }
    
    public void addtables(int id ,String Name,int Qty ,Double Price){
    
        DefaultTableModel dt = (DefaultTableModel) JTable.getModel();
        
       DecimalFormat df = new DecimalFormat("00.000") ;       
       double totPrice = Price * Double.valueOf(Qty) ;
       
       String TotalPrice = df.format(totPrice);
        
        
        
        // product allready add chk
        
        for (int row = 0; row < JTable.getRowCount(); row++) {
            
            if (Name == JTable.getValueAt(row, 1)) {
                
                dt.removeRow(JTable.convertRowIndexToModel(row));
                
            } 
        }
        
        List<Object> row = new ArrayList<>();
        row.add(id);
        row.add(Name);
        row.add(Qty);
        row.add(TotalPrice); // total price

        // Add the row to the table model
        dt.addRow(row.toArray());
    }
        
        public void cal(){
    //cal total table values
   
   int numOfRow = JTable.getRowCount() ;
   double tot = 0.0 ;
   
       for (int i = 0; i < numOfRow; i++) {
           
           double value = Double.valueOf(JTable.getValueAt(i, 3).toString());
          
           tot += value ;
           
       }
       
       DecimalFormat df = new DecimalFormat("00.000") ;
       total.setText(df.format(tot));
    
       pay();
   
   }
        
      public void pay(){
   // pat btn action

    String totalText = total.getText();
    String payText = pay.getText();

    // Check if the total or pay fields are empty or null
    
    if (payText == null || payText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter valid values Pay", "Input Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        double tot = Double.valueOf(totalText);
        double paid = Double.valueOf(payText);
        double balance = paid - tot;

        DecimalFormat df = new DecimalFormat("00.000");

        bal.setText(String.valueOf(df.format(balance)));

        Bill(); // Call your Bill method
        
    } catch (NumberFormatException e) {
        // Handle invalid number format
        JOptionPane.showMessageDialog(this, "Please enter valid values Pay", "Input Error", JOptionPane.ERROR_MESSAGE);
    }
   }  
    
       public void Bill() {
        // bill print
        
        try {
            
           b.setText("\t\t             ---MOBI CAFE---\n");
            b.setText(b.getText() + "\t\t          Pajajaran Indah V No.7, \n");
            b.setText(b.getText() + "\t\t          Baranangsiang, Bogor, \n");
            b.setText(b.getText() + "\t\t          +62 831-4122-0307, \n");
            b.setText(b.getText() + "-------------------------------------------------------------------------------------------------------------------------------------\n");
            b.setText(b.getText() + "  Item \t\t\tQty \t\t\tPrice" +"\n");
            b.setText(b.getText() + "-------------------------------------------------------------------------------------------------------------------------------------\n");
            
            DefaultTableModel df = (DefaultTableModel) JTable.getModel();
            
            // get table Product details
            
            for (int i = 0; i < JTable.getRowCount(); i++) {
                
                String Name = df.getValueAt(i, 1).toString();
                String Qty = df.getValueAt(i, 2).toString();
                String Price = df.getValueAt(i, 3).toString();
                
                b.setText(b.getText() +"  "+ Name+"\t\t\t"+Qty +"\t\t\t"+Price + "\n");
            }
            
            b.setText(b.getText() + "-------------------------------------------------------------------------------------------------------------------------------------\n");
            b.setText(b.getText() + "Sub Total :Rp. " + total.getText() +"\n");
            b.setText(b.getText() + "Cash         :Rp " + pay.getText() +"\n");
            b.setText(b.getText() + "Balance    :Rp " + bal.getText() +"\n");
            b.setText(b.getText() + "-------------------------------------------------------------------------------------------------------------------------------------\n");
            b.setText(b.getText() + "\t\t\tThank you!"+"\n");
            b.setText(b.getText() + "-------------------------------------------------------------------------------------------------------------------------------------\n");
            
            
           
       
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(this, e, "Error", JOptionPane.ERROR_MESSAGE);
            
            
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

        jScrollPane3 = new javax.swing.JScrollPane();
        b = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        bg = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        pn_cinnamon = new javax.swing.JPanel();
        nm_cinnamon = new javax.swing.JLabel();
        ft_cinnamon1 = new javax.swing.JLabel();
        q1 = new javax.swing.JLabel();
        tmbh_cinnamon = new javax.swing.JButton();
        krng_cinnamon = new javax.swing.JButton();
        qty_croffle2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        pn_spaghetti = new javax.swing.JPanel();
        nm_spaghetti = new javax.swing.JLabel();
        ft_spaghetti = new javax.swing.JLabel();
        q2 = new javax.swing.JLabel();
        tmbh_spgty = new javax.swing.JButton();
        krng_spgty = new javax.swing.JButton();
        qty_croffle1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        pn_croffle = new javax.swing.JPanel();
        nm_croffle = new javax.swing.JLabel();
        ft_croffle = new javax.swing.JLabel();
        qty_croffle = new javax.swing.JLabel();
        q3 = new javax.swing.JLabel();
        tmbh_croffle = new javax.swing.JButton();
        krng_croffle = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        pn_carbonara = new javax.swing.JPanel();
        nm_carbonara = new javax.swing.JLabel();
        ft_carbonara = new javax.swing.JLabel();
        q4 = new javax.swing.JLabel();
        tmbh_carbonara = new javax.swing.JButton();
        krng_carbonara = new javax.swing.JButton();
        qty_carbonara = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        pn_tiramisu = new javax.swing.JPanel();
        nm_tiramisu = new javax.swing.JLabel();
        q5 = new javax.swing.JLabel();
        tmbh_tiramisu = new javax.swing.JButton();
        krng_tiramisu = new javax.swing.JButton();
        qty_tiramisu = new javax.swing.JLabel();
        ft_tiramisu = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        pn_lasagna = new javax.swing.JPanel();
        nm_lasagna = new javax.swing.JLabel();
        q6 = new javax.swing.JLabel();
        tmbh_lasagna = new javax.swing.JButton();
        krng_lasagna = new javax.swing.JButton();
        qty_lasagna = new javax.swing.JLabel();
        ft_lasagna = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        pn_americano = new javax.swing.JPanel();
        nm_americano = new javax.swing.JLabel();
        q7 = new javax.swing.JLabel();
        tmbh_americano = new javax.swing.JButton();
        krng_americano = new javax.swing.JButton();
        qty_americano = new javax.swing.JLabel();
        ft_americano = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        pn_lt = new javax.swing.JPanel();
        nm_lt = new javax.swing.JLabel();
        q8 = new javax.swing.JLabel();
        tmbh_lt = new javax.swing.JButton();
        krng_lt = new javax.swing.JButton();
        qty_lt = new javax.swing.JLabel();
        ft_lt = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        pn_macha = new javax.swing.JPanel();
        nm_macha = new javax.swing.JLabel();
        qty_macha = new javax.swing.JLabel();
        q9 = new javax.swing.JLabel();
        tmbh_macha = new javax.swing.JButton();
        krng_macha = new javax.swing.JButton();
        ft_macha = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        pn_ms = new javax.swing.JPanel();
        nm_ms = new javax.swing.JLabel();
        q10 = new javax.swing.JLabel();
        tmbh_ms = new javax.swing.JButton();
        krng_ms = new javax.swing.JButton();
        qty_ms = new javax.swing.JLabel();
        ft_ms = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        pn_ic = new javax.swing.JPanel();
        nm_ic = new javax.swing.JLabel();
        q11 = new javax.swing.JLabel();
        tmbh_ic = new javax.swing.JButton();
        krng_ic = new javax.swing.JButton();
        qty_ic = new javax.swing.JLabel();
        ft_ic = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        latte = new javax.swing.JPanel();
        nm_latte = new javax.swing.JLabel();
        q12 = new javax.swing.JLabel();
        tmbh_latte = new javax.swing.JButton();
        krng_latte = new javax.swing.JButton();
        ft_latte = new javax.swing.JLabel();
        qty_latte = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        dsr_drink = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        dsr_food = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton13 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        pay = new javax.swing.JTextField();
        bal = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        desk_cinnamon = new javax.swing.JPanel();
        desk_bolognese = new javax.swing.JPanel();
        desk_croffle = new javax.swing.JPanel();
        desk_carbonara = new javax.swing.JPanel();
        desk_tiramisu = new javax.swing.JPanel();
        desk_lasagna = new javax.swing.JPanel();
        desk_americano = new javax.swing.JPanel();
        desk_lt = new javax.swing.JPanel();
        desk_macha = new javax.swing.JPanel();
        desk_ms = new javax.swing.JPanel();
        desk_ic = new javax.swing.JPanel();
        desk_latte = new javax.swing.JPanel();

        b.setBackground(new java.awt.Color(251, 213, 176));
        b.setColumns(20);
        b.setFont(new java.awt.Font("Times New Roman", 0, 9)); // NOI18N
        b.setRows(5);
        b.setMaximumSize(new java.awt.Dimension(124, 64));
        b.setMinimumSize(new java.awt.Dimension(124, 64));
        jScrollPane3.setViewportView(b);

        setMaximumSize(new java.awt.Dimension(1200, 620));
        setMinimumSize(new java.awt.Dimension(1200, 620));
        setPreferredSize(new java.awt.Dimension(1181, 1759));
        setLayout(new java.awt.CardLayout());

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(1200, 620));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(1200, 620));
        jScrollPane1.setName(""); // NOI18N
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1200, 620));

        bg.setBackground(new java.awt.Color(0, 0, 0));
        bg.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        bg.setMaximumSize(new java.awt.Dimension(1181, 1554));
        bg.setMinimumSize(new java.awt.Dimension(1181, 1554));
        bg.setPreferredSize(new java.awt.Dimension(1181, 1554));
        bg.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(218, 165, 32));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("PAYMENT");
        jLabel17.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        bg.add(jLabel17);
        jLabel17.setBounds(-10, 1160, 1200, 28);

        pn_cinnamon.setBackground(new java.awt.Color(0, 0, 0));
        pn_cinnamon.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        pn_cinnamon.setMaximumSize(new java.awt.Dimension(180, 200));
        pn_cinnamon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pn_cinnamonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pn_cinnamonMouseExited(evt);
            }
        });
        pn_cinnamon.setLayout(null);

        nm_cinnamon.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        nm_cinnamon.setForeground(new java.awt.Color(218, 165, 32));
        nm_cinnamon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nm_cinnamon.setText("CINNAMON ROLL");
        pn_cinnamon.add(nm_cinnamon);
        nm_cinnamon.setBounds(0, 0, 180, 26);

        ft_cinnamon1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ft_cinnamon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_food/cinnamon.png"))); // NOI18N
        pn_cinnamon.add(ft_cinnamon1);
        ft_cinnamon1.setBounds(0, 30, 180, 100);

        q1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        q1.setForeground(new java.awt.Color(218, 165, 32));
        q1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q1.setText("0");
        pn_cinnamon.add(q1);
        q1.setBounds(130, 160, 40, 19);

        tmbh_cinnamon.setFont(new java.awt.Font("Segoe UI Black", 1, 11)); // NOI18N
        tmbh_cinnamon.setText("+");
        tmbh_cinnamon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tmbh_cinnamonMouseEntered(evt);
            }
        });
        tmbh_cinnamon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbh_cinnamonActionPerformed(evt);
            }
        });
        pn_cinnamon.add(tmbh_cinnamon);
        tmbh_cinnamon.setBounds(130, 190, 50, 23);

        krng_cinnamon.setFont(new java.awt.Font("Segoe UI Black", 1, 11)); // NOI18N
        krng_cinnamon.setText("-");
        krng_cinnamon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                krng_cinnamonMouseEntered(evt);
            }
        });
        krng_cinnamon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                krng_cinnamonActionPerformed(evt);
            }
        });
        pn_cinnamon.add(krng_cinnamon);
        krng_cinnamon.setBounds(0, 190, 50, 23);

        qty_croffle2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        qty_croffle2.setForeground(new java.awt.Color(218, 165, 32));
        qty_croffle2.setText("Quantity    :");
        pn_cinnamon.add(qty_croffle2);
        qty_croffle2.setBounds(0, 160, 100, 19);

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(218, 165, 32));
        jLabel4.setText("37.500");
        pn_cinnamon.add(jLabel4);
        jLabel4.setBounds(120, 140, 70, 19);

        jLabel16.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(218, 165, 32));
        jLabel16.setText("Price           :");
        pn_cinnamon.add(jLabel16);
        jLabel16.setBounds(0, 140, 90, 19);

        bg.add(pn_cinnamon);
        pn_cinnamon.setBounds(20, 70, 180, 220);

        pn_spaghetti.setBackground(new java.awt.Color(0, 0, 0));
        pn_spaghetti.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        pn_spaghetti.setMaximumSize(new java.awt.Dimension(180, 200));
        pn_spaghetti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pn_spaghettiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pn_spaghettiMouseExited(evt);
            }
        });
        pn_spaghetti.setLayout(null);

        nm_spaghetti.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        nm_spaghetti.setForeground(new java.awt.Color(218, 165, 32));
        nm_spaghetti.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nm_spaghetti.setText("BOLOGNESE");
        pn_spaghetti.add(nm_spaghetti);
        nm_spaghetti.setBounds(0, 0, 180, 26);

        ft_spaghetti.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ft_spaghetti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_food/Spgty.png"))); // NOI18N
        pn_spaghetti.add(ft_spaghetti);
        ft_spaghetti.setBounds(0, 30, 180, 100);

        q2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        q2.setForeground(new java.awt.Color(218, 165, 32));
        q2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q2.setText("0");
        pn_spaghetti.add(q2);
        q2.setBounds(140, 160, 30, 19);

        tmbh_spgty.setFont(new java.awt.Font("Segoe UI Black", 1, 11)); // NOI18N
        tmbh_spgty.setText("+");
        tmbh_spgty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tmbh_spgtyMouseEntered(evt);
            }
        });
        tmbh_spgty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbh_spgtyActionPerformed(evt);
            }
        });
        pn_spaghetti.add(tmbh_spgty);
        tmbh_spgty.setBounds(130, 190, 50, 23);

        krng_spgty.setFont(new java.awt.Font("Segoe UI Black", 1, 11)); // NOI18N
        krng_spgty.setText("-");
        krng_spgty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                krng_spgtyMouseEntered(evt);
            }
        });
        krng_spgty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                krng_spgtyActionPerformed(evt);
            }
        });
        pn_spaghetti.add(krng_spgty);
        krng_spgty.setBounds(0, 190, 50, 23);

        qty_croffle1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        qty_croffle1.setForeground(new java.awt.Color(218, 165, 32));
        qty_croffle1.setText("Quantity    :");
        pn_spaghetti.add(qty_croffle1);
        qty_croffle1.setBounds(0, 160, 100, 19);

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(218, 165, 32));
        jLabel5.setText("Price           :");
        pn_spaghetti.add(jLabel5);
        jLabel5.setBounds(0, 140, 90, 19);

        jLabel20.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(218, 165, 32));
        jLabel20.setText("43.500");
        pn_spaghetti.add(jLabel20);
        jLabel20.setBounds(120, 140, 70, 19);

        bg.add(pn_spaghetti);
        pn_spaghetti.setBounds(250, 70, 180, 220);

        pn_croffle.setBackground(new java.awt.Color(0, 0, 0));
        pn_croffle.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        pn_croffle.setMaximumSize(new java.awt.Dimension(180, 200));
        pn_croffle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pn_croffleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pn_croffleMouseExited(evt);
            }
        });
        pn_croffle.setLayout(null);

        nm_croffle.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        nm_croffle.setForeground(new java.awt.Color(218, 165, 32));
        nm_croffle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nm_croffle.setText("CROFFLE");
        pn_croffle.add(nm_croffle);
        nm_croffle.setBounds(0, 0, 180, 26);

        ft_croffle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ft_croffle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_food/croffle.png"))); // NOI18N
        pn_croffle.add(ft_croffle);
        ft_croffle.setBounds(0, 30, 180, 100);

        qty_croffle.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        qty_croffle.setForeground(new java.awt.Color(218, 165, 32));
        qty_croffle.setText("Quantity    :");
        pn_croffle.add(qty_croffle);
        qty_croffle.setBounds(0, 160, 100, 19);

        q3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        q3.setForeground(new java.awt.Color(218, 165, 32));
        q3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q3.setText("0");
        pn_croffle.add(q3);
        q3.setBounds(140, 160, 30, 19);

        tmbh_croffle.setFont(new java.awt.Font("Segoe UI Black", 1, 11)); // NOI18N
        tmbh_croffle.setText("+");
        tmbh_croffle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tmbh_croffleMouseEntered(evt);
            }
        });
        tmbh_croffle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbh_croffleActionPerformed(evt);
            }
        });
        pn_croffle.add(tmbh_croffle);
        tmbh_croffle.setBounds(130, 190, 50, 23);

        krng_croffle.setFont(new java.awt.Font("Segoe UI Black", 1, 11)); // NOI18N
        krng_croffle.setText("-");
        krng_croffle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                krng_croffleMouseEntered(evt);
            }
        });
        krng_croffle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                krng_croffleActionPerformed(evt);
            }
        });
        pn_croffle.add(krng_croffle);
        krng_croffle.setBounds(0, 190, 50, 23);

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(218, 165, 32));
        jLabel6.setText("Price           :");
        pn_croffle.add(jLabel6);
        jLabel6.setBounds(0, 140, 90, 19);

        jLabel21.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(218, 165, 32));
        jLabel21.setText("25.000");
        pn_croffle.add(jLabel21);
        jLabel21.setBounds(120, 140, 70, 19);

        bg.add(pn_croffle);
        pn_croffle.setBounds(480, 70, 180, 220);

        pn_carbonara.setBackground(new java.awt.Color(0, 0, 0));
        pn_carbonara.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        pn_carbonara.setMaximumSize(new java.awt.Dimension(180, 200));
        pn_carbonara.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_carbonaraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pn_carbonaraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pn_carbonaraMouseExited(evt);
            }
        });
        pn_carbonara.setLayout(null);

        nm_carbonara.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        nm_carbonara.setForeground(new java.awt.Color(218, 165, 32));
        nm_carbonara.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nm_carbonara.setText("CARBONARA");
        pn_carbonara.add(nm_carbonara);
        nm_carbonara.setBounds(0, 0, 180, 26);

        ft_carbonara.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ft_carbonara.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_food/carbonara.png"))); // NOI18N
        pn_carbonara.add(ft_carbonara);
        ft_carbonara.setBounds(0, 30, 180, 100);

        q4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        q4.setForeground(new java.awt.Color(218, 165, 32));
        q4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q4.setText("0");
        pn_carbonara.add(q4);
        q4.setBounds(140, 160, 30, 19);

        tmbh_carbonara.setFont(new java.awt.Font("Segoe UI Black", 1, 11)); // NOI18N
        tmbh_carbonara.setText("+");
        tmbh_carbonara.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tmbh_carbonaraMouseEntered(evt);
            }
        });
        tmbh_carbonara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbh_carbonaraActionPerformed(evt);
            }
        });
        pn_carbonara.add(tmbh_carbonara);
        tmbh_carbonara.setBounds(130, 190, 50, 23);

        krng_carbonara.setFont(new java.awt.Font("Segoe UI Black", 1, 11)); // NOI18N
        krng_carbonara.setText("-");
        krng_carbonara.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                krng_carbonaraMouseEntered(evt);
            }
        });
        krng_carbonara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                krng_carbonaraActionPerformed(evt);
            }
        });
        pn_carbonara.add(krng_carbonara);
        krng_carbonara.setBounds(0, 190, 50, 23);

        qty_carbonara.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        qty_carbonara.setForeground(new java.awt.Color(218, 165, 32));
        qty_carbonara.setText("Quantity    :");
        pn_carbonara.add(qty_carbonara);
        qty_carbonara.setBounds(0, 160, 100, 19);

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(218, 165, 32));
        jLabel7.setText("Price           :");
        pn_carbonara.add(jLabel7);
        jLabel7.setBounds(0, 140, 90, 19);

        jLabel22.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(218, 165, 32));
        jLabel22.setText("43.000");
        pn_carbonara.add(jLabel22);
        jLabel22.setBounds(120, 140, 70, 19);

        bg.add(pn_carbonara);
        pn_carbonara.setBounds(20, 340, 180, 220);

        pn_tiramisu.setBackground(new java.awt.Color(0, 0, 0));
        pn_tiramisu.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        pn_tiramisu.setMaximumSize(new java.awt.Dimension(180, 200));
        pn_tiramisu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pn_tiramisuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pn_tiramisuMouseExited(evt);
            }
        });
        pn_tiramisu.setLayout(null);

        nm_tiramisu.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        nm_tiramisu.setForeground(new java.awt.Color(218, 165, 32));
        nm_tiramisu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nm_tiramisu.setText("TIRAMISU");
        pn_tiramisu.add(nm_tiramisu);
        nm_tiramisu.setBounds(0, 0, 180, 26);

        q5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        q5.setForeground(new java.awt.Color(218, 165, 32));
        q5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q5.setText("0");
        pn_tiramisu.add(q5);
        q5.setBounds(140, 160, 30, 19);

        tmbh_tiramisu.setFont(new java.awt.Font("Segoe UI Black", 1, 11)); // NOI18N
        tmbh_tiramisu.setText("+");
        tmbh_tiramisu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tmbh_tiramisuMouseEntered(evt);
            }
        });
        tmbh_tiramisu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbh_tiramisuActionPerformed(evt);
            }
        });
        pn_tiramisu.add(tmbh_tiramisu);
        tmbh_tiramisu.setBounds(130, 190, 50, 23);

        krng_tiramisu.setFont(new java.awt.Font("Segoe UI Black", 1, 11)); // NOI18N
        krng_tiramisu.setText("-");
        krng_tiramisu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                krng_tiramisuMouseEntered(evt);
            }
        });
        krng_tiramisu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                krng_tiramisuActionPerformed(evt);
            }
        });
        pn_tiramisu.add(krng_tiramisu);
        krng_tiramisu.setBounds(0, 190, 50, 23);

        qty_tiramisu.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        qty_tiramisu.setForeground(new java.awt.Color(218, 165, 32));
        qty_tiramisu.setText("Quantity    :");
        pn_tiramisu.add(qty_tiramisu);
        qty_tiramisu.setBounds(0, 160, 100, 19);

        ft_tiramisu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ft_tiramisu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_food/tiramisu.png"))); // NOI18N
        pn_tiramisu.add(ft_tiramisu);
        ft_tiramisu.setBounds(0, 30, 180, 100);

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(218, 165, 32));
        jLabel8.setText("Price           :");
        pn_tiramisu.add(jLabel8);
        jLabel8.setBounds(0, 140, 90, 19);

        jLabel23.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(218, 165, 32));
        jLabel23.setText("35.000");
        pn_tiramisu.add(jLabel23);
        jLabel23.setBounds(120, 140, 70, 19);

        bg.add(pn_tiramisu);
        pn_tiramisu.setBounds(250, 340, 180, 220);

        pn_lasagna.setBackground(new java.awt.Color(0, 0, 0));
        pn_lasagna.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        pn_lasagna.setMaximumSize(new java.awt.Dimension(180, 200));
        pn_lasagna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pn_lasagnaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pn_lasagnaMouseExited(evt);
            }
        });
        pn_lasagna.setLayout(null);

        nm_lasagna.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        nm_lasagna.setForeground(new java.awt.Color(218, 165, 32));
        nm_lasagna.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nm_lasagna.setText("LASAGNA");
        pn_lasagna.add(nm_lasagna);
        nm_lasagna.setBounds(0, 0, 180, 26);

        q6.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        q6.setForeground(new java.awt.Color(218, 165, 32));
        q6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q6.setText("0");
        pn_lasagna.add(q6);
        q6.setBounds(140, 160, 30, 19);

        tmbh_lasagna.setFont(new java.awt.Font("Segoe UI Black", 1, 11)); // NOI18N
        tmbh_lasagna.setText("+");
        tmbh_lasagna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tmbh_lasagnaMouseEntered(evt);
            }
        });
        tmbh_lasagna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbh_lasagnaActionPerformed(evt);
            }
        });
        pn_lasagna.add(tmbh_lasagna);
        tmbh_lasagna.setBounds(130, 190, 50, 23);

        krng_lasagna.setFont(new java.awt.Font("Segoe UI Black", 1, 11)); // NOI18N
        krng_lasagna.setText("-");
        krng_lasagna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                krng_lasagnaMouseEntered(evt);
            }
        });
        krng_lasagna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                krng_lasagnaActionPerformed(evt);
            }
        });
        pn_lasagna.add(krng_lasagna);
        krng_lasagna.setBounds(0, 190, 50, 23);

        qty_lasagna.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        qty_lasagna.setForeground(new java.awt.Color(218, 165, 32));
        qty_lasagna.setText("Quantity    :");
        pn_lasagna.add(qty_lasagna);
        qty_lasagna.setBounds(0, 160, 100, 19);

        ft_lasagna.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ft_lasagna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_food/lasagna.png"))); // NOI18N
        pn_lasagna.add(ft_lasagna);
        ft_lasagna.setBounds(0, 30, 180, 100);

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(218, 165, 32));
        jLabel9.setText("Price           :");
        pn_lasagna.add(jLabel9);
        jLabel9.setBounds(0, 140, 90, 19);

        jLabel24.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(218, 165, 32));
        jLabel24.setText("46.000");
        pn_lasagna.add(jLabel24);
        jLabel24.setBounds(120, 140, 70, 19);

        bg.add(pn_lasagna);
        pn_lasagna.setBounds(480, 340, 180, 220);

        pn_americano.setBackground(new java.awt.Color(0, 0, 0));
        pn_americano.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        pn_americano.setMaximumSize(new java.awt.Dimension(180, 200));
        pn_americano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pn_americanoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pn_americanoMouseExited(evt);
            }
        });
        pn_americano.setLayout(null);

        nm_americano.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        nm_americano.setForeground(new java.awt.Color(218, 165, 32));
        nm_americano.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nm_americano.setText("ICE AMERICANO");
        pn_americano.add(nm_americano);
        nm_americano.setBounds(0, 0, 180, 26);

        q7.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        q7.setForeground(new java.awt.Color(218, 165, 32));
        q7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q7.setText("0");
        pn_americano.add(q7);
        q7.setBounds(130, 160, 40, 19);

        tmbh_americano.setFont(new java.awt.Font("Segoe UI Black", 1, 11)); // NOI18N
        tmbh_americano.setText("+");
        tmbh_americano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tmbh_americanoMouseEntered(evt);
            }
        });
        tmbh_americano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbh_americanoActionPerformed(evt);
            }
        });
        pn_americano.add(tmbh_americano);
        tmbh_americano.setBounds(130, 190, 50, 23);

        krng_americano.setFont(new java.awt.Font("Segoe UI Black", 1, 11)); // NOI18N
        krng_americano.setText("-");
        krng_americano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                krng_americanoMouseEntered(evt);
            }
        });
        krng_americano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                krng_americanoActionPerformed(evt);
            }
        });
        pn_americano.add(krng_americano);
        krng_americano.setBounds(0, 190, 50, 23);

        qty_americano.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        qty_americano.setForeground(new java.awt.Color(218, 165, 32));
        qty_americano.setText("Quantity    :");
        pn_americano.add(qty_americano);
        qty_americano.setBounds(0, 160, 100, 19);

        ft_americano.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ft_americano.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_drink/americano.png"))); // NOI18N
        pn_americano.add(ft_americano);
        ft_americano.setBounds(0, 30, 180, 100);

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(218, 165, 32));
        jLabel10.setText("Price           :");
        pn_americano.add(jLabel10);
        jLabel10.setBounds(0, 140, 90, 19);

        jLabel25.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(218, 165, 32));
        jLabel25.setText("22.000");
        pn_americano.add(jLabel25);
        jLabel25.setBounds(120, 140, 70, 19);

        bg.add(pn_americano);
        pn_americano.setBounds(20, 630, 180, 220);

        pn_lt.setBackground(new java.awt.Color(0, 0, 0));
        pn_lt.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        pn_lt.setMaximumSize(new java.awt.Dimension(180, 200));
        pn_lt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pn_ltMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pn_ltMouseExited(evt);
            }
        });
        pn_lt.setLayout(null);

        nm_lt.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        nm_lt.setForeground(new java.awt.Color(218, 165, 32));
        nm_lt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nm_lt.setText("LEMON TEA");
        pn_lt.add(nm_lt);
        nm_lt.setBounds(0, 0, 180, 26);

        q8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        q8.setForeground(new java.awt.Color(218, 165, 32));
        q8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q8.setText("0");
        pn_lt.add(q8);
        q8.setBounds(140, 160, 30, 19);

        tmbh_lt.setFont(new java.awt.Font("Segoe UI Black", 1, 11)); // NOI18N
        tmbh_lt.setText("+");
        tmbh_lt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tmbh_ltMouseEntered(evt);
            }
        });
        tmbh_lt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbh_ltActionPerformed(evt);
            }
        });
        pn_lt.add(tmbh_lt);
        tmbh_lt.setBounds(130, 190, 50, 23);

        krng_lt.setFont(new java.awt.Font("Segoe UI Black", 1, 11)); // NOI18N
        krng_lt.setText("-");
        krng_lt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                krng_ltMouseEntered(evt);
            }
        });
        krng_lt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                krng_ltActionPerformed(evt);
            }
        });
        pn_lt.add(krng_lt);
        krng_lt.setBounds(0, 190, 50, 23);

        qty_lt.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        qty_lt.setForeground(new java.awt.Color(218, 165, 32));
        qty_lt.setText("Quantity    :");
        pn_lt.add(qty_lt);
        qty_lt.setBounds(0, 160, 100, 19);

        ft_lt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ft_lt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_drink/lemon_tea.png"))); // NOI18N
        pn_lt.add(ft_lt);
        ft_lt.setBounds(0, 30, 180, 100);

        jLabel11.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(218, 165, 32));
        jLabel11.setText("Price           :");
        pn_lt.add(jLabel11);
        jLabel11.setBounds(0, 140, 90, 19);

        jLabel26.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(218, 165, 32));
        jLabel26.setText("17.500");
        pn_lt.add(jLabel26);
        jLabel26.setBounds(120, 140, 70, 19);

        bg.add(pn_lt);
        pn_lt.setBounds(250, 630, 180, 220);

        pn_macha.setBackground(new java.awt.Color(0, 0, 0));
        pn_macha.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        pn_macha.setMaximumSize(new java.awt.Dimension(180, 200));
        pn_macha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pn_machaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pn_machaMouseExited(evt);
            }
        });
        pn_macha.setLayout(null);

        nm_macha.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        nm_macha.setForeground(new java.awt.Color(218, 165, 32));
        nm_macha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nm_macha.setText("MACHA");
        pn_macha.add(nm_macha);
        nm_macha.setBounds(0, 0, 180, 26);

        qty_macha.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        qty_macha.setForeground(new java.awt.Color(218, 165, 32));
        qty_macha.setText("Quantity    :");
        pn_macha.add(qty_macha);
        qty_macha.setBounds(0, 160, 100, 19);

        q9.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        q9.setForeground(new java.awt.Color(218, 165, 32));
        q9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q9.setText("0");
        pn_macha.add(q9);
        q9.setBounds(140, 160, 30, 19);

        tmbh_macha.setFont(new java.awt.Font("Segoe UI Black", 1, 11)); // NOI18N
        tmbh_macha.setText("+");
        tmbh_macha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tmbh_machaMouseEntered(evt);
            }
        });
        tmbh_macha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbh_machaActionPerformed(evt);
            }
        });
        pn_macha.add(tmbh_macha);
        tmbh_macha.setBounds(130, 190, 50, 23);

        krng_macha.setFont(new java.awt.Font("Segoe UI Black", 1, 11)); // NOI18N
        krng_macha.setText("-");
        krng_macha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                krng_machaMouseEntered(evt);
            }
        });
        krng_macha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                krng_machaActionPerformed(evt);
            }
        });
        pn_macha.add(krng_macha);
        krng_macha.setBounds(0, 190, 50, 23);

        ft_macha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ft_macha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_drink/macha.png"))); // NOI18N
        pn_macha.add(ft_macha);
        ft_macha.setBounds(0, 30, 180, 100);

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(218, 165, 32));
        jLabel12.setText("Price           :");
        pn_macha.add(jLabel12);
        jLabel12.setBounds(0, 140, 90, 19);

        jLabel27.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(218, 165, 32));
        jLabel27.setText("25.000");
        pn_macha.add(jLabel27);
        jLabel27.setBounds(120, 140, 70, 19);

        bg.add(pn_macha);
        pn_macha.setBounds(480, 630, 180, 220);

        pn_ms.setBackground(new java.awt.Color(0, 0, 0));
        pn_ms.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        pn_ms.setMaximumSize(new java.awt.Dimension(180, 200));
        pn_ms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pn_msMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pn_msMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pn_msMouseExited(evt);
            }
        });
        pn_ms.setLayout(null);

        nm_ms.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        nm_ms.setForeground(new java.awt.Color(218, 165, 32));
        nm_ms.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nm_ms.setText("MILK SHAKE");
        pn_ms.add(nm_ms);
        nm_ms.setBounds(0, 0, 180, 26);

        q10.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        q10.setForeground(new java.awt.Color(218, 165, 32));
        q10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q10.setText("0");
        pn_ms.add(q10);
        q10.setBounds(140, 160, 30, 19);

        tmbh_ms.setFont(new java.awt.Font("Segoe UI Black", 1, 11)); // NOI18N
        tmbh_ms.setText("+");
        tmbh_ms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tmbh_msMouseEntered(evt);
            }
        });
        tmbh_ms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbh_msActionPerformed(evt);
            }
        });
        pn_ms.add(tmbh_ms);
        tmbh_ms.setBounds(130, 190, 50, 23);

        krng_ms.setFont(new java.awt.Font("Segoe UI Black", 1, 11)); // NOI18N
        krng_ms.setText("-");
        krng_ms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                krng_msMouseEntered(evt);
            }
        });
        krng_ms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                krng_msActionPerformed(evt);
            }
        });
        pn_ms.add(krng_ms);
        krng_ms.setBounds(0, 190, 50, 23);

        qty_ms.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        qty_ms.setForeground(new java.awt.Color(218, 165, 32));
        qty_ms.setText("Quantity    :");
        pn_ms.add(qty_ms);
        qty_ms.setBounds(0, 160, 100, 19);

        ft_ms.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ft_ms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_drink/milkshake.png"))); // NOI18N
        pn_ms.add(ft_ms);
        ft_ms.setBounds(0, 30, 180, 100);

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(218, 165, 32));
        jLabel13.setText("Price           :");
        pn_ms.add(jLabel13);
        jLabel13.setBounds(0, 140, 90, 19);

        jLabel28.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(218, 165, 32));
        jLabel28.setText("24.000");
        pn_ms.add(jLabel28);
        jLabel28.setBounds(120, 140, 70, 19);

        bg.add(pn_ms);
        pn_ms.setBounds(20, 910, 180, 220);

        pn_ic.setBackground(new java.awt.Color(0, 0, 0));
        pn_ic.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        pn_ic.setMaximumSize(new java.awt.Dimension(180, 200));
        pn_ic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pn_icMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pn_icMouseExited(evt);
            }
        });
        pn_ic.setLayout(null);

        nm_ic.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        nm_ic.setForeground(new java.awt.Color(218, 165, 32));
        nm_ic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nm_ic.setText("ICE CREAM");
        pn_ic.add(nm_ic);
        nm_ic.setBounds(0, 0, 180, 26);

        q11.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        q11.setForeground(new java.awt.Color(218, 165, 32));
        q11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q11.setText("0");
        pn_ic.add(q11);
        q11.setBounds(140, 160, 30, 19);

        tmbh_ic.setFont(new java.awt.Font("Segoe UI Black", 1, 11)); // NOI18N
        tmbh_ic.setText("+");
        tmbh_ic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tmbh_icMouseEntered(evt);
            }
        });
        tmbh_ic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbh_icActionPerformed(evt);
            }
        });
        pn_ic.add(tmbh_ic);
        tmbh_ic.setBounds(130, 190, 50, 23);

        krng_ic.setFont(new java.awt.Font("Segoe UI Black", 1, 11)); // NOI18N
        krng_ic.setText("-");
        krng_ic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                krng_icMouseEntered(evt);
            }
        });
        krng_ic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                krng_icActionPerformed(evt);
            }
        });
        pn_ic.add(krng_ic);
        krng_ic.setBounds(0, 190, 50, 23);

        qty_ic.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        qty_ic.setForeground(new java.awt.Color(218, 165, 32));
        qty_ic.setText("Quantity    :");
        pn_ic.add(qty_ic);
        qty_ic.setBounds(0, 160, 100, 19);

        ft_ic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ft_ic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_drink/icecream.png"))); // NOI18N
        pn_ic.add(ft_ic);
        ft_ic.setBounds(0, 30, 180, 100);

        jLabel14.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(218, 165, 32));
        jLabel14.setText("Price           :");
        pn_ic.add(jLabel14);
        jLabel14.setBounds(0, 140, 90, 19);

        jLabel29.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(218, 165, 32));
        jLabel29.setText("20.000");
        pn_ic.add(jLabel29);
        jLabel29.setBounds(120, 140, 70, 19);

        bg.add(pn_ic);
        pn_ic.setBounds(250, 910, 180, 220);

        latte.setBackground(new java.awt.Color(0, 0, 0));
        latte.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        latte.setMaximumSize(new java.awt.Dimension(180, 200));
        latte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                latteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                latteMouseExited(evt);
            }
        });
        latte.setLayout(null);

        nm_latte.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        nm_latte.setForeground(new java.awt.Color(218, 165, 32));
        nm_latte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nm_latte.setText("LATTE");
        latte.add(nm_latte);
        nm_latte.setBounds(0, 0, 180, 26);

        q12.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        q12.setForeground(new java.awt.Color(218, 165, 32));
        q12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        q12.setText("0");
        latte.add(q12);
        q12.setBounds(140, 160, 30, 19);

        tmbh_latte.setFont(new java.awt.Font("Segoe UI Black", 1, 11)); // NOI18N
        tmbh_latte.setText("+");
        tmbh_latte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tmbh_latteMouseEntered(evt);
            }
        });
        tmbh_latte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tmbh_latteActionPerformed(evt);
            }
        });
        latte.add(tmbh_latte);
        tmbh_latte.setBounds(130, 190, 50, 23);

        krng_latte.setFont(new java.awt.Font("Segoe UI Black", 1, 11)); // NOI18N
        krng_latte.setText("-");
        krng_latte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                krng_latteMouseEntered(evt);
            }
        });
        krng_latte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                krng_latteActionPerformed(evt);
            }
        });
        latte.add(krng_latte);
        krng_latte.setBounds(0, 190, 50, 23);

        ft_latte.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ft_latte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img_drink/latte.png"))); // NOI18N
        latte.add(ft_latte);
        ft_latte.setBounds(0, 30, 180, 100);

        qty_latte.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        qty_latte.setForeground(new java.awt.Color(218, 165, 32));
        qty_latte.setText("Quantity    :");
        latte.add(qty_latte);
        qty_latte.setBounds(0, 160, 100, 19);

        jLabel15.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(218, 165, 32));
        jLabel15.setText("Price           :");
        latte.add(jLabel15);
        jLabel15.setBounds(0, 140, 90, 19);

        jLabel30.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(218, 165, 32));
        jLabel30.setText("26.000");
        latte.add(jLabel30);
        jLabel30.setBounds(120, 140, 70, 19);

        bg.add(latte);
        latte.setBounds(480, 910, 180, 220);

        dsr_drink.setBackground(new java.awt.Color(0, 0, 0));
        dsr_drink.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        dsr_drink.setLayout(new java.awt.BorderLayout());
        bg.add(dsr_drink);
        dsr_drink.setBounds(680, 630, 480, 470);

        jLabel18.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(218, 165, 32));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("MENU FOOD");
        jLabel18.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        bg.add(jLabel18);
        jLabel18.setBounds(0, 20, 1200, 28);

        dsr_food.setBackground(new java.awt.Color(0, 0, 0));
        dsr_food.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        dsr_food.setLayout(new java.awt.BorderLayout());
        bg.add(dsr_food);
        dsr_food.setBounds(680, 70, 480, 460);

        jLabel19.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(218, 165, 32));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("MENU DRINK");
        jLabel19.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        bg.add(jLabel19);
        jLabel19.setBounds(0, 580, 1200, 28);

        JTable.setBackground(new java.awt.Color(251, 213, 176));
        JTable.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Item", "Qty", "Price"
            }
        ));
        JTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JTable);

        bg.add(jScrollPane2);
        jScrollPane2.setBounds(22, 1220, 1140, 170);

        jPanel3.setBackground(new java.awt.Color(251, 213, 176));

        jButton13.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton13.setText("Delete");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setText("Total       :");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setText("Cash      :");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("Balance :");

        total.setBackground(new java.awt.Color(255, 255, 255));
        total.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        total.setText("00");

        pay.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        pay.setText("0");
        pay.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                payKeyReleased(evt);
            }
        });

        bal.setBackground(new java.awt.Color(255, 255, 255));
        bal.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        bal.setText("00");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bal))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(929, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton13)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(total))
                .addGap(5, 5, 5)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(bal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton13)
                .addGap(31, 31, 31))
        );

        bg.add(jPanel3);
        jPanel3.setBounds(20, 1390, 1140, 128);

        jButton12.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton12.setText("Pay & Print");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        bg.add(jButton12);
        jButton12.setBounds(20, 1520, 1140, 24);

        desk_cinnamon.setBackground(new java.awt.Color(255, 255, 255));
        desk_cinnamon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desk_cinnamonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout desk_cinnamonLayout = new javax.swing.GroupLayout(desk_cinnamon);
        desk_cinnamon.setLayout(desk_cinnamonLayout);
        desk_cinnamonLayout.setHorizontalGroup(
            desk_cinnamonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        desk_cinnamonLayout.setVerticalGroup(
            desk_cinnamonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        bg.add(desk_cinnamon);
        desk_cinnamon.setBounds(820, 540, 20, 20);

        desk_bolognese.setBackground(new java.awt.Color(255, 255, 255));
        desk_bolognese.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desk_bologneseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout desk_bologneseLayout = new javax.swing.GroupLayout(desk_bolognese);
        desk_bolognese.setLayout(desk_bologneseLayout);
        desk_bologneseLayout.setHorizontalGroup(
            desk_bologneseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        desk_bologneseLayout.setVerticalGroup(
            desk_bologneseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        bg.add(desk_bolognese);
        desk_bolognese.setBounds(860, 540, 20, 20);

        desk_croffle.setBackground(new java.awt.Color(255, 255, 255));
        desk_croffle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desk_croffleMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout desk_croffleLayout = new javax.swing.GroupLayout(desk_croffle);
        desk_croffle.setLayout(desk_croffleLayout);
        desk_croffleLayout.setHorizontalGroup(
            desk_croffleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        desk_croffleLayout.setVerticalGroup(
            desk_croffleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        bg.add(desk_croffle);
        desk_croffle.setBounds(900, 540, 20, 20);

        desk_carbonara.setBackground(new java.awt.Color(255, 255, 255));
        desk_carbonara.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desk_carbonaraMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout desk_carbonaraLayout = new javax.swing.GroupLayout(desk_carbonara);
        desk_carbonara.setLayout(desk_carbonaraLayout);
        desk_carbonaraLayout.setHorizontalGroup(
            desk_carbonaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        desk_carbonaraLayout.setVerticalGroup(
            desk_carbonaraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        bg.add(desk_carbonara);
        desk_carbonara.setBounds(940, 540, 20, 20);

        desk_tiramisu.setBackground(new java.awt.Color(255, 255, 255));
        desk_tiramisu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desk_tiramisuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout desk_tiramisuLayout = new javax.swing.GroupLayout(desk_tiramisu);
        desk_tiramisu.setLayout(desk_tiramisuLayout);
        desk_tiramisuLayout.setHorizontalGroup(
            desk_tiramisuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        desk_tiramisuLayout.setVerticalGroup(
            desk_tiramisuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        bg.add(desk_tiramisu);
        desk_tiramisu.setBounds(980, 540, 20, 20);

        desk_lasagna.setBackground(new java.awt.Color(255, 255, 255));
        desk_lasagna.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desk_lasagnaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout desk_lasagnaLayout = new javax.swing.GroupLayout(desk_lasagna);
        desk_lasagna.setLayout(desk_lasagnaLayout);
        desk_lasagnaLayout.setHorizontalGroup(
            desk_lasagnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        desk_lasagnaLayout.setVerticalGroup(
            desk_lasagnaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        bg.add(desk_lasagna);
        desk_lasagna.setBounds(1020, 540, 20, 20);

        desk_americano.setBackground(new java.awt.Color(255, 255, 255));
        desk_americano.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desk_americanoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout desk_americanoLayout = new javax.swing.GroupLayout(desk_americano);
        desk_americano.setLayout(desk_americanoLayout);
        desk_americanoLayout.setHorizontalGroup(
            desk_americanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        desk_americanoLayout.setVerticalGroup(
            desk_americanoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        bg.add(desk_americano);
        desk_americano.setBounds(820, 1110, 20, 20);

        desk_lt.setBackground(new java.awt.Color(255, 255, 255));
        desk_lt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desk_ltMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout desk_ltLayout = new javax.swing.GroupLayout(desk_lt);
        desk_lt.setLayout(desk_ltLayout);
        desk_ltLayout.setHorizontalGroup(
            desk_ltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        desk_ltLayout.setVerticalGroup(
            desk_ltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        bg.add(desk_lt);
        desk_lt.setBounds(860, 1110, 20, 20);

        desk_macha.setBackground(new java.awt.Color(255, 255, 255));
        desk_macha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desk_machaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout desk_machaLayout = new javax.swing.GroupLayout(desk_macha);
        desk_macha.setLayout(desk_machaLayout);
        desk_machaLayout.setHorizontalGroup(
            desk_machaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        desk_machaLayout.setVerticalGroup(
            desk_machaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        bg.add(desk_macha);
        desk_macha.setBounds(900, 1110, 20, 20);

        desk_ms.setBackground(new java.awt.Color(255, 255, 255));
        desk_ms.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desk_msMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout desk_msLayout = new javax.swing.GroupLayout(desk_ms);
        desk_ms.setLayout(desk_msLayout);
        desk_msLayout.setHorizontalGroup(
            desk_msLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        desk_msLayout.setVerticalGroup(
            desk_msLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        bg.add(desk_ms);
        desk_ms.setBounds(940, 1110, 20, 20);

        desk_ic.setBackground(new java.awt.Color(255, 255, 255));
        desk_ic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desk_icMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout desk_icLayout = new javax.swing.GroupLayout(desk_ic);
        desk_ic.setLayout(desk_icLayout);
        desk_icLayout.setHorizontalGroup(
            desk_icLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        desk_icLayout.setVerticalGroup(
            desk_icLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        bg.add(desk_ic);
        desk_ic.setBounds(980, 1110, 20, 20);

        desk_latte.setBackground(new java.awt.Color(255, 255, 255));
        desk_latte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desk_latteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout desk_latteLayout = new javax.swing.GroupLayout(desk_latte);
        desk_latte.setLayout(desk_latteLayout);
        desk_latteLayout.setHorizontalGroup(
            desk_latteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        desk_latteLayout.setVerticalGroup(
            desk_latteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        bg.add(desk_latte);
        desk_latte.setBounds(1020, 1110, 20, 20);

        jScrollPane1.setViewportView(bg);

        add(jScrollPane1, "card3");
    }// </editor-fold>//GEN-END:initComponents

    private void tmbh_cinnamonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tmbh_cinnamonMouseEntered
        pn_cinnamon.setBackground(Color.GRAY);
    }//GEN-LAST:event_tmbh_cinnamonMouseEntered

    private void tmbh_cinnamonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbh_cinnamonActionPerformed
        int i = Integer.valueOf(q1.getText());
        ++i;
        q1.setText(String.valueOf(i));

        addtables(1, "Cinnamon  ", i,37.500);

        cal();
    }//GEN-LAST:event_tmbh_cinnamonActionPerformed

    private void krng_cinnamonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_krng_cinnamonMouseEntered
        pn_cinnamon.setBackground(Color.GRAY);
    }//GEN-LAST:event_krng_cinnamonMouseEntered

    private void krng_cinnamonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_krng_cinnamonActionPerformed
        int i = Integer.valueOf(q1.getText());
        --i;
        q1.setText(String.valueOf(i));

        addtables(1, "Cinnamon  ", i,37.500);

        cal();
    }//GEN-LAST:event_krng_cinnamonActionPerformed

    private void pn_cinnamonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_cinnamonMouseEntered
        pn_cinnamon.setBackground(Color.GRAY);
        
        dsr_food.removeAll();
        dsr_food.add(new cinnamon());
        dsr_food.repaint();
        dsr_food.revalidate();
        
        desk_cinnamon.setBackground(Color.GRAY);
        desk_bolognese.setBackground(Color.WHITE);
        desk_croffle.setBackground(Color.WHITE);
        desk_carbonara.setBackground(Color.WHITE);
        desk_tiramisu.setBackground(Color.WHITE);
        desk_lasagna.setBackground(Color.WHITE);
    }//GEN-LAST:event_pn_cinnamonMouseEntered

    private void pn_cinnamonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_cinnamonMouseExited
        pn_cinnamon.setBackground(Color.BLACK);
    }//GEN-LAST:event_pn_cinnamonMouseExited

    private void tmbh_spgtyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tmbh_spgtyMouseEntered
        pn_spaghetti.setBackground(Color.GRAY);
    }//GEN-LAST:event_tmbh_spgtyMouseEntered

    private void tmbh_spgtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbh_spgtyActionPerformed
        int i = Integer.valueOf(q2.getText());
        ++i;
        q2.setText(String.valueOf(i));

        addtables(2, "Bolognesse", i,43.000);

        cal();
    }//GEN-LAST:event_tmbh_spgtyActionPerformed

    private void krng_spgtyMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_krng_spgtyMouseEntered
        pn_spaghetti.setBackground(Color.GRAY);
    }//GEN-LAST:event_krng_spgtyMouseEntered

    private void krng_spgtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_krng_spgtyActionPerformed
        int i = Integer.valueOf(q2.getText());
        --i;
        q2.setText(String.valueOf(i));

        addtables(2, "Bolognesse", i,43.000);

        cal();
    }//GEN-LAST:event_krng_spgtyActionPerformed

    private void pn_spaghettiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_spaghettiMouseEntered
        pn_spaghetti.setBackground(Color.GRAY);
        
        dsr_food.removeAll();
        dsr_food.add(new bolognese());
        dsr_food.repaint();
        dsr_food.revalidate();
        
        desk_cinnamon.setBackground(Color.WHITE);
        desk_bolognese.setBackground(Color.GRAY);
        desk_croffle.setBackground(Color.WHITE);
        desk_carbonara.setBackground(Color.WHITE);
        desk_tiramisu.setBackground(Color.WHITE);
        desk_lasagna.setBackground(Color.WHITE);
    }//GEN-LAST:event_pn_spaghettiMouseEntered

    private void pn_spaghettiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_spaghettiMouseExited
        pn_spaghetti.setBackground(Color.BLACK);
    }//GEN-LAST:event_pn_spaghettiMouseExited

    private void tmbh_croffleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tmbh_croffleMouseEntered
        pn_croffle.setBackground(Color.GRAY);
    }//GEN-LAST:event_tmbh_croffleMouseEntered

    private void tmbh_croffleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbh_croffleActionPerformed
        int i = Integer.valueOf(q3.getText());
        ++i;
        q3.setText(String.valueOf(i));

        addtables(3, "Croffle", i,25.000);

        cal();
    }//GEN-LAST:event_tmbh_croffleActionPerformed

    private void krng_croffleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_krng_croffleMouseEntered
        pn_croffle.setBackground(Color.GRAY);
    }//GEN-LAST:event_krng_croffleMouseEntered

    private void krng_croffleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_krng_croffleActionPerformed
        int i = Integer.valueOf(q3.getText());
        --i;
        q3.setText(String.valueOf(i));

        addtables(3, "Croffle", i,25.000);

        cal();
    }//GEN-LAST:event_krng_croffleActionPerformed

    private void pn_croffleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_croffleMouseEntered
        pn_croffle.setBackground(Color.GRAY);
        
        dsr_food.removeAll();
        dsr_food.add(new croffle());
        dsr_food.repaint();
        dsr_food.revalidate();
        
        desk_cinnamon.setBackground(Color.WHITE);
        desk_bolognese.setBackground(Color.WHITE);
        desk_croffle.setBackground(Color.GRAY);
        desk_carbonara.setBackground(Color.WHITE);
        desk_tiramisu.setBackground(Color.WHITE);
        desk_lasagna.setBackground(Color.WHITE);
    }//GEN-LAST:event_pn_croffleMouseEntered

    private void pn_croffleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_croffleMouseExited
        pn_croffle.setBackground(Color.BLACK);
    }//GEN-LAST:event_pn_croffleMouseExited

    private void tmbh_carbonaraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tmbh_carbonaraMouseEntered
        pn_carbonara.setBackground(Color.GRAY);
    }//GEN-LAST:event_tmbh_carbonaraMouseEntered

    private void tmbh_carbonaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbh_carbonaraActionPerformed
        int i = Integer.valueOf(q4.getText());
        ++i;
        q4.setText(String.valueOf(i));

        addtables(4, "Carbonara", i,43.000);

        cal();
    }//GEN-LAST:event_tmbh_carbonaraActionPerformed

    private void krng_carbonaraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_krng_carbonaraMouseEntered
        pn_carbonara.setBackground(Color.GRAY);
    }//GEN-LAST:event_krng_carbonaraMouseEntered

    private void krng_carbonaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_krng_carbonaraActionPerformed
        int i = Integer.valueOf(q4.getText());
        --i;
        q4.setText(String.valueOf(i));

        addtables(4, "Carbonara", i,43.000);

        cal();
    }//GEN-LAST:event_krng_carbonaraActionPerformed

    private void pn_carbonaraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_carbonaraMouseClicked

    }//GEN-LAST:event_pn_carbonaraMouseClicked

    private void pn_carbonaraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_carbonaraMouseEntered
        pn_carbonara.setBackground(Color.GRAY);
        
        dsr_food.removeAll();
        dsr_food.add(new carbonara());
        dsr_food.repaint();
        dsr_food.revalidate();
        
        desk_cinnamon.setBackground(Color.WHITE);
        desk_bolognese.setBackground(Color.WHITE);
        desk_croffle.setBackground(Color.WHITE);
        desk_carbonara.setBackground(Color.GRAY);
        desk_tiramisu.setBackground(Color.WHITE);
        desk_lasagna.setBackground(Color.WHITE);
    }//GEN-LAST:event_pn_carbonaraMouseEntered

    private void pn_carbonaraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_carbonaraMouseExited
        pn_carbonara.setBackground(Color.BLACK);
    }//GEN-LAST:event_pn_carbonaraMouseExited

    private void tmbh_tiramisuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tmbh_tiramisuMouseEntered
        pn_tiramisu.setBackground(Color.GRAY);
    }//GEN-LAST:event_tmbh_tiramisuMouseEntered

    private void tmbh_tiramisuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbh_tiramisuActionPerformed
        int i = Integer.valueOf(q5.getText());
        ++i;
        q5.setText(String.valueOf(i));

        addtables(5, "Tiramisu", i,35.000);

        cal();
    }//GEN-LAST:event_tmbh_tiramisuActionPerformed

    private void krng_tiramisuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_krng_tiramisuMouseEntered
        pn_tiramisu.setBackground(Color.GRAY);
    }//GEN-LAST:event_krng_tiramisuMouseEntered

    private void krng_tiramisuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_krng_tiramisuActionPerformed
        int i = Integer.valueOf(q5.getText());
        --i;
        q5.setText(String.valueOf(i));

        addtables(5, "Tiramisu", i,35.000);

        cal();
    }//GEN-LAST:event_krng_tiramisuActionPerformed

    private void pn_tiramisuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_tiramisuMouseEntered
        pn_tiramisu.setBackground(Color.GRAY);
        
        dsr_food.removeAll();
        dsr_food.add(new tiramisu());
        dsr_food.repaint();
        dsr_food.revalidate();
        
        desk_cinnamon.setBackground(Color.WHITE);
        desk_bolognese.setBackground(Color.WHITE);
        desk_croffle.setBackground(Color.WHITE);
        desk_carbonara.setBackground(Color.WHITE);
        desk_tiramisu.setBackground(Color.GRAY);
        desk_lasagna.setBackground(Color.WHITE);
    }//GEN-LAST:event_pn_tiramisuMouseEntered

    private void pn_tiramisuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_tiramisuMouseExited
        pn_tiramisu.setBackground(Color.BLACK);
    }//GEN-LAST:event_pn_tiramisuMouseExited

    private void tmbh_lasagnaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tmbh_lasagnaMouseEntered
        pn_lasagna.setBackground(Color.GRAY);
    }//GEN-LAST:event_tmbh_lasagnaMouseEntered

    private void tmbh_lasagnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbh_lasagnaActionPerformed
        int i = Integer.valueOf(q6.getText());
        ++i;
        q6.setText(String.valueOf(i));

        addtables(6, "Lasagna", i,46.000);

        cal();
    }//GEN-LAST:event_tmbh_lasagnaActionPerformed

    private void krng_lasagnaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_krng_lasagnaMouseEntered
        pn_lasagna.setBackground(Color.GRAY);
    }//GEN-LAST:event_krng_lasagnaMouseEntered

    private void krng_lasagnaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_krng_lasagnaActionPerformed
        int i = Integer.valueOf(q6.getText());
        --i;
        q6.setText(String.valueOf(i));

        addtables(6, "Lasagna", i,46.000);

        cal();
    }//GEN-LAST:event_krng_lasagnaActionPerformed

    private void pn_lasagnaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_lasagnaMouseEntered
        pn_lasagna.setBackground(Color.GRAY);
        
        dsr_food.removeAll();
        dsr_food.add(new lasagna());
        dsr_food.repaint();
        dsr_food.revalidate();
        
        desk_cinnamon.setBackground(Color.WHITE);
        desk_bolognese.setBackground(Color.WHITE);
        desk_croffle.setBackground(Color.WHITE);
        desk_carbonara.setBackground(Color.WHITE);
        desk_tiramisu.setBackground(Color.WHITE);
        desk_lasagna.setBackground(Color.GRAY);
    }//GEN-LAST:event_pn_lasagnaMouseEntered

    private void pn_lasagnaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_lasagnaMouseExited
        pn_lasagna.setBackground(Color.BLACK);
    }//GEN-LAST:event_pn_lasagnaMouseExited

    private void pn_icMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_icMouseExited
        pn_ic.setBackground(Color.BLACK);
    }//GEN-LAST:event_pn_icMouseExited

    private void pn_icMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_icMouseEntered
        pn_ic.setBackground(Color.GRAY);
        
        dsr_drink.removeAll();
        dsr_drink.add(new ice_cream());
        dsr_drink.repaint();
        dsr_drink.revalidate();
        
        desk_americano.setBackground(Color.WHITE);
        desk_lt.setBackground(Color.WHITE);
        desk_macha.setBackground(Color.WHITE);
        desk_ms.setBackground(Color.WHITE);
        desk_ic.setBackground(Color.GRAY);
        desk_latte.setBackground(Color.WHITE);
    }//GEN-LAST:event_pn_icMouseEntered

    private void krng_icActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_krng_icActionPerformed
        int i = Integer.valueOf(q11.getText());
        --i;
        q11.setText(String.valueOf(i));

        addtables(5, "Ice Cream", i,20.000);

        cal();
    }//GEN-LAST:event_krng_icActionPerformed

    private void krng_icMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_krng_icMouseEntered
        pn_ic.setBackground(Color.GRAY);
    }//GEN-LAST:event_krng_icMouseEntered

    private void tmbh_icActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbh_icActionPerformed
        int i = Integer.valueOf(q11.getText());
        ++i;
        q11.setText(String.valueOf(i));

        addtables(5, "Ice Cream", i,20.000);

        cal();
    }//GEN-LAST:event_tmbh_icActionPerformed

    private void tmbh_icMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tmbh_icMouseEntered
        pn_ic.setBackground(Color.GRAY);
    }//GEN-LAST:event_tmbh_icMouseEntered

    private void pn_americanoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_americanoMouseExited
        pn_americano.setBackground(Color.BLACK);
    }//GEN-LAST:event_pn_americanoMouseExited

    private void pn_americanoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_americanoMouseEntered
        pn_americano.setBackground(Color.GRAY);
        
        dsr_drink.removeAll();
        dsr_drink.add(new americano());
        dsr_drink.repaint();
        dsr_drink.revalidate();
        
        desk_americano.setBackground(Color.GRAY);
        desk_lt.setBackground(Color.WHITE);
        desk_macha.setBackground(Color.WHITE);
        desk_ms.setBackground(Color.WHITE);
        desk_ic.setBackground(Color.WHITE);
        desk_latte.setBackground(Color.WHITE);
    }//GEN-LAST:event_pn_americanoMouseEntered

    private void krng_americanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_krng_americanoActionPerformed
        int i = Integer.valueOf(q7.getText());
        --i;
        q7.setText(String.valueOf(i));

        addtables(1, "Ice Americano", i,22.000);

        cal();
    }//GEN-LAST:event_krng_americanoActionPerformed

    private void krng_americanoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_krng_americanoMouseEntered
        pn_americano.setBackground(Color.GRAY);
    }//GEN-LAST:event_krng_americanoMouseEntered

    private void tmbh_americanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbh_americanoActionPerformed
        int i = Integer.valueOf(q7.getText());
        ++i;
        q7.setText(String.valueOf(i));

        addtables(1, "Ice Americano", i,22.000);

        cal();
    }//GEN-LAST:event_tmbh_americanoActionPerformed

    private void tmbh_americanoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tmbh_americanoMouseEntered
        pn_americano.setBackground(Color.GRAY);
    }//GEN-LAST:event_tmbh_americanoMouseEntered

    private void pn_msMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_msMouseExited
        pn_ms.setBackground(Color.BLACK);
    }//GEN-LAST:event_pn_msMouseExited

    private void pn_msMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_msMouseEntered
        pn_ms.setBackground(Color.GRAY);
        
        dsr_drink.removeAll();
        dsr_drink.add(new milk_shake());
        dsr_drink.repaint();
        dsr_drink.revalidate();
        
        desk_americano.setBackground(Color.WHITE);
        desk_lt.setBackground(Color.WHITE);
        desk_macha.setBackground(Color.WHITE);
        desk_ms.setBackground(Color.GRAY);
        desk_ic.setBackground(Color.WHITE);
        desk_latte.setBackground(Color.WHITE);
    }//GEN-LAST:event_pn_msMouseEntered

    private void pn_msMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_msMouseClicked

    }//GEN-LAST:event_pn_msMouseClicked

    private void krng_msActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_krng_msActionPerformed
        int i = Integer.valueOf(q10.getText());
        --i;
        q10.setText(String.valueOf(i));

        addtables(4, "Milk Shake", i,24.000);

        cal();
    }//GEN-LAST:event_krng_msActionPerformed

    private void krng_msMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_krng_msMouseEntered
        pn_ms.setBackground(Color.GRAY);
    }//GEN-LAST:event_krng_msMouseEntered

    private void tmbh_msActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbh_msActionPerformed
        int i = Integer.valueOf(q10.getText());
        ++i;
        q10.setText(String.valueOf(i));

        addtables(4, "Milk Shake", i,24.000);

        cal();
    }//GEN-LAST:event_tmbh_msActionPerformed

    private void tmbh_msMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tmbh_msMouseEntered
        pn_ms.setBackground(Color.GRAY);
    }//GEN-LAST:event_tmbh_msMouseEntered

    private void pn_machaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_machaMouseExited
        pn_macha.setBackground(Color.BLACK);
    }//GEN-LAST:event_pn_machaMouseExited

    private void pn_machaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_machaMouseEntered
        pn_macha.setBackground(Color.GRAY);
        
        dsr_drink.removeAll();
        dsr_drink.add(new macha());
        dsr_drink.repaint();
        dsr_drink.revalidate();
        
        desk_americano.setBackground(Color.WHITE);
        desk_lt.setBackground(Color.WHITE);
        desk_macha.setBackground(Color.GRAY);
        desk_ms.setBackground(Color.WHITE);
        desk_ic.setBackground(Color.WHITE);
        desk_latte.setBackground(Color.WHITE);
    }//GEN-LAST:event_pn_machaMouseEntered

    private void krng_machaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_krng_machaActionPerformed
        int i = Integer.valueOf(q9.getText());
        --i;
        q9.setText(String.valueOf(i));

        addtables(3, "Macha", i,25.000);

        cal();
    }//GEN-LAST:event_krng_machaActionPerformed

    private void krng_machaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_krng_machaMouseEntered
        pn_macha.setBackground(Color.GRAY);
    }//GEN-LAST:event_krng_machaMouseEntered

    private void tmbh_machaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbh_machaActionPerformed
        int i = Integer.valueOf(q9.getText());
        ++i;
        q9.setText(String.valueOf(i));

        addtables(3, "Macha", i,25.000);

        cal();
    }//GEN-LAST:event_tmbh_machaActionPerformed

    private void tmbh_machaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tmbh_machaMouseEntered
        pn_macha.setBackground(Color.GRAY);
    }//GEN-LAST:event_tmbh_machaMouseEntered

    private void latteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_latteMouseExited
        latte.setBackground(Color.BLACK);
    }//GEN-LAST:event_latteMouseExited

    private void latteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_latteMouseEntered
        latte.setBackground(Color.GRAY);
        
        dsr_drink.removeAll();
        dsr_drink.add(new latte());
        dsr_drink.repaint();
        dsr_drink.revalidate();
        
        desk_americano.setBackground(Color.WHITE);
        desk_lt.setBackground(Color.WHITE);
        desk_macha.setBackground(Color.WHITE);
        desk_ms.setBackground(Color.WHITE);
        desk_ic.setBackground(Color.WHITE);
        desk_latte.setBackground(Color.GRAY);
    }//GEN-LAST:event_latteMouseEntered

    private void krng_latteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_krng_latteActionPerformed
        int i = Integer.valueOf(q12.getText());
        --i;
        q12.setText(String.valueOf(i));

        addtables(6, "Latte", i,26.000);

        cal();
    }//GEN-LAST:event_krng_latteActionPerformed

    private void krng_latteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_krng_latteMouseEntered
        latte.setBackground(Color.GRAY);
    }//GEN-LAST:event_krng_latteMouseEntered

    private void tmbh_latteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbh_latteActionPerformed
        int i = Integer.valueOf(q12.getText());
        ++i;
        q12.setText(String.valueOf(i));

        addtables(6, "Latte", i,26.000);

        cal();
    }//GEN-LAST:event_tmbh_latteActionPerformed

    private void tmbh_latteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tmbh_latteMouseEntered
        latte.setBackground(Color.GRAY);
    }//GEN-LAST:event_tmbh_latteMouseEntered

    private void pn_ltMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_ltMouseExited
        pn_lt.setBackground(Color.BLACK);
    }//GEN-LAST:event_pn_ltMouseExited

    private void pn_ltMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pn_ltMouseEntered
        pn_lt.setBackground(Color.GRAY);
        
        dsr_drink.removeAll();
        dsr_drink.add(new lt());
        dsr_drink.repaint();
        dsr_drink.revalidate();
        
        desk_americano.setBackground(Color.WHITE);
        desk_lt.setBackground(Color.GRAY);
        desk_macha.setBackground(Color.WHITE);
        desk_ms.setBackground(Color.WHITE);
        desk_ic.setBackground(Color.WHITE);
        desk_latte.setBackground(Color.WHITE);
    }//GEN-LAST:event_pn_ltMouseEntered

    private void krng_ltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_krng_ltActionPerformed
        int i = Integer.valueOf(q8.getText());
        --i;
        q8.setText(String.valueOf(i));

        addtables(2, "Lemon Tea", i,17.500);

        cal();
    }//GEN-LAST:event_krng_ltActionPerformed

    private void krng_ltMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_krng_ltMouseEntered
        pn_lt.setBackground(Color.GRAY);
    }//GEN-LAST:event_krng_ltMouseEntered

    private void tmbh_ltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tmbh_ltActionPerformed
        int i = Integer.valueOf(q8.getText());
        ++i;
        q8.setText(String.valueOf(i));

        addtables(2, "Lemon Tea", i,17.500);

        cal();
    }//GEN-LAST:event_tmbh_ltActionPerformed

    private void tmbh_ltMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tmbh_ltMouseEntered
        pn_lt.setBackground(Color.GRAY);
    }//GEN-LAST:event_tmbh_ltMouseEntered

    private void JTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTableMouseClicked

    }//GEN-LAST:event_JTableMouseClicked

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        DefaultTableModel dt = (DefaultTableModel) JTable.getModel();

        int selectedRow = JTable.getSelectedRow();

        if (selectedRow == -1) {
            // No row is selected, show message
            JOptionPane.showMessageDialog(this, "Please select a row", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // A row is selected, proceed with deletion
            String r = dt.getValueAt(selectedRow, 0).toString();

            // Remove product
            dt.removeRow(selectedRow);

            // Remove Qty Label
            System.out.println(r);
            switch (r) {
                case "1":
                q6.setText("0");
                break;
                case "2":
                q1.setText("0");
                break;
                case "3":
                q4.setText("0");
                break;
                case "4":
                q2.setText("0");
                break;
                case "5":
                q5.setText("0");
                break;
                case "6":
                q3.setText("0");
                break;
                case "7":
                q6.setText("0");
                break;
                case "8":
                q1.setText("0");
                break;
                case "9":
                q4.setText("0");
                break;
                case "10":
                q2.setText("0");
                break;
                case "11":
                q5.setText("0");
                break;
                case "12":
                q3.setText("0");
                break;
                default:
                System.out.println("over");
            }

            cal(); // After item delete, calculate total

        }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void payKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_payKeyReleased
        pay();
    }//GEN-LAST:event_payKeyReleased

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        try {

            pay();
            b.print(); //print

        } catch (PrinterException e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void desk_cinnamonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desk_cinnamonMouseClicked
        dsr_food.removeAll();
        dsr_food.add(new cinnamon());
        dsr_food.repaint();
        dsr_food.revalidate();
        
        desk_cinnamon.setBackground(Color.GRAY);
        desk_bolognese.setBackground(Color.WHITE);
        desk_croffle.setBackground(Color.WHITE);
        desk_carbonara.setBackground(Color.WHITE);
        desk_tiramisu.setBackground(Color.WHITE);
        desk_lasagna.setBackground(Color.WHITE);
    }//GEN-LAST:event_desk_cinnamonMouseClicked

    private void desk_bologneseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desk_bologneseMouseClicked
        dsr_food.removeAll();
        dsr_food.add(new bolognese());
        dsr_food.repaint();
        dsr_food.revalidate();
        
        desk_cinnamon.setBackground(Color.WHITE);
        desk_bolognese.setBackground(Color.GRAY);
        desk_croffle.setBackground(Color.WHITE);
        desk_carbonara.setBackground(Color.WHITE);
        desk_tiramisu.setBackground(Color.WHITE);
        desk_lasagna.setBackground(Color.WHITE);
    }//GEN-LAST:event_desk_bologneseMouseClicked

    private void desk_croffleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desk_croffleMouseClicked
        dsr_food.removeAll();
        dsr_food.add(new croffle());
        dsr_food.repaint();
        dsr_food.revalidate();
        
        desk_cinnamon.setBackground(Color.WHITE);
        desk_bolognese.setBackground(Color.WHITE);
        desk_croffle.setBackground(Color.GRAY);
        desk_carbonara.setBackground(Color.WHITE);
        desk_tiramisu.setBackground(Color.WHITE);
        desk_lasagna.setBackground(Color.WHITE);
    }//GEN-LAST:event_desk_croffleMouseClicked

    private void desk_carbonaraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desk_carbonaraMouseClicked
        dsr_food.removeAll();
        dsr_food.add(new carbonara());
        dsr_food.repaint();
        dsr_food.revalidate();
        
        desk_cinnamon.setBackground(Color.WHITE);
        desk_bolognese.setBackground(Color.WHITE);
        desk_croffle.setBackground(Color.WHITE);
        desk_carbonara.setBackground(Color.GRAY);
        desk_tiramisu.setBackground(Color.WHITE);
        desk_lasagna.setBackground(Color.WHITE);
    }//GEN-LAST:event_desk_carbonaraMouseClicked

    private void desk_tiramisuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desk_tiramisuMouseClicked
        dsr_food.removeAll();
        dsr_food.add(new tiramisu());
        dsr_food.repaint();
        dsr_food.revalidate();
        
        desk_cinnamon.setBackground(Color.WHITE);
        desk_bolognese.setBackground(Color.WHITE);
        desk_croffle.setBackground(Color.WHITE);
        desk_carbonara.setBackground(Color.WHITE);
        desk_tiramisu.setBackground(Color.GRAY);
        desk_lasagna.setBackground(Color.WHITE);
    }//GEN-LAST:event_desk_tiramisuMouseClicked

    private void desk_lasagnaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desk_lasagnaMouseClicked
        dsr_food.removeAll();
        dsr_food.add(new lasagna());
        dsr_food.repaint();
        dsr_food.revalidate();
        
        desk_cinnamon.setBackground(Color.WHITE);
        desk_bolognese.setBackground(Color.WHITE);
        desk_croffle.setBackground(Color.WHITE);
        desk_carbonara.setBackground(Color.WHITE);
        desk_tiramisu.setBackground(Color.WHITE);
        desk_lasagna.setBackground(Color.GRAY);
    }//GEN-LAST:event_desk_lasagnaMouseClicked

    private void desk_americanoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desk_americanoMouseClicked
        dsr_drink.removeAll();
        dsr_drink.add(new americano());
        dsr_drink.repaint();
        dsr_drink.revalidate();
        
        desk_americano.setBackground(Color.GRAY);
        desk_lt.setBackground(Color.WHITE);
        desk_macha.setBackground(Color.WHITE);
        desk_ms.setBackground(Color.WHITE);
        desk_ic.setBackground(Color.WHITE);
        desk_latte.setBackground(Color.WHITE);
    }//GEN-LAST:event_desk_americanoMouseClicked

    private void desk_ltMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desk_ltMouseClicked
        dsr_drink.removeAll();
        dsr_drink.add(new lt());
        dsr_drink.repaint();
        dsr_drink.revalidate();
        
        desk_americano.setBackground(Color.WHITE);
        desk_lt.setBackground(Color.GRAY);
        desk_macha.setBackground(Color.WHITE);
        desk_ms.setBackground(Color.WHITE);
        desk_ic.setBackground(Color.WHITE);
        desk_latte.setBackground(Color.WHITE);
    }//GEN-LAST:event_desk_ltMouseClicked

    private void desk_machaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desk_machaMouseClicked
        dsr_drink.removeAll();
        dsr_drink.add(new macha());
        dsr_drink.repaint();
        dsr_drink.revalidate();
        
        desk_americano.setBackground(Color.WHITE);
        desk_lt.setBackground(Color.WHITE);
        desk_macha.setBackground(Color.GRAY);
        desk_ms.setBackground(Color.WHITE);
        desk_ic.setBackground(Color.WHITE);
        desk_latte.setBackground(Color.WHITE);
    }//GEN-LAST:event_desk_machaMouseClicked

    private void desk_msMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desk_msMouseClicked
        dsr_drink.removeAll();
        dsr_drink.add(new milk_shake());
        dsr_drink.repaint();
        dsr_drink.revalidate();
        
        desk_americano.setBackground(Color.WHITE);
        desk_bolognese.setBackground(Color.WHITE);
        desk_macha.setBackground(Color.WHITE);
        desk_ms.setBackground(Color.GRAY);
        desk_ic.setBackground(Color.WHITE);
        desk_latte.setBackground(Color.WHITE);
    }//GEN-LAST:event_desk_msMouseClicked

    private void desk_icMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desk_icMouseClicked
        dsr_drink.removeAll();
        dsr_drink.add(new ice_cream());
        dsr_drink.repaint();
        dsr_drink.revalidate();
        
        desk_americano.setBackground(Color.WHITE);
        desk_lt.setBackground(Color.WHITE);
        desk_macha.setBackground(Color.WHITE);
        desk_ms.setBackground(Color.WHITE);
        desk_ic.setBackground(Color.GRAY);
        desk_latte.setBackground(Color.WHITE);
    }//GEN-LAST:event_desk_icMouseClicked

    private void desk_latteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desk_latteMouseClicked
        dsr_drink.removeAll();
        dsr_drink.add(new latte());
        dsr_drink.repaint();
        dsr_drink.revalidate();
        
        desk_americano.setBackground(Color.WHITE);
        desk_lt.setBackground(Color.WHITE);
        desk_macha.setBackground(Color.WHITE);
        desk_ms.setBackground(Color.WHITE);
        desk_ic.setBackground(Color.WHITE);
        desk_latte.setBackground(Color.GRAY);
    }//GEN-LAST:event_desk_latteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTable;
    private javax.swing.JTextArea b;
    private javax.swing.JLabel bal;
    private javax.swing.JPanel bg;
    private javax.swing.JPanel desk_americano;
    private javax.swing.JPanel desk_bolognese;
    private javax.swing.JPanel desk_carbonara;
    private javax.swing.JPanel desk_cinnamon;
    private javax.swing.JPanel desk_croffle;
    private javax.swing.JPanel desk_ic;
    private javax.swing.JPanel desk_lasagna;
    private javax.swing.JPanel desk_latte;
    private javax.swing.JPanel desk_lt;
    private javax.swing.JPanel desk_macha;
    private javax.swing.JPanel desk_ms;
    private javax.swing.JPanel desk_tiramisu;
    private javax.swing.JPanel dsr_drink;
    private javax.swing.JPanel dsr_food;
    private javax.swing.JLabel ft_americano;
    private javax.swing.JLabel ft_carbonara;
    private javax.swing.JLabel ft_cinnamon1;
    private javax.swing.JLabel ft_croffle;
    private javax.swing.JLabel ft_ic;
    private javax.swing.JLabel ft_lasagna;
    private javax.swing.JLabel ft_latte;
    private javax.swing.JLabel ft_lt;
    private javax.swing.JLabel ft_macha;
    private javax.swing.JLabel ft_ms;
    private javax.swing.JLabel ft_spaghetti;
    private javax.swing.JLabel ft_tiramisu;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
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
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton krng_americano;
    private javax.swing.JButton krng_carbonara;
    private javax.swing.JButton krng_cinnamon;
    private javax.swing.JButton krng_croffle;
    private javax.swing.JButton krng_ic;
    private javax.swing.JButton krng_lasagna;
    private javax.swing.JButton krng_latte;
    private javax.swing.JButton krng_lt;
    private javax.swing.JButton krng_macha;
    private javax.swing.JButton krng_ms;
    private javax.swing.JButton krng_spgty;
    private javax.swing.JButton krng_tiramisu;
    private javax.swing.JPanel latte;
    private javax.swing.JLabel nm_americano;
    private javax.swing.JLabel nm_carbonara;
    private javax.swing.JLabel nm_cinnamon;
    private javax.swing.JLabel nm_croffle;
    private javax.swing.JLabel nm_ic;
    private javax.swing.JLabel nm_lasagna;
    private javax.swing.JLabel nm_latte;
    private javax.swing.JLabel nm_lt;
    private javax.swing.JLabel nm_macha;
    private javax.swing.JLabel nm_ms;
    private javax.swing.JLabel nm_spaghetti;
    private javax.swing.JLabel nm_tiramisu;
    private javax.swing.JTextField pay;
    private javax.swing.JPanel pn_americano;
    private javax.swing.JPanel pn_carbonara;
    private javax.swing.JPanel pn_cinnamon;
    private javax.swing.JPanel pn_croffle;
    private javax.swing.JPanel pn_ic;
    private javax.swing.JPanel pn_lasagna;
    private javax.swing.JPanel pn_lt;
    private javax.swing.JPanel pn_macha;
    private javax.swing.JPanel pn_ms;
    private javax.swing.JPanel pn_spaghetti;
    private javax.swing.JPanel pn_tiramisu;
    private javax.swing.JLabel q1;
    private javax.swing.JLabel q10;
    private javax.swing.JLabel q11;
    private javax.swing.JLabel q12;
    private javax.swing.JLabel q2;
    private javax.swing.JLabel q3;
    private javax.swing.JLabel q4;
    private javax.swing.JLabel q5;
    private javax.swing.JLabel q6;
    private javax.swing.JLabel q7;
    private javax.swing.JLabel q8;
    private javax.swing.JLabel q9;
    private javax.swing.JLabel qty_americano;
    private javax.swing.JLabel qty_carbonara;
    private javax.swing.JLabel qty_croffle;
    private javax.swing.JLabel qty_croffle1;
    private javax.swing.JLabel qty_croffle2;
    private javax.swing.JLabel qty_ic;
    private javax.swing.JLabel qty_lasagna;
    private javax.swing.JLabel qty_latte;
    private javax.swing.JLabel qty_lt;
    private javax.swing.JLabel qty_macha;
    private javax.swing.JLabel qty_ms;
    private javax.swing.JLabel qty_tiramisu;
    private javax.swing.JButton tmbh_americano;
    private javax.swing.JButton tmbh_carbonara;
    private javax.swing.JButton tmbh_cinnamon;
    private javax.swing.JButton tmbh_croffle;
    private javax.swing.JButton tmbh_ic;
    private javax.swing.JButton tmbh_lasagna;
    private javax.swing.JButton tmbh_latte;
    private javax.swing.JButton tmbh_lt;
    private javax.swing.JButton tmbh_macha;
    private javax.swing.JButton tmbh_ms;
    private javax.swing.JButton tmbh_spgty;
    private javax.swing.JButton tmbh_tiramisu;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}