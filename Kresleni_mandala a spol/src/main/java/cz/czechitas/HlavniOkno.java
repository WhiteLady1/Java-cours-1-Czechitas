package cz.czechitas;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import java.util.*;
import java.util.List;
import javax.imageio.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.filechooser.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.plaf.*;
import net.miginfocom.swing.*;
import net.sevecek.util.*;

public class HlavniOkno extends JFrame {

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner non-commercial license
    JMenuBar menuOtevrit;
    JMenu menu2;
    JMenuItem menuOtevri;
    JMenuItem menuUloz;
    JMenuItem menuClose;
    JLabel labPaleta;
    JLabel labBarva1;
    JLabel labBarva2;
    JLabel labBarva3;
    JLabel labBarva4;
    JLabel labBarva5;
    JLabel labBarva6;
    JLabel labBarva7;
    JLabel labBarva8;
    JLabel labBarva9;
    JLabel labBarva10;
    JLabel labBarva31;
    JLabel labBarva16;
    JLabel labBarva17;
    JLabel labBarva18;
    JLabel labBarva19;
    JLabel labBarva20;
    JLabel labBarva21;
    JLabel labBarva22;
    JLabel labBarva23;
    JLabel labBarva24;
    JLabel labBarva25;
    JLabel labBarva32;
    JLabel labBarva11;
    JLabel labBarva12;
    JLabel labBarva13;
    JLabel labBarva14;
    JLabel labBarva15;
    JLabel labBarva26;
    JLabel labBarva27;
    JLabel labBarva28;
    JLabel labBarva29;
    JLabel labBarva30;
    JLabel labBarva33;
    JLabel labObrazek;
    JLabel label7;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    JPanel contentPane;
    MigLayout migLayoutManager;
    BufferedImage obrazek;
    Color barvaPole;
    File novySoubor;

    public HlavniOkno() {
        initComponents();
        
    }

    private void priOtevreniOkna(WindowEvent e) {
        File soubor = new File("obrazek1.png");
        nahrajObrazek(soubor);
    }
    private void nahrajObrazek(File soubor) {
        try {
            obrazek = ImageIO.read(soubor);
        } catch (IOException ex) {
            throw new ApplicationPublicException(ex, "Nepodařilo se nahrát obrázek mandaly ze souboru " + soubor.getAbsolutePath());
        }
        labObrazek.setIcon(new ImageIcon(obrazek));
        labObrazek.setMinimumSize(new Dimension(obrazek.getWidth(), obrazek.getHeight()));
        pack();
        setMinimumSize(getSize());
    }
    private void priKliknutiMysi(MouseEvent e) {
        int X=e.getX();
        int Y=e.getY();
        vyplnObrazek(obrazek,X,Y, barvaPole);
        labObrazek.repaint();
    }

    private void priVyberuBarvy(MouseEvent e) {
        JLabel barvaVyber= (JLabel) e.getSource();
        nastavAktualiniBarvuKresleni(barvaVyber);
    }
    public void nastavAktualiniBarvuKresleni(JLabel barvaVyber){
        barvaPole=barvaVyber.getBackground();
        labBarva1.setBorder(BorderFactory.createEmptyBorder());
        labBarva2.setBorder(BorderFactory.createEmptyBorder());
        labBarva3.setBorder(BorderFactory.createEmptyBorder());
        labBarva4.setBorder(BorderFactory.createEmptyBorder());
        labBarva5.setBorder(BorderFactory.createEmptyBorder());
        labBarva6.setBorder(BorderFactory.createEmptyBorder());
        labBarva7.setBorder(BorderFactory.createEmptyBorder());
        labBarva8.setBorder(BorderFactory.createEmptyBorder());
        labBarva9.setBorder(BorderFactory.createEmptyBorder());
        labBarva10.setBorder(BorderFactory.createEmptyBorder());
        labBarva11.setBorder(BorderFactory.createEmptyBorder());
        labBarva12.setBorder(BorderFactory.createEmptyBorder());
        labBarva13.setBorder(BorderFactory.createEmptyBorder());
        labBarva14.setBorder(BorderFactory.createEmptyBorder());
        labBarva15.setBorder(BorderFactory.createEmptyBorder());
        labBarva16.setBorder(BorderFactory.createEmptyBorder());
        labBarva17.setBorder(BorderFactory.createEmptyBorder());
        labBarva18.setBorder(BorderFactory.createEmptyBorder());
        labBarva19.setBorder(BorderFactory.createEmptyBorder());
        labBarva20.setBorder(BorderFactory.createEmptyBorder());
        labBarva21.setBorder(BorderFactory.createEmptyBorder());
        labBarva22.setBorder(BorderFactory.createEmptyBorder());
        labBarva23.setBorder(BorderFactory.createEmptyBorder());
        labBarva24.setBorder(BorderFactory.createEmptyBorder());
        labBarva25.setBorder(BorderFactory.createEmptyBorder());
        labBarva26.setBorder(BorderFactory.createEmptyBorder());
        labBarva27.setBorder(BorderFactory.createEmptyBorder());
        labBarva28.setBorder(BorderFactory.createEmptyBorder());
        labBarva29.setBorder(BorderFactory.createEmptyBorder());
        labBarva30.setBorder(BorderFactory.createEmptyBorder());
        labBarva31.setBorder(BorderFactory.createEmptyBorder());
        labBarva32.setBorder(BorderFactory.createEmptyBorder());
        labBarva33.setBorder(BorderFactory.createEmptyBorder());
        barvaVyber.setBorder(BorderFactory.createMatteBorder(3,3,3,3,Color.BLACK));
    }

