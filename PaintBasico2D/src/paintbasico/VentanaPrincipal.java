/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paintbasico;

import SM.DSC.IU.Lienzo2D;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JSlider;
import sm.image.KernelProducer;

/**
 *
 * @author David
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    BufferedImage imagenFoco = null;
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        /*
        VentanaInterna vi = new VentanaInterna();
        this.panelEscritorio.add(vi); 
        vi.setVisible(true);
        this.panelEscritorio.getDesktopManager().activateFrame(vi);
        */
    }
    
    private void deseleccionarFormas(){
        this.tbLapiz.setSelected(false);
        this.tbLinea.setSelected(false);
        this.tbRectangulo.setSelected(false);
        this.tbElipse.setSelected(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbFormas = new javax.swing.JToolBar();
        tbLapiz = new javax.swing.JToggleButton();
        tbLinea = new javax.swing.JToggleButton();
        tbRectangulo = new javax.swing.JToggleButton();
        tbElipse = new javax.swing.JToggleButton();
        jPanel1 = new javax.swing.JPanel();
        labelEstado = new javax.swing.JLabel();
        panelAtributos = new javax.swing.JPanel();
        panelColor = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        panelGrosor = new javax.swing.JPanel();
        spinnerGrosor = new javax.swing.JSpinner();
        panelEfectos = new javax.swing.JPanel();
        cbRelleno = new javax.swing.JCheckBox();
        cbAlisar = new javax.swing.JCheckBox();
        cbTransparencia = new javax.swing.JCheckBox();
        cbEditar = new javax.swing.JCheckBox();
        panelBrillo = new javax.swing.JPanel();
        sliderBrillo = new javax.swing.JSlider();
        panelFiltro = new javax.swing.JPanel();
        comboFiltro = new javax.swing.JComboBox();
        panelEscritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        miNuevo = new javax.swing.JMenuItem();
        miAbrir = new javax.swing.JMenuItem();
        miGuardar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        cbmEstado = new javax.swing.JCheckBoxMenuItem();
        cbmFormas = new javax.swing.JCheckBoxMenuItem();
        cbmAtributos = new javax.swing.JCheckBoxMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Paint Básico");
        setPreferredSize(new java.awt.Dimension(1000, 800));

        tbFormas.setRollover(true);

        tbLapiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Lapiz.gif"))); // NOI18N
        tbLapiz.setSelected(true);
        tbLapiz.setFocusable(false);
        tbLapiz.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbLapiz.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbLapiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbLapizMouseClicked(evt);
            }
        });
        tbFormas.add(tbLapiz);

        tbLinea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Linea.gif"))); // NOI18N
        tbLinea.setFocusable(false);
        tbLinea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbLinea.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbLinea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbLineaMouseClicked(evt);
            }
        });
        tbFormas.add(tbLinea);

        tbRectangulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Rectangulo.gif"))); // NOI18N
        tbRectangulo.setFocusable(false);
        tbRectangulo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbRectangulo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbRectangulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbRectanguloMouseClicked(evt);
            }
        });
        tbFormas.add(tbRectangulo);

        tbElipse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/Ovalo.gif"))); // NOI18N
        tbElipse.setFocusable(false);
        tbElipse.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        tbElipse.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tbElipse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbElipseMouseClicked(evt);
            }
        });
        tbFormas.add(tbElipse);

        getContentPane().add(tbFormas, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new java.awt.BorderLayout());

        labelEstado.setText("Barra de estado");
        labelEstado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.add(labelEstado, java.awt.BorderLayout.PAGE_END);

        panelColor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Color", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 12))); // NOI18N
        panelColor.setPreferredSize(new java.awt.Dimension(130, 90));
        panelColor.setLayout(new java.awt.GridLayout(2, 3, 5, 5));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        panelColor.add(jPanel3);

        jPanel5.setBackground(new java.awt.Color(255, 0, 0));
        jPanel5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel5.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        panelColor.add(jPanel5);

        jPanel7.setBackground(new java.awt.Color(0, 0, 204));
        jPanel7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel7.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        panelColor.add(jPanel7);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        panelColor.add(jPanel4);

        jPanel6.setBackground(new java.awt.Color(255, 255, 0));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel6.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        panelColor.add(jPanel6);

        jPanel8.setBackground(new java.awt.Color(0, 255, 0));
        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.setPreferredSize(new java.awt.Dimension(25, 25));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        panelColor.add(jPanel8);

        panelAtributos.add(panelColor);

        panelGrosor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Grosor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12))); // NOI18N
        panelGrosor.setPreferredSize(new java.awt.Dimension(90, 90));

        spinnerGrosor.setValue(1);
        spinnerGrosor.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spinnerGrosorStateChanged(evt);
            }
        });
        panelGrosor.add(spinnerGrosor);

        panelAtributos.add(panelGrosor);

        panelEfectos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        panelEfectos.setLayout(new java.awt.GridLayout(2, 0));

        cbRelleno.setText("Relleno");
        cbRelleno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRellenoActionPerformed(evt);
            }
        });
        panelEfectos.add(cbRelleno);

        cbAlisar.setText("Alisar");
        cbAlisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAlisarActionPerformed(evt);
            }
        });
        panelEfectos.add(cbAlisar);

        cbTransparencia.setText("Transparencia");
        cbTransparencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTransparenciaActionPerformed(evt);
            }
        });
        panelEfectos.add(cbTransparencia);

        cbEditar.setText("Editar");
        cbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEditarActionPerformed(evt);
            }
        });
        panelEfectos.add(cbEditar);

        panelAtributos.add(panelEfectos);

        panelBrillo.setBorder(javax.swing.BorderFactory.createTitledBorder("Brillo"));

        sliderBrillo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderBrilloStateChanged(evt);
            }
        });
        panelBrillo.add(sliderBrillo);

        panelAtributos.add(panelBrillo);

        panelFiltro.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtro"));

        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Media", "Binomial", "Enfoque", "Relieve", "Laplacaino" }));
        comboFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFiltroActionPerformed(evt);
            }
        });
        panelFiltro.add(comboFiltro);

        panelAtributos.add(panelFiltro);

        jPanel1.add(panelAtributos, java.awt.BorderLayout.WEST);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);
        getContentPane().add(panelEscritorio, java.awt.BorderLayout.CENTER);

        jMenu1.setText("Archivo");

        miNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.ALT_MASK));
        miNuevo.setText("Nuevo");
        miNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miNuevoActionPerformed(evt);
            }
        });
        jMenu1.add(miNuevo);

        miAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        miAbrir.setText("Abrir");
        miAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(miAbrir);

        miGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.ALT_MASK));
        miGuardar.setText("Guardar");
        miGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(miGuardar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edicion");

        cbmEstado.setSelected(true);
        cbmEstado.setText("Ver barra de estado");
        cbmEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmEstadoActionPerformed(evt);
            }
        });
        jMenu2.add(cbmEstado);

        cbmFormas.setSelected(true);
        cbmFormas.setText("Ver barra de formas");
        cbmFormas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmFormasActionPerformed(evt);
            }
        });
        jMenu2.add(cbmFormas);

        cbmAtributos.setSelected(true);
        cbmAtributos.setText("Ver barra de atributos");
        cbmAtributos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbmAtributosActionPerformed(evt);
            }
        });
        jMenu2.add(cbmAtributos);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbmEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmEstadoActionPerformed
        if(this.cbmEstado.isSelected()){
            this.labelEstado.setVisible(true);
        }else{
            this.labelEstado.setVisible(false);
        }
    }//GEN-LAST:event_cbmEstadoActionPerformed

    private void miAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAbrirActionPerformed
        JFileChooser dlg = new JFileChooser();
        int resp = dlg.showOpenDialog(this);
        if( resp == JFileChooser.APPROVE_OPTION) {
            try {
                File f = dlg.getSelectedFile();
                BufferedImage img = ImageIO.read(f);
                VentanaInterna vi = new VentanaInterna();
                vi.getLienzo().setImage(img);
                this.panelEscritorio.add(vi);
                vi.setTitle(f.getName());
                vi.setVisible(true);
            } catch (Exception ex) {
                System.err.println("Error al leer la imagen: "+ex);
            }
        }
    }//GEN-LAST:event_miAbrirActionPerformed

    private void miGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGuardarActionPerformed
        VentanaInterna vi=(VentanaInterna) panelEscritorio.getSelectedFrame(); 
        if (vi != null) {
            JFileChooser dlg = new JFileChooser();
            int resp = dlg.showSaveDialog(this);
            if (resp == JFileChooser.APPROVE_OPTION) {
                try {
                    BufferedImage img = vi.getLienzo().getImage(true);
                    if (img != null) {
                        File f = dlg.getSelectedFile();
                        ImageIO.write(img, "jpg", f);
                        vi.setTitle(f.getName());
                    }
                }catch (Exception ex) {
                    System.err.println("Error al guardar la imagen: "+ex);
                }
            }
        }
    }//GEN-LAST:event_miGuardarActionPerformed

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        VentanaInterna vi = (VentanaInterna)panelEscritorio.getSelectedFrame();
        vi.getLienzo().setColor(Color.BLACK);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        VentanaInterna vi = (VentanaInterna)panelEscritorio.getSelectedFrame();
        vi.getLienzo().setColor(Color.RED);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        VentanaInterna vi = (VentanaInterna)panelEscritorio.getSelectedFrame();
        vi.getLienzo().setColor(Color.BLUE);
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        VentanaInterna vi = (VentanaInterna)panelEscritorio.getSelectedFrame();
        vi.getLienzo().setColor(Color.WHITE);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        VentanaInterna vi = (VentanaInterna)panelEscritorio.getSelectedFrame();
        vi.getLienzo().setColor(Color.YELLOW);
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        VentanaInterna vi = (VentanaInterna)panelEscritorio.getSelectedFrame();
        vi.getLienzo().setColor(Color.GREEN);
    }//GEN-LAST:event_jPanel8MouseClicked

    private void cbRellenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRellenoActionPerformed
        VentanaInterna vi = (VentanaInterna)panelEscritorio.getSelectedFrame();
        
        if (this.cbRelleno.isSelected()){
            vi.getLienzo().setRelleno(true);
            return;
        }else{
            vi.getLienzo().setRelleno(false);
            return;
        }
    }//GEN-LAST:event_cbRellenoActionPerformed

    private void tbLapizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLapizMouseClicked
        deseleccionarFormas();
        this.tbLapiz.setSelected(true);
        VentanaInterna vi = (VentanaInterna)panelEscritorio.getSelectedFrame();
        vi.getLienzo().setForma(Lienzo2D.FORMA_LAPIZ);
        this.labelEstado.setText("Punto");
    }//GEN-LAST:event_tbLapizMouseClicked

    private void tbLineaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbLineaMouseClicked
        deseleccionarFormas();
        this.tbLinea.setSelected(true);
        VentanaInterna vi = (VentanaInterna)panelEscritorio.getSelectedFrame();
        vi.getLienzo().setForma(Lienzo2D.FORMA_LINEA);
        this.labelEstado.setText("Línea");
    }//GEN-LAST:event_tbLineaMouseClicked

    private void tbRectanguloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbRectanguloMouseClicked
        deseleccionarFormas();
        this.tbRectangulo.setSelected(true);
        VentanaInterna vi = (VentanaInterna)panelEscritorio.getSelectedFrame();
        vi.getLienzo().setForma(Lienzo2D.FORMA_RECTANGULO);
        this.labelEstado.setText("Rectángulo");
    }//GEN-LAST:event_tbRectanguloMouseClicked

    private void miNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miNuevoActionPerformed
        VentanaInterna vi = new VentanaInterna();
        this.panelEscritorio.add(vi); 
        vi.setVisible(true);
        BufferedImage img;
        img = new BufferedImage(300,300,BufferedImage.TYPE_INT_RGB);
        img.createGraphics().fillRect(0, 0, 300, 300);
        vi.getLienzo().setImage(img);
    }//GEN-LAST:event_miNuevoActionPerformed

    private void tbElipseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbElipseMouseClicked
        deseleccionarFormas();
        this.tbElipse.setSelected(true);
        VentanaInterna vi = (VentanaInterna)panelEscritorio.getSelectedFrame();
        vi.getLienzo().setForma(Lienzo2D.FORMA_OVALO);
        this.labelEstado.setText("Elipse");
    }//GEN-LAST:event_tbElipseMouseClicked

    private void cbmAtributosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmAtributosActionPerformed
        panelAtributos.setVisible(!panelAtributos.isVisible());
    }//GEN-LAST:event_cbmAtributosActionPerformed

    private void cbmFormasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbmFormasActionPerformed
        tbFormas.setVisible(!tbFormas.isVisible());
    }//GEN-LAST:event_cbmFormasActionPerformed

    private void cbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEditarActionPerformed
        VentanaInterna vi = (VentanaInterna)panelEscritorio.getSelectedFrame();
        vi.getLienzo().setEditable(cbEditar.isSelected());
    }//GEN-LAST:event_cbEditarActionPerformed

    private void cbTransparenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTransparenciaActionPerformed
        VentanaInterna vi = (VentanaInterna)panelEscritorio.getSelectedFrame();
        vi.getLienzo().setTransparente(cbTransparencia.isSelected());
    }//GEN-LAST:event_cbTransparenciaActionPerformed

    private void cbAlisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAlisarActionPerformed
        VentanaInterna vi = (VentanaInterna)panelEscritorio.getSelectedFrame();
        vi.getLienzo().setAlisado(cbAlisar.isSelected());
    }//GEN-LAST:event_cbAlisarActionPerformed

    private void spinnerGrosorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spinnerGrosorStateChanged
        VentanaInterna vi = (VentanaInterna)panelEscritorio.getSelectedFrame();
        vi.getLienzo().setGrosor((int)spinnerGrosor.getValue());
    }//GEN-LAST:event_spinnerGrosorStateChanged

    private void comboFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFiltroActionPerformed
        VentanaInterna vi = (VentanaInterna)panelEscritorio.getSelectedFrame();
        BufferedImage resultado = vi.getLienzo().getImage(true);
        
        if(imagenFoco != null){
            Kernel k = null;

            switch(this.comboFiltro.getSelectedIndex()){
                case 0:
                    k = KernelProducer.createKernel(KernelProducer.TYPE_MEDIA_3x3);
                    break;
                case 1:
                    k = KernelProducer.createKernel(KernelProducer.TYPE_BINOMIAL_3x3);
                    break;
                case 2:
                    k = KernelProducer.createKernel(KernelProducer.TYPE_ENFOQUE_3x3);
                    break;
                case 3:
                    k = KernelProducer.createKernel(KernelProducer.TYPE_RELIEVE_3x3);
                    break;
                case 4:
                    k = KernelProducer.createKernel(KernelProducer.TYPE_LAPLACIANA_3x3);
                default:
            }
            ConvolveOp cop = new ConvolveOp(k,ConvolveOp.EDGE_NO_OP,null);
            cop.filter(resultado, null);
        }
        
    }//GEN-LAST:event_comboFiltroActionPerformed

    private void sliderBrilloStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sliderBrilloStateChanged
        JSlider source = (JSlider)evt.getSource();
        if (!source.getValueIsAdjusting()) {
            int valor = (int)source.getValue();
            System.out.println("Slider"+valor);
        }
    }//GEN-LAST:event_sliderBrilloStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbAlisar;
    private javax.swing.JCheckBox cbEditar;
    private javax.swing.JCheckBox cbRelleno;
    private javax.swing.JCheckBox cbTransparencia;
    private javax.swing.JCheckBoxMenuItem cbmAtributos;
    private javax.swing.JCheckBoxMenuItem cbmEstado;
    private javax.swing.JCheckBoxMenuItem cbmFormas;
    private javax.swing.JComboBox comboFiltro;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JMenuItem miAbrir;
    private javax.swing.JMenuItem miGuardar;
    private javax.swing.JMenuItem miNuevo;
    private javax.swing.JPanel panelAtributos;
    private javax.swing.JPanel panelBrillo;
    private javax.swing.JPanel panelColor;
    private javax.swing.JPanel panelEfectos;
    private javax.swing.JDesktopPane panelEscritorio;
    private javax.swing.JPanel panelFiltro;
    private javax.swing.JPanel panelGrosor;
    private javax.swing.JSlider sliderBrillo;
    private javax.swing.JSpinner spinnerGrosor;
    private javax.swing.JToggleButton tbElipse;
    private javax.swing.JToolBar tbFormas;
    private javax.swing.JToggleButton tbLapiz;
    private javax.swing.JToggleButton tbLinea;
    private javax.swing.JToggleButton tbRectangulo;
    // End of variables declaration//GEN-END:variables
}
