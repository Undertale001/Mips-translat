/******************************************************
 * this class represnt the static methods for
 * the mips project
 * @author Undertale365
 * @version 
 *****************************************************/
public class convertMethods
{   
    public static boolean caseOfZeroRegisters(String s){ return s.equals("syscall");}
    public static boolean caseOfTowRegisters(String s) { return s.equals("mult") || s.equals("multu") || s.equals("div") || s.equals("divu");}
    public static boolean caseOfOneRegisters(String s) { return s.equals("mflo") || s.equals("mfhi") || s.equals("div") || s.equals("divu");}
    
    public static String rgisterBits(String S) 
    {
        String res = "";
        switch (S) {
            case "$0":
            res +="00000";
            break;
            case "$zero":
            res +="00000";
            break;
            case "$1":
            res +="00001";
            break;
            case "$at":
            res +="00001";
            break;
            case "$2":
            res +="00010";
            break;
            case "$v0":
            res +="00010";
            break;
            case "$3":
            res +="00011";
            break;
            case "$v1":
            res +="00011";
            break;
            case "$4":
            res +="00100";
            break;
            case "$a0":
            res +="00100";
            break;
            case "$5":
            res +="00101";
            break;
            case "$a1":
            res +="00101";
            break;
            case "$6":
            res +="00110";
            break;
            case "$a2":
            res +="00110";
            break;
            case "$7":
            res +="00111";
            break;
            case "$a3":
            res +="00111";
            break;
            case "$8":
            res +="01000";
            break;
            case "$t0":
            res +="01000";
            break;
            case "$9":
            res +="01001";
            break;
            case "$t1":
            res +="01001";
            break;
            case "$10":
            res +="01010";
            break;
            case "$t2":
            res +="01010";
            break;
            case "$11":
            res +="01011";
            break;
            case "$t3":
            res +="01011";
            break;
            case "$12":
            res +="01100";
            break;
            case "$t4":
            res +="01100";
            break;
            case "$13":
            res +="01101";
            break;
            case "$t5":
            res +="01101";
            break;
            case "$14":
            res +="01110";
            break;
            case "$t6":
            res +="01110";
            break;
            case "$15":
            res +="01111";
            break;
            case "$t7":
            res +="01111";
            break;
            case "$16":
            res +="10000";
            break;
            case "$s0":
            res +="10000";
            break;
            case "$17":
            res +="10001";
            break;
            case "$s1":
            res +="10001";
            break;
            case "$18":
            res +="10010";
            break;
            case "$s2":
            res +="10010";
            break;
            case "$19":
            res +="10011";
            break;
            case "$s3":
            res +="10011";
            break;
            case "$20":
            res +="10100";
            break;
            case "$s4":
            res +="10100";
            break;
            case "$21":
            res +="10101";
            break;
            case "$s5":
            res +="10101";
            break;
            case "$22":
            res +="10110";
            break;
            case "$s6":
            res +="10110";
            break;
            case "$23":
            res +="10111";
            break;
            case "$s7":
            res +="10111";
            break;
            case "$24":
            res +="11000";
            break;
            case "$t8":
            res +="11000";
            break;
            case "$25":
            res +="11001";
            break;
            case "$t9":
            res +="11001";
            break;
            case "$26":
            res +="11010";
            break;
            case "$k0":
            res +="11010";
            break;
            case "$27":
            res +="11011";
            break;
            case "$k1":
            res +="11011";
            break;
            case "$28":
            res +="11100";
            break;
            case "$gp":
            res +="11100";
            break;
            case "$29":
            res +="11101";
            break;
            case "$sp":
            res +="11101";
            break;
            case "$30":
            res +="11110";
            break;
            case "$fp":
            res +="11110";
            break;
            case "$31":
            res +="11111";
            break;
            case "$ra":
            res +="11111";
            break;
            default:
            res +="00000";
                break;
        }    
        return res;
    }

    public static String func(String S,String format) 
    {
    if (format.charAt(0) == 'R') 
    {
        switch (S) {
            case "sll":
            return "000000";           
            case "srl":           
            return "000010";
            case "sra":           
            return "000011";
            case "sllv":           
            return "000100";
            case "sriv":           
            return "000110";
            case "srav":           
            return "000111";
            case "jr":           
            return "001000";
            case "jalr":           
            return "001001";
            case "movz":           
            return "001010";
            case "movn":           
            return "001011";
            case "syscall":           
            return "001100";
            case "brack":           
            return "001101";
            case "sync":           
            return "001111";
            case "mfhi":           
            return "010000";
            case "mfti":           
            return "010001";
            case "mflo":           
            return "010010";
            case "mfto":           
            return "010011";
            case "mult":           
            return "011000";
            case "multu":           
            return "011001";
            case "div":           
            return "011010";
            case "divu":           
            return "011011";
            case "add":           
            return "100000";
            case "addu":           
            return "100001";
            case "sub":           
            return "100010";
            case "subu":           
            return "100011";
            case "and":           
            return "100100";
            case "or":           
            return "100101";
            case "xor":           
            return "100110";
            case "nor":           
            return "100111";
            case "slt":           
            return "101010";
            case "sltu":           
            return "101011";
            case "tge":           
            return "110000";
            case "tgeu":           
            return "110001";
            case "tlt":           
            return "110010";
            case "tltu":           
            return "110011";
            case "teg":           
            return "110100";
            case "tne":           
            return "110110";
            default:
            return "Unknow";
        }
    }
    if (format.charAt(0) == 'I') 
    {
            
    }
    if (format.charAt(0) == 'J') 
    {
            
    }
    return "";
    }

    public static String fromBinToHex(String S) 
{
    int j = 0;
    String st1 = "", st2="";
    for (int i = 0; i < S.length(); i++) 
    {   
        if (S.charAt(i) == '-') 
        {
            continue;
        }
        j++;
        st1+=S.charAt(i);
        if( j == 4)
        {
            switch (st1) {
                case "0000":
                    st2+="0";
                    break;
                    case "0001":
                    st2+="1";
                    break;
                    case "0010":
                    st2+="2";
                    break;
                    case "0011":
                    st2+="3";
                    break;
                    case "0100":
                    st2+="4";
                    break;
                    case "0101":
                    st2+="5";
                    break;
                    case "0110":
                    st2+="6";
                    break;
                    case "0111":
                    st2+="7";
                    break;
                    case "1000":
                    st2+="8";
                    break;
                    case "1001":
                    st2+="9";
                    break;
                    case "1010":
                    st2+="A";
                    break;
                    case "1011":
                    st2+="B";
                    break;
                    case "1100":
                    st2+="C";
                    break;
                    case "1101":
                    st2+="D";
                    break;
                    case "1110":
                    st2+="E";
                    break;
                    case "1111":
                    st2+="F";
                    break;
            }
            j = 0;
            st1="";
        }

    }
    return st2;
  }
}