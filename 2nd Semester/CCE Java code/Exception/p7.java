public class p7 {
   public static void someMethod() throws Exception
   {
    try {
        someMethod2();
    } catch (Exception e) {
        System.out.println(e);
        throw e;
    }
}



    public static void someMethod2() throws Exception
   {
     throw new Exception("someMethod2 Exception");
   }


  public static void main(String[] args)
  {
    try {
        someMethod();
    } catch (Exception e) {
        System.out.println(e);
        e.printStackTrace();
    }
  }
   
}
