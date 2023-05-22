package com.company;

public class Main {

    public static void main(String[] args) {
//        Product product1 = new Product();
//        product1.name = "Delongi Kahve Makinesi";
//        product1.discount = 7;          //discount : indirim oranı
//        product1.unitPrice = 2200;
//        product1.imageUrl = "facsv.jpg";
//        product1.unitsInStock = 500;
//
//        Product product2 = new Product();
//        product2.name = "Smeg Kahve Makinesi";
//        product2.discount = 10;
//        product2.unitPrice = 3200;
//        product2.imageUrl = "facsv2.jpg";
//        product2.unitsInStock = 100;
//
//        Product product3 = new Product();
//        product3.name = "Kitchen Aid Kahve Makinesi";
//        product3.discount = 8;
//        product3.unitPrice = 4200;
//        product3.imageUrl = "facsv3.jpg";
//        product3.unitsInStock = 90;
//
//        //html etiketleriyle web'e listeleme yapıyoruz.
//        System.out.println("<ul>");         //<ul> : listeleri yapar
//        Product[] products = {product1, product2, product3};
//        for (Product product : products){
//            System.out.println("<li>" + product.name + "</li>");
//        }
//        System.out.println("</ul>");

        Product product1 = new Product();
        product1.setName("Delongi Kahve Makinesi");
        product1.setDiscount(7);
        product1.setImageUrl("bilmemne.jpg");
        product1.setUnitPrice(220);
        product1.setUnitsInStock(20);

        System.out.println(product1.getName());

        individualCustomer individualCustomer = new individualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("655");
        individualCustomer.setPhone("33563534");
        individualCustomer.setFirstName("Merve");
        individualCustomer.setLastName("Atabey");
        System.out.println(individualCustomer.getId());
        System.out.println(individualCustomer.getPhone());
        System.out.println(individualCustomer.getCustomerNumber());
        System.out.println(individualCustomer.getFirstName() + " " + individualCustomer.getLastName());

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setTaxNumber("111111111");
        corporateCustomer.setId(3);
        System.out.println(corporateCustomer.getCompanyName() + "," + corporateCustomer.getTaxNumber() + "," + corporateCustomer.getId());

        Customer[] customers = {individualCustomer, corporateCustomer};
       




    }
}
