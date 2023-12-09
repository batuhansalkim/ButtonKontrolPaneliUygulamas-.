import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Batuhan Salkım 1210505904
// Ömer Kargalı  1220505069

public class BatuOmerOdev extends JButton {
    //degiskenler tanimlandi
    private String graphQLSchema;
    private Color activeColor;
    private Color passiveColor;
    private boolean isActive;

    public BatuOmerOdev(String text) {
        //degiskenlere atamalar yapiliyor.
        super(text);
        this.graphQLSchema = "";
        this.activeColor = Color.black;
        this.passiveColor = Color.white;
        this.isActive = false;

        setPassiveState();
        addActionListener(new ButtonClickListener());
    }

    public void setGraphQLSchema(String schema) {
        this.graphQLSchema = schema;
    }

    //aktif olduğundaki renk burada seçildi
    public void setActiveColor(Color color) {
        this.activeColor = color;
    }
    //pasif olduğundaki renk burada seçildi
    public void setPassiveColor(Color color) {
        this.passiveColor = color;
    }
    //pasif olduğunda renk ve yazı değişiyor
    private void setPassiveState() {
        setBackground(passiveColor);
        setText("Pasif");
        isActive = false;
    }
    //aktif olduğunda renk ve yazi degisiyor.
    private void setActiveState() {
        setBackground(activeColor);
        setText("Aktif");
        isActive = true;
    }

    private class ButtonClickListener implements ActionListener {
        //butona tiklama olayi yapildiginda gerceklesecekler
        @Override
        public void actionPerformed(ActionEvent e) {
            if (isActive) {
                setPassiveStateForAllButtonsExceptCurrent();
                isActive = false; // Butonu pasif hale getirr
            } else {
                setActiveState();
                isActive = true; // Butonu aktif hale getirir
                //tiklandigi zaman aktif oldugunda çalışıyor yazacak.
                System.out.println("Çalışıyor: " + graphQLSchema);
            }
        }
    }
    
    private void setPassiveStateForAllButtonsExceptCurrent() {
        for (Component component : getParent().getComponents()) {
            if (component instanceof BatuOmerOdev) {
                BatuOmerOdev button = (BatuOmerOdev) component;
                if (button != this) {
                    button.setPassiveState();
                }
            }
        }
    }

    public static void main(String[] args) {
        //kutuları oluşturduk
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Button Kontrol Paneli Uygulaması.");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new GridLayout(4, 4, 10, 10));

            BatuOmerOdev[] buttons = new BatuOmerOdev[16];
            //for döngüsü ile tiklanan kutuya link atamasi yapildi
            for (int i = 0; i < 16; i++) {
                buttons[i] = new BatuOmerOdev("Button " + (i + 1));
                frame.add(buttons[i]);
                buttons[i].setGraphQLSchema("https://api.example.com/graphql");
            }

            frame.setSize(400, 400);
            frame.setVisible(true);
        });
    }
}

