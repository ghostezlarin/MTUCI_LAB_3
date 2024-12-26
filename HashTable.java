import java.util.LinkedList;

public class HashTable<K, V> {
    // Внутренний класс Entry представляет собой отдельную запись в таблицы с key и value
    private class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
    // Массив списков хранящий цепочки записей. Каждый элемент массива - цепочка, которая хранит записи с
    // одинаковым хеш кодом
    private LinkedList<Entry<K, V>>[] table;
    // кол-во элементов в массиве
    private int size;
    //начальная емкость массива(дефолт 16)
    private static final int DEFAULT_CAPACITY = 16;

    //избегаем проверку на типы
    @SuppressWarnings("unchecked")
    public HashTable(){
        table = (LinkedList<Entry<K,V>>[]) new LinkedList[DEFAULT_CAPACITY];
        size = 0;
    }

    // возврат хеш-кода для ключа
    private int hash(K key){
        return key.hashCode() % table.length;
    }

    //добавление новой пары ключ-значение
    public void put(K key, V value){
        // вычисляем индекс по хеш-коду
        int index = hash(key);
        // если цепочки нет, создаем новый список
        if (table[index] == null){
            table[index] = new LinkedList<>();
        }
        // обновление
        for (Entry<K, V> entry : table[index]){
            if (entry.key.equals(key)){
                entry.value = value;
                return;
            }
        }
        table[index].add(new Entry<>(key,value));
        size++;
    }
    // возвращение значения по ключу
    public V get(K key){
        int index = hash(key);
        LinkedList<Entry<K, V>> bucket = table[index];
        if (bucket != null){
            for (Entry<K, V> entry : bucket){
                if (entry.key.equals(key)){
                    return entry.value;
                }
            }
        }
        return null;
    }

    //удаление записи по ключу
    public void remove(K key){
        int index = hash(key);
        LinkedList<Entry<K, V>> bucket = table[index];
        if (bucket != null){
            for (Entry<K, V> entry : bucket){
                if (entry.key.equals(key)){
                    bucket.remove(entry);
                    size--;
                    return;
                }
            }
        }
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }
}
