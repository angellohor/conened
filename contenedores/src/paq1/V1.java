package paq1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class V1 extends JFrame{
    private JTextField n_identificacion;
    private JTextField n_peso;
    private JTextField n_remite;
    private JTextField n_recibe;
    private JComboBox n_pais;
    private JRadioButton a1;
    private JRadioButton a3;
    private JRadioButton a2;
    private JCheckBox inspeccionadoEnAduanasCheckBox;
    private JTextArea n_descripcion;
    private JTextArea n_estado;
    private JButton apilarButton;
    private JButton desapilarButton;
    private JTextField numeroDeColumnaTextField;
    private JButton mostrarDatosDelContenedorButton;
    private JTextField IDContenedorTextField;
    private JButton cuantosButton;
    private JComboBox comboBox2;
    private JTextField textField3;
    private JPanel mainpanel;
    private JLabel lbv1;
    private JLabel logo;
    private JLabel error_peso;
    private JLabel error_prioridad;

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
    public V1 (){
        contenedor [][]p1;
        p1 = new contenedor[10][12];
        for(int i=0;i<10;i++){
            for(int a=0; a<12; a++){
                p1[i][a] = new contenedor();
            }
        }
        setContentPane(mainpanel);
        setTitle("GestionDeContenedores");
        setSize(900,500);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        apilarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (n_identificacion.getText().matches("[0-9]+")) {
                    lbv1.setText("Numero de identificacion correcto");
                    if ((a1.isSelected()== true && a2.isSelected()==false && a3.isSelected()==false) || (a1.isSelected()== false && a2.isSelected()==true && a3.isSelected()==false) || (a1.isSelected()== false && a2.isSelected()==false && a3.isSelected()==true)){
                        error_prioridad.setText("Prioridad correcta");
                        if (n_peso.getText().matches("[0-9]+.+[0-9]") || n_peso.getText().matches("[0-9]+")) {
                            error_peso.setText("Peso correcto");

                            
                            p1[0][0].setNumero_identificación(Integer.parseInt(n_identificacion.getText()));
                            p1[0][0].setPeso(Double.parseDouble(n_peso.getText()));
                            if(a1.isSelected()){
                                p1[0][0].setPrioridad(1);
                            } else if (a2.isSelected()) {
                                p1[0][0].setPrioridad(2);
                            } else if (a3.isSelected()) {
                                p1[0][0].setPrioridad(3);
                            }
                            p1[0][0].setDescripción(n_descripcion.getText());
                            p1[0][0].setAduanas(inspeccionadoEnAduanasCheckBox.isSelected());
                            p1[0][0].setEstado(n_estado.getText());
                            p1[0][0].setEmpresa_receptora(n_recibe.getText());
                            p1[0][0].setEmpresa_remitente(n_remite.getText());
                            p1[0][0].setPaís_procedencia((String)n_pais.getSelectedItem());

                        } else error_peso.setText("Introduce un numero de peso correcto");
                    }else error_prioridad.setText("Presiona solo un numero de prioridad");
                }else lbv1.setText("Introduce un numero de identificacion entero");



            }
        });
        desapilarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbv1.setText("Has desapilado el contenedor seleccionado");
            }
        });
        mostrarDatosDelContenedorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gestioncontainers gest = new gestioncontainers(p1[0][0]);
            }
        });
        cuantosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lbv1.setText("Has presionado ¿cuantos?");
            }
        });
    }
}
