package orderafter;

public class TaxCalculator implements ITaxCalculator{
  
  /** 
   * Calculate tax base on shipToCountry 
   * US --> 0.07 * Total
   * EU --> 0.2 * Total
   * @param total
   * @param shipToCountry
   * @return float
   */
  public float caculateTax(float total, String shipToCountry) {
    if (shipToCountry.equals("US")) {
      total += total * 0.07; //US sales tax
    } else if (shipToCountry.equals("EU")) {
      total += total * 0.2;  //EU VAT
    }
    return total;
  }
}
