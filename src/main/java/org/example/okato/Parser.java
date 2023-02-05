package org.example.okato;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Parser {
    public void pars(String link) {
        try {
            Document document = Jsoup.connect(link).get();
            Elements elementsDocument = document.select("div.one_fifth");
            String textElement;
            for (int i = 1; i < elementsDocument.size(); i++) {
                textElement = elementsDocument.get(i).text();
                textElement = textElement.replace("-","").replace(" ","");
                if (textElement.equals("ОКАТО")){
                    break;
                }
                System.out.println(textElement);
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println(link + " Error");
        }
    }

    public static void main(String[] args) {
        Parser parser = new Parser();
        parser.pars("https://classinform.ru/okato/07401368000.html");

    }
}
