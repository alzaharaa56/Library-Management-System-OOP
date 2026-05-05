package models;

public class Address {

    private String street;
    private String city;
    private String zipCode;


    public  Address(String street,String city){
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
    }

    public String getStreet(){
        return street;
    }

    public String getCity(){

        return city;
    }

    public String getZipCode(){

        return zipCode;
    }


    public  String getFullAddress() {

        return street + " ," + city + " ," + zipCode;
    }
}
