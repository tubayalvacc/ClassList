public interface IArrayListClass<T> {

    void add(T data);

    void grow();

    void getIndex(int index);

    boolean setValue(int index, T value);

    String tostring();

    void remove(T value);

    int indexOf(T data);

    int lastIndexOf(T data);

    boolean isEmpty();

    T[] toArray();

    void clear();

    ArrayListClass<T> sublist(int start, int finish);

    boolean includes(T data);
}
