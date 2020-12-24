package vn.techmaster;

public enum CustomerType
{
    PayAsYouGo(1),
    Unlimited(0);

    private int typeCode;

    CustomerType(int typeCode) {
        this.typeCode = typeCode;
    }
}
