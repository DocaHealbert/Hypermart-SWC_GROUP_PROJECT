package main;
import java.io.*;
import java.util.*;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainUI extends javax.swing.JFrame {

    /**
     * Creates new form HomeUI
     */
    public MainUI() {
        initComponents();
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private CounterChoose counterchoose;

    //TEMPORARY LIST WITHOUT COUNTER NUMBER, WILL ASSIGN TO COUNTER LIST QUEUE
    private ArrayList<CustomerInformation> customerList = new ArrayList();
    private ArrayList<String> listCustID = new ArrayList<String>();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MAIN");
        setBackground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N
        jLabel1.setText("Hypermarket");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(378, 378, 378))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(255, 204, 102));
        jButton1.setText("START");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 102, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Click Start to read txt file");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel7)
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel7)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(376, 376, 376))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(161, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    //GET ONLY SELECTED ITEM BY CUSTOMER ID TO ADD TO COUNTER
    public List filteritemdatacust(String custID) {
        Predicate<CustomerInformation> itemSelectCondition = itemsCond -> itemsCond.getCustID().equalsIgnoreCase(custID);
        List itemsCustomer = customerList.stream().filter(itemSelectCondition).collect(Collectors.toList());
        return itemsCustomer;
    }
    
    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        jButton1.setEnabled(false);
        //1. READ TEXTFILE AND ADD TO TEMPORARY ARRAY
        try {
            BufferedReader br = new BufferedReader(new FileReader("cashierapp.txt"));
            String line = br.readLine();

            String customerID = "";
            String customerIC = "";
            String customerName = "";
            String currentCustID = "";

            while (line != null) {
                //READ DATA EACH LINE
                StringTokenizer st = new StringTokenizer(line, ",");
                customerID = st.nextToken();
                customerIC = st.nextToken();
                customerName = st.nextToken();
                String itemID = st.nextToken();
                String itemName = st.nextToken();
                double itemPrice = Double.parseDouble(st.nextToken());
                String datePurchase = st.nextToken();
                if (!customerID.equalsIgnoreCase(currentCustID)) {
                    listCustID.add(customerID);
                    currentCustID = customerID;
                }

                customerList.add(new CustomerInformation(customerID, customerIC, customerName, null, itemID, itemName, itemPrice, datePurchase));

                line = br.readLine();
            }
            br.close();

            //ADD TO NEW QUEUE
            int counterswitching = 1;
            for (int i = 0; i < listCustID.size(); i++) {
                List filtereditemcustomer = filteritemdatacust(listCustID.get(i));

                if (filtereditemcustomer.size() <= 5) {
                    if (counterswitching == 1) {
                        for (int j = 0; j < filtereditemcustomer.size(); j++) {
                            CustomerInformation itemdata = (CustomerInformation) filtereditemcustomer.get(j);
                            String custID = itemdata.getCustID();
                            String custIC = itemdata.getCustIC();
                            String custName = itemdata.getCustName();
                            String itemID = itemdata.getItemID();
                            String itemName = itemdata.getItemName();
                            Double itemPrice = itemdata.getitemPrice();
                            String datePurchased = itemdata.getDatePurchase();

                            main.Main.getCounter1().add(new CustomerInformation(custID, custIC, custName, "counter1", itemID, itemName, itemPrice, datePurchased));
                        }
                        counterswitching = 2;
                    } else if (counterswitching == 2) {
                        for (int j = 0; j < filtereditemcustomer.size(); j++) {
                            CustomerInformation itemdata = (CustomerInformation) filtereditemcustomer.get(j);
                            String custID = itemdata.getCustID();
                            String custIC = itemdata.getCustIC();
                            String custName = itemdata.getCustName();
                            String itemID = itemdata.getItemID();
                            String itemName = itemdata.getItemName();
                            Double itemPrice = itemdata.getitemPrice();
                            String datePurchased = itemdata.getDatePurchase();

                            main.Main.getCounter2().add(new CustomerInformation(custID, custIC, custName, "counter2", itemID, itemName, itemPrice, datePurchased));

                        }
                        counterswitching = 1;
                    }
                } else {
                    for (int j = 0; j < filtereditemcustomer.size(); j++) {
                        CustomerInformation itemdata = (CustomerInformation) filtereditemcustomer.get(j);
                        String custID = itemdata.getCustID();
                        String custIC = itemdata.getCustIC();
                        String custName = itemdata.getCustName();
                        String itemID = itemdata.getItemID();
                        String itemName = itemdata.getItemName();
                        Double itemPrice = itemdata.getitemPrice();
                        String datePurchased = itemdata.getDatePurchase();

                        main.Main.getCounter3().add(new CustomerInformation(custID, custIC, custName, "counter3", itemID, itemName, itemPrice, datePurchased));

                    }
                }
            }

            counterchoose = new CounterChoose();
            counterchoose.setVisible(true);
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
    }//GEN-LAST:event_jButton1MouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration//GEN-END:variables

}
