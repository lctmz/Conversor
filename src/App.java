
import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        Object[] options = { "Convertir Divisas", "Convertir Temperaturas", "Salir" };
        int elige = JOptionPane.showOptionDialog(null, "Que quieres hacer?", "Conversor", JOptionPane.DEFAULT_OPTION,
                JOptionPane.PLAIN_MESSAGE, null,
                options, options[0]);

        if (elige == 2) {
            JOptionPane.showMessageDialog(null, "Programa cerrado");
            System.exit(0);
        }
        if (elige == 0) {
            DecimalFormat formatearDivisa = new DecimalFormat("#.##");
            boolean continuarPrograma = true;
            while (continuarPrograma) {
                String[] opciones = { "Pesos Mexicanos a Euros", "Pesos Mexicanos a Dolares",
                        "Pesos Mexicanos a Libras Esterlinas", "Pesos Mexicanos a Yen", "Pesos Mexicanos a Won", };
                String cambio = (String) JOptionPane.showInputDialog(null, "Elige una opcion", "Conversor de Moneda",
                        JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                String input = JOptionPane.showInputDialog(null, "Ingrese Cantidad de Pesos:");
                double pesos = 0.00;
                try {
                    pesos = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Valor no valido");
                }
                if (cambio.equals("Pesos Mexicanos a Euros")) {
                    double euros = pesos * 0.054;
                    JOptionPane.showMessageDialog(null,
                            pesos + "Pesos mexicanos son: " + formatearDivisa.format(euros) + "Euros.");
                } else if (cambio.equals("Pesos Mexicanos a Dolares")) {
                    double dolares = pesos * 0.058;
                    JOptionPane.showMessageDialog(null,
                            pesos + "Pesos mexicanos son: " + formatearDivisa.format(dolares) + "Dolares.");
                } else if (cambio.equals("Pesos Mexicanos a Libras Esterlinas")) {
                    double libras = pesos * 0.046;
                    JOptionPane.showMessageDialog(null,
                            pesos + "Pesos mexicanos son: " + formatearDivisa.format(libras) + "Libras Esterlinas.");
                } else if (cambio.equals("Pesos Mexicanos a Yen")) {
                    double yen = pesos * 8.03;
                    JOptionPane.showMessageDialog(null,
                            pesos + "Pesos mexicanos son: " + formatearDivisa.format(yen) + "Yenes.");
                } else if (cambio.equals("Pesos Mexicanos a Won")) {
                    double won = pesos * 74.76;
                    JOptionPane.showMessageDialog(null,
                            pesos + "Pesos mexicanos son: " + formatearDivisa.format(won) + "Wones.");
                }
                int confirma = JOptionPane.showConfirmDialog(null, "Desea continuar usando el programa?", "Confirmar", JOptionPane.YES_NO_CANCEL_OPTION);
                if(confirma == JOptionPane.NO_OPTION || confirma == JOptionPane.CANCEL_OPTION) {
                    continuarPrograma = false;
                    JOptionPane.showMessageDialog(null, "Programa Finalizado");

                }
            }

        }
    if (elige ==1){
        boolean seguirPrograma = true;
        while(seguirPrograma){
            String[] opciones = {"Celsius a Fahrenheit", "Fahrenheit a Celsius"};
            int opcion = JOptionPane.showOptionDialog(null, "Elige una opcion", "Conversor de Temperatura", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

            String valorNominal = JOptionPane.showInputDialog(null, "Ingrese valor a convertir");
            double valor = 0.0 ;
            try{
                valor = Double.parseDouble(valorNominal);
            } catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Valor no valido");
                System.exit(0);
            }

            double resultado = 0;
            if(opcion == 0) {
                resultado = ( valor * 9/5)+32;
                JOptionPane.showMessageDialog(null, valor + " Grados Celsius son: " + resultado + " Grados Fahreinheit");
            } else if(opcion == 1) {
                resultado = ( valor - 32)* 5/9;
                JOptionPane.showMessageDialog(null, valor + " Grados Fahrenheit son: " + resultado + " Grados Celsius");
            }
            int continuar = JOptionPane.showConfirmDialog(null, "Desea seguir usando el programa?", "", JOptionPane.YES_NO_OPTION);
            if (continuar == JOptionPane.NO_OPTION) {
                seguirPrograma = false;
                JOptionPane.showMessageDialog(null, "Programa Finalizado");
            }

        }
    }

    }
}
