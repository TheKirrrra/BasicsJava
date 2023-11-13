package homeworks.homework24_48.homework_24.Task02;

public class Moustache {

    private boolean moustache;

    public Moustache(boolean moustache) {
        this.moustache = moustache;
    }

    public String toString() {
        return "{Есть усы? " + moustache;
    }

    public boolean isMoustache() {
        return moustache;
    }

    public void setMoustache(boolean moustache) {
        this.moustache = moustache;
    }
}
