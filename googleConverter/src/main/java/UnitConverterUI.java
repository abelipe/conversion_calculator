
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
        if (jTextField1.getText().isEmpty()) {
            jTextField2.setText("");
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
        if (jTextField2.getText().isEmpty()) {
            jTextField1.setText("");
        }
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

    @Override
    public void handleSelection(ItemEvent e) {
        System.out.println("Handle selection called");
        if (e.getStateChange() == ItemEvent.SELECTED) {
            Object selectedItem = comboBox.getSelectedItem();

            if (selectedItem.equals(comboBox2.getSelectedItem())) {
                // Store the previously selected items in temporary variables
                Object temp1 = comboBox.getSelectedItem();
                Object temp2 = comboBox2.getSelectedItem();
                System.out.println("Temp1: " + temp1);
                System.out.println("Temp2: " + temp2);

                // Swap the selected items
                comboBox.setSelectedItem(temp2);
                comboBox2.setSelectedItem(temp1);
            }
        }
    }
}

public class ComboBox2Handler extends ComboBoxHandler {
    private JComboBox comboBox1;

    public ComboBox2Handler(JComboBox comboBox, JComboBox comboBox1) {
        super(comboBox);
        this.comboBox1 = comboBox1;
    }

    @Override
    public void handleSelection(ItemEvent e) {
        System.out.println("Handle selection called");
        if (e.getStateChange() == ItemEvent.SELECTED) {
            Object selectedItem = comboBox.getSelectedItem();

            if (selectedItem.equals(comboBox1.getSelectedItem())) {
                // Store the previously selected items in temporary variables
                Object temp1 = comboBox.getSelectedItem();
                Object temp2 = comboBox1.getSelectedItem();
                System.out.println("Temp1: " + temp1);
                System.out.println("Temp2: " + temp2);

                // Swap the selected items
                comboBox.setSelectedItem(temp2);
                comboBox1.setSelectedItem(temp1);
            }
        }
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

        if (selectedItem.equals("Consumo de combustible")) {
            comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {"Milla por galon americano", "Millas por galon (imperial)", "Kilometro por litro", "Litro por 100 kilometros"}));
            comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {"Milla por galon americano", "Millas por galon (imperial)", "Kilometro por litro", "Litro por 100 kilometros"}));
            jTextField1.setText("");
            jTextField2.setText("");
        } else if (selectedItem.equals("Frecuencia")) {
            comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {"Hercio", "Kilohercio", "Megahercio", "Gigahercio"}));
            comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {"Hercio", "Kilohercio", "Megahercio", "Gigahercio"}));
            jTextField1.setText("");
            jTextField2.setText("");
        }
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

            if (unit1.equals("Milla por galon americano")) {
                if (unit2.equals("Millas por galon (imperial)")) {
                    double result = inputValue * 1.201;
                    jLabel2.setText("Fórmula: Multiplicar el valor de consumo de combustible por 1.201" );
                    jTextField2.setText(String.valueOf(result));
                } else if (unit2.equals("Kilometro por litro")) {
                    double result = inputValue * 0.425144;
                    jLabel2.setText("Fórmula: divide el valor de consumo de combustible entre 2.352" );
                    jTextField2.setText(String.valueOf(result));
                } else if (unit2.equals("Litro por 100 kilometros")) {
                    double result = 235.215 / inputValue;
                    jTextField2.setText(String.valueOf(result));
                    jLabel2.setText("Fórmula: 235.215/(1 US mpg) = 235.215 L/100 km" );         
                }
            } else if (unit1.equals("Millas por galon (imperial)")) {
                if (unit2.equals("Milla por galon americano")) {
                    double result = inputValue / 1.201;
                    jLabel2.setText("Fórmula: divide el valor de consumo de combustible entre 1.201" );
                    jTextField2.setText(String.valueOf(result));
                } else if (unit2.equals("Kilometro por litro")) {
                    double result = inputValue / 2.825;
                    jLabel2.setText("Fórmula: para obtener un resultado aproximado, divide el valor de consumo de combustible entre 2.825" );
                    jTextField2.setText(String.valueOf(result));
                } else if (unit2.equals("Litro por 100 kilometros")) {
                    double result = 282.481 / inputValue;
                    jLabel2.setText("Fórmula: 282.481/(1 I mpg) = 282.481 L/100 km" );
                    jTextField2.setText(String.valueOf(result));
                }
            } else if (unit1.equals("Kilometro por litro")) {
                if (unit2.equals("Milla por galon americano")) {
                    double result = inputValue / 0.425144;
                    jLabel2.setText("Fórmula: para obtener un resultado aproximado, multiplica el valor de consumo de combustible por 2.352" );
                    jTextField2.setText(String.valueOf(result));
                } else if (unit2.equals("Millas por galon (imperial)")) {
                    double result = inputValue * 2.825;
                    jLabel2.setText("Fórmula: para obtener un resultado aproximado, multiplica el valor de consumo de combustible por 2.825" );
                    jTextField2.setText(String.valueOf(result));
                } else if (unit2.equals("Litro por 100 kilometros")) {
                    double result = 100 / inputValue;
                    jLabel2.setText("Fórmula: 100/(1 km/L) = 100 L/100 km" );
                    jTextField2.setText(String.valueOf(result));
                }
            } else if (unit1.equals("Litro por 100 kilometros")) {
                if (unit2.equals("Milla por galon americano")) {
                    double result = 235.215 / inputValue;
                    jLabel2.setText("Fórmula: 235.215/(L/100 km) = US mpg" );
                    jTextField2.setText(String.valueOf(result));
                } else if (unit2.equals("Millas por galon (imperial)")) {
                    double result = 282.481 / inputValue;
                    jLabel2.setText("Fórmula: 282.481/(1 L/100 km) = 282.481 I mpg" );
                    jTextField2.setText(String.valueOf(result));
                } else if (unit2.equals("Kilometro por litro")) {
                    double result = 100 / inputValue;
                    jLabel2.setText("Fórmula: 100/(1 L/100 km) = 100 km/L" );
                    jTextField2.setText(String.valueOf(result));
                }
            }
             if (unit1.equals("Hercio")) {
                if (unit2.equals("Kilohercio")) {
                    double result = inputValue / 1000;
                    jLabel2.setText("Fórmula: divide el valor de frecuencia entre 1000" );
                    jTextField2.setText(String.valueOf(result));
                } else if (unit2.equals("Megahercio")) {
                    double result = inputValue / 1000000;
                    jLabel2.setText("Fórmula: divide el valor de frecuencia entre 1e+6" );
                    jTextField2.setText(String.valueOf(result));
                } else if (unit2.equals("Gigahercio")) {
                    double result = inputValue / 1000000000;
                    jLabel2.setText("Fórmula: divide el valor de frecuencia entre 1e+9" );
                    jTextField2.setText(String.valueOf(result));
                }
            } else if (unit1.equals("Kilohercio")) {
                if (unit2.equals("Hercio")) {
                    double result = inputValue * 1000;
                    jLabel2.setText("Fórmula: Multiplicar el valor de frecuencia por 1000" );
                    jTextField2.setText(String.valueOf(result));
                } else if (unit2.equals("Megahercio")) {
                    double result = inputValue / 1000;
                    jLabel2.setText("Fórmula: divide el valor de frecuencia entre 1000" );
                    jTextField2.setText(String.valueOf(result));
                } else if (unit2.equals("Gigahercio")) {
                    double result = inputValue / 1000000;
                    jLabel2.setText("Fórmula: divide el valor de frecuencia entre 1e+6" );
                    jTextField2.setText(String.valueOf(result));
                }
            } else if (unit1.equals("Megahercio")) {
                if (unit2.equals("Hercio")) {
                    double result = inputValue * 1000000;
                    jLabel2.setText("Fórmula: Multiplicar el valor de frecuencia por 1e+6" );
                    jTextField2.setText(String.valueOf(result));
                } else if (unit2.equals("Kilohercio")) {
                    double result = inputValue * 1000;
                    jLabel2.setText("Fórmula: Multiplicar el valor de frecuencia por 1000" );
                    jTextField2.setText(String.valueOf(result));
                } else if (unit2.equals("Gigahercio")) {
                    double result = inputValue / 1000;
                    jLabel2.setText("Fórmula: divide el valor de frecuencia entre 1000" );
                    jTextField2.setText(String.valueOf(result));
                }
            } else if (unit1.equals("Gigahercio")) {
                if (unit2.equals("Hercio")) {
                    double result = inputValue * 1000000000;
                    jLabel2.setText("Fórmula: Multiplicar el valor de frecuencia por 1e+9" );
                    jTextField2.setText(String.valueOf(result));
                } else if (unit2.equals("Kilohercio")) {
                    double result = inputValue * 1000000;
                    jLabel2.setText("Fórmula: Multiplicar el valor de frecuencia por 1e+6" );
                    jTextField2.setText(String.valueOf(result));
                } else if (unit2.equals("Megahercio")) {
                    double result = inputValue * 1000;
                    jLabel2.setText("Fórmula: Multiplicar el valor de frecuencia por 1000" );
                    jTextField2.setText(String.valueOf(result));
                }
            }
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

            if (unit2.equals("Milla por galon americano")) {
                if (unit1.equals("Millas por galon (imperial)")) {
                    double result = inputValue / 1.201;
                    jLabel2.setText("Fórmula: divide el valor de consumo de combustible entre 1.201" );
                    jTextField1.setText(String.valueOf(result));
                } else if (unit1.equals("Kilometro por litro")) {
                    double result = inputValue / 2.352;
                    jLabel2.setText("Fórmula: Multiplicar el valor de consumo de combustible por 2.352" );
                    jTextField1.setText(String.valueOf(result));
                } else if (unit1.equals("Litro por 100 kilometros")) {
                    double result = 235.215 / inputValue;
                    jLabel2.setText("Fórmula: 235.215/(L/100 km) = US mpg" );
                    jTextField1.setText(String.valueOf(result));
                }
            } else if (unit2.equals("Millas por galon (imperial)")) {
                if (unit1.equals("Milla por galon americano")) {
                    double result = inputValue * 0.83267;
                    jLabel2.setText("Fórmula: Multiplicar el valor de consumo de combustible por 1.201" );
                    jTextField1.setText(String.valueOf(result));
                } else if (unit1.equals("Kilometro por litro")) {
                    double result = inputValue / 2.825;
                    jLabel2.setText("Fórmula: para obtener un resultado aproximado, multiplica el valor de consumo de combustible por 2.825" );
                    jTextField1.setText(String.valueOf(result));
                } else if (unit1.equals("Litro por 100 kilometros")) {
                    double result = 282.481 / inputValue;
                    jLabel2.setText("Fórmula: 282.481/(L/100 km) = I mpg" );
                    jTextField1.setText(String.valueOf(result));
                }
            } else if (unit2.equals("Kilometro por litro")) {
                if (unit1.equals("Milla por galon americano")) {
                    double result = inputValue / 0.425144;
                    jLabel2.setText("Fórmula: divide el valor de consumo de combustible entre 2.352" );
                    jTextField1.setText(String.valueOf(result));
                } else if (unit1.equals("Millas por galon (imperial)")) {
                    double result = inputValue * 2.825;
                    jLabel2.setText("Fórmula: para obtener un resultado aproximado, divide el valor de consumo de combustible entre 2.825" );
                    jTextField1.setText(String.valueOf(result));
                } else if (unit1.equals("Litro por 100 kilometros")) {
                    double result = 100 / inputValue;
                    jLabel2.setText("Fórmula: 100/(L/100 km) = km/L" );
                    jTextField1.setText(String.valueOf(result));
                }
            } else if (unit2.equals("Litro por 100 kilometros")) {
                if (unit1.equals("Milla por galon americano")) {
                    double result = 235.215 / inputValue;
                    jLabel2.setText("Fórmula: 235.215/(US mpg) = L/100 km" );
                    jTextField1.setText(String.valueOf(result));
                } else if (unit1.equals("Millas por galon (imperial)")) {
                    double result = 282.481 / inputValue;
                    jLabel2.setText("Fórmula: 282.481/(I mpg) = L/100 km" );
                    jTextField1.setText(String.valueOf(result));
                } else if (unit1.equals("Kilometro por litro")) {
                    double result = 100 / inputValue;
                    jLabel2.setText("Fórmula: 100/(km/L) = L/100 km" );
                    jTextField1.setText(String.valueOf(result));
                }
            }
            if (unit2.equals("Hercio")) {
                if (unit1.equals("Kilohercio")) {
                    double result = inputValue / 1000;
                    jLabel2.setText("Fórmula: Multiplicar el valor de frecuencia por 1000" );
                    jTextField1.setText(String.valueOf(result));
                } else if (unit1.equals("Megahercio")) {
                    double result = inputValue / 1000000;
                    jLabel2.setText("Fórmula: Multiplicar el valor de frecuencia por 1e+6" );
                    jTextField1.setText(String.valueOf(result));
                } else if (unit1.equals("Gigahercio")) {
                    double result = inputValue / 1000000000;
                    jLabel2.setText("Fórmula: Multiplicar el valor de frecuencia por 1e+9" );
                    jTextField1.setText(String.valueOf(result));
                }
            } else if (unit2.equals("Kilohercio")) {
                if (unit1.equals("Hercio")) {
                    double result = inputValue * 1000;
                    jLabel2.setText("Fórmula: divide el valor de frecuencia entre 1000" );
                    jTextField1.setText(String.valueOf(result));
                } else if (unit1.equals("Megahercio")) {
                    double result = inputValue / 1000;
                    jLabel2.setText("Fórmula: Multiplicar el valor de frecuencia por 1000" );
                    jTextField1.setText(String.valueOf(result));
                } else if (unit1.equals("Gigahercio")) {
                    double result = inputValue / 1000000;
                    jLabel2.setText("Multiplicar el valor de frecuencia por 1e+6" );
                    jTextField1.setText(String.valueOf(result));
                }
            } else if (unit2.equals("Megahercio")) {
                if (unit1.equals("Hercio")) {
                    double result = inputValue * 1000000;
                    jLabel2.setText("Fórmula: divide el valor de frecuencia entre 1e+6" );
                    jTextField1.setText(String.valueOf(result));
                } else if (unit1.equals("Kilohercio")) {
                    double result = inputValue * 1000;
                    jLabel2.setText("Fórmula: divide el valor de frecuencia entre 1000" );
                    jTextField1.setText(String.valueOf(result));
                } else if (unit1.equals("Gigahercio")) {
                    double result = inputValue / 1000;
                    jLabel2.setText("Fórmula: Multiplicar el valor de frecuencia por 1000" );
                    jTextField1.setText(String.valueOf(result));
                }
            } else if (unit2.equals("Gigahercio")) {
                if (unit1.equals("Hercio")) {
                    double result = inputValue * 1000000000;
                    jLabel2.setText("Fórmula: divide el valor de frecuencia entre 1e+9" );
                    jTextField1.setText(String.valueOf(result));
                } else if (unit1.equals("Kilohercio")) {
                    double result = inputValue * 1000000;
                    jLabel2.setText("Fórmula: divide el valor de frecuencia entre 1e+6" );
                    jTextField1.setText(String.valueOf(result));
                } else if (unit1.equals("Megahercio")) {
                    double result = inputValue * 1000;
                    jLabel2.setText("Fórmula: divide el valor de frecuencia entre 1000" );
                    jTextField1.setText(String.valueOf(result));
                }
            }
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

