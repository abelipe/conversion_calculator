
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;



public class UnitConverterUI extends javax.swing.JFrame {
    
    
    public UnitConverterUI() {
        initComponents();
        addEventListeners();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(10, 16));

        jTextField1.setMinimumSize(new java.awt.Dimension(176, 22));
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jTextField2.setMinimumSize(new java.awt.Dimension(176, 22));
        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Milla por galon americano", "Millas por galon (imperial)", "Kilometro por litro", "Litro por 100 kilometros" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Milla por galon americano", "Millas por galon (imperial)", "Kilometro por litro", "Litro por 100 kilometros" }));
        jComboBox2.setSelectedIndex(1);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consumo de combustible", "Frecuencia" }));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("=");

        jLabel2.setBackground(new java.awt.Color(255, 255, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Fórmula:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(jLabel1)
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(280, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    jTextField2.setText(jTextField1.getText().isEmpty() ? "" : jTextField2.getText());
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    jTextField1.setText(jTextField2.getText().isEmpty() ? "" : jTextField1.getText());
    }//GEN-LAST:event_jTextField2KeyTyped

  
    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(() -> {
        UnitConverterUI ui = new UnitConverterUI();
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    });
}

    
// Clases
    
public abstract class ComboBoxHandler {
    protected JComboBox comboBox;

    public ComboBoxHandler(JComboBox comboBox) {
        this.comboBox = comboBox;
    }

    public void handleSelection(ItemEvent e) {
        // Default implementation, do nothing
    }
}

public class ComboBox1Handler extends ComboBoxHandler {
    private JComboBox comboBox2;

    public ComboBox1Handler(JComboBox comboBox, JComboBox comboBox2) {
        super(comboBox);
        this.comboBox2 = comboBox2;
    }
}

public class ComboBox2Handler extends ComboBoxHandler {
    private JComboBox comboBox1;

    public ComboBox2Handler(JComboBox comboBox, JComboBox comboBox1) {
        super(comboBox);
        this.comboBox1 = comboBox1;
    }
}

public class ComboBox3Handler extends ComboBoxHandler {
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JTextField jTextField1;
    private JTextField jTextField2;

    public ComboBox3Handler(JComboBox comboBox, JComboBox comboBox1, JComboBox comboBox2, JTextField jTextField1, JTextField jTextField2) {
        super(comboBox);
        this.comboBox1 = comboBox1;
        this.comboBox2 = comboBox2;
        this.jTextField1 = jTextField1;
        this.jTextField2 = jTextField2;
    }

    
    public void handleSelection(Object selectedItem) {
        System.out.println("ComboBox 3: " + selectedItem);

        comboBox1.setModel(selectedItem.equals("Consumo de combustible") 
        ? new DefaultComboBoxModel<>(new String[] {"Milla por galon americano", "Millas por galon (imperial)", "Kilometro por litro", "Litro por 100 kilometros"}) 
        : selectedItem.equals("Frecuencia") 
        ? new DefaultComboBoxModel<>(new String[] {"Hercio", "Kilohercio", "Megahercio", "Gigahercio"}) 
        : comboBox1.getModel());

        comboBox2.setModel(selectedItem.equals("Consumo de combustible") 
        ? new DefaultComboBoxModel<>(new String[] {"Milla por galon americano", "Millas por galon (imperial)", "Kilometro por litro", "Litro por 100 kilometros"}) 
        : selectedItem.equals("Frecuencia") 
        ? new DefaultComboBoxModel<>(new String[] {"Hercio", "Kilohercio", "Megahercio", "Gigahercio"}) 
        : comboBox2.getModel());

        jTextField1.setText(selectedItem.equals("Consumo de combustible") || selectedItem.equals("Frecuencia") ? "" : jTextField1.getText());
        jTextField2.setText(selectedItem.equals("Consumo de combustible") || selectedItem.equals("Frecuencia") ? "" : jTextField2.getText());
    }
}


    private void addEventListeners() {
    ComboBox1Handler comboBox1Handler = new ComboBox1Handler(jComboBox1, jComboBox2);
    jComboBox1.addItemListener(e -> comboBox1Handler.handleSelection(e));

    ComboBox2Handler comboBox2Handler = new ComboBox2Handler(jComboBox2, jComboBox1);
    jComboBox2.addItemListener(e -> comboBox2Handler.handleSelection(e));

    ComboBox3Handler comboBox3Handler = new ComboBox3Handler(jComboBox3, jComboBox1, jComboBox2, jTextField1, jTextField2);
    jComboBox3.addItemListener(e -> {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            comboBox3Handler.handleSelection(jComboBox3.getSelectedItem());
        }
    });


    jTextField1.addKeyListener(new KeyAdapter() {
    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("TextField 1: " + jTextField1.getText());
        String value = jTextField1.getText();
        if (!value.isEmpty()) {
            double inputValue = Double.parseDouble(value);
            String unit1 = (String) jComboBox1.getSelectedItem();
            String unit2 = (String) jComboBox2.getSelectedItem();
            String unit3 = (String) jComboBox3.getSelectedItem();

            double result = unit3.equals("Consumo de combustible")
                    ? (unit1.equals("Milla por galon americano")
                            ? (unit2.equals("Millas por galon (imperial)") ? inputValue * 1.201
                                    : unit2.equals("Kilometro por litro") ? inputValue * 0.425144
                                            : unit2.equals("Litro por 100 kilometros") ? 235.215 / inputValue
                                                    : inputValue)
                            : unit1.equals("Millas por galon (imperial)")
                                    ? (unit2.equals("Milla por galon americano") ? inputValue / 1.201
                                            : unit2.equals("Kilometro por litro") ? inputValue / 2.825
                                                    : unit2.equals("Litro por 100 kilometros") ? 282.481 / inputValue
                                                            : inputValue)
                                    : unit1.equals("Kilometro por litro")
                                            ? (unit2.equals("Milla por galon americano") ? inputValue / 0.425144
                                                    : unit2.equals("Millas por galon (imperial)") ? inputValue * 2.825
                                                            : unit2.equals("Litro por 100 kilometros") ? 100 / inputValue
                                                                    : inputValue)
                                            : unit1.equals("Litro por 100 kilometros")
                                                    ? (unit2.equals("Milla por galon americano") ? 235.215 / inputValue
                                                            : unit2.equals("Millas por galon (imperial)") ? 282.481 / inputValue
                                                                    : unit2.equals("Kilometro por litro") ? 100 / inputValue
                                                                            : inputValue)
                                                    : inputValue)
                    : (unit1.equals("Hercio")
                            ? (unit2.equals("Kilohercio") ? inputValue / 1000
                                    : unit2.equals("Megahercio") ? inputValue / 1000000
                                            : unit2.equals("Gigahercio") ? inputValue / 1000000000
                                                    : inputValue)
                            : unit1.equals("Kilohercio")
                                    ? (unit2.equals("Hercio") ? inputValue * 1000
                                            : unit2.equals("Megahercio") ? inputValue / 1000
                                                    : unit2.equals("Gigahercio") ? inputValue / 1000000
                                                            : inputValue)
                                    : unit1.equals("Megahercio")
                                            ? (unit2.equals("Hercio") ? inputValue * 1000000
                                                    : unit2.equals("Kilohercio") ? inputValue * 1000
                                                            : unit2.equals("Gigahercio") ? inputValue / 1000
                                                                    : inputValue)
                                            : unit1.equals("Gigahercio")
                                                    ? (unit2.equals("Hercio") ? inputValue * 1000000000
                                                            : unit2.equals("Kilohercio") ? inputValue * 1000000
                                                                    : unit2.equals("Megahercio") ? inputValue * 1000
                                                                            : inputValue)
                                                    : inputValue);
            String formula = unit3.equals("Consumo de combustible")
                    ? (unit1.equals("Milla por galon americano")
                            ? (unit2.equals("Millas por galon (imperial)") ? "Multiplicar el valor de consumo de combustible por 1.201"
                                    : unit2.equals("Kilometro por litro") ? "divide el valor de consumo de combustible entre 2.352"
                                            : unit2.equals("Litro por 100 kilometros") ? "235.215/(1 US mpg) = 235.215 L/100 km"
                                                    : "")
                            : unit1.equals("Millas por galon (imperial)")
                                    ? (unit2.equals("Milla por galon americano") ? "divide el valor de consumo de combustible entre 1.201"
                                            : unit2.equals("Kilometro por litro") ? "para obtener un resultado aproximado, divide el valor de consumo de combustible entre 2.825"
                                                    : unit2.equals("Litro por 100 kilometros") ? "282.481/(1 I mpg) = 282.481 L/100 km"
                                                            : "")
                                    : unit1.equals("Kilometro por litro")
                                            ? (unit2.equals("Milla por galon americano") ? "Multiplicar el valor de consumo de combustible por 2.352"
                                                    : unit2.equals("Millas por galon (imperial)") ? "Multiplicar el valor de consumo de combustible por 2.825"
                                                            : unit2.equals("Litro por 100 kilometros") ? "100/(1 km/L) = 100 L/100 km"
                                                                    : "")
                                            : unit1.equals("Litro por 100 kilometros")
                                                    ? (unit2.equals("Milla por galon americano") ? "235.215/(1 US mpg) = 235.215 L/100 km"
                                                            : unit2.equals("Millas por galon (imperial)") ? "282.481/(1 I mpg) = 282.481 L/100 km"
                                                                    : unit2.equals("Kilometro por litro") ? "100/(1 km/L) = 100 L/100 km"
                                                                            : "")
                                                    : "")
                    : (unit1.equals("Hercio")
                            ? (unit2.equals("Kilohercio") ? "Multiplicar el valor de hercio por 1000"
                                    : unit2.equals("Megahercio") ? "Multiplicar el valor de hercio por 1000000"
                                            : unit2.equals("Gigahercio") ? "Multiplicar el valor de hercio por 1000000000"
                                                    : "")
                            : unit1.equals("Kilohercio")
                                    ? (unit2.equals("Hercio") ? "Divide el valor de kilohercio entre 1000"
                                            : unit2.equals("Megahercio") ? "Multiplicar el valor de kilohercio por 1000"
                                                    : unit2.equals("Gigahercio") ? "Multiplicar el valor de kilohercio por 1000000"
                                                            : "")
                                    : unit1.equals("Megahercio")
                                            ? (unit2.equals("Hercio") ? "Multiplicar el valor de megahercio por 1000000"
                                                    : unit2.equals("Kilohercio") ? "Multiplicar el valor de megahercio por 1000"
                                                            : unit2.equals("Gigahercio") ? "Multiplicar el valor de megahercio por 1000"
                                                                    : "")
                                            : unit1.equals("Gigahercio")
                                                    ? (unit2.equals("Hercio") ? "Multiplicar el valor de gigahercio por 1000000000"
                                                            : unit2.equals("Kilohercio") ? "Multiplicar el valor de gigahercio por 1000000"
                                                                    : unit2.equals("Megahercio") ? "Multiplicar el valor de gigahercio por 1000"
                                                                            : "")
                                                    : "");

            jTextField2.setText(String.valueOf(result));
            jLabel2.setText("Formula: " + formula);
        }
    }
});
   jTextField2.addKeyListener(new KeyAdapter() {
    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("TextField 2: " + jTextField2.getText());
        String value = jTextField2.getText();
        if (!value.isEmpty()) {
            double inputValue = Double.parseDouble(value);
            String unit1 = (String) jComboBox1.getSelectedItem();
            String unit2 = (String) jComboBox2.getSelectedItem();
            String unit3 = (String) jComboBox3.getSelectedItem();

            double result = unit3.equals("Consumo de combustible")
                    ? (unit2.equals("Milla por galon americano")
                            ? (unit1.equals("Millas por galon (imperial)") ? inputValue / 1.201 : unit1.equals("Kilometro por litro") ? inputValue / 2.352 : unit1.equals("Litro por 100 kilometros") ? 235.215 / inputValue : inputValue)
                            : unit2.equals("Millas por galon (imperial)")
                            ? (unit1.equals("Milla por galon americano") ? inputValue * 0.83267 : unit1.equals("Kilometro por litro") ? inputValue / 2.825 : unit1.equals("Litro por 100 kilometros") ? 282.481 / inputValue : inputValue)
                            : unit2.equals("Kilometro por litro")
                            ? (unit1.equals("Milla por galon americano") ? inputValue / 0.425144 : unit1.equals("Millas por galon (imperial)") ? inputValue * 2.825 : unit1.equals("Litro por 100 kilometros") ? 100 / inputValue : inputValue)
                            : unit2.equals("Litro por 100 kilometros")
                            ? (unit1.equals("Milla por galon americano") ? 235.215 / inputValue : unit1.equals("Millas por galon (imperial)") ? 282.481 / inputValue : unit1.equals("Kilometro por litro") ? 100 / inputValue : inputValue)
                            : inputValue)
                    : unit3.equals("Frecuencia")
                    ? (unit2.equals("Hercio")
                            ? (unit1.equals("Kilohercio") ? inputValue / 1000 : unit1.equals("Megahercio") ? inputValue / 1000000 : unit1.equals("Gigahercio") ? inputValue / 1000000000 : inputValue)
                            : unit2.equals("Kilohercio")
                            ? (unit1.equals("Hercio") ? inputValue * 1000 : unit1.equals("Megahercio") ? inputValue / 1000 : unit1.equals("Gigahercio") ? inputValue / 1000000 : inputValue)
                            : unit2.equals("Megahercio")
                            ? (unit1.equals("Hercio") ? inputValue * 1000000 : unit1.equals("Kilohercio") ? inputValue * 1000 : unit1.equals("Gigahercio") ? inputValue / 1000 : inputValue)
                            : unit2.equals("Gigahercio")
                            ? (unit1.equals("Hercio") ? inputValue * 1000000000 : unit1.equals("Kilohercio") ? inputValue * 1000000 : unit1.equals("Megahercio") ? inputValue * 1000 : inputValue)
                            : inputValue)
                    : inputValue;
            jLabel2.setText(unit3.equals("Consumo de combustible")
                    ? (unit2.equals("Milla por galon americano")
                            ? (unit1.equals("Millas por galon (imperial)") ? "Fórmula: divide el valor de consumo de combustible entre 1.201" : unit1.equals("Kilometro por litro") ? "Fórmula: Multiplicar el valor de consumo de combustible por 2.352" : unit1.equals("Litro por 100 kilometros") ? "Fórmula: 235.215/(L/100 km) = US mpg" : "")
                            : unit2.equals("Millas por galon (imperial)")
                            ? (unit1.equals("Milla por galon americano") ? "Fórmula: Multiplicar el valor de consumo de combustible por 1.201" : unit1.equals("Kilometro por litro") ? "Fórmula: para obtener un resultado aproximado, multiplica el valor de consumo de combustible por 2.825" : unit1.equals("Litro por 100 kilometros") ? "Fórmula: 282.481/(L/100 km) = I mpg" : "")
                            : unit2.equals("Kilometro por litro")
                            ? (unit1.equals("Milla por galon americano") ? "Fórmula: divide el valor de consumo de combustible entre 2.352" : unit1.equals("Millas por galon (imperial)") ? "Fórmula: para obtener un resultado aproximado, divide el valor de consumo de combustible entre 2.825" : unit1.equals("Litro por 100 kilometros") ? "Fórmula: 100/(L/100 km) = km/L" : "")
                            : unit2.equals("Litro por 100 kilometros")
                            ? (unit1.equals("Milla por galon americano") ? "Fórmula: 235.215/(US mpg) = L/100 km" : unit1.equals("Millas por galon (imperial)") ? "Fórmula: 282.481/(I mpg) = L/100 km" : unit1.equals("Kilometro por litro") ? "Fórmula: 100/(km/L) = L/100 km" : "")
                            : "")
                    : unit3.equals("Frecuencia")
                    ? (unit2.equals("Hercio")
                            ? (unit1.equals("Kilohercio") ? "Fórmula: Multiplicar el valor de frecuencia por 1000" : unit1.equals("Megahercio") ? "Fórmula: Multiplicar el valor de frecuencia por 1e+6" : unit1.equals("Gigahercio") ? "Fórmula: Multiplicar el valor de frecuencia por 1e+9" : "")
                            : unit2.equals("Kilohercio")
                            ? (unit1.equals("Hercio") ? "Fórmula: divide el valor de frecuencia entre 1000" : unit1.equals("Megahercio") ? "Fórmula: Multiplicar el valor de frecuencia por 1000" : unit1.equals("Gigahercio") ? "Fórmula: Multiplicar el valor de frecuencia por 1e+6" : "")
                            : unit2.equals("Megahercio")
                            ? (unit1.equals("Hercio") ? "Fórmula: divide el valor de frecuencia entre 1e+6" : unit1.equals("Kilohercio") ? "Fórmula: divide el valor de frecuencia entre 1000" : unit1.equals("Gigahercio") ? "Fórmula: Multiplicar el valor de frecuencia por 1000" : "")
                            : unit2.equals("Gigahercio")
                            ? (unit1.equals("Hercio") ? "Fórmula: divide el valor de frecuencia entre 1e+9" : unit1.equals("Kilohercio") ? "Fórmula: divide el valor de frecuencia entre 1e+6" : unit1.equals("Megahercio") ? "Fórmula: divide el valor de frecuencia entre 1000" : "")
                            : "")
                    : "");

            jTextField1.setText(String.valueOf(result));
        }
    }
});
    
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}

