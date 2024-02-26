/*
3. Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в целых сантиметрах),
его цвет (красный, желтый, зеленый тд) и материал (деревянный, металлический, картонный и тд.). Найти:
- количество кубиков желтого цвета и их суммарный объем;
- количество деревянных кубиков с ребром 3 см
*/
package Sem3.Task4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cube {
    private Integer length;
    private String color;
    private String material;

    /**
     * @return size
     * @ApiNote For finding a cube size
     */
    public Integer getVolume() {
        return (int) Math.pow(getLength(), 3);
    }

    static Collection<Cube> unicumCollection(List<Cube> cubeList) {
        return new HashSet<>(cubeList);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cube cube = (Cube) o;
        return Objects.equals(length, cube.length) && Objects.equals(color, cube.color) && Objects.equals(material, cube.material);
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, color, material);
    }
}
