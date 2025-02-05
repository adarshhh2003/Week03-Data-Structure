package ChallengeProblem.CompareStringBuilderStringBuffer;

import java.util.List;

public class CompareTime {
    public static long stringBuilderTime(List<String> list, int n) {
        long start = System.nanoTime();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<n; i++) {
            sb.append(list.get(0));
        }

        long end = System.nanoTime();

        return end-start;
    }

    public static long stringBufferTime(List<String> list, int n) {
        long start = System.nanoTime();
        StringBuffer sb = new StringBuffer();

        for(int i=0; i<n; i++) {
            sb.append(list.get(0));
        }

        long end = System.nanoTime();

        return end-start;
    }
}
