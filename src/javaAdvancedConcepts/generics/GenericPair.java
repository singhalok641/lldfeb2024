package javaAdvancedConcepts.generics;

public class GenericPair<F, S> {
    F first;
    S second;

    public GenericPair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}
