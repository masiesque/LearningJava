package br.com.masiesque.Scoletion.Test;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {
    public static void main(String[] args) {
        Queue<String> fila1 = new PriorityQueue<>();

        fila1.add("D");
        fila1.add("C");
        fila1.add("B");
        fila1.add("A");

        while(!fila1.isEmpty())
            System.out.println(fila1.poll());
    }
}
