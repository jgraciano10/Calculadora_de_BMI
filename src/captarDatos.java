import javax.swing.*;
import java.awt.*;

public class captarDatos extends JFrame {
    private JPanel captarDatos;
    private JTextField textPeso;
    private JTextField textAltura;
    private JButton calcularButton;
    private JButton limpiarButton;
    private JTextArea textResultado;
    private JPanel Jpanel1;

    public JPanel getCaptarDatos() {
        return captarDatos;
    }

    public void setListener(Procesador listener) {
        calcularButton.addActionListener(listener);
        limpiarButton.addActionListener(listener);
    }

    public void calcular (){
        String peso = textPeso.getText();
        String altura= textAltura.getText();
        Calcular_BMI calcularBmi = new Calcular_BMI(Double.parseDouble(peso), Double.parseDouble(altura));
        textResultado.append(calcularBmi.calcular());

    }

    public void limpiar (){
        textAltura.setText("");
        textPeso.setText("");
        textResultado.setText("");
    }


}
