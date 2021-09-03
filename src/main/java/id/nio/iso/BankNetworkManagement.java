package id.nio.iso;

import id.nio.iso.LogonManager;

public class BankNetworkManagement extends LogonManager {
    public BankNetworkManagement() {
        super("bank-mux", "bank-send", 300000);
    }
}
