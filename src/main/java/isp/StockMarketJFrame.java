package isp;

import yahoofinance.Stock;

import javax.swing.*;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StockMarketJFrame extends javax.swing.JFrame {

    private StockMarketQueryService marketService;
    private Portofolio portofolio;

    public StockMarketJFrame() {
        try {
            marketService = new StockMarketQueryService();
            marketService.requestData();
            portofolio = new Portofolio(new BigDecimal(1000));
        } catch (IOException ex) {
            Logger.getLogger(StockMarketJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        initComponents();

        this.portofolioFundsText.setText(portofolio.getFunds().toPlainString() + " $");
    }

    private void initComponents() {
        //functie generata in NetBeans IDE (drag & drop)

        Portofolio = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMarket = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        buttonRefresh = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        portofolioRefresh = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        portofolioFundsText = new javax.swing.JTextField();
        symbolComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        quantityTextField = new javax.swing.JTextField();
        buyButton = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        portofolioItems = new javax.swing.JComboBox<>();
        refreshSell = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        availableAmount = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        amountToSell = new javax.swing.JTextField();
        sellButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableMarket.setModel(marketService);
        jScrollPane1.setViewportView(jTableMarket);

        buttonRefresh.setText("Refresh");
        buttonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(buttonRefresh)
                                .addContainerGap(328, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(buttonRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0))
        );

        Portofolio.addTab("Market", jPanel1);

        jTable1.setModel(portofolio);
        jScrollPane2.setViewportView(jTable1);

        portofolioRefresh.setText("Refresh");
        portofolioRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portofolioRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(portofolioRefresh))
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(portofolioRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        Portofolio.addTab("Portofolio", jPanel2);

        jLabel1.setText("Available funds:");

        portofolioFundsText.setEditable(false);
        portofolioFundsText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portofolioFundsTextActionPerformed(evt);
            }
        });

        symbolComboBox.setModel(new DefaultComboBoxModel(marketService.getSymbols()));
        symbolComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                symbolComboBoxActionPerformed(evt);
            }
        });
        symbolComboBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                symbolComboBoxKeyPressed(evt);
            }
        });

        jLabel2.setText("Symbol:");

        jLabel3.setText("Quantity:");

        buyButton.setText("Buy");
        buyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(buyButton)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(portofolioFundsText, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                                .addComponent(quantityTextField))
                                        .addComponent(symbolComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 182, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(portofolioFundsText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(symbolComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buyButton)
                                .addGap(200, 200, 200))
        );

        Portofolio.addTab("Buy", jPanel4);

        portofolioItems.setModel(new DefaultComboBoxModel(portofolio.getStockNames()));
        portofolioItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                portofolioItemsActionPerformed(evt);
            }
        });

        refreshSell.setText("Refresh");
        refreshSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshSellActionPerformed(evt);
            }
        });

        jLabel4.setText("Available amount:");

        availableAmount.setEditable(false);
        availableAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                availableAmountActionPerformed(evt);
            }
        });

        jLabel5.setText("Amount:");

        jLabel6.setText("Stock:");

        amountToSell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountToSellActionPerformed(evt);
            }
        });

        sellButton.setText("Sell");
        sellButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(refreshSell, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel5))
                                                .addGap(23, 23, 23)
                                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(amountToSell, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel6Layout.createSequentialGroup()
                                                                .addComponent(portofolioItems, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(availableAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(sellButton))))
                                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(portofolioItems, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4)
                                        .addComponent(availableAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(amountToSell, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(sellButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 271, Short.MAX_VALUE)
                                .addComponent(refreshSell, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27))
        );

        Portofolio.addTab("Sell", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(Portofolio)
                                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Portofolio, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        pack();
    } //functie generata in NetBeans IDE (drag & drop)

    private void symbolComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void portofolioFundsTextActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void buyButtonActionPerformed(java.awt.event.ActionEvent evt) {

        Stock stock = marketService.getStocks().get((String) symbolComboBox.getSelectedItem());
        BigDecimal quantity = new BigDecimal(this.quantityTextField.getText());
        BigDecimal stockPrice = stock.getQuote().getPrice().multiply(quantity);


        if (this.portofolio.getFunds().compareTo(stockPrice) >= 0) {
            this.portofolio.setFunds(this.portofolio.getFunds().subtract(stockPrice));
            this.portofolioFundsText.setText(this.portofolio.getFunds() + " $");
            this.quantityTextField.setText("");

            if (this.portofolio.getStocks().containsKey(stock)) {
                BigDecimal newQuantity = this.portofolio.getStocks().get(stock).add(quantity);
                this.portofolio.getStocks().replace(stock, newQuantity);
            } else {
                this.portofolio.getStocks().put(stock, quantity);
                this.portofolio.getItems().add(stock);
            }
        }
    }

    private void symbolComboBoxKeyPressed(java.awt.event.KeyEvent evt) {
    }

    private void portofolioRefreshActionPerformed(java.awt.event.ActionEvent evt) {
        this.portofolio.refresh();
    }

    private void buttonRefreshActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            marketService.requestData();
        } catch (IOException ex) {
            Logger.getLogger(StockMarketJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void refreshSellActionPerformed(java.awt.event.ActionEvent evt) {
        this.portofolio.refreshStockNames();
        this.portofolioItems.setModel(new DefaultComboBoxModel(portofolio.getStockNames()));
        this.setAvailableAmount();
    }

    private void setAvailableAmount() {
        Stock stock = marketService.getStocks().get((String) portofolioItems.getSelectedItem());
        if (stock != null)
            this.availableAmount.setText(portofolio.getStocks().get(stock).toString());
        else {
            this.availableAmount.setText("");
            this.portofolioItems.setModel(new DefaultComboBoxModel(new String[]{"NO STOCKS"}));
        }

    }

    private void portofolioItemsActionPerformed(java.awt.event.ActionEvent evt) {
        this.setAvailableAmount();
    }

    private void availableAmountActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void amountToSellActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void sellButtonActionPerformed(java.awt.event.ActionEvent evt) {
        BigDecimal amount = new BigDecimal(amountToSell.getText());
        Stock stock = marketService.getStocks().get((String) portofolioItems.getSelectedItem());
        BigDecimal price = amount.multiply(stock.getQuote().getPrice());
        this.amountToSell.setText("");

        if (amount.compareTo(new BigDecimal(availableAmount.getText())) < 0) {
            this.portofolio.setFunds(portofolio.getFunds().add(price));
            portofolioFundsText.setText(portofolio.getFunds().toPlainString() + " $");
            portofolio.getStocks().replace(stock, portofolio.getStocks().get(stock).subtract(amount));
            this.setAvailableAmount();
        } else if (amount.compareTo(new BigDecimal(availableAmount.getText())) == 0) {
            this.portofolio.setFunds(portofolio.getFunds().add(price));
            portofolioFundsText.setText(portofolio.getFunds().toPlainString() + " $");

            portofolio.getStocks().remove(stock);
            portofolio.getItems().remove(stock);
            portofolio.refreshStockNames();
            this.portofolioItems.setModel(new DefaultComboBoxModel(portofolio.getStockNames()));
            this.setAvailableAmount();
        }
    }

    private javax.swing.JTabbedPane Portofolio;
    private javax.swing.JTextField amountToSell;
    private javax.swing.JTextField availableAmount;
    private javax.swing.JButton buttonRefresh;
    private javax.swing.JButton buyButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTableMarket;
    private javax.swing.JTextField portofolioFundsText;
    private javax.swing.JComboBox<String> portofolioItems;
    private javax.swing.JButton portofolioRefresh;
    private javax.swing.JTextField quantityTextField;
    private javax.swing.JButton refreshSell;
    private javax.swing.JButton sellButton;
    private javax.swing.JComboBox<String> symbolComboBox;
}
