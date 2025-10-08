package java21.enums;

enum Company{
    GOOGLE("Google is product based company have product like search engine, map etc."),
    MICROSOFT("Microsoft is product based company have product like windows, phone etc."),
    ADOBE("Adobe is product based company have product like photoshop, element etc.");

    private String description;

    private Company(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }
}

public class EnumConstructor {

    public static void main(String[] args) {
        Company company = Company.GOOGLE;
        System.out.println(company.getDescription());
    }
}
