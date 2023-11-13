package lessons.lesson24_48.lesson_43;

public class RussianConverterImpl implements Convert{
    @Override
    public String from(int x, int y, int z) {
        return "Точка в координатах (" + x + ", " + y + ", " + z + ")";
    }
}
