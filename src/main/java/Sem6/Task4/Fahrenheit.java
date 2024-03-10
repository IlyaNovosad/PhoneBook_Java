package Sem6.Task4;

public class Fahrenheit implements Converter{
    /**
     * @apiNote
     * @param value -- Температура в цельсиях
     * @return Температура в Фаренгейтах
     */
    @Override
    public double convertValue(double value) {
        return (value * 1.8) + 32;
    }
}
