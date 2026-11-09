import javax.swing.*;

import java.awt.Component;
import java.awt.event.*;

public class Main {
    private static final double TASA_USD_COP = 3200;

    private static double leerNumero(JTextField campo) {
        return Double.parseDouble(campo.getText().trim().replace(',', '.'));
    }

    private static String formatear(double datos) {
        return String.format("%.2f", datos);
    }

    private static void mostrarError(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

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
        botonConvertirPesos.setBounds(310, 460, 280, 40);

        // ---------------------- EventActions ------------------------

        // ---------------------- Sumar ------------------------

        botonSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    JOptionPane.showMessageDialog(null,
                            "Suma es: " + formatear(leerNumero(campo1) + leerNumero(campo2)));
                } catch (NumberFormatException ex) {
                    mostrarError("Por favor, ingresa solo números válidos");
                }
            }
        });

        // ---------------------- Restar ------------------------

        botonRestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    JOptionPane.showMessageDialog(null,
                            "Resta es: " + formatear(leerNumero(campo1) - leerNumero(campo2)));
                } catch (NumberFormatException ex) {
                    mostrarError("Por favor, ingresa solo números válidos");
                }
            }
        });

        // ---------------------- Multplicacion ------------------------

        botonMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    JOptionPane.showMessageDialog(null,
                            "Multiplicación es: " + formatear(leerNumero(campo1) * leerNumero(campo2)));
                } catch (NumberFormatException ex) {
                    mostrarError("Por favor, ingresa solo números válidos");
                }
            }

        });

        // ---------------------- Division ------------------------

        botonDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    if (leerNumero(campo2) == 0) {
                        mostrarError("No se puede dividir entre cero.");
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "División es: " + formatear(leerNumero(campo1) / leerNumero(campo2)));
                    }

                } catch (NumberFormatException ex) {
                    mostrarError("Por favor, ingresa solo números válidos");
                }
            }
        });

        // ---------------------- Convertir °C a °F------------------------

        botonConvertirFahrenheit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double fahrenheit = (leerNumero(campo3) * 9.0 / 5.0) + 32;
                    JOptionPane.showMessageDialog(null, "Fahrenheit: " + formatear(fahrenheit) + " °F");
                } catch (NumberFormatException ex) {
                    mostrarError("Por favor, ingresa solo números válidos");
                }
            }
        });

        // ---------------------- Convertir °F a °C ------------------------

        botonConvertirCelsius.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double celsius = (leerNumero(campo3) - 32) * 5.0 / 9.0;
                    JOptionPane.showMessageDialog(null, "Celsius: " + formatear(celsius) + " °C");
                } catch (NumberFormatException ex) {
                    mostrarError("Por favor, ingresa solo números válidos");
                }
            }
        });

        // ---------------------- Convertir el monto en USD ------------------------

        botonConvertirDolares.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double USD = leerNumero(campo4) / TASA_USD_COP;
                    JOptionPane.showMessageDialog(null, "USD " + formatear(USD));
                } catch (NumberFormatException ex) {
                    mostrarError("Por favor, ingresa solo números válidos");
                }
            }
        });

        // ---------------------- Convertir el monto en COP ------------------------

        botonConvertirPesos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double COP = leerNumero(campo4) * TASA_USD_COP;
                    JOptionPane.showMessageDialog(null, "COP " + formatear(COP));
                } catch (NumberFormatException ex) {
                    mostrarError("Por favor, ingresa solo números válidos");
                }
            }
        });

        // ----------------------agregar elementos de ventanta ------------------------
        for (Component c : new Component[] { label1, label2, label3, label4,
                campo1, campo2, campo3, campo4,
                botonSumar, botonRestar, botonMultiplicar, botonDividir,
                botonConvertirCelsius, botonConvertirFahrenheit,
                botonConvertirDolares, botonConvertirPesos }) {
            ventana.add(c);
        }

        // ----------------------------------------------
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);

    }
}
