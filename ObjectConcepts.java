class ObjectConcepts{
    public static void main(String[] args) throws InterruptedException {

        Object x = new Object();
        Object y = new Object();
        System.out.println(x.equals(y));
        System.out.println(x.hashCode());
        System.out.println(x.getClass());


        System.out.println("test");

    }
    @Override
    public void finalize(){
    // this is deprecated as of Java 9
    }
}