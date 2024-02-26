/*
3. Даны следующие сведения о кубиках: размер каждого кубика (длина ребра в целых сантиметрах),
его цвет (красный, желтый, зеленый тд) и материал (деревянный, металлический, картонный и тд.). Найти:
- количество кубиков желтого цвета и их суммарный объем;
- количество деревянных кубиков с ребром 3 см
*/
package Sem3.Task3_Example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cube {
    private Integer lenght;
    private String color;
    private String material;

    /**
     * @return size
     * @ApiNote For finding a cube size
     */
    public Integer getVolume() {
        return (int) Math.pow(getLenght(), 3);
    }

}
