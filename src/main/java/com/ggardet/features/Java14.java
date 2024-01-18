package com.ggardet.features;

public class Java14 {

    public static void main(final String[] args) {
        // des NPE plus claires
        npe();

        // (et d'autres trucs importants mais pas hyper intéressants pour nous au jour le jour)
    }

    private static void npe() {
        final var person = new Person();
        person.setName("George Abitbol");;
        final var address = new Address();
        address.setRegion(null);
        person.setAddress(address);
        System.out.println(person.getAddress().getRegion().toLowerCase());
    }

    static class Person {
        private String name;
        private Address address;

        public String getName() {
            return name;
        }

        public void setName(final String name) {
            this.name = name;
        }

        public Address getAddress() {
            return address;
        }

        public void setAddress(final Address address) {
            this.address = address;
        }
    }

    static class Address {
        private String region;

        public String getRegion() {
            return region;
        }

        public void setRegion(final String region) {
            this.region = region;
        }
    }
}
