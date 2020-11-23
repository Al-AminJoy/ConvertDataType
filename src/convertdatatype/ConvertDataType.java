package convertdatatype;

public class ConvertDataType {

    public static void main(String[] args) {
       String str="100";
       //String To Other
       int num=Integer.parseInt(str);
       System.out.println(num);
       //Other To String
       String str2=Integer.toString(num);
       System.out.println(str2);
      //Decimal to Other
       String binary=Integer.toBinaryString(num);
       System.out.println(binary);     
       //Other to Decimal
       Integer dec=Integer.parseInt(binary,2);
       System.out.println(dec);
    }
    
}
