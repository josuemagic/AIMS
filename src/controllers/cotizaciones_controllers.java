package controllers;

import static java.lang.String.valueOf;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import models.Owner_Models;
import views.panels.panel_cotizacion;

public class cotizaciones_controllers {

    public void updateBigMaterial(String listMaterials, float medida) {
        Owner_Models uptadeInch = new Owner_Models();
        // Separamos el string en un arreglo
        String[] arraySplit = listMaterials.split("/");

        String TextWidt = arraySplit[1];
        String[] arrayWidth = TextWidt.split("M");

        Float widthBigMaterials = (Float.parseFloat(arrayWidth[0]) - medida);
        int idBigMaterials = Integer.parseInt(arraySplit[arraySplit.length - 1]);

        if (widthBigMaterials < medida) {
            JOptionPane.showMessageDialog(null, "La medida que se usara en mayor a la pieza seleccionada \n "
                    + "Por favor seleccione una pieza mas grande");
        } else {
            try {
                //Actualizamos la medida del producto
                uptadeInch.updateData(idBigMaterials, widthBigMaterials);
            } catch (SQLException ex) {
                Logger.getLogger(panel_cotizacion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void updateLittleMaterials(String listLittleMaterials, String amount) throws SQLException {
        String[] arraySplit = listLittleMaterials.split("\\s+");

        int updateDataAmount = (Integer.parseInt(arraySplit[4])) - Integer.parseInt(amount);
        int idLittleMaterials = Integer.parseInt(arraySplit[0]);

        if (Integer.parseInt(arraySplit[4]) < Integer.parseInt(amount)) {
            JOptionPane.showMessageDialog(null, "La cantidad que necesita es mayor a las disponible"
                    + "Por favor eliga otra opcion o ponga una cantidad menor");
        } else {
            Owner_Models owner_models = new Owner_Models();
            owner_models.updateDataLittleMaterials(idLittleMaterials, updateDataAmount);
        }
    }

    public String[] buildBigStructureTicket(String bigMaterials, float medida) {
        String element = "";
        String[] arrayReturn = new String[2];
        // Separamos el string en un arreglo
        String[] arraySplit = bigMaterials.split("/");

        // Separamos por espacion, ( 200 $) = [ ,200, $]
        String[] arraySplitPrice = arraySplit[2].split("\\s+");

        float price = (Float.parseFloat(arraySplitPrice[1]) * medida);
        String priceString = valueOf(price);

        element += arraySplit[0] + "| " + medida + "M | " + price + "$" + "\n\n";
        arrayReturn[0] = element;
        arrayReturn[1] = priceString;

        return arrayReturn;
    }

    public String[] buildLittleStructureTicket(String littleMaterial, String amount) {
        String element = "";
        float price = 0;
        String priceString = "";
        String[] arrayReturn = new String[2];

        String[] arraySplit = littleMaterial.split("\\s+");

        price = (Float.valueOf(arraySplit[6]) * Float.valueOf(amount));
        priceString = String.valueOf(price);;

        for (int i = 0; i < arraySplit.length; i++) {
            System.out.println(arraySplit[i]);
        }

        element = arraySplit[1] + " Precio: " + price + "Cantidad: " + amount + "\n\n";
        arrayReturn[0] = element;
        arrayReturn[1] = priceString;

        return arrayReturn;

    }

}
