import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // ----------------------Titulos------------------------

        JFrame ventana = new JFrame("Taller 3");

        ventana.setSize(800, 600);
        ventana.setLayout(null);

        // ---------------------operaciones aritméticas-------------------------

        JLabel label1 = new JLabel("Ingresa el primer numero:");
        label1.setBounds(50, 50, 200, 30);

        JLabel label2 = new JLabel("Ingresa el segundo numero:");
        label2.setBounds(450, 50, 200, 30);

        JTextField campo1 = new JTextField();
        campo1.setBounds(50, 80, 300, 30);

        JTextField campo2 = new JTextField();
        campo2.setBounds(450, 80, 300, 30);

        JButton botonSumar = new JButton("Sumar");
        botonSumar.setBounds(50, 120, 110, 40);

        JButton botonRestar = new JButton("Restar");
        botonRestar.setBounds(170, 120, 110, 40);

        JButton botonMultiplicar = new JButton("Multiplicar");
        botonMultiplicar.setBounds(290, 120, 110, 40);

        JButton botonDividir = new JButton("Dividir");
        botonDividir.setBounds(410, 120, 110, 40);

        // ----------------------Conversion de temperatura ------------------------

        JLabel label3 = new JLabel("Ingresa la temperatura a convertir:");
        label3.setBounds(50, 210, 250, 30);

        JTextField campo3 = new JTextField();
        campo3.setBounds(50, 250, 250, 30);

        JButton botonConvertirFahrenheit = new JButton("Convertir a fahrenheit");
        botonConvertirFahrenheit.setBounds(50, 300, 200, 40);

        JButton botonConvertirCelsius = new JButton("Convertir a Celsius");
        botonConvertirCelsius.setBounds(310, 300, 200, 40);

        // ----------------------Conversion de Moneda ------------------------

        JLabel label4 = new JLabel("Ingresa el monto a convertir:");
        label4.setBounds(50, 380, 300, 30);

        JTextField campo4 = new JTextField();
        campo4.setBounds(50, 410, 250, 30);

        JButton botonConvertirDolares = new JButton("Convertir a dolares (USD)");
        botonConvertirDolares.setBounds(50, 460, 200, 40);

        JButton botonConvertirPesos = new JButton("Convertir a Pesos Colombianos (COP)");
        botonConvertirPesos.setBounds(310, 460, 200, 40);

        // ---------------------- EventActions ------------------------
        try {

            // ---------------------- Sumar ------------------------

            botonSumar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    try {
                        double num1 = Double.parseDouble(campo1.getText().trim().replace(',', '.'));
                        double num2 = Double.parseDouble(campo2.getText().trim().replace(',', '.'));

                        double sumar = num1 + num2;

                        JOptionPane.showMessageDialog(null, "Suma es: " + sumar);

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Por favor, ingresa solo números válidos", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }

            });

            // ---------------------- Restar ------------------------

            botonRestar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    try {
                        double num1 = Double.parseDouble(campo1.getText().trim().replace(',', '.'));
                        double num2 = Double.parseDouble(campo2.getText().trim().replace(',', '.'));

                        double restar = num1 - num2;

                        JOptionPane.showMessageDialog(null, "Resta es: " + restar);

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Por favor, ingresa solo números válidos", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }

            });

            // ---------------------- Multplicacion ------------------------

            botonMultiplicar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    try {
                        double num1 = Double.parseDouble(campo1.getText().trim().replace(',', '.'));
                        double num2 = Double.parseDouble(campo2.getText().trim().replace(',', '.'));

                        double multiplicar = num1 * num2;

                        JOptionPane.showMessageDialog(null, "Multiplicación es: " + multiplicar);

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Por favor, ingresa solo números válidos", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }

            });

            // ---------------------- Division ------------------------

            botonDividir.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    try {
                        double num1 = Double.parseDouble(campo1.getText().trim().replace(',', '.'));
                        double num2 = Double.parseDouble(campo2.getText().trim().replace(',', '.'));

                        if (num2 == 0) {
                            JOptionPane.showMessageDialog(null, "No se puede dividir entre cero.", "Error", JOptionPane.ERROR_MESSAGE);
                        } else {
                            double dividir = num1 / num2;

                            JOptionPane.showMessageDialog(null, "División es: " + dividir);
                        }


                    } catch (
                            NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Por favor, ingresa solo números válidos", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            });
            
            // ---------------------- Convertir °C a °F------------------------

                        botonConvertirFahrenheit.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                try {
                                    double num1 = Double.parseDouble(campo3.getText().trim().replace(',', '.'));

                                    double fahrenheit = (num1 * 9.0 / 5.0) + 32;

                                    JOptionPane.showMessageDialog(null, "Fahrenheit: " + String.format("%.2f", fahrenheit) + " °F");

                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Por favor, ingresa solo números válidos", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            }

                        });

                        // ---------------------- Convertir °F a °C ------------------------

                        botonConvertirCelsius.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {

                                try {
                                    double num1 = Double.parseDouble(campo3.getText().trim().replace(',', '.'));

                                    double celsius = (num1 - 32) * 5.0 / 9.0;

                                    JOptionPane.showMessageDialog(null, "Celsius: " + String.format("%.2f", celsius) + " °C");

                                } catch (NumberFormatException ex) {
                                    JOptionPane.showMessageDialog(null, "Por favor, ingresa solo números válidos", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        });
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Por favor, ingresa un numero valido", "Error", JOptionPane.ERROR_MESSAGE);
        }

        // ----------------------agregar elementos de ventanta ------------------------

        ventana.add(label1);
        ventana.add(label2);
        ventana.add(label3);
        ventana.add(label4);
        ventana.add(campo1);
        ventana.add(campo2);
        ventana.add(campo3);
        ventana.add(campo4);
        ventana.add(botonSumar);
        ventana.add(botonRestar);
        ventana.add(botonMultiplicar);
        ventana.add(botonDividir);
        ventana.add(botonConvertirCelsius);
        ventana.add(botonConvertirFahrenheit);
        ventana.add(botonConvertirDolares);
        ventana.add(botonConvertirPesos);

        // ----------------------------------------------
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);

    }
}
