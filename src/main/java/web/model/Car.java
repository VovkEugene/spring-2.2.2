package web.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Car {
    private long id;
    private String name;
    private int year;
}
