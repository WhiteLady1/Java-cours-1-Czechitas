package cz.czechitas;

import java.awt.*;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.plaf.*;
import net.miginfocom.swing.*;

public class HlavniOkno extends JFrame {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    JLabel label15;
    JLabel label16;
    JLabel label1;
    JTextField husaSamec;
    JLabel label10;
    JTextField kralikSamec;
    JLabel label2;
    JTextField husaSamice;
    JLabel label11;
    JTextField kralikSamice;
    JButton button1;
    JLabel label14;
    JLabel label12;
    JTextField celkemHusy;
    JLabel label13;
    JTextField celkemKraliku;
    JLabel label17;
    JLabel label3;
    JTextField hmotnostPsenice;
    JLabel label5;
    JLabel label7;
    JTextField hmotnostMrkve;
    JLabel label6;
    JLabel label4;
    JTextField radkyPsenice;
    JLabel label8;
    JTextField radkyMrkve;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    JPanel contentPane;
    MigLayout migLayoutManager;

    public HlavniOkno() {
        initComponents();
    }

    private void priStuskuVypocitej(ActionEvent e) {
    int samciHusa=Integer.parseInt(husaSamec.getText());
    int samiceHusa=Integer.parseInt(husaSamice.getText());
    int celkemHus;
    if (samciHusa>0){
        celkemHus=samciHusa+samiceHusa*15+samiceHusa;
    }  else {celkemHus=samiceHusa;
    }
    int samciKralik=Integer.parseInt(kralikSamec.getText());
    int samiceKralik=Integer.parseInt(kralikSamice.getText());
    int celkemKralik;
    if (samciKralik>0) {
        celkemKralik = samciKralik + samiceKralik * 40+samiceKralik;
    }else {celkemKralik=samiceKralik;
    }
    celkemHusy.setText(String.format("%10d%n",celkemHus));
    celkemKraliku.setText(String.format("%10d%n",celkemKralik));
    double psenice=(45.75*celkemHus);
    double radkuPsenice=Math.round(psenice/2);
    hmotnostPsenice.setText(String.format("%10.1f%n",psenice));
    radkyPsenice.setText(String.format("%10.0f%n",radkuPsenice));
    double mrkev=(91.5*celkemKralik);
    double radkuMrkve=Math.round(mrkev/5);
    hmotnostMrkve.setText(String.format("%10.1f%n",mrkev));
    radkyMrkve.setText(String.format("%10.0f%n",radkuMrkve));
    }


