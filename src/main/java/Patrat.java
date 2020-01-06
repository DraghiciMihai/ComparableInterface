public class Patrat implements Comparable<Patrat> {
    private int latura;

    public Patrat(int latura) {
        this.latura = latura;
    }

    public int compareTo(Patrat itemToBeCompared) {
        if (itemToBeCompared.getArea() > this.getArea())
            return -1;
        else if (itemToBeCompared.getArea() < this.getArea())
            return 1;
        else return 0;
    }

    public int getArea() {
        return (int) Math.pow(latura, 2);
    }
}
