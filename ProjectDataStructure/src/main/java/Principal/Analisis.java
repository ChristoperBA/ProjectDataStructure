/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Principal;

/**
 *
 * @author antho
 */
public class Analisis extends javax.swing.JPanel {

    /**
     * Creates new form Analisis1
     */
    public Analisis() {
        initComponents();
        text1.setText("Top 5 de los clientes con mayor cantidad de alquileres realizados.");
        text2.setText("Top 5 del vehículo que se ha alquilado la mayor cantidad de veces.");
        text3.setText("Promedio y total del monto pagado por alquileres en cada categoría de clientes. ");
        text1.setEnabled(false);
        text2.setEnabled(false);
        text3.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        text1 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        text2 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        text3 = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jEditorPane2 = new javax.swing.JEditorPane();

        setBackground(new java.awt.Color(0, 153, 51));

        text1.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        text1.setName(""); // NOI18N
        jScrollPane2.setViewportView(text1);

        text2.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jScrollPane3.setViewportView(text2);

        text3.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jScrollPane4.setViewportView(text3);

        jScrollPane1.setViewportView(jEditorPane1);

        jScrollPane5.setViewportView(jTextPane1);

        jScrollPane6.setViewportView(jEditorPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addComponent(jScrollPane5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                    .addComponent(jScrollPane6))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane6))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JEditorPane jEditorPane2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane text1;
    private javax.swing.JTextPane text2;
    private javax.swing.JTextPane text3;
    // End of variables declaration//GEN-END:variables
}
