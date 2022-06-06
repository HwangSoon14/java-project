package javaswingdev.form;

import javaswingdev.card.ModelCard;

public class Form_Dashboard extends javax.swing.JPanel {

    public Form_Dashboard() {
        initComponents();
        init();
    }

    private void init() {
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Tên Cửa Hàng", "Chứng Nhận", "Địa Điểm", "Ngày Cấp"
            }
        ));
        table.fixTable(jScrollPane1);
        table.addRow(new Object[]{"1", "CỬA HÀNG 1", "ISO", "ĐÀ NẴNG", "25 T8,2018"});
        table.addRow(new Object[]{"2", "CỬA HÀNG 2", "ISOOL", "Huế", "01 T9,2019"});
        table.addRow(new Object[]{"3", "CỬA HÀNG 3", "ASS", "Quảng Nam", "22 T9,2015"});
        table.addRow(new Object[]{"4", "CỬA HÀNG 4", "IS", "Sài Gòn", "26 T9,2016"});
        table.addRow(new Object[]{"5", "CỬA HÀNG 5", "NNA", "Hà Nội", "14 T9,2017"});
        table.addRow(new Object[]{"6", "CỬA HÀNG 6", "WWE", "Cao Bằng", "13 T9,2017"});
        table.addRow(new Object[]{"7", "CỬA HÀNG 7", "BOXING", "Lạng Sơn", "11 T9,2020"});
        table.addRow(new Object[]{"8", "CỬA HÀNG 8", "HOKBIETNUA", "Ai bíc", "03 T9,2019"});
        table.addRow(new Object[]{"9", "CỬA HÀNG 9", "HOKCONHO", "Mỹ", "11 T9,2019"});
        table.addRow(new Object[]{"10", "CỬA HÀNG 10", "VIPRO", "Hàn Quốc", "23 T9,2019"});
        table.addRow(new Object[]{"11", "CỬA HÀNG 11", "DINH?", "Ả rập xê út", "26 T9,2016"});
        table.addRow(new Object[]{"12", "CỬA HÀNG 12", "ALO", "Liên Xô", "21 T9,2017"});
        table.addRow(new Object[]{"13", "CỬA HÀNG 13", "KKL", "Ukraine", "10 T9,2018"});
        table.addRow(new Object[]{"14", "CỬA HÀNG 14", "ASDES", "Pháp", "13 T9,2016"});
        table.addRow(new Object[]{"15", "CỬA HÀNG 15", "ALPHA", "Anh", "15 T9,2014"});
        table.addRow(new Object[]{"16", "CỬA HÀNG 16", "BETA", "Hok bíc nữa", "16 T9,2016"});
        table.addRow(new Object[]{"17", "CỬA HÀNG 17", "CSUI", "Huế", "17 T9,2010"});
        
        
        
      
        //  init card data
        card1.setData(new ModelCard(null, null, null, "40", "CỬA HÀNG ĐÃ ĐƯỢC CẤP CHỨNG NHẬN"));
        card2.setData(new ModelCard(null, null, null, "800", "SỐ CHỨNG NHẬN TRONG KHO"));
        card3.setData(new ModelCard(null, null, null, "10", "TỔNG SỐ NGƯỜI DÙNG TRONG HỆ THỐNG"));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        card1 = new javaswingdev.card.Card();
        card2 = new javaswingdev.card.Card();
        card3 = new javaswingdev.card.Card();
        roundPanel1 = new javaswingdev.swing.RoundPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javaswingdev.swing.table.Table();

        setOpaque(false);

        card2.setColor1(new java.awt.Color(95, 211, 226));
        card2.setColor2(new java.awt.Color(26, 166, 170));
        card2.setIcon(javaswingdev.GoogleMaterialDesignIcon.PIE_CHART);

        card3.setColor1(new java.awt.Color(95, 243, 140));
        card3.setColor2(new java.awt.Color(3, 157, 27));
        card3.setIcon(javaswingdev.GoogleMaterialDesignIcon.RING_VOLUME);

        roundPanel1.setBackground(new java.awt.Color(255, 255, 255));
        roundPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        roundPanel1.setRound(10);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#", "Name", "Email", "Position", "Date Join"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
        roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(card1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(card2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30)
                        .addComponent(card3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javaswingdev.card.Card card1;
    private javaswingdev.card.Card card2;
    private javaswingdev.card.Card card3;
    private javax.swing.JScrollPane jScrollPane1;
    private javaswingdev.swing.RoundPanel roundPanel1;
    private javaswingdev.swing.table.Table table;
    // End of variables declaration//GEN-END:variables
}
