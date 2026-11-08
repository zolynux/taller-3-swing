import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // ----------------------Titulos------------------------

        JFrame ventana = new JFrame("Taller 3");

        ventana.setSize(800, 600);
        ventana.setLayout(null);

        // ----------------------Subtitulos------------------------

        JLabel label1 = new JLabel("Ingresa el primer numero:");
        label1.setBounds(50, 50, 200, 30);

        JLabel label2 = new JLabel("Ingresa el segundo numero:");
        label2.setBounds(450, 50, 200, 30);

        // ----------------------Campos------------------------

        JTextField campo1 = new JTextField();
        campo1.setBounds(50, 80, 300, 30);

        JTextField campo2 = new JTextField();
        campo2.setBounds(450, 80, 300, 30);

        // ---------------------Botontes-------------------------

        JButton sumarBoton = new JButton("Sumar");
        sumarBoton.setBounds(100, 110, 100, 50);

        JButton restarBoton = new JButton("Restar");
        restarBoton.setBounds(200, 110, 100, 50);

        JButton multiplicarButton = new JButton("Multiplicar");
        multiplicarButton.setBounds(300, 110, 100, 50);

        JButton dividirButton = new JButton("Dividir");
        dividirButton.setBounds(400, 110, 100, 50);

        // ----------------------agregar ------------------------

        ventana.add(label1);
        ventana.add(label2);
        ventana.add(campo1);
        ventana.add(campo2);
        ventana.add(sumarBoton);
        ventana.add(restarBoton);
        ventana.add(multiplicarButton);
        ventana.add(dividirButton);

        // ----------------------------------------------
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);

    }
}
