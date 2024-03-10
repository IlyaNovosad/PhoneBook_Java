package Sem6.Task4;

public class Kalvin implements Converter{
    /**
     * @apiNote
     * @param value -- Температура в цельсиях
     * @return Температура в кельвинах
     */
    @Override
    public double convertValue(double value) {
        return (value + 273.15);
    }
}
