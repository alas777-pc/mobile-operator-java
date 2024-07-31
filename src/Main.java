//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int mobileaccount = 100;
        int deposit = 1100;
        int percent;
        if (deposit >= 1000) {
            percent = 1;
        } else {
            percent = 0;
        }
        int bonus = deposit / 100 * percent;
        System.out.println(mobileaccount + deposit + bonus);
    }
}