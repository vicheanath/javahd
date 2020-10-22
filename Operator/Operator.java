class Operator{
    public static void main(String[] args) {
        String greeting = "Helloasdfasdfasdf";
        System.out.println("The leang of the greetting is :"+ greeting.length());
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.toLowerCase());
        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate"));

        //Operator Conect

        String firstName = "Vichea";
        String lastName = "Nath";
        System.out.println(firstName + " " + lastName);
        //conscat
        System.out.println(firstName.concat(lastName)); //conect string frist name and lastname
        
    }
}