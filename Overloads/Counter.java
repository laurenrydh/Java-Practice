package Overloads;

public class Counter {
    private int counter;

    public Counter() {
        this.counter = 0;
    }

    public Counter(int startValue) {
        this.counter = startValue;
    }

    public int getCount() {
        return this.counter;
    }

    public void increase() {
        this.counter += 1;
    }

    public void increase(int increaseBy) {
        this.counter += increaseBy;
    }

    public void decrease() {
        this.counter -= 1;
    }

    public void descrese(int decreseBy) {
        this.counter -= decreseBy;
    }

    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println(counter.getCount());
        Counter seeded = new Counter(100);
        System.out.println(seeded.getCount());
        counter.increase();
        System.out.println(counter.getCount());
        counter.increase();
        System.out.println(counter.getCount());
        counter.decrease();
        System.out.println(counter.getCount());
        counter.increase(100);
        System.out.println(counter.getCount());
        counter.descrese(50);
        System.out.println(counter.getCount());
    }

}
