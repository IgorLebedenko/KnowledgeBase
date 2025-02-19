package com.github.ilebedenko.release_history.java9._8_new_optional_methods;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Новые методы Optional:
 * <p>
 * `stream()` - создает Stream из Optional. Если Optional будет пустым, то и Stream тоже
 * <p>
 * `ifPresentOrElse(Consumer, Runnable)` - выполняет одно действие,
 *          если значение в Optional присутствует, иначе - другое
 * <p>
 * `or(Supplier)` - возвращает Optional переданного значения, если оно задано,
 *          иначе возвращает Optional, предоставленной Supplier функцией
 */
public class Test {
    public static void main(String[] args) {
        Map<Integer, String> persons = Map.of(
                1, "Ann",
                2, "Ben",
                3, "Chloe",
                4, "Den"
        );
        List<Integer> ids = List.of(1, 2, 4, 5);

        // stream   -> Ann Ben Den
        // =============== BEFORE JAVA 9 ================
        ids.stream()
                .map(id -> Optional.ofNullable(persons.get(id)))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .forEach(name -> System.out.print(name + " "));
        System.out.println();
        // =============== AFTER JAVA 9 ================
        ids.stream()
                .map(id -> Optional.ofNullable(persons.get(id)))
                .flatMap(Optional::stream)
                .forEach(name -> System.out.print(name + " "));
        System.out.println();

        // ifPresentOrElse
        ids.stream()
                .map(id -> Optional.ofNullable(persons.get(id)))
                .forEach(opt -> opt.ifPresentOrElse(
                        name -> System.out.printf("Person '%s' exists\n", name),
                        () -> System.out.println("Person does not exist!")
                ));

        // or
        Optional<String> address = AddressUtil.getHomeAddress("Joe")
                .or(() -> AddressUtil.getWorkAddress("Joe"));
        address.ifPresent(System.out::println);
    }
}
