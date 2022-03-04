package liam.year22.march.w1.d3;

import java.util.Objects;

/**
 * @Description
 * @Author liam661
 * @Date 2022/3/1 18:33
 **/
public class Coder {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coder coder = (Coder) o;
        return age == coder.age &&
                Objects.equals(name, coder.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
