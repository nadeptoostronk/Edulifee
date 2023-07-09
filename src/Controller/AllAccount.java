package Controller;

import java.util.ArrayList;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamImplicit;

@XStreamAlias("AccountInfo")
public class AllAccount {
    
    @XStreamImplicit
    private ArrayList<Account> allEdulifeAccounts = new ArrayList<>();

    public ArrayList<Account> getEdulifeAccounts() {
        return allEdulifeAccounts;
    }

    public void setRefoodAccounts(ArrayList<Account> allEdulifeAccounts) {
        this.allEdulifeAccounts = allEdulifeAccounts;
    }
}