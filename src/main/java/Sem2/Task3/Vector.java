package Sem2.Task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Vector {
    private double x;
    private double y;
    private double z;

//    public Vector(double x, double y, double z) {
//        this.x = x;
//        this.y = y;
//        this.z = z;
//    }
//
//    public Vector() {
//    }
//
//    public double getX() {
//        return x;
//    }
//
//    public void setX(double x) {
//        this.x = x;
//    }
//
//    public double getY() {
//        return y;
//    }
//
//    public void setY(double y) {
//        this.y = y;
//    }
//
//    public double getZ() {
//        return z;
//    }
//
//    public void setZ(double z) {
//        this.z = z;
//    }
//
//    @Override
//    public String toString() {
//        return "Vector{" +
//                "x=" + x +
//                ", y=" + y +
//                ", z=" + z +
//                '}';
//    }
//
    /**
     * @apiNote метод, вычисляет длину вектора
     * @return возвращает значение
     */
    public double length() {
        double length = Math.sqrt(x*x + y*y + z*z);
        return length;
    }

    /**
     * @apiNote Вычисляет скалярное произведение
     * @param vectorTwo
     * @return скалярное произведение
     */
    public double scalar(Vector vectorTwo) {
        double scalar = x* vectorTwo.getX() + y* vectorTwo.getY() + z* vectorTwo.getZ();
        return scalar;
    }

    /**
     * @apiNote перемножает два вектора
     * @param vectorTwo
     * @return новый вектор
     */
    public Vector multiply(Vector vectorTwo) {
        return new Vector(
                y * vectorTwo.getZ() - z * vectorTwo.getY(),
                z * vectorTwo.getX() - x * vectorTwo.getZ(),
                x * vectorTwo.getY() - y * vectorTwo.getX()
        );
    }

    /**
     * @apiNote вычисляет угол между векторами
     * @param vectorTwo
     * @return значение
     */
    public double cos(Vector vectorTwo) {
        return scalar(vectorTwo) / (length() * vectorTwo.length());
    }

    /**
     * @apiNote вычисляет сумму векторов
     * @param vector2
     * @return результирующий вектор
     */
    public Vector sum(Vector vector2) {
        return new Vector(x+vector2.getX(),y+vector2.getY(),z+vector2.getZ());
    }

    /**
     * @apiNote вычисляет разность веркторов
     * @param vector2
     * @return результирующий вектор
     */
    public Vector degree(Vector vector2) {
        return new Vector(x-vector2.getX(),y-vector2.getY(),z-vector2.getZ());
    }
}
