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

        try {
            //Actualizamos la medida del producto
            uptadeInch.updateData(idBigMaterials, widthBigMaterials);
        } catch (SQLException ex) {
            Logger.getLogger(panel_cotizacion.class.getName()).log(Level.SEVERE, null, ex);

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
        String[] arrayReturn = new String[4];
        // Separamos el string en un arreglo
        String[] arraySplit = bigMaterials.split("/");

        // Separamos por espacion, ( 200 $) = [ ,200, $]
        String[] arraySplitPrice = arraySplit[2].split("\\s+");

        float price = (Float.parseFloat(arraySplitPrice[1]) * medida);

        arrayReturn[0] = arraySplit[3];
        arrayReturn[1] = arraySplit[0];
        arrayReturn[2] = Float.toString(medida);
        arrayReturn[3] = Float.toString(price);

        return arrayReturn;
    }

    public String[] buildLittleStructureTicket(String littleMaterial, String amount) {
        String element = "";
        float price = 0;
        String[] arrayReturn = new String[5];

        String[] arraySplit = littleMaterial.split("\\s+");

        price = (Float.valueOf(arraySplit[6]) * Float.valueOf(amount));

        element = arraySplit[1] + " Precio: " + price + "Cantidad: " + amount + "\n\n";
        arrayReturn[0] = arraySplit[0];
        arrayReturn[1] = arraySplit[1];
        arrayReturn[2] = arraySplit[2];
        arrayReturn[3] = Float.toString(price);
        arrayReturn[4] = amount;

        return arrayReturn;

    }

}
