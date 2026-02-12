package week04;

import week04.geometry.Segment;

public class Lecture {
    public static void main(String[] args) {
        Segment s=new Segment(3.14f,1.1f,2.0f,0.3f);
        System.out.println(s.getP1().getX());
    }
}
