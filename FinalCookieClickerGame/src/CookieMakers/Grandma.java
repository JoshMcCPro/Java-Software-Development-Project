package CookieMakers;

// Creates Cursor class
public class Grandma extends CookieMaker {
    // initializing variables
    private int cookieAmountPro = 0;
    private int cost = 0;
    private int time = 0;

    // Grandma method
    public Grandma() {

    }

    // CookieMaker method that you can input cookie production, cost, and time
    public Grandma(int cookieAmountPro, int cost, int time) {
        this.cookieAmountPro = cookieAmountPro;
        this.cost = cost;
        this.time = time;
    }

    // Gets cookie production amount
    @Override
    public int getCookieAmountPro() {
        return cookieAmountPro;
    }

    // Sets the new cookie production
    @Override
    public void setCookieAmountPro(int cookieAmountPro) {
        this.cookieAmountPro = cookieAmountPro;
    }

    // Gets the cost of the Grandma
    @Override
    public int getCost() {
        return cost;
    }

    // Sets the new cost of the Grandma
    @Override
    public void setCost(int cost) {
        this.cost = cost;
    }

    // Get the time
    @Override
    public int getTime() {
        return time;
    }

    // Sets the new time
    @Override
    public void setTime(int time) {
        this.time = time;
    }

    // Adds to the cost
    @Override
    public int UpCost(int addAmount) {
        return getCost() + addAmount;
    }

    // Adds to the cookie production
    @Override
    public int UpCookieAmountPro(int addAmount) {
        return getCookieAmountPro() + addAmount;
    }

}
