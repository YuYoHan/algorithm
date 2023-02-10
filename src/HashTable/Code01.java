package HashTable;

import java.util.Hashtable;
import java.util.Scanner;

public class Code01 {
    public static void main(String[] args) {
        String[] userId = {"ke", "me", "jo", "ha"};
        String[] password = {"l11", "l23", "d3213", "k2323"};

        Hashtable<String, String> ht = new Hashtable<>(userId.length);

        for (int i = 0; i < userId.length; i++) {
            ht.put(userId[i], password[i]);
        }
        System.out.println(ht); // {ke=l11, me=l23, jo=d3213, ha=k2323}

        boolean FLAG = true;

        while (FLAG) {
            System.out.println("유저 ID는 >>>>");
            Scanner sc = new Scanner(System.in);
            String user_key = sc.nextLine();
            String pw_value = ht.get(user_key);

            if(pw_value != null) {
                System.out.println("유저 Password는 >>>> ");
                String passwordInputValue = sc.nextLine();

                if(pw_value.equals(passwordInputValue)) {
                    System.out.println("인증 성공!!");
                } else {
                    System.out.println("인증 실패!!");
                }
            }else {
                System.out.println("입력한 유저 ID는 등록되어 있지 않습니다.");
            }
        }
    }
}