    private void menuOtevriMousePressed(MouseEvent e) {
        JFileChooser dialog;
        if (novySoubor == null) {
            dialog = new JFileChooser(".");
        } else {
            dialog = new JFileChooser(novySoubor.getParentFile());
        }
        dialog.setFileSelectionMode(JFileChooser.FILES_ONLY);
        dialog.setMultiSelectionEnabled(false);
        dialog.addChoosableFileFilter(new FileNameExtensionFilter("Obrázky (*.png)", "png"));
        int vysledek = dialog.showOpenDialog(this);
        if (vysledek != JFileChooser.APPROVE_OPTION) {
            return;
        }

        novySoubor = dialog.getSelectedFile();
        nahrajObrazek(novySoubor);
    }
    private void menuUlozMousePressed(MouseEvent e) {
        JFileChooser dialog;
        if (novySoubor == null) {
            dialog = new JFileChooser(".");
        } else {
            dialog = new JFileChooser(novySoubor.getParentFile());
        }
        dialog.setFileSelectionMode(JFileChooser.FILES_ONLY);
        dialog.setMultiSelectionEnabled(false);
        FileFilter pngFilter = new FileNameExtensionFilter("Obrázky (*.png)", "png");
        dialog.addChoosableFileFilter(pngFilter);
        int vysledek = dialog.showSaveDialog(this);
        if (vysledek != JFileChooser.APPROVE_OPTION) {
            return;
        }

        File soubor = dialog.getSelectedFile();
        if (!soubor.getName().contains(".") && !soubor.exists()) {
            soubor = new File(soubor.getParentFile(), soubor.getName() + ".png");
        }
        if (soubor.exists()) {
            int potvrzeni = JOptionPane.showConfirmDialog(this, "Soubor " + soubor.getName() + " už existuje.\nChcete jej přepsat?", "Přepsat soubor?", JOptionPane.YES_NO_OPTION);
            if (potvrzeni == JOptionPane.NO_OPTION) {
                return;
            }
        }
        ulozObrazek(soubor);
        novySoubor = soubor;
    }

    private void ulozObrazek(File soubor) {
        try {
            ImageIO.write(obrazek, "png", soubor);
        } catch (IOException ex) {
            throw new ApplicationPublicException(ex, "Nepodařilo se uložit obrázek mandaly do souboru " + soubor.getAbsolutePath());
        }
    }


    public void vyplnObrazek(BufferedImage obrazek, int x, int y, Color barva) {
        if (barva == null) {
            barva = new Color(255, 255, 0);
        }

        // Zamez vyplnovani mimo rozsah
        if (x < 0 || x >= obrazek.getWidth() || y < 0 || y >= obrazek.getHeight()) {
            return;
        }

        WritableRaster pixely = obrazek.getRaster();
        int[] novyPixel = new int[] {barva.getRed(), barva.getGreen(), barva.getBlue(), barva.getAlpha()};
        int[] staryPixel = new int[] {255, 255, 255, 255};
        staryPixel = pixely.getPixel(x, y, staryPixel);

        // Pokud uz je pocatecni pixel obarven na cilovou barvu, nic nemen
        if (pixelyMajiStejnouBarvu(novyPixel, staryPixel)) {
            return;
        }

        // Zamez prebarveni cerne cary
        int[] cernyPixel = new int[] {0, 0, 0, staryPixel[3]};
        if (pixelyMajiStejnouBarvu(cernyPixel, staryPixel)) {
            return;
        }

        vyplnovaciSmycka(pixely, x, y, novyPixel, staryPixel);
    }

    /**
     * Provede skutecne vyplneni pomoci zasobniku
     */
    private void vyplnovaciSmycka(WritableRaster raster, int x, int y, int[] novaBarva, int[] nahrazovanaBarva) {
        Rectangle rozmery = raster.getBounds();
        int[] aktualniBarva = new int[] {255, 255, 255, 255};

        Deque<Point> zasobnik = new ArrayDeque<>(rozmery.width * rozmery.height);
        zasobnik.push(new Point(x, y));
        while (zasobnik.size() > 0) {
            Point point = zasobnik.pop();
            x = point.x;
            y = point.y;
            if (!pixelyMajiStejnouBarvu(raster.getPixel(x, y, aktualniBarva), nahrazovanaBarva)) {
                continue;
            }

            // Najdi levou zed, po ceste vyplnuj
            int levaZed = x;
            do {
                raster.setPixel(levaZed, y, novaBarva);
                levaZed--;
            }
            while (levaZed >= 0 && pixelyMajiStejnouBarvu(raster.getPixel(levaZed, y, aktualniBarva), nahrazovanaBarva));
            levaZed++;

            // Najdi pravou zed, po ceste vyplnuj
            int pravaZed = x;
            do {
                raster.setPixel(pravaZed, y, novaBarva);
                pravaZed++;
            }
            while (pravaZed < rozmery.width && pixelyMajiStejnouBarvu(raster.getPixel(pravaZed, y, aktualniBarva), nahrazovanaBarva));
            pravaZed--;

            // Pridej na zasobnik body nahore a dole
            for (int i = levaZed; i <= pravaZed; i++) {
                if (y > 0 && pixelyMajiStejnouBarvu(raster.getPixel(i, y - 1, aktualniBarva), nahrazovanaBarva)) {
                    if (!(i > levaZed && i < pravaZed
                            && pixelyMajiStejnouBarvu(raster.getPixel(i - 1, y - 1, aktualniBarva), nahrazovanaBarva)
                            && pixelyMajiStejnouBarvu(raster.getPixel(i + 1, y - 1, aktualniBarva), nahrazovanaBarva))) {
                        zasobnik.add(new Point(i, y - 1));
                    }
                }
                if (y < rozmery.height - 1 && pixelyMajiStejnouBarvu(raster.getPixel(i, y + 1, aktualniBarva), nahrazovanaBarva)) {
                    if (!(i > levaZed && i < pravaZed
                            && pixelyMajiStejnouBarvu(raster.getPixel(i - 1, y + 1, aktualniBarva), nahrazovanaBarva)
                            && pixelyMajiStejnouBarvu(raster.getPixel(i + 1, y + 1, aktualniBarva), nahrazovanaBarva))) {
                        zasobnik.add(new Point(i, y + 1));
                    }
                }
            }
        }
    }

    /**
     * Vrati true pokud RGB hodnoty v polich jsou stejne. Pokud jsou ruzne, vraci false
     */
    private boolean pixelyMajiStejnouBarvu(int[] barva1, int[] barva2) {
        return barva1[0] == barva2[0] && barva1[1] == barva2[1] && barva1[2] == barva2[2];
    }

