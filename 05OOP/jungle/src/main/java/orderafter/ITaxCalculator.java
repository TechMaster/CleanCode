package orderafter;

public interface ITaxCalculator {
  public float caculateTax(float total, String shipToCountry);
}