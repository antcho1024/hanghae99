import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


class Sale {
    String fruitName;
    int price;
    float discount;

    public Sale(String fruitName, int price, float discount) {
        this.fruitName = fruitName;
        this.price = price;
        this.discount = discount;
    }
}
public class prac_stream {
    public static void main(String[] args) {

        //예제 1 (리스트 -> 스트링 변환)
        List<String> list = new ArrayList<>();
        list.add("서울");
        list.add("부산");
        list.add("대구");
        list.add("서울");

        System.out.println(list);

        List<String> result = list.stream()
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(result);

        Set<String> set = list.stream()
                .filter(it -> "서울".equals(it)) //.filter("서울"::equals)도 가능 알트 엔터
                .collect(Collectors.toSet());

        System.out.println(set);
        System.out.println("-----");

        //예제 2 (array -> 스트링으로 변환)
        String[] arr = {"SQL", "Java", "Python"};
        Stream<String> stringStream = Arrays.stream(arr);
        stringStream.forEach(System.out::println);


        //예제 3 (map 연산)
//        List<Sale> sales = Arrays.asList(
//                new Sale("Apple", 5000, 0.05f),
//                new Sale("Orange", 4000, 0.2f),
//                new Sale("Grape", 2000, 0),
//        );
//        sales.stream()
//                .map()
//                .forEach();

        //예제 4- (reduce)


        //퀴즈
        List<String> names = Arrays.asList("김정우", "김호정", "이하늘", "이정희", "박정우", "박지현", "정우석", "이지수");
        long count = names.stream()
                .filter(s -> s.startsWith("이"))
                .count();
        System.out.println(count);


    }
}