    private void menuCloseMousePressed(MouseEvent e) {
        dispose();
    }





    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner non-commercial license
        menuOtevrit = new JMenuBar();
        menu2 = new JMenu();
        menuOtevri = new JMenuItem();
        menuUloz = new JMenuItem();
        menuClose = new JMenuItem();
        labPaleta = new JLabel();
        labBarva1 = new JLabel();
        labBarva2 = new JLabel();
        labBarva3 = new JLabel();
        labBarva4 = new JLabel();
        labBarva5 = new JLabel();
        labBarva6 = new JLabel();
        labBarva7 = new JLabel();
        labBarva8 = new JLabel();
        labBarva9 = new JLabel();
        labBarva10 = new JLabel();
        labBarva31 = new JLabel();
        labBarva16 = new JLabel();
        labBarva17 = new JLabel();
        labBarva18 = new JLabel();
        labBarva19 = new JLabel();
        labBarva20 = new JLabel();
        labBarva21 = new JLabel();
        labBarva22 = new JLabel();
        labBarva23 = new JLabel();
        labBarva24 = new JLabel();
        labBarva25 = new JLabel();
        labBarva32 = new JLabel();
        labBarva11 = new JLabel();
        labBarva12 = new JLabel();
        labBarva13 = new JLabel();
        labBarva14 = new JLabel();
        labBarva15 = new JLabel();
        labBarva26 = new JLabel();
        labBarva27 = new JLabel();
        labBarva28 = new JLabel();
        labBarva29 = new JLabel();
        labBarva30 = new JLabel();
        labBarva33 = new JLabel();
        labObrazek = new JLabel();
        label7 = new JLabel();

