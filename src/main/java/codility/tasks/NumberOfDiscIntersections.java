package codility.tasks;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://app.codility.com/programmers/lessons/6-sorting/number_of_disc_intersections/
 */
public class NumberOfDiscIntersections {

    public int solution(int[] A) {
        int len = A.length;
        if (len < 2) { return 0; }

        class Event {
            public double coord;
            public int intersectingDiscsDelta;

            public Event(double coord, int intersectingDiscsDelta) {
                this.coord = coord;
                this.intersectingDiscsDelta = intersectingDiscsDelta;
            }
        }

        Event[] events = new Event[len * 2];

        for (int i = 0, j = 0; i < len; i++) {
            events[j++] = new Event((double) i - (double) A[i], 1);
            events[j++] = new Event((double) i + (double) A[i], -1);
        }

        Arrays.sort(events, new Comparator<Event>() {
            @Override
            public int compare(Event a, Event b) {
                int coordDiff = (int) (a.coord - b.coord);
                if (coordDiff != 0) {
                    return coordDiff;
                }
                return b.intersectingDiscsDelta - a.intersectingDiscsDelta;
            }
        });


        int intersections = 0;
        for (int i = 0, intersectingDiscs = 0; i < events.length; i++) {
            Event event = events[i];

            if (event.intersectingDiscsDelta > 0) {
                intersections += intersectingDiscs;
            }

            if (intersections > 10000000) {
                return -1;
            }

            intersectingDiscs += event.intersectingDiscsDelta;
        }

        return intersections;
    }
}
