package liam.year22.jan.w1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Description
 * @Author liam661
 * @Date 2022/1/6 19:39
 **/
public class StreamTest {
    public static void main(String [] args){
        /*List<Integer> list = Arrays.asList(7,6,9,3,8,2,1);
        //list.stream().filter(x -> x > 6).forEach(System.out::println);

        // 匹配第一个
        Optional<Integer> findFirst = list.stream().filter(x -> x > 6).findFirst();
        //System.out.println(findFirst.get());

        // 任意匹配
        Optional<Integer> findAny = list.parallelStream().filter(x -> x > 6).findAny();
        //System.out.println(findAny.get());

        boolean anyMatch = list.stream().anyMatch(x -> x > 6);
        System.out.println("是否存在大于6的值："+anyMatch);*/

        /*
        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
        personList.add(new Person("Alisa", 7900, 26, "female", "New York"));

        List<String> filterList = personList.stream().filter(x -> x.getSalary() > 8000).
                map(Person::getName).collect(Collectors.toList());
        System.out.println("高于8000的员工姓名："+ filterList);*/

        /*List<Integer> list = Arrays.asList(7,6,9,4,11,6);
        Optional<Integer> max = list.stream().max(Integer::compareTo);
        System.out.println("自然排序最大值："+ max.get());
        Optional<Integer> max2 = list.stream().max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println("自定义排序的最大值："+ max2.get());*/

        // eg3
        /*List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
        personList.add(new Person("Alisa", 7900, 26, "female", "New York"));

        Optional<Person> max = personList.stream().max(Comparator.comparingInt(Person::getSalary));
        System.out.println("员工的最大工资："+ max.get().getSalary());*/

        // eg4
        /*String[] strArr = { "abcd", "bcdd", "defde", "fTr" };
        List<String> strList = Arrays.stream(strArr).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("每个元素大写："+strList);

        List<Integer> integerList = Arrays.asList(1,3,5,7,9,11);
        List<Integer> integerListNew = integerList.stream().map(x -> x+3).collect(Collectors.toList());
        System.out.println("每个元素加三："+integerListNew);*/

        // eg5
        /*List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
        personList.add(new Person("Alisa", 7900, 26, "female", "New York"));

        List<Person> personListNew = personList.stream().map(person -> {
            Person personNew = new Person(person.getName(), 0, 0, null, null);
            personNew.setSalary(person.getSalary() + 1000);
            return personNew;
        }).collect(Collectors.toList());

        System.out.println("一次改动前：" + personList.get(0).getName() + "-->" + personList.get(0).getSalary());
        System.out.println("一次改动后：" + personListNew.get(0).getName() + "-->" + personListNew.get(0).getSalary());

        List<Person> personListNew2 = personList.stream().map(person -> {
            person.setSalary(person.getSalary() + 10000);
            return person;
        }).collect(Collectors.toList());
        System.out.println("二次改动前：" + personList.get(0).getName() + "-->" + personListNew.get(0).getSalary());
        System.out.println("二次改动后：" + personListNew2.get(0).getName() + "-->" + personListNew2.get(0).getSalary());*/

        // eg6
        /*List<String> list = Arrays.asList("m,k,l,a", "1,3,5,7");
        List<String> listNew = list.stream().flatMap(s ->{
            String [] split = s.split(",");
            Stream<String> s2 = Arrays.stream(split);
            return s2;
        }).collect(Collectors.toList());
        System.out.println("处理前："+ list);
        System.out.println("处理后："+listNew);*/

        // eg7
        /*List<Integer> list = Arrays.asList(1,3,2,8,11,4);
        Optional<Integer> sum = list.stream().reduce((x,y) -> x + y);
        System.out.println("list 求和："+ sum.get());
        Optional<Integer> sum2 = list.stream().reduce(Integer :: sum);
        System.out.println("list 求和2："+ sum2.get());
        Integer sum3 = list.stream().reduce(0, Integer :: sum);
        System.out.println("list 求和3："+ sum3);
        // 求乘积
        Optional<Integer> product = list.stream().reduce((x,y) -> x * y);
        System.out.println("list 求乘积："+product.get());
        // 求最大值写法
        Integer max2 = list.stream().reduce(1, Integer :: max);
        System.out.println("最大值："+ max2);*/

        // eg8
        /*List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
        personList.add(new Person("Owen", 9500, 25, "male", "New York"));
        personList.add(new Person("Alisa", 7900, 26, "female", "New York"));

        Optional<Integer> sumSalary = personList.stream().map(Person::getSalary).reduce(Integer ::sum);
        Integer sumSalary2 = personList.stream().reduce(0, (sum, p) -> sum+= p.getSalary(),
                (sum1, sum2)-> sum1 + sum2);
        Integer sumSalary3 = personList.stream().reduce(0, (sum,p) -> sum += p.getSalary(), Integer :: sum);
        System.out.println("工资之和："+sumSalary.get()+","+ sumSalary2+","+sumSalary3);

        // 最高工资
        Integer maxSalary = personList.stream().reduce(0,
                (max, p) -> max > p.getSalary() ? max : p.getSalary(),Integer ::max);
        // 最高工资2
        Integer maxSalary2 = personList.stream().reduce(0,
                (max, p)-> max > p.getSalary() ? max : p.getSalary(),
                (max1, max2) -> max1 > max2 ? max1 : max2);
        System.out.println("最高工资："+maxSalary+", "+maxSalary2);*/

        // eg9
        /*List<Integer> list = Arrays.asList(1, 6, 3, 4, 6, 7, 9, 6, 20);
        List<Integer> listNew = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        Set<Integer> set = list.stream().filter(x -> x % 2 == 0).collect(Collectors.toSet());
        System.out.println("toList" +listNew);
        System.out.println("toSet "+ set);

        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));

        Map<?, Person> map = personList.stream().filter(p -> p.getSalary() > 8000).collect(
                Collectors.toMap(Person::getName, p->p));
        System.out.println("toMap: "+map);*/
        // eg10
        /*List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        // 求总数
        Long count = personList.stream().collect(Collectors.counting());
        System.out.println("总数："+count);
        // 求平均工资
        Double average = personList.stream().collect(Collectors.averagingDouble(Person::getSalary));
        System.out.println("平均工资："+average);
        // 求最高工资
        Optional<Integer> max = personList.stream().map(Person::getSalary).collect(Collectors.maxBy(Integer::compare));
        // 求工资之和
        Integer sum = personList.stream().collect(Collectors.summingInt(Person::getSalary));
        System.out.println("员工工资总和："+ sum);
        // 一次性统计所有信息
        DoubleSummaryStatistics collect = personList.stream().collect(Collectors.summarizingDouble(Person::getSalary));
        System.out.println("员工工资所有统计："+ collect);*/
        // 分组
        /*List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));
        personList.add(new Person("Anni", 8200, 24, "female", "New York"));
        personList.add(new Person("Owen", 9500, 22,"male","New York"));
        personList.add(new Person("Alisa", 7900, 23,"female", "New York"));

        Map<Boolean, List<Person>> part = personList.stream().collect(
                Collectors.partitioningBy(x -> x.getSalary() > 8000));
        Map<String,List<Person>> group = personList.stream().collect(Collectors.groupingBy(Person::getSex));
        Map<String,Map<String, List<Person>>> group2 = personList.stream().collect(Collectors.groupingBy(Person::getSex, Collectors.groupingBy(Person::getArea)));
        System.out.println("员工按薪资是否大于8000分组情况：" + part);
        System.out.println("员工按性别分组情况：" + group);
        System.out.println("员工按性别、地区：" + group2);*/

        /*List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));

        String names = personList.stream().map(p -> p.getName()).collect(Collectors.joining(","));
        System.out.println("所有员工的姓名："+ names);

        List<String> list = Arrays.asList("A","B","C");
        String string = list.stream().collect(Collectors.joining("-"));
        System.out.println("拼接后的字符串："+string);*/

        /*List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Tom", 8900, 23, "male", "New York"));
        personList.add(new Person("Jack", 7000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 7800, 21, "female", "Washington"));

        Integer sum = personList.stream().collect(
                Collectors.reducing(0, Person::getSalary, (i,j) -> (i + j -5000)));
        System.out.println("员工扣税薪资总和："+ sum);
        Optional<Integer> sum2 = personList.stream().map(Person::getSalary).reduce(Integer::sum);
        System.out.println("员工薪资总和："+sum2.get());*/

        // eg12
        /*List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Sherry", 9000, 24, "female", "New York"));
        personList.add(new Person("Tom", 8900, 22, "male", "Washington"));
        personList.add(new Person("Jack", 9000, 25, "male", "Washington"));
        personList.add(new Person("Lily", 8800, 26, "male", "New York"));
        personList.add(new Person("Alisa", 9000, 26, "female", "New York"));

        List<String> newList = personList.stream().sorted(
                Comparator.comparing(Person::getSalary)).map(Person::getName).collect(Collectors.toList());
        System.out.println("升序："+newList);

        List<String> newList2 = personList.stream().sorted(
                Comparator.comparing(Person::getSalary).reversed()).map(Person::getName).collect(Collectors.toList());
        System.out.println("反序："+newList2);

        List<String> newList3 = personList.stream().sorted(
                Comparator.comparing(Person::getSalary).thenComparing(Person::getAge)).map(Person::getName).collect(Collectors.toList());
        System.out.println("先按工资再按年龄"+newList3);

        List<String> newList4 = personList.stream().sorted(
                (p1,p2) ->{
                    if(p1.getSalary() == p2.getSalary()){
                        return p2.getAge() - p1.getAge();
                    }else {
                        return p2.getSalary() - p1.getSalary();
                    }
                }
        ).map(Person::getName).collect(Collectors.toList());
        System.out.println("先按工资再按年龄自定义排序："+ newList4);*/
        // eg13
        String [] arr1 = {"a","b","c","d"};
        String [] arr2 = {"e","f","g","h"};
        Stream<String> stream1 = Stream.of(arr1);
        Stream<String> stream2 = Stream.of(arr2);
        List<String> newList = Stream.concat(stream1, stream2).distinct().collect(Collectors.toList());
        System.out.println("流合并："+newList);
        List<Integer> collect = Stream.iterate(1, x -> x+2).limit(10).collect(Collectors.toList());
        System.out.println("limit: "+collect);
        List<Integer> collect2 = Stream.iterate(1, x-> x+2).skip(1).limit(5).collect(Collectors.toList());
        System.out.println("skip: "+collect2);

        double b = (28.2*400+26.4*600)/1000;
        double a = (28.2*400+26.4*600)/1000 * 1.1;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}
