import java.util.Scanner; // Import the Scanner class

public class MIPS extends convertMethods {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        String[] Rcommand = new String[6];
        String value = "";
        //String[] Icommand = new String[6];
        //String[] Jcommand = new String[6];
        while(!value.equals("exit")){
            System.out.println("Enter your command formt"); // R/I/J
            value = myObj.nextLine(); // Read user input format
            if (value.charAt(0) == 'R' || value.charAt(0) == 'r') {
                Rcommand[0] = "R";

                System.out.println("Enter your format " + Rcommand[0] + " command"); // R/I/J
                value = myObj.nextLine(); // Read user input command
                System.out.println("ECO: " + value);

                String S1 = "", S2 = "", S3 = "", S4 = "";
                int mode1 = 1, mode2 = 0, mode3 = 0, mode4 = 0, j = 0;
                for (int i = 0; i < value.length(); i++) {
                    if (value.charAt(i) != ' ') {
                        if (mode1 == 1) // command name
                            S1 += value.charAt(i);
                        if (mode2 == 1) // ragister RS
                            S2 += value.charAt(i);
                        if (mode3 == 1) // ragister RT
                            S3 += value.charAt(i);
                        if (mode4 == 1) // ragister RD
                            S4 += value.charAt(i);
                    }
                    if (value.charAt(i) == ' ') {
                        j++;
                        if (j == 1) {
                            mode1 = 0; // stop get the command
                            mode2 = 1; // start get ragister RS
                        }
                        if (j == 2) {
                            mode2 = 0; // stop take ragister RS
                            mode3 = 1; // start get ragister RT
                        }
                        if (j == 3) {
                            mode3 = 0; // stop take ragister RT
                            mode4 = 1; // start get ragister RD
                        }
                        continue;
                    }
                }
                String temp_To_Check = S1;
                Rcommand[1] = S1; // save command name
                Rcommand[2] = S2; // save ragister RS
                Rcommand[3] = S3; // save ragister RT
                Rcommand[4] = S4; // save ragister RD
                if (caseOfZeroRegisters(temp_To_Check)) // for exmaple syscall
                {
                    Rcommand[2] = Rcommand[3] = Rcommand[4] = Rcommand[5] = "XXXXX";
                    Rcommand[5] = func(Rcommand[1], "R");
                    Rcommand[0] = "000000"; // opcode in R format is 6 bits of zero
                    j = -1; // falge for this case
                }
                if (caseOfOneRegisters(temp_To_Check)) // for exmaple mflo/mfhi
                {
                    temp_To_Check = Rcommand[2]; // make a swop
                    Rcommand[2] = Rcommand[3];
                    Rcommand[3] = temp_To_Check;
                }
                if (caseOfTowRegisters(temp_To_Check)) // for empale mult/div
                {
                    temp_To_Check = Rcommand[4]; // make a swop
                    Rcommand[4] = Rcommand[3];
                    Rcommand[3] = temp_To_Check;
                }

                System.out.println("System inishlize command");
                for (int i = 0; i < 3; i++) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(".");
                }
                if (j != -1) {
                    Rcommand[5] = func(Rcommand[1], "R");
                    Rcommand[0] = "000000"; // opcode in R format is 6 bits of zero
                    Rcommand[1] = rgisterBits(Rcommand[2]);
                    Rcommand[2] = rgisterBits(Rcommand[4]);
                    Rcommand[3] = rgisterBits(Rcommand[3]);
                    Rcommand[4] = "00000";
                }
                String conver = "";
                System.out.println(" OPCODE\t   RS\t   RT\t   RD\t  SHAMT\t  FUNCT");
                for (int i = 0; i < Rcommand.length; i++) {
                    for (int k = 0; k < Rcommand[i].length(); k++) {
                        conver += Rcommand[i].charAt(k);
                    }
                    System.out.print("[" + Rcommand[i] + "] ");
                }
                if (j == -1) // case of syscall
                {
                    conver = "0x0XXXXXXC";
                }
                System.out.println("\n");
                System.out.println("\nThe command in a binary set --> " + conver);
                conver = fromBinToHex(conver);
                System.out.println("\nThe command in a hex set --> 0x" + conver + "\n");
            }
        }
    }
}
