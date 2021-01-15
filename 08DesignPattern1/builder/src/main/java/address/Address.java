package address;

public class Address {

    private Integer number;

    private String alley;

    private String street;

    private String ward;

    private String district;

    private String province;

    private Address() {
    }

    public Integer getNumber() {
        return number;
    }

    public String getAlley() {
        return alley;
    }

    public String getStreet() {
        return street;
    }

    public String getWard() {
        return ward;
    }

    public String getDistrict() {
        return district;
    }

    public String getProvince() {
        return province;
    }

    @Override
    public String toString() {
        return "Address{" +
                "number=" + number +
                ", alley='" + alley + '\'' +
                ", street='" + street + '\'' +
                ", ward='" + ward + '\'' +
                ", district='" + district + '\'' +
                ", province='" + province + '\'' +
                '}';
    }

    public static class Builder {

        private Integer number;

        private String alley;

        private String street;

        private String ward;

        private String district;

        private String province;

        public Builder number(int number) {
            this.number = number;
            return this;
        }

        public Builder alley(String alley) {
            this.alley = alley;
            return this;
        }

        public Builder street(String street) {
            this.street = street;
            return this;
        }

        public Builder ward(String ward) {
            this.ward = ward;
            return this;
        }

        public Builder district(String district) {
            this.district = district;
            return this;
        }

        public Builder province(String province) {
            this.province = province;
            return this;
        }

        public Address build() {
            Address address = new Address();
            address.number = this.number;
            address.alley = this.alley;
            address.street = this.street;
            address.ward = this.ward;
            address.district = this.district;
            address.province = this.province;
            return address;
        }

    }

}
