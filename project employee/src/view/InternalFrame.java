package view;

import controller.DBAcess;
import java.awt.BorderLayout;
import java.awt.Container;
import java.sql.Connection;
import java.util.HashMap;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.swing.JRViewer;

public class InternalFrame extends javax.swing.JInternalFrame {

    public InternalFrame() {
        initComponents();
    }

    public InternalFrame(String filename) {
        this(filename, null);
    }

    public InternalFrame(String filename, HashMap param) {
        try {
            DBAcess db = new DBAcess();
            Connection dbcon = db.createConnection();

            JasperPrint print = JasperFillManager.
                    fillReport(filename, param, dbcon);
            JRViewer viewer = new JRViewer(print);
            Container c = getContentPane();
            c.setLayout(new BorderLayout());
            c.add(viewer);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
