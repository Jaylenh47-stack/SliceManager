package data;

import models.Order;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class ReceiptManager {

    public static void saveReceipt(Order order){
        File file = new File("Receipts/");
        try{

            FileWriter fileWriter = new FileWriter(order.getReceiptFileName());
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);


            bufferedWriter.write(order.getReceiptText());
            bufferedWriter.close();

        }
        catch (Exception e) {
            System.out.println("There was a file error");
        }
    }


}