        private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        label15 = new JLabel();
        label16 = new JLabel();
        label1 = new JLabel();
        husaSamec = new JTextField();
        label10 = new JLabel();
        kralikSamec = new JTextField();
        label2 = new JLabel();
        husaSamice = new JTextField();
        label11 = new JLabel();
        kralikSamice = new JTextField();
        button1 = new JButton();
        label14 = new JLabel();
        label12 = new JLabel();
        celkemHusy = new JTextField();
        label13 = new JLabel();
        celkemKraliku = new JTextField();
        label17 = new JLabel();
        label3 = new JLabel();
        hmotnostPsenice = new JTextField();
        label5 = new JLabel();
        label7 = new JLabel();
        hmotnostMrkve = new JTextField();
        label6 = new JLabel();
        label4 = new JLabel();
        radkyPsenice = new JTextField();
        label8 = new JLabel();
        radkyMrkve = new JTextField();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Farm\u00e1\u0159ka 3.0");
        setBackground(new Color(238, 238, 238));
        setForeground(Color.black);
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "fillx,insets 0,hidemode 3,aligny top",
            // columns
            "[24,fill]" +
            "[42,fill]" +
            "[23,fill]ind" +
            "[63,fill]" +
            "[27,fill]" +
            "[40,fill]" +
            "[37,fill]" +
            "[63,fill]" +
            "[fill]" +
            "[fill]",
            // rows
            "[]" +
            "[fill]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]" +
            "[]"));
        this.contentPane = (JPanel) this.getContentPane();
        this.contentPane.setBackground(this.getBackground());
        LayoutManager layout = this.contentPane.getLayout();
        if (layout instanceof MigLayout) {
            this.migLayoutManager = (MigLayout) layout;
        }

        //---- label15 ----
        label15.setText("Husy");
        label15.setFont(new Font("Segoe UI", Font.BOLD, 20));
        contentPane.add(label15, "cell 2 0 2 1,alignx center,growx 0");

        //---- label16 ----
        label16.setText("Kr\u00e1l\u00edci");
        label16.setFont(new Font("Segoe UI", Font.BOLD, 20));
        contentPane.add(label16, "cell 6 0 2 1,alignx center,growx 0");

        //---- label1 ----
        label1.setText("Po\u010det samc\u016f:");
        contentPane.add(label1, "cell 1 1 2 1,alignx right,growx 0");

        //---- husaSamec ----
        husaSamec.setSelectionColor(Color.blue);
        husaSamec.setColumns(10);
        contentPane.add(husaSamec, "cell 3 1");

        //---- label10 ----
        label10.setText("Po\u010det samc\u016f:");
        contentPane.add(label10, "cell 5 1 2 1,alignx right,growx 0");

        //---- kralikSamec ----
        kralikSamec.setColumns(20);
        contentPane.add(kralikSamec, "cell 7 1");

        //---- label2 ----
        label2.setText("Po\u010det samic:");
        contentPane.add(label2, "cell 1 2 2 1,alignx right,growx 0");

        //---- husaSamice ----
        husaSamice.setColumns(20);
        contentPane.add(husaSamice, "cell 3 2");

        //---- label11 ----
        label11.setText("Po\u010det samic:");
        contentPane.add(label11, "cell 5 2 2 1,alignx right,growx 0");

        //---- kralikSamice ----
        kralikSamice.setColumns(20);
        contentPane.add(kralikSamice, "cell 7 2");

        //---- button1 ----
        button1.setText("Vypo\u010d\u00edtat");
        button1.addActionListener(e -> priStuskuVypocitej(e));
        contentPane.add(button1, "cell 4 3 2 1,align center center,grow 0 0");

        //---- label14 ----
        label14.setText("Celkov\u00fd po\u010det po sez\u00f3n\u011b p\u0159ed zimou");
        label14.setFont(new Font("Segoe UI", Font.BOLD, 16));
        contentPane.add(label14, "cell 1 4 5 1");

        //---- label12 ----
        label12.setText("Po\u010det hus:");
        contentPane.add(label12, "cell 1 5 2 1,alignx right,growx 0");

        //---- celkemHusy ----
        celkemHusy.setBackground(UIManager.getColor("CheckBox.background"));
        celkemHusy.setColumns(20);
        celkemHusy.setEditable(false);
        contentPane.add(celkemHusy, "cell 3 5");

        //---- label13 ----
        label13.setText("Po\u010det kr\u00e1l\u00edk\u016f:");
        contentPane.add(label13, "cell 5 5 2 1,alignx right,growx 0");

        //---- celkemKraliku ----
        celkemKraliku.setColumns(20);
        celkemKraliku.setEditable(false);
        contentPane.add(celkemKraliku, "cell 7 5");

        //---- label17 ----
        label17.setText("Potraviny");
        label17.setFont(new Font("Segoe UI", Font.BOLD, 16));
        contentPane.add(label17, "cell 1 6 3 1");

        //---- label3 ----
        label3.setText("Hmotnost p\u0161enice:");
        contentPane.add(label3, "cell 1 7 2 1,alignx right,growx 0");

        //---- hmotnostPsenice ----
        hmotnostPsenice.setColumns(20);
        hmotnostPsenice.setEditable(false);
        contentPane.add(hmotnostPsenice, "cell 3 7");

        //---- label5 ----
        label5.setText("Kg");
        contentPane.add(label5, "cell 4 7");

        //---- label7 ----
        label7.setText("Hmotnost mrkve:");
        contentPane.add(label7, "cell 5 7 2 1,alignx right,growx 0");

        //---- hmotnostMrkve ----
        hmotnostMrkve.setColumns(20);
        hmotnostMrkve.setEditable(false);
        contentPane.add(hmotnostMrkve, "cell 7 7");

        //---- label6 ----
        label6.setText("Kg");
        contentPane.add(label6, "cell 8 7");

        //---- label4 ----
        label4.setText("Po\u010det \u0159\u00e1dk\u016f p\u0161enice:");
        contentPane.add(label4, "cell 1 8 2 1,alignx right,growx 0");

        //---- radkyPsenice ----
        radkyPsenice.setColumns(20);
        radkyPsenice.setEditable(false);
        contentPane.add(radkyPsenice, "cell 3 8");

        //---- label8 ----
        label8.setText("Po\u010det \u0159\u00e1dk\u016f mrkve:");
        contentPane.add(label8, "cell 5 8 2 1,alignx right,growx 0");

        //---- radkyMrkve ----
        radkyMrkve.setColumns(20);
        radkyMrkve.setEditable(false);
        contentPane.add(radkyMrkve, "cell 7 8");
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
}
