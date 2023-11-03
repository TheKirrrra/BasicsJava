package lesson_43;

public class EnglishConvertImpl implements Convert{
    @Override
    public String from(int x, int y, int z) {
        return "Point at coordinates (" + x + ", " + y + ", " + z + ")";
    }
}
