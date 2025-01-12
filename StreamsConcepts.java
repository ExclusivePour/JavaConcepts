import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsConcepts {
    public static void main(String[] args){



        List<String> fruits = List.of("banana","apple","apple","banana","banana","kiwi","pear");
        //Map<String,Long> result= fruits.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Map<String,Long> result= fruits.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));

        System.out.println(result);
        List<Employee> list = List.of(new Employee("John",100),new Employee("Jim",300),new Employee("Max",200));

        Map<String,Integer> map=list.stream()
                                .sorted()
                                .limit(2)
                                .collect(Collectors.toMap(e->e.name, e->e.salary));//forEach(e->System.out.println(e.name+" "+e.salary));

        System.out.println(map.toString());
    }

    private static class Employee implements Comparable<Employee>{

        private String name;
        private int salary;

        public Employee(String name,int salary){
            this.name=name;
            this.salary=salary;
        }

        public int compareTo(Employee e2){
            return e2.salary-this.salary;
        }
    }
}
