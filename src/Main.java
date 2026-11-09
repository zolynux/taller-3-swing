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

    private static void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
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

        JTextField operaCampo1 = new JTextField();
        operaCampo1.setBounds(50, 80, 300, 30);

        JTextField operaCampo2 = new JTextField();
        operaCampo2.setBounds(450, 80, 300, 30);

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

        JTextField tempCampo = new JTextField();
        tempCampo.setBounds(50, 250, 250, 30);

        JButton botonConvertirFahrenheit = new JButton("Convertir a fahrenheit");
        botonConvertirFahrenheit.setBounds(50, 300, 200, 40);

        JButton botonConvertirCelsius = new JButton("Convertir a Celsius");
        botonConvertirCelsius.setBounds(310, 300, 200, 40);

        // ----------------------Conversion de Moneda ------------------------

        JLabel label4 = new JLabel("Ingresa el monto a convertir:");
        label4.setBounds(50, 380, 300, 30);

        JTextField monedaCampo = new JTextField();
        monedaCampo.setBounds(50, 410, 250, 30);

        JButton botonConvertirDolares = new JButton("Convertir a dolares (USD)");
        botonConvertirDolares.setBounds(50, 460, 200, 40);

        JButton botonConvertirPesos = new JButton("Convertir a Pesos Colombianos (COP)");
        botonConvertirPesos.setBounds(310, 460, 280, 40);

        // ---------------------- EventActions ------------------------

        ActionListener manejadorDeEventos = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Object fuente = e.getSource();

                    if (fuente == botonSumar) {
                        // ---------------------- Sumar ------------------------
                        mostrarMensaje("Suma es: " + formatear(leerNumero(operaCampo1) + leerNumero(operaCampo2)));

                    } else if (fuente == botonRestar) {
                        // ---------------------- Restar ------------------------
                        mostrarMensaje("Resta es: " + formatear(leerNumero(operaCampo1) - leerNumero(operaCampo2)));
                    } else if (fuente == botonMultiplicar) {
                        // ---------------------- Multplicacion ------------------------
                        mostrarMensaje(
                                "Multiplicación es: " + formatear(leerNumero(operaCampo1) * leerNumero(operaCampo2)));
                    } else if (fuente == botonDividir) {
                        // ---------------------- Division ------------------------
                        if (leerNumero(operaCampo2) == 0) {
                            mostrarError("No se puede dividir entre cero.");
                        } else {
                            mostrarMensaje(
                                    "División es: " + formatear(leerNumero(operaCampo1) / leerNumero(operaCampo2)));
                        }
                    } else if (fuente == botonConvertirFahrenheit) {
                        // ---------------------- Convertir °C a °F------------------------
                        double fahrenheit = (leerNumero(tempCampo) * 9.0 / 5.0) + 32;
                        mostrarMensaje("Fahrenheit: " + formatear(fahrenheit) + " °F");
                    } else if (fuente == botonConvertirCelsius) {
                        // ---------------------- Convertir °F a °C ------------------------
                        double celsius = (leerNumero(tempCampo) - 32) * 5.0 / 9.0;
                        mostrarMensaje("Celsius: " + formatear(celsius) + " °C");
                    } else if (fuente == botonConvertirDolares) {
                        // ---------------------- Convertir el monto en USD ------------------------
                        double USD = leerNumero(monedaCampo) / TASA_USD_COP;
                        mostrarMensaje("USD " + formatear(USD));
                    } else if (fuente == botonConvertirPesos) {
                        // ---------------------- Convertir el monto en COP ------------------------
                        double COP = leerNumero(monedaCampo) * TASA_USD_COP;
                        mostrarMensaje("COP " + formatear(COP));
                    }

                } catch (NumberFormatException ex) {
                    mostrarError("Por favor, ingresa solo números válidos");
                }
            }
        };
        for (JButton b : new JButton[] { botonSumar, botonRestar, botonMultiplicar, botonDividir,
                botonConvertirFahrenheit, botonConvertirCelsius,
                botonConvertirDolares, botonConvertirPesos }) {
            b.addActionListener(manejadorDeEventos);
        }
        // ----------------------agregar elementos de ventanta ------------------------
        for (Component c : new Component[] { label1, label2, label3, label4,
                operaCampo1, operaCampo2, tempCampo, monedaCampo,
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
