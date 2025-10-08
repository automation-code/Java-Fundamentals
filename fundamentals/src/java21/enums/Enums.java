package java21.enums;

enum SearchEngine{
GOOGLE, BING, YANDEX, YAHOO
}

public class Enums {

    public static void main(String[] args) {
        SearchEngine searchEngine = SearchEngine.YAHOO;

        switch (searchEngine){
            case GOOGLE:
                System.out.println("Google Search Engine");
                break;
            case BING:
                System.out.println("Bing Search Engine");
                break;
            case YANDEX:
                System.out.println("Yandex Search Engine");
                break;
            case YAHOO:
                System.out.println("Yahoo Search Engine");
                break;
            default:
                System.out.println("No value is found");
        }
    }
}
