import java.util.ArrayList;

public class BankDriver {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        MinimumBalanceAccount mba = new MinimumBalanceAccount();
        SavingsAccount sa = new SavingsAccount();
        ba.deposit(1000);
        mba.deposit(1000);
        sa.deposit(1000);

        ArrayList<BankAccount> accounts = new ArrayList<>();

        accounts.add(ba);
        accounts.add(mba);
        accounts.add(sa);

        for (BankAccount account : accounts) {
            account.deposit(1000);
            // instanceof: 클래스의 인스턴트인지 확인해준다.
            if(account instanceof SavingsAccount) {
                ((SavingsAccount) account).addInterest();
            }
        }

        /**
        캐스팅(자식 -> 부모 : 업캐스팅)
        부모클래스로 선언된 인스턴스에서는 부모클래스에만 있는 메소드 사용 가능
        BankAccount sa2 = new SavingsAccount();
        BankAccount sa3 = sa;

        sa.addInterest();
        sa3.addInertest(); 불가능하기 떄문에 아래와 같이 작성
        캐스팅(부모 -> 자식 : 다운캐스팅)
        ((SavingsAccount) sa3).addInterest();
         */
    }
}
