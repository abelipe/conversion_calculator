
import java.awt.event.ItemEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;


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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Milla por galon americano", "Millas por galon (imperial)", "Kilometro por litro", "Litro por 100 kilometros" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Milla por galon americano", "Millas por galon (imperial)", "Kilometro por litro", "Litro por 100 kilometros" }));
        jComboBox2.setSelectedIndex(1);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consumo de combustible", "Frecuencia" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

  
    public static void main(String args[]) {
    java.awt.EventQueue.invokeLater(() -> {
        UnitConverterUI ui = new UnitConverterUI();
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    });
}
    
    private void addEventListeners() {
    jComboBox1.addActionListener(e -> {
        Object selectedItem = jComboBox1.getSelectedItem();
        System.out.println("ComboBox 1: " + selectedItem);

        // Check if the selected item is the same as the one in jComboBox2
        if (selectedItem.equals(jComboBox2.getSelectedItem())) {
            // Swap the selected items
            Object temp = jComboBox1.getSelectedItem();
            jComboBox1.setSelectedItem(jComboBox2.getSelectedItem());
            jComboBox2.setSelectedItem(temp);
        }
    });

    jComboBox2.addActionListener(e -> {
        Object selectedItem = jComboBox2.getSelectedItem();
        System.out.println("ComboBox 2: " + selectedItem);

        // Check if the selected item is the same as the one in jComboBox1
        if (selectedItem.equals(jComboBox1.getSelectedItem())) {
            // Swap the selected items
            Object temp = jComboBox2.getSelectedItem();
            jComboBox2.setSelectedItem(jComboBox1.getSelectedItem());
            jComboBox1.setSelectedItem(temp);
        }
    });

   jComboBox3.addItemListener(e -> {
    if (e.getStateChange() == ItemEvent.SELECTED) {
        Object selectedItem = jComboBox3.getSelectedItem();
        System.out.println("ComboBox 3: " + selectedItem);

        if (selectedItem.equals("Consumo de combustible")) {
            jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] {"Milla por galon americano", "Millas por galon (imperial)", "Kilometro por litro", "Litro por 100 kilometros"}));
            jComboBox2.setModel(new DefaultComboBoxModel<>(new String[] {"Milla por galon americano", "Millas por galon (imperial)", "Kilometro por litro", "Litro por 100 kilometros"}));
            jTextField1.setText("");
            jTextField2.setText("");
        } else if (selectedItem.equals("Frecuencia")) {
            jComboBox1.setModel(new DefaultComboBoxModel<>(new String[] {"Hercio", "Kilohercio", "Megahercio", "Gigahercio"}));
            jComboBox2.setModel(new DefaultComboBoxModel<>(new String[] {"Hercio", "Kilohercio", "Megahercio", "Gigahercio"}));
            jTextField1.setText("");
            jTextField2.setText("");
        }
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
                    double result = inputValue * 0.83267;
                    jTextField2.setText(String.valueOf(result));
                } else if (unit2.equals("Kilometro por litro")) {
                    double result = inputValue * 0.425144;
                    jTextField2.setText(String.valueOf(result));
                } else if (unit2.equals("Litro por 100 kilometros")) {
                    double result = 235.215 / inputValue;
                    jTextField2.setText(String.valueOf(result));
                }
            } else if (unit1.equals("Millas por galon (imperial)")) {
                if (unit2.equals("Milla por galon americano")) {
                    double result = inputValue / 0.83267;
                    jTextField2.setText(String.valueOf(result));
                } else if (unit2.equals("Kilometro por litro")) {
                    double result = inputValue * 0.506192;
                    jTextField2.setText(String.valueOf(result));
                } else if (unit2.equals("Litro por 100 kilometros")) {
                    double result = 282.481 / inputValue;
                    jTextField2.setText(String.valueOf(result));
                }
            } else if (unit1.equals("Kilometro por litro")) {
                if (unit2.equals("Milla por galon americano")) {
                    double result = inputValue / 0.425144;
                    jTextField2.setText(String.valueOf(result));
                } else if (unit2.equals("Millas por galon (imperial)")) {
                    double result = inputValue / 0.506192;
                    jTextField2.setText(String.valueOf(result));
                } else if (unit2.equals("Litro por 100 kilometros")) {
                    double result = 100 / inputValue;
                    jTextField2.setText(String.valueOf(result));
                }
            } else if (unit1.equals("Litro por 100 kilometros")) {
                if (unit2.equals("Milla por galon americano")) {
                    double result = 235.215 / inputValue;
                    jTextField2.setText(String.valueOf(result));
                } else if (unit2.equals("Millas por galon (imperial)")) {
                    double result = 282.481 / inputValue;
                    jTextField2.setText(String.valueOf(result));
                } else if (unit2.equals("Kilometro por litro")) {
                    double result = 100 / inputValue;
                    jTextField2.setText(String.valueOf(result));
                }
            }
             if (unit1.equals("Hercio")) {
                if (unit2.equals("Kilohercio")) {
                    double result = inputValue / 1000;
                    jTextField2.setText(String.valueOf(result));
                } else if (unit2.equals("Megahercio")) {
                    double result = inputValue / 1000000;
                    jTextField2.setText(String.valueOf(result));
                } else if (unit2.equals("Gigahercio")) {
                    double result = inputValue / 1000000000;
                    jTextField2.setText(String.valueOf(result));
                }
            } else if (unit1.equals("Kilohercio")) {
                if (unit2.equals("Hercio")) {
                    double result = inputValue * 1000;
                    jTextField2.setText(String.valueOf(result));
                } else if (unit2.equals("Megahercio")) {
                    double result = inputValue / 1000;
                    jTextField2.setText(String.valueOf(result));
                } else if (unit2.equals("Gigahercio")) {
                    double result = inputValue / 1000000;
                    jTextField2.setText(String.valueOf(result));
                }
            } else if (unit1.equals("Megahercio")) {
                if (unit2.equals("Hercio")) {
                    double result = inputValue * 1000000;
                    jTextField2.setText(String.valueOf(result));
                } else if (unit2.equals("Kilohercio")) {
                    double result = inputValue * 1000;
                    jTextField2.setText(String.valueOf(result));
                } else if (unit2.equals("Gigahercio")) {
                    double result = inputValue / 1000;
                    jTextField2.setText(String.valueOf(result));
                }
            } else if (unit1.equals("Gigahercio")) {
                if (unit2.equals("Hercio")) {
                    double result = inputValue * 1000000000;
                    jTextField2.setText(String.valueOf(result));
                } else if (unit2.equals("Kilohercio")) {
                    double result = inputValue * 1000000;
                    jTextField2.setText(String.valueOf(result));
                } else if (unit2.equals("Megahercio")) {
                    double result = inputValue * 1000;
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
                    double result = inputValue / 0.83267;
                    jTextField1.setText(String.valueOf(result));
                } else if (unit1.equals("Kilometro por litro")) {
                    double result = inputValue / 0.425144;
                    jTextField1.setText(String.valueOf(result));
                } else if (unit1.equals("Litro por 100 kilometros")) {
                    double result = 235.215 / inputValue;
                    jTextField1.setText(String.valueOf(result));
                }
            } else if (unit2.equals("Millas por galon (imperial)")) {
                if (unit1.equals("Milla por galon americano")) {
                    double result = inputValue * 0.83267;
                    jTextField1.setText(String.valueOf(result));
                } else if (unit1.equals("Kilometro por litro")) {
                    double result = inputValue / 0.506192;
                    jTextField1.setText(String.valueOf(result));
                } else if (unit1.equals("Litro por 100 kilometros")) {
                    double result = 282.481 / inputValue;
                    jTextField1.setText(String.valueOf(result));
                }
            } else if (unit2.equals("Kilometro por litro")) {
                if (unit1.equals("Milla por galon americano")) {
                    double result = inputValue / 0.425144;
                    jTextField1.setText(String.valueOf(result));
                } else if (unit1.equals("Millas por galon (imperial)")) {
                    double result = inputValue / 0.506192;
                    jTextField1.setText(String.valueOf(result));
                } else if (unit1.equals("Litro por 100 kilometros")) {
                    double result = 100 / inputValue;
                    jTextField1.setText(String.valueOf(result));
                }
            } else if (unit2.equals("Litro por 100 kilometros")) {
                if (unit1.equals("Milla por galon americano")) {
                    double result = 235.215 / inputValue;
                    jTextField1.setText(String.valueOf(result));
                } else if (unit1.equals("Millas por galon (imperial)")) {
                    double result = 282.481 / inputValue;
                    jTextField1.setText(String.valueOf(result));
                } else if (unit1.equals("Kilometro por litro")) {
                    double result = 100 / inputValue;
                    jTextField1.setText(String.valueOf(result));
                }
            }
            if (unit2.equals("Hercio")) {
                if (unit1.equals("Kilohercio")) {
                    double result = inputValue * 1000;
                    jTextField1.setText(String.valueOf(result));
                } else if (unit1.equals("Megahercio")) {
                    double result = inputValue * 1000000;
                    jTextField1.setText(String.valueOf(result));
                } else if (unit1.equals("Gigahercio")) {
                    double result = inputValue * 1000000000;
                    jTextField1.setText(String.valueOf(result));
                }
            } else if (unit2.equals("Kilohercio")) {
                if (unit1.equals("Hercio")) {
                    double result = inputValue / 1000;
                    jTextField1.setText(String.valueOf(result));
                } else if (unit1.equals("Megahercio")) {
                    double result = inputValue * 1000;
                    jTextField1.setText(String.valueOf(result));
                } else if (unit1.equals("Gigahercio")) {
                    double result = inputValue * 1000000;
                    jTextField1.setText(String.valueOf(result));
                }
            } else if (unit2.equals("Megahercio")) {
                if (unit1.equals("Hercio")) {
                    double result = inputValue / 1000000;
                    jTextField1.setText(String.valueOf(result));
                } else if (unit1.equals("Kilohercio")) {
                    double result = inputValue / 1000;
                    jTextField1.setText(String.valueOf(result));
                } else if (unit1.equals("Gigahercio")) {
                    double result = inputValue * 1000;
                    jTextField1.setText(String.valueOf(result));
                }
            } else if (unit2.equals("Gigahercio")) {
                if (unit1.equals("Hercio")) {
                    double result = inputValue / 1000000000;
                    jTextField1.setText(String.valueOf(result));
                } else if (unit1.equals("Kilohercio")) {
                    double result = inputValue / 1000000;
                    jTextField1.setText(String.valueOf(result));
                } else if (unit1.equals("Megahercio")) {
                    double result = inputValue / 1000;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}

