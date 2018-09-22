package shail.misc;

public class ComputeBinaryRepresentation {


    public static void main(String args[])
    {
        computeBinary(5);
        System.out.println(computeBinaryAlt(5));
    }


    public static String computeBinary(int val) {


        String binRep = "";

        while(val >= 2)
        {
            binRep = val%2 +binRep;
            val = val/2;
        }

        if(val == 1 || binRep == "") binRep = val%2 +binRep;

        System.out.println(binRep);

        return binRep;

    }

    public static String computeBinaryAlt(int val) {


        if(val < 2)
        {
            return Integer.toString(val);
        }

        return computeBinaryAlt(val/2) +  computeBinaryAlt(val%2);


    }
}
