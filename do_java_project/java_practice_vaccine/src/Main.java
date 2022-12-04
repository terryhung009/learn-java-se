import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String vaccine = JOptionPane.showInputDialog("請輸入疫苗名稱(選項包含AZ, BNT, Moderna, Janssen): ");
        vaccine = vaccine.toLowerCase();
        if(vaccine.equals("az")){
            JOptionPane.showMessageDialog(null, "AZ\n研發國；英國、瑞典\n疫苗類型：腸病毒疫苗\n劑量：2\n保護力：81%");
        }else if(vaccine.equals("bnt")){
            JOptionPane.showMessageDialog(null , "BNT\n研發國；德國、美國\n疫苗類型：mRNA疫苗\n劑量：2\n保護力：81%");

        }else if(vaccine.equals("moderna")){
            JOptionPane.showMessageDialog(null , "Moderna\n研發國；美國\n疫苗類型：mRNA疫苗\n劑量：2\n保護力：94%");
        }else if(vaccine.equals("janssen")){
            JOptionPane.showMessageDialog(null , "Janssen\n研發國；美國與比利時\n疫苗類型：腺病毒疫苗\n劑量：2\n保護力：66%");
        }else {
            JOptionPane.showMessageDialog(null, "無法辨識輸入內容，請重新確認輸入內容沒有中文字或空白鍵，且符合選項");
        }

    }

}
