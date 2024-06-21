public class CHW_14_STRINGMETHODS {
    public static void main(String[] args) {
        String name ="NIKHIL";
//        System.out.println(name);
        int value = name.length();
        System.out.println(value);
//        String lstring = name.toUpperCase();
//        System.out.println(lstring);
        String ustring = name.toLowerCase();
        System.out.println(ustring);
        String nonTrimmedString="     Nikhil      ";
        System.out.println(nonTrimmedString.trim());
//        System.out.println(TrimmedString);

        System.out.printlnSystem.out.println(name.replace('r','p'));(name.substring(1,5));



        System.out.println(name.startsWith("NI"));
        System.out.println(name.charAt(0));

        String modificationName = "Niikhiil";
        System.out.println(modificationName.indexOf("iil"));
        System.out.println(modificationName.indexOf("iil", 5));
        System.out.println("I am escape sequence \n double quote");

    }
}
