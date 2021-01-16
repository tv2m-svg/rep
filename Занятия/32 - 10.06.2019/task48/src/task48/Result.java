package task48;

public class Result {

    private boolean bSearch;
    private double x1, x2;

    public Result(boolean bSearch, double x1, double x2) {
        this.bSearch = bSearch;
        this.x1 = x1;
        this.x2 = x2;
    }

    @Override
    public boolean equals(Object obj) {
        Result result = (Result) obj;
        return (this.bSearch == result.bSearch) && (this.x1 == result.x1)
                && (this.x2 == result.x2);
    }
}
