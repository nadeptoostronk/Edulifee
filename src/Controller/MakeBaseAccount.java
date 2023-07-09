package Controller;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;

public class MakeBaseAccount {
    public static void main(String[] args) {
        XStream xstream = new XStream(new StaxDriver());
        
        
        xstream.processAnnotations(Account.class);
        xstream.processAnnotations(AllAccount.class);

        AllAccount dataAll = new AllAccount();

        Account test1 = new Account();


        test1.setEmail("syahidabd02@gmail.com");
        test1.setPassword("syahid");
        test1.setUsername("syahid");

        dataAll.getEdulifeAccounts().add(test1);
        


    
    
        String xml = xstream.toXML(dataAll);
        FileOutputStream myFile = null;
        try {
            myFile = new FileOutputStream("src/Controller/account.xml");
            byte[] bytes = xml.getBytes("UTF-8");
            myFile.write(bytes);
        } catch (Exception e) {
            System.err.println("Perhatian: " + e.getMessage());
        } finally {
            if (myFile != null) {
                try {
                    myFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}