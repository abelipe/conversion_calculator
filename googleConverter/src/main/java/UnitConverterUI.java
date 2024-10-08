import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;



public class UnitConverterUI extends javax.swing.JFrame {
        // Define the conversion factors and formulas
        private static final Map<String, Map<String, Double>> conversionFactors = new HashMap<>();
        private static final Map<String, Map<String, String>> conversionFormulas = new HashMap<>();
        private static final Map<String, Boolean> isDivision = new HashMap<>();

    static {
        // Initialize conversion factors for "Consumo de combustible"
        Map<String, Double> fuelConsumptionFactors = new HashMap<>();
        fuelConsumptionFactors.put("Milla por galon americano-Millas por galon (imperial)", 1.201);
        fuelConsumptionFactors.put("Milla por galon americano-Kilometro por litro", 2.352);
        fuelConsumptionFactors.put("Milla por galon americano-Litro por 100 kilometros", 235.215);
        fuelConsumptionFactors.put("Millas por galon (imperial)-Milla por galon americano", 1 / 1.201);
        fuelConsumptionFactors.put("Millas por galon (imperial)-Kilometro por litro", 2.825);
        fuelConsumptionFactors.put("Millas por galon (imperial)-Litro por 100 kilometros", 282.481);
        fuelConsumptionFactors.put("Kilometro por litro-Milla por galon americano", 1 / 2.352);
        fuelConsumptionFactors.put("Kilometro por litro-Millas por galon (imperial)", 1 / 2.825);
        fuelConsumptionFactors.put("Kilometro por litro-Litro por 100 kilometros", 100.0);
        fuelConsumptionFactors.put("Litro por 100 kilometros-Milla por galon americano", 235.215);
        fuelConsumptionFactors.put("Litro por 100 kilometros-Millas por galon (imperial)", 282.481);
        fuelConsumptionFactors.put("Litro por 100 kilometros-Kilometro por litro", 100.0);
        conversionFactors.put("Consumo de combustible", fuelConsumptionFactors);

        // Initialize conversion formulas for "Consumo de combustible"
        Map<String, String> fuelConsumptionFormulas = new HashMap<>();
        fuelConsumptionFormulas.put("Milla por galon americano-Millas por galon (imperial)", "Multiplicar el valor de milla por galon americano por 1.201");
        fuelConsumptionFormulas.put("Milla por galon americano-Kilometro por litro", "Multiplicar el valor de milla por galon americano por 2.352");
        fuelConsumptionFormulas.put("Milla por galon americano-Litro por 100 kilometros", "Dividir el valor de milla por galon americano por 235.215");
        fuelConsumptionFormulas.put("Millas por galon (imperial)-Milla por galon americano", "Dividir el valor de millas por galon (imperial) por 1.201");
        fuelConsumptionFormulas.put("Millas por galon (imperial)-Kilometro por litro", "Multiplicar el valor de millas por galon (imperial) por 2.825");
        fuelConsumptionFormulas.put("Millas por galon (imperial)-Litro por 100 kilometros", "Dividir 282.481 por el valor de millas por galon (imperial)");
        fuelConsumptionFormulas.put("Kilometro por litro-Milla por galon americano", "Dividir el valor de kilometro por litro por 2.352");
        fuelConsumptionFormulas.put("Kilometro por litro-Millas por galon (imperial)", "Dividir el valor de kilometro por litro por 2.825");
        fuelConsumptionFormulas.put("Kilometro por litro-Litro por 100 kilometros", "Dividir el valor de kilometro por litro por 100");
        fuelConsumptionFormulas.put("Litro por 100 kilometros-Milla por galon americano", "Multiplicar el valor de litro por 100 kilometros por 235.215");
        fuelConsumptionFormulas.put("Litro por 100 kilometros-Millas por galon (imperial)", "Multiplicar el valor de litro por 100 kilometros por 282.481");
        fuelConsumptionFormulas.put("Litro por 100 kilometros-Kilometro por litro", "Multiplicar el valor de litro por 100 kilometros por 100");
        conversionFormulas.put("Consumo de combustible", fuelConsumptionFormulas);

        // Initialize conversion factors for "Frecuencia"
        Map<String, Double> frequencyFactors = new HashMap<>();
        frequencyFactors.put("Hercio-Kilohercio", 1 / 1000.0);
        frequencyFactors.put("Hercio-Megahercio", 1 / 1000000.0);
        frequencyFactors.put("Hercio-Gigahercio", 1 / 1000000000.0);
        frequencyFactors.put("Kilohercio-Hercio", 1000.0);
        frequencyFactors.put("Kilohercio-Megahercio", 1 / 1000.0);
        frequencyFactors.put("Kilohercio-Gigahercio", 1 / 1000000.0);
        frequencyFactors.put("Megahercio-Hercio", 1000000.0);
        frequencyFactors.put("Megahercio-Kilohercio", 1000.0);
        frequencyFactors.put("Megahercio-Gigahercio", 1 / 1000.0);
        frequencyFactors.put("Gigahercio-Hercio", 1000000000.0);
        frequencyFactors.put("Gigahercio-Kilohercio", 1000000.0);
        frequencyFactors.put("Gigahercio-Megahercio", 1000.0);
        conversionFactors.put("Frecuencia", frequencyFactors);

        // Initialize conversion formulas for "Frecuencia"
        Map<String, String> frequencyFormulas = new HashMap<>();
        frequencyFormulas.put("Hercio-Kilohercio", "Dividir el valor de hercio por 1000");
        frequencyFormulas.put("Hercio-Megahercio", "Dividir el valor de hercio por 1000000");
        frequencyFormulas.put("Hercio-Gigahercio", "Dividir el valor de hercio por 1000000000");
        frequencyFormulas.put("Kilohercio-Hercio", "Multiplicar el valor de kilohercio por 1000");
        frequencyFormulas.put("Kilohercio-Megahercio", "Dividir el valor de kilohercio por 1000");
        frequencyFormulas.put("Kilohercio-Gigahercio", "Dividir el valor de kilohercio por 1000000");
        frequencyFormulas.put("Megahercio-Hercio", "Multiplicar el valor de megahercio por 1000000");
        frequencyFormulas.put("Megahercio-Kilohercio", "Multiplicar el valor de megahercio por 1000");
        frequencyFormulas.put("Megahercio-Gigahercio", "Dividir el valor de megahercio por 1000");
        frequencyFormulas.put("Gigahercio-Hercio", "Multiplicar el valor de gigahercio por 1000000000");
        frequencyFormulas.put("Gigahercio-Kilohercio", "Multiplicar el valor de gigahercio por 1000000");
        frequencyFormulas.put("Gigahercio-Megahercio", "Multiplicar el valor de gigahercio por 1000");
        conversionFormulas.put("Frecuencia", frequencyFormulas);

        // Initialize division flags for "Consumo de combustible"
        isDivision.put("Milla por galon americano-Litro por 100 kilometros", true);
        isDivision.put("Millas por galon (imperial)-Litro por 100 kilometros", true);
        isDivision.put("Kilometro por litro-Litro por 100 kilometros", true);
        isDivision.put("Litro por 100 kilometros-Milla por galon americano", true);
        isDivision.put("Litro por 100 kilometros-Millas por galon (imperial)", true);
        isDivision.put("Litro por 100 kilometros-Kilometro por litro", true);

    }

    
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
        Optional.of(evt.getKeyChar())
                .filter(Character::isDigit)
                .ifPresentOrElse(
                        c -> {},
                        evt::consume
                );
        Optional.of(jTextField1.getText())
                .filter(text -> !text.isEmpty())
                .ifPresentOrElse(
                        text -> jTextField2.setText(jTextField2.getText()),
                        () -> jTextField2.setText("")
                );
    }//GEN-LAST:event_jTextField1KeyTyped
    
    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        Optional.of(evt.getKeyChar())
                .filter(Character::isDigit)
                .ifPresentOrElse(
                        c -> {},
                        evt::consume
                );
        Optional.of(jTextField2.getText())
                .filter(text -> !text.isEmpty())
                .ifPresentOrElse(
                        text -> jTextField1.setText(jTextField1.getText()),
                        () -> jTextField1.setText("")
                );
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
    jComboBox3.addItemListener(e -> 
    Optional.of(e)
            .filter(event -> event.getStateChange() == ItemEvent.SELECTED)
            .map(ItemEvent::getItem)
            .ifPresent(comboBox3Handler::handleSelection)
        );


    jTextField1.addKeyListener(new KeyAdapter() {
        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("TextField 1: " + jTextField1.getText());
            Optional.ofNullable(jTextField1.getText())
                    .filter(value -> !value.isEmpty())
                    .map(Double::parseDouble)
                    .ifPresent(inputValue -> {
                        String unit1 = Optional.ofNullable((String) jComboBox1.getSelectedItem()).orElse("");
                        String unit2 = Optional.ofNullable((String) jComboBox2.getSelectedItem()).orElse("");
                        String unit3 = Optional.ofNullable((String) jComboBox3.getSelectedItem()).orElse("");

                        String key = unit1 + "-" + unit2;

                        double result = Optional.ofNullable(conversionFactors.get(unit3))
                                .map(factors -> {
                                    double factor = factors.getOrDefault(key, 1.0);
                                    return isDivision.getOrDefault(key, false) ? factor / inputValue : factor * inputValue;
                                })
                                .orElse(inputValue);

                        String formula = Optional.ofNullable(conversionFormulas.get(unit3))
                                .map(formulas -> formulas.getOrDefault(key, ""))
                                .orElse("");

                        jTextField2.setText(String.valueOf(result));
                        jLabel2.setText("Formula: " + formula);
                    });
        }
    });

    jTextField2.addKeyListener(new KeyAdapter() {
        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("TextField 2: " + jTextField2.getText());
            Optional.ofNullable(jTextField2.getText())
                    .filter(value -> !value.isEmpty())
                    .map(Double::parseDouble)
                    .ifPresent(inputValue -> {
                        String unit1 = Optional.ofNullable((String) jComboBox1.getSelectedItem()).orElse("");
                        String unit2 = Optional.ofNullable((String) jComboBox2.getSelectedItem()).orElse("");
                        String unit3 = Optional.ofNullable((String) jComboBox3.getSelectedItem()).orElse("");

                        String key = unit2 + "-" + unit1;

                        double result = Optional.ofNullable(conversionFactors.get(unit3))
                                .map(factors -> {
                                    double factor = factors.getOrDefault(key, 1.0);
                                    return isDivision.getOrDefault(key, false) ? factor / inputValue : factor * inputValue;
                                })
                                .orElse(inputValue);

                        String formula = Optional.ofNullable(conversionFormulas.get(unit3))
                                .map(formulas -> formulas.getOrDefault(key, ""))
                                .orElse("");

                        jTextField1.setText(String.valueOf(result));
                        jLabel1.setText("Formula: " + formula);
                    });
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

