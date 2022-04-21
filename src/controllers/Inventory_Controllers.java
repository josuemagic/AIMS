package controllers;

import models.Owner_Models;
import java.sql.ResultSet;
import java.sql.SQLException;
import models.Inventory_Models;

public class Inventory_Controllers {

    public ResultSet getInventoryBigMaterial() {
        Owner_Models GIBG = new Owner_Models();
        return GIBG.getData();
    }

    public ResultSet getInventoryLittleMaterial() {
        Owner_Models GIBG = new Owner_Models();
        return GIBG.getDataLitlelMaterials();
    }

    public void addBigMaterial(String name, String color, String inch, String caliber, String price, String width) throws SQLException {
        float caliberFloat = Float.valueOf(caliber);
        float inchFloat = Float.valueOf(inch);
        float priceFloat = Float.valueOf(price);
        float widthFloat = Float.valueOf(width);
        int id = 2;
        Inventory_Models GLI = new Inventory_Models();
        ResultSet dataTable = GLI.getLastIdBigMaterial();
        while (dataTable.next()) {
            id += Integer.valueOf(dataTable.getString("idmaterials"));
        }

        GLI.addBigMaterial(name, color, inchFloat, caliberFloat, priceFloat, widthFloat, id);

    }

    public void addLittleMaterial(String name, String inch, String amount, String price) {
        float inchFloat = Float.valueOf(inch);
        float priceFloat = Float.valueOf(price);
        int amountFloat = Integer.valueOf(amount);

        Inventory_Models AIM = new Inventory_Models();
        AIM.addLittleMaterial(name, inchFloat, amountFloat, priceFloat);
    }
}
