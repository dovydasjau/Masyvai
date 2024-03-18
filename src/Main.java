public class Main {
    public static void main(String[] args) {

        System.out.println("-------------------1.---------------------");

        int[] First = new int[30];

        for (int i = 0; i < First.length; i++) {
            First[i] = (int) (5 + Math.random() * 21);
            System.out.print(First[i]);
            if (i < First.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("\n-------------------2.---------------------");

        int tenCounter = 0;

        for (int i = 0; i < First.length; i++) {
            if (First[i] > 10) {
                tenCounter++;
            }
        }

        System.out.println("Reikšmių, didesnių už 10 yra: " + tenCounter);

        System.out.println("---------------b.-----------------");

        int maxValue = Integer.MIN_VALUE;
        int maxIndex = -1;
        int count = 0;

        // Find the largest value and its index
        for (int i = 0; i < First.length; i++) {
            if (First[i] > maxValue) {
                maxValue = First[i];
                maxIndex = i;
                count = 1;
            } else if (First[i] == maxValue) {
                count++;
            }
        }

        System.out.println("Didžiausia reikšmė: " + maxValue);
        System.out.println("Didžiausios reikšmės pozicija masyve: " + maxIndex);
        if (count > 1) {
            System.out.println("Didžiausia reikšmė dar buvo pakartota: " + (count - 1) + " kartus.");
        }

        System.out.println("---------------c.-----------------");

        int sum = 0;
        for (int i = 0; i < First.length; i++) {
            if (First[i] % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("Lyginių skaičių pozicijų suma: " + sum);

        System.out.println("---------------d.-----------------");

        int[] Second = new int[First.length];

        for (int i = 0; i < First.length; i++) {
            Second[i] = First[i] - i;
            System.out.print(Second[i]);
            if (i < Second.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("\n---------------e.-----------------");

        int[] Third = new int[39];

        for (int i = 0; i < 10; i++) {
            Third[i] = (int) (5 + Math.random() * 21);
        }

//        for (int i = 10; i < Third.length; i++) {

//        }


    }
}