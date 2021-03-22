package Temp;

public class IpValidation {

    public static void main(String[] args) {
        String ip = "192.168.0.1";
        String[] partip = ip.split("\\.");
        int count = 0;
       
       // if (partip.length == 4) {
            
            for (int j = 0; j < partip.length; j++) {
                int i = Integer.parseInt(partip[j]);
                if (i > 0 && i < 256 && (j == partip.length - 1)) {
                    count++;
                }
                else if (i >= 0 && i < 256) {
                    count++;
                }

                System.out.println(count);

            }

       // }
        if (count == 4) {
            System.out.println("Valid");

        } else {
            System.out.println("Not Valid");
        }
    }

}
