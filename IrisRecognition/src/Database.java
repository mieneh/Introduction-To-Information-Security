import java.util.Vector;

public class Database {
    public static String compare(Feature[] currentIris, Vector<Feature[]> irisDb, Vector<String> nameDb) {
        Vector<Float> distance = new Vector<Float>();
        for (Feature[] iris : irisDb) {
            float dist = 0f;
            for (int i = 0; i < iris.length; i++) {
                dist = dist + distance(iris[i].toVector(), currentIris[i].toVector());  // compute distance
            }
            distance.add(dist);
            System.out.println(dist);
        }

        int shortest = 0;
        float shortDist = distance.get(0);
        for (int i = 1; i < distance.size(); i++) {
            if (distance.get(i) < shortDist) {
                shortest = i;
                shortDist = distance.get(i);
            }
        }

        float maxDist = distance.get(0);
        for (Float dist : distance) {
            if (dist > maxDist) {
                maxDist = dist;
            }
        }

        float similarityPercentage = (1 - (shortDist / maxDist)) * 100;

        return nameDb.get(shortest) + " " + String.format("%.2f", similarityPercentage) + "%";
    }

    protected static float distance(float[] a, float[] b) {
        double d = 0;
        for (int i = 0; i < a.length; i++)
            d += Math.pow(a[i] - b[i], 2);
        return (float) d;
    }
}