package java_personal.LeetCode.Algorithms;

class DefangingAnIPAddress {

    public static String defangIPaddr(String address) {

        String str = address.replace(".","[.]");

        return str;

    }

    public static void main(String[] args) {

        String address = "1.1.1.1";

        System.out.println(defangIPaddr(address));
    }
}
