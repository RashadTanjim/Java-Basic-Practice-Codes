/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ABC;

/**
 *
 * @author arnob
 */
class Testtry {

    public static int b;

    public static void main(String args[]) {
        for (int a = 0; a < 4; a++) {
            try {

                switch (a) {
                    case 0:
                        int zero = 0;
                        b = 45 / zero;
                        break;
                    case 1:
                        int arr1[] = null;
                        b = arr1[0];
                        break;
                    case 2:
                        int arr2[] = new int[3];
                        b = arr2[5];
                        break;
                    case 3:
                        System.out.println("Hello ");
                        break;

                }

            } catch (Exception e) {
                System.out.println(" For : " + a + "\n");
                System.out.println(e.getMessage());

            }
        }
    }
}
