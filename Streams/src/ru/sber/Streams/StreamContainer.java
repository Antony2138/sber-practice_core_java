package ru.sber.Streams;

class StreamContainer {
    private String name;
    private long count;

    public StreamContainer(String name, long count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public long getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "StreamContainer{" +
                "name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
