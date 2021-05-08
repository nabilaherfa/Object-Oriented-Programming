/*
Nama    : Nabilah Erfariani
NIM     : 13519181
Kelas   : K04
Praktikum Week 12
*/

public class AccountTest {
    public AccountTest() {
       // Tidak melakukan apa-apa
    }
  
    public void test() {
       // Melakukan tes terhadap method transfer.
       // Asumsikan method lainnya benar.
        Account a = AccountFactory.withBalance(20);
        Account b = AccountFactory.withBalance(0);
        Account c = AccountFactory.withBalance(20);
        Account d = AccountFactory.withBalance(0);

        try {
            a.transfer(b, 20);
        } catch (InvalidAmountException e) {    
            assert false;
        }
        assert a.getNumOfTransaction() == 1;
        assert b.getNumOfTransaction() == 1;
        assert a.getBalance() == 0;
        assert b.getBalance() == 20;
  
        try {
            c.transfer(d, 25);
            assert false;
        } catch (InvalidAmountException e) {
         // pass
        }
        assert c.getNumOfTransaction() == 0;
        assert d.getNumOfTransaction() == 0;
        assert c.getBalance() == 20;
        assert d.getBalance() == 0;
    }
  }