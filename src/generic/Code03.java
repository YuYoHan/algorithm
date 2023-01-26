package generic;

interface InterfaceGeneric<T> {
    T example();
}

class ExGeneric implements InterfaceGeneric<String> {
    @Override
    public String example() {
        return null;
    }
}

public interface Code03 {
    public static void main(String[] args) {

    }
}
