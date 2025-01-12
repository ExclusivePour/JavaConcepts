public class GenericsConcepts {

    public static void main(String[] args){
        GenericsConcepts gc = new GenericsConcepts();
        gc.run();
    }

    public void run(){
        Can<String> can = new Can<>("Worms");
        String x = can.whatsInside();
        System.out.println(x);
    }

    class Can<T>{

        T contents;
        public Can(T contents){
            this.contents=contents;
        }
        public T whatsInside(){
            return contents;
        }

    }
}

