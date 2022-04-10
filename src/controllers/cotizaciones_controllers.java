package controllers;

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

    public String buildBigStructureTicket(String bigMaterials, float medida) {
        String element = "";

        // Separamos el string en un arreglo
        String[] arraySplit = bigMaterials.split("/");

        // Separamos por espacion, ( 200 $) = [ ,200, $]
        String[] arraySplitPrice = arraySplit[2].split("\\s+");
        float price = (Float.parseFloat(arraySplitPrice[1]) * medida);

        element += arraySplit[0] + "| " + medida + "M | " + price + "$" + "\n";
        System.out.println(element);
        return element;
    }
}
