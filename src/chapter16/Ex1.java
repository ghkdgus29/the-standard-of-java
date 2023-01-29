package chapter16;

public class Ex1 {
    public static void main(String[] args) {

        int[] ip = {192, 168, 10, 100};
        int[] subnet = {255, 255, 255, 0};

        int[] nwAddr = new int[4];
        int[] hostAddr = new int[4];

        System.out.print("네트워크 주소:");

        for (int i = 0; i < ip.length; i++) {
            nwAddr[i] = (ip[i] & subnet[i]);
            System.out.print(nwAddr[i] < 0 ? nwAddr[i] + 256 : nwAddr[i]);
            System.out.print(".");
        }

        System.out.println();
        System.out.print("호스트 주소:");

        for (int i = 0; i < hostAddr.length; i++) {
            hostAddr[i] = (ip[i] & ~subnet[i]);
            System.out.print(hostAddr[i] < 0 ? hostAddr[i] + 256 : hostAddr[i]);
            System.out.print(".");
        }

        System.out.println();
    }
}
