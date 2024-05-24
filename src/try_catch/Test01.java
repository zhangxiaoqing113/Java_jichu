package try_catch;

public class Test01 {
    private  int i=10;
    private  int j=100;
    private  int k=1000;

    /**
     * try catch finally  不管怎么样,最后都会走finally
     * 如果 try catch finally 都有返回值,以finally为准.
     *
     *  如果try中有return语句 finally中没有
     * try{return test02();}
     * finally {System.out.println("finally ");}
     * 执行完test02()后 不返回,执行完 finally 后,再把 test02()结果返回
     *
     *
     * @return
     */
    public int test01(){
        try {
            System.out.println("try ");
          //  int u=i/0;
            return test02();
        }catch (Exception e){
            System.out.println("Exception ");
            return j;
        } finally {
            System.out.println("finally ");
           // return k;
        }
    }

    public int test02(){
        System.out.println("test02 ");
        return 20;
    }


    public String test03(){
        String name;
        while (true){
            try {
                name="test03 try";
                return name;
            }catch (Exception e){
                name="catch";
                return  name;
            }finally {
                System.out.println("test03 finally");
            }


        }
    }



    public void test04(String s){
        System.out.println("test04 "+s);
    }
}
