import javax.swing.*;

void main() {
    JFrame ventana = new JFrame("Taller 3");

    ventana.setSize(800, 600);
    ventana.setLayout(null);

    JLabel label1 = new JLabel("Ingresa el primer numero:");
    label1.setBounds(50, 50, 200, 30);

    JLabel label2 = new JLabel("Ingresa el primer numero:");
    label2.setBounds(250, 50, 200, 30);



    ventana.add(label1);
    ventana.add(label2);

    ventana.setLocationRelativeTo(null);
    ventana.setVisible(true);

}