        //======== this ========
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relaxa\u010dn\u00ed omalov\u00e1nky");
        setIconImage(new ImageIcon("C:\\Users\\Blanka\\Desktop\\Malba\\000110-reprodukce-kvetiny-iris-i-11093l.jpg").getImage());
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                priOtevreniOkna(e);
            }
        });
        Container contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "insets rel,hidemode 3",
            // columns
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[fill]" +
            "[26,fill]" +
            "[20:n,fill]" +
            "[grow,fill]",
            // rows
            "[]" +
            "[]" +
            "[]" +
            "[grow,fill]" +
            "[]"));
        this.contentPane = (JPanel) this.getContentPane();
        this.contentPane.setBackground(this.getBackground());
        LayoutManager layout = this.contentPane.getLayout();
        if (layout instanceof MigLayout) {
            this.migLayoutManager = (MigLayout) layout;
        }

        //======== menuOtevrit ========
        {

            //======== menu2 ========
            {
                menu2.setText("Soubor");

                //---- menuOtevri ----
                menuOtevri.setText("Otev\u0159i");
                menuOtevri.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        menuOtevriMousePressed(e);
                    }
                });
                menu2.add(menuOtevri);

                //---- menuUloz ----
                menuUloz.setText("Ulo\u017e jako...");
                menuUloz.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        menuUlozMousePressed(e);
                    }
                });
                menu2.add(menuUloz);

                //---- menuClose ----
                menuClose.setText("Zav\u0159i");
                menuClose.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        menuCloseMousePressed(e);
                    }
                });
                menu2.add(menuClose);
            }
            menuOtevrit.add(menu2);
        }
        setJMenuBar(menuOtevrit);

        //---- labPaleta ----
        labPaleta.setText("Vyber barvu : ");
        contentPane.add(labPaleta, "cell 0 0");

        //---- labBarva1 ----
        labBarva1.setText(" ");
        labBarva1.setBackground(new Color(128, 72, 71));
        labBarva1.setOpaque(true);
        labBarva1.setHorizontalAlignment(SwingConstants.CENTER);
        labBarva1.setFont(labBarva1.getFont().deriveFont(labBarva1.getFont().getSize() + 2f));
        labBarva1.setBorder(null);
        labBarva1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priVyberuBarvy(e);
            }
        });
        contentPane.add(labBarva1, "cell 1 0,wmin 20,hmin 20");

        //---- labBarva2 ----
        labBarva2.setText(" ");
        labBarva2.setBackground(new Color(255, 84, 82));
        labBarva2.setOpaque(true);
        labBarva2.setHorizontalAlignment(SwingConstants.CENTER);
        labBarva2.setFont(labBarva2.getFont().deriveFont(labBarva2.getFont().getSize() + 2f));
        labBarva2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priVyberuBarvy(e);
            }
        });
        contentPane.add(labBarva2, "cell 2 0,wmin 20,hmin 20");

        //---- labBarva3 ----
        labBarva3.setText(" ");
        labBarva3.setBackground(new Color(255, 145, 143));
        labBarva3.setOpaque(true);
        labBarva3.setHorizontalAlignment(SwingConstants.CENTER);
        labBarva3.setFont(labBarva3.getFont().deriveFont(labBarva3.getFont().getSize() + 2f));
        labBarva3.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priVyberuBarvy(e);
            }
        });
        contentPane.add(labBarva3, "cell 3 0,wmin 20,height 20");

        //---- labBarva4 ----
        labBarva4.setText(" ");
        labBarva4.setBackground(new Color(128, 11, 9));
        labBarva4.setOpaque(true);
        labBarva4.setHorizontalAlignment(SwingConstants.CENTER);
        labBarva4.setFont(labBarva4.getFont().deriveFont(labBarva4.getFont().getSize() + 2f));
        labBarva4.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priVyberuBarvy(e);
            }
        });
        contentPane.add(labBarva4, "cell 4 0,wmin 20,hmin 20");

        //---- labBarva5 ----
        labBarva5.setText(" ");
        labBarva5.setBackground(new Color(204, 117, 115));
        labBarva5.setOpaque(true);
        labBarva5.setHorizontalAlignment(SwingConstants.CENTER);
        labBarva5.setFont(labBarva5.getFont().deriveFont(labBarva5.getFont().getSize() + 2f));
        labBarva5.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priVyberuBarvy(e);
            }
        });
        contentPane.add(labBarva5, "cell 5 0,alignx center,growx 0,wmin 20,hmin 20");

        //---- labBarva6 ----
        labBarva6.setText(" ");
        labBarva6.setBackground(new Color(97, 59, 9));
        labBarva6.setOpaque(true);
        labBarva6.setHorizontalAlignment(SwingConstants.CENTER);
        labBarva6.setFont(labBarva6.getFont().deriveFont(labBarva6.getFont().getSize() + 2f));
        labBarva6.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priVyberuBarvy(e);
            }
        });
        contentPane.add(labBarva6, "cell 6 0,wmin 20,hmin 20");

        //---- labBarva7 ----
        labBarva7.setText(" ");
        labBarva7.setBackground(new Color(230, 164, 79));
        labBarva7.setOpaque(true);
        labBarva7.setHorizontalAlignment(SwingConstants.CENTER);
        labBarva7.setFont(labBarva7.getFont().deriveFont(labBarva7.getFont().getSize() + 2f));
        labBarva7.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priVyberuBarvy(e);
            }
        });
        contentPane.add(labBarva7, "cell 7 0,wmin 20,hmin 20");

        //---- labBarva8 ----
        labBarva8.setText(" ");
        labBarva8.setBackground(new Color(224, 136, 20));
        labBarva8.setOpaque(true);
        labBarva8.setHorizontalAlignment(SwingConstants.CENTER);
        labBarva8.setFont(labBarva8.getFont().deriveFont(labBarva8.getFont().getSize() + 2f));
        labBarva8.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priVyberuBarvy(e);
            }
        });
        contentPane.add(labBarva8, "cell 8 0,wmin 20,height 20");

        //---- labBarva9 ----
        labBarva9.setText(" ");
        labBarva9.setBackground(new Color(117, 98, 73));
        labBarva9.setOpaque(true);
        labBarva9.setHorizontalAlignment(SwingConstants.CENTER);
        labBarva9.setFont(labBarva9.getFont().deriveFont(labBarva9.getFont().getSize() + 2f));
        labBarva9.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priVyberuBarvy(e);
            }
        });
        contentPane.add(labBarva9, "cell 9 0,wmin 20,hmin 20");

        //---- labBarva10 ----
        labBarva10.setText(" ");
        labBarva10.setBackground(new Color(184, 111, 17));
        labBarva10.setOpaque(true);
        labBarva10.setHorizontalAlignment(SwingConstants.CENTER);
        labBarva10.setFont(labBarva10.getFont().deriveFont(labBarva10.getFont().getSize() + 2f));
        labBarva10.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priVyberuBarvy(e);
            }
        });
        contentPane.add(labBarva10, "cell 10 0,alignx center,growx 0,wmin 20,hmin 20");

        //---- labBarva31 ----
        labBarva31.setText(" ");
        labBarva31.setBackground(Color.white);
        labBarva31.setOpaque(true);
        labBarva31.setHorizontalAlignment(SwingConstants.CENTER);
        labBarva31.setFont(labBarva31.getFont().deriveFont(labBarva31.getFont().getSize() + 2f));
        labBarva31.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priVyberuBarvy(e);
            }
        });
        contentPane.add(labBarva31, "cell 11 0,alignx center,growx 0,wmin 20,hmin 20");

        //---- labBarva16 ----
        labBarva16.setText(" ");
        labBarva16.setBackground(new Color(128, 127, 75));
        labBarva16.setOpaque(true);
        labBarva16.setHorizontalAlignment(SwingConstants.CENTER);
        labBarva16.setFont(labBarva16.getFont().deriveFont(labBarva16.getFont().getSize() + 2f));
        labBarva16.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priVyberuBarvy(e);
            }
        });
        contentPane.add(labBarva16, "cell 1 1,wmin 20,hmin 20");

        //---- labBarva17 ----
        labBarva17.setText(" ");
        labBarva17.setBackground(new Color(255, 251, 88));
        labBarva17.setOpaque(true);
        labBarva17.setHorizontalAlignment(SwingConstants.CENTER);
        labBarva17.setFont(labBarva17.getFont().deriveFont(labBarva17.getFont().getSize() + 2f));
        labBarva17.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priVyberuBarvy(e);
            }
        });
        contentPane.add(labBarva17, "cell 2 1,wmin 20,hmin 20");

        //---- labBarva18 ----
        labBarva18.setText(" ");
        labBarva18.setBackground(new Color(255, 253, 150));
        labBarva18.setOpaque(true);
        labBarva18.setHorizontalAlignment(SwingConstants.CENTER);
        labBarva18.setFont(labBarva18.getFont().deriveFont(labBarva18.getFont().getSize() + 2f));
        labBarva18.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priVyberuBarvy(e);
            }
        });
        contentPane.add(labBarva18, "cell 3 1,wmin 20,height 20");

        //---- labBarva19 ----
        labBarva19.setText(" ");
        labBarva19.setBackground(new Color(128, 126, 14));
        labBarva19.setOpaque(true);
        labBarva19.setHorizontalAlignment(SwingConstants.CENTER);
        labBarva19.setFont(labBarva19.getFont().deriveFont(labBarva19.getFont().getSize() + 2f));
        labBarva19.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priVyberuBarvy(e);
            }
        });
        contentPane.add(labBarva19, "cell 4 1,wmin 20,hmin 20");

        //---- labBarva20 ----
        labBarva20.setText(" ");
        labBarva20.setBackground(new Color(204, 203, 120));
        labBarva20.setOpaque(true);
        labBarva20.setHorizontalAlignment(SwingConstants.CENTER);
        labBarva20.setFont(labBarva20.getFont().deriveFont(labBarva20.getFont().getSize() + 2f));
        labBarva20.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priVyberuBarvy(e);
            }
        });
        contentPane.add(labBarva20, "cell 5 1,alignx center,growx 0,wmin 20,hmin 20");

        //---- labBarva21 ----
        labBarva21.setText(" ");
        labBarva21.setBackground(new Color(75, 128, 86));
        labBarva21.setOpaque(true);
        labBarva21.setHorizontalAlignment(SwingConstants.CENTER);
        labBarva21.setFont(labBarva21.getFont().deriveFont(labBarva21.getFont().getSize() + 2f));
        labBarva21.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priVyberuBarvy(e);
            }
        });
        contentPane.add(labBarva21, "cell 6 1,wmin 20,hmin 20");

        //---- labBarva22 ----
        labBarva22.setText(" ");
        labBarva22.setBackground(new Color(88, 255, 121));
        labBarva22.setOpaque(true);
        labBarva22.setHorizontalAlignment(SwingConstants.CENTER);
        labBarva22.setFont(labBarva22.getFont().deriveFont(labBarva22.getFont().getSize() + 2f));
        labBarva22.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priVyberuBarvy(e);
            }
        });
        contentPane.add(labBarva22, "cell 7 1,wmin 20,hmin 20");

        //---- labBarva23 ----
        labBarva23.setText(" ");
        labBarva23.setBackground(new Color(150, 255, 171));
        labBarva23.setOpaque(true);
        labBarva23.setHorizontalAlignment(SwingConstants.CENTER);
        labBarva23.setFont(labBarva23.getFont().deriveFont(labBarva23.getFont().getSize() + 2f));
        labBarva23.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priVyberuBarvy(e);
            }
        });
        contentPane.add(labBarva23, "cell 8 1,wmin 20,height 20");

        //---- labBarva24 ----
        labBarva24.setText(" ");
        labBarva24.setBackground(new Color(14, 128, 37));
        labBarva24.setOpaque(true);
        labBarva24.setHorizontalAlignment(SwingConstants.CENTER);
        labBarva24.setFont(labBarva24.getFont().deriveFont(labBarva24.getFont().getSize() + 2f));
        labBarva24.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priVyberuBarvy(e);
            }
        });
        contentPane.add(labBarva24, "cell 9 1,wmin 20,hmin 20");

        //---- labBarva25 ----
        labBarva25.setText(" ");
        labBarva25.setBackground(new Color(120, 204, 137));
        labBarva25.setOpaque(true);
        labBarva25.setHorizontalAlignment(SwingConstants.CENTER);
        labBarva25.setFont(labBarva25.getFont().deriveFont(labBarva25.getFont().getSize() + 2f));
        labBarva25.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priVyberuBarvy(e);
            }
        });
        contentPane.add(labBarva25, "cell 10 1,alignx center,growx 0,wmin 20,hmin 20");

        //---- labBarva32 ----
        labBarva32.setText(" ");
        labBarva32.setBackground(new Color(153, 153, 153));
        labBarva32.setOpaque(true);
        labBarva32.setHorizontalAlignment(SwingConstants.CENTER);
        labBarva32.setFont(labBarva32.getFont().deriveFont(labBarva32.getFont().getSize() + 2f));
        labBarva32.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priVyberuBarvy(e);
            }
        });
        contentPane.add(labBarva32, "cell 11 1,alignx center,growx 0,wmin 20,hmin 20");

        //---- labBarva11 ----
        labBarva11.setText(" ");
        labBarva11.setBackground(new Color(75, 106, 128));
        labBarva11.setOpaque(true);
        labBarva11.setHorizontalAlignment(SwingConstants.CENTER);
        labBarva11.setFont(labBarva11.getFont().deriveFont(labBarva11.getFont().getSize() + 2f));
        labBarva11.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priVyberuBarvy(e);
            }
        });
        contentPane.add(labBarva11, "cell 1 2,wmin 20,hmin 20");

        //---- labBarva12 ----
        labBarva12.setText(" ");
        labBarva12.setBackground(new Color(88, 185, 255));
        labBarva12.setOpaque(true);
        labBarva12.setHorizontalAlignment(SwingConstants.CENTER);
        labBarva12.setFont(labBarva12.getFont().deriveFont(labBarva12.getFont().getSize() + 2f));
        labBarva12.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priVyberuBarvy(e);
            }
        });
        contentPane.add(labBarva12, "cell 2 2,wmin 20,hmin 20");

        //---- labBarva13 ----
        labBarva13.setText(" ");
        labBarva13.setBackground(new Color(150, 211, 255));
        labBarva13.setOpaque(true);
        labBarva13.setHorizontalAlignment(SwingConstants.CENTER);
        labBarva13.setFont(labBarva13.getFont().deriveFont(labBarva13.getFont().getSize() + 2f));
        labBarva13.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priVyberuBarvy(e);
            }
        });
        contentPane.add(labBarva13, "cell 3 2,wmin 20,height 20");

        //---- labBarva14 ----
        labBarva14.setText(" ");
        labBarva14.setBackground(new Color(14, 80, 128));
        labBarva14.setOpaque(true);
        labBarva14.setHorizontalAlignment(SwingConstants.CENTER);
        labBarva14.setFont(labBarva14.getFont().deriveFont(labBarva14.getFont().getSize() + 2f));
        labBarva14.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priVyberuBarvy(e);
            }
        });
        contentPane.add(labBarva14, "cell 4 2,wmin 20,hmin 20");

        //---- labBarva15 ----
        labBarva15.setText(" ");
        labBarva15.setBackground(new Color(120, 169, 204));
        labBarva15.setOpaque(true);
        labBarva15.setHorizontalAlignment(SwingConstants.CENTER);
        labBarva15.setFont(labBarva15.getFont().deriveFont(labBarva15.getFont().getSize() + 2f));
        labBarva15.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priVyberuBarvy(e);
            }
        });
        contentPane.add(labBarva15, "cell 5 2,alignx center,growx 0,wmin 20,hmin 20");

        //---- labBarva26 ----
        labBarva26.setText(" ");
        labBarva26.setBackground(new Color(100, 75, 128));
        labBarva26.setOpaque(true);
        labBarva26.setHorizontalAlignment(SwingConstants.CENTER);
        labBarva26.setFont(labBarva26.getFont().deriveFont(labBarva26.getFont().getSize() + 2f));
        labBarva26.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priVyberuBarvy(e);
            }
        });
        contentPane.add(labBarva26, "cell 6 2,wmin 20,hmin 20");

        //---- labBarva27 ----
        labBarva27.setText(" ");
        labBarva27.setBackground(new Color(168, 88, 255));
        labBarva27.setOpaque(true);
        labBarva27.setHorizontalAlignment(SwingConstants.CENTER);
        labBarva27.setFont(labBarva27.getFont().deriveFont(labBarva27.getFont().getSize() + 2f));
        labBarva27.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priVyberuBarvy(e);
            }
        });
        contentPane.add(labBarva27, "cell 7 2,wmin 20,hmin 20");

        //---- labBarva28 ----
        labBarva28.setText(" ");
        labBarva28.setBackground(new Color(201, 150, 255));
        labBarva28.setOpaque(true);
        labBarva28.setHorizontalAlignment(SwingConstants.CENTER);
        labBarva28.setFont(labBarva28.getFont().deriveFont(labBarva28.getFont().getSize() + 2f));
        labBarva28.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priVyberuBarvy(e);
            }
        });
        contentPane.add(labBarva28, "cell 8 2,wmin 20,height 20");

        //---- labBarva29 ----
        labBarva29.setText(" ");
        labBarva29.setBackground(new Color(69, 14, 128));
        labBarva29.setOpaque(true);
        labBarva29.setHorizontalAlignment(SwingConstants.CENTER);
        labBarva29.setFont(labBarva29.getFont().deriveFont(labBarva29.getFont().getSize() + 2f));
        labBarva29.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priVyberuBarvy(e);
            }
        });
        contentPane.add(labBarva29, "cell 9 2,wmin 20,hmin 20");

        //---- labBarva30 ----
        labBarva30.setText(" ");
        labBarva30.setBackground(new Color(161, 120, 204));
        labBarva30.setOpaque(true);
        labBarva30.setHorizontalAlignment(SwingConstants.CENTER);
        labBarva30.setFont(labBarva30.getFont().deriveFont(labBarva30.getFont().getSize() + 2f));
        labBarva30.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priVyberuBarvy(e);
            }
        });
        contentPane.add(labBarva30, "cell 10 2,alignx center,growx 0,wmin 20,hmin 20");

        //---- labBarva33 ----
        labBarva33.setText(" ");
        labBarva33.setBackground(Color.darkGray);
        labBarva33.setOpaque(true);
        labBarva33.setHorizontalAlignment(SwingConstants.CENTER);
        labBarva33.setFont(labBarva33.getFont().deriveFont(labBarva33.getFont().getSize() + 2f));
        labBarva33.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priVyberuBarvy(e);
            }
        });
        contentPane.add(labBarva33, "cell 11 2,alignx center,growx 0,wmin 20,hmin 20");

        //---- labObrazek ----
        labObrazek.setOpaque(true);
        labObrazek.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                priKliknutiMysi(e);
            }
        });
        contentPane.add(labObrazek, "cell 0 3 13 1");

        //---- label7 ----
        label7.setText("WL");
        label7.setForeground(Color.gray);
        contentPane.add(label7, "cell 12 4");
        pack();
        setLocationRelativeTo(null);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
}
