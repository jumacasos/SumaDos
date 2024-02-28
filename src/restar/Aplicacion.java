package restar;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aplicacion {
    private JPanel pnlPrincipal;
    private JTextField tflNum1;
    private JTextField tflNum2;
    private JButton btnRestar;
    private JLabel lblResultado;

    public Aplicacion() {
        btnRestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String sN1 = tflNum1.getText();
                String sN2 = tflNum2.getText();
                int num1 = Integer.parseInt(sN1);
                int num2 = Integer.parseInt(sN2);
                int resta;
                String resultado;

                if ( num1 > num2 ){

                    resta = num1 - num2;

                    //pruba kkss
                    lblResultado.setText("La resta de los números " + num1 + " menos " + num2 + " es: " + resta);
                }
                else{
                    resta = num2 - num1;
                    lblResultado.setText("La resta de " + num2 + " menos " + num1 + " es: " + resta);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Aplicacion resta");
        frame.setContentPane(new Aplicacion().pnlPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(450, 230);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
