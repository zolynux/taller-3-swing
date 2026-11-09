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

        // ---------------------operaciones aritméticas-------------------------

        JButton sumarBoton = new JButton("Sumar");
        sumarBoton.setBounds(50, 120, 110, 40);

        JButton restarBoton = new JButton("Restar");
        restarBoton.setBounds(170, 120, 110, 40);

        JButton multiplicarButton = new JButton("Multiplicar");
        multiplicarButton.setBounds(290, 120, 110, 40);

        JButton dividirButton = new JButton("Dividir");
        dividirButton.setBounds(410, 120, 110, 40);

        // ----------------------Conversion de temperatura ------------------------

        JLabel label3 = new JLabel("Ingresa un valor en grados centigrados:");
        label3.setBounds(50, 210, 250, 30);

        JButton botonConvertirFahrenheit = new JButton("Convertir a fahrenheit");
        botonConvertirFahrenheit.setBounds(50, 240, 200, 40);

        JButton botonConvertirCelsius = new JButton("Convertir a Celsius");
        botonConvertirCelsius.setBounds(310, 240, 200, 40);

        // ----------------------Conversion de Moneda ------------------------

        JLabel label4 = new JLabel("Ingresa un valor en dolares (USB):");
        label4.setBounds(50, 330, 250, 30);

        JLabel label5 = new JLabel("Ingresa un valor en PesosColombianos (COP):");
        label5.setBounds(300, 330, 300, 30);

        JTextField campo3 = new JTextField();
        campo3.setBounds(50, 360, 250, 30);

        JTextField campo4 = new JTextField();
        campo4.setBounds(300, 360, 250, 30);

        JButton botonConvertirDolares = new JButton("Convertir a dolares (USB)");
        botonConvertirDolares.setBounds(50, 390, 200, 40);

        JButton botonConvertirPesos = new JButton("Convertir a PesosColombianos (COP)");
        botonConvertirPesos.setBounds(310, 390, 200, 40);

        // ----------------------agregar elementos de ventanta ------------------------

        ventana.add(label1);
        ventana.add(label2);
        ventana.add(label3);
        ventana.add(label4);
        ventana.add(label5);
        ventana.add(campo1);
        ventana.add(campo2);
        ventana.add(sumarBoton);
        ventana.add(restarBoton);
        ventana.add(multiplicarButton);
        ventana.add(dividirButton);
        ventana.add(botonConvertirCelsius);
        ventana.add(botonConvertirFahrenheit);

        // ----------------------------------------------
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);

    }
}
