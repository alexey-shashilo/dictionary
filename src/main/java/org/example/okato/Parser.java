package org.example.okato;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class Parser {

    public Document getPage(String okatoCode) {
        try {
            StringBuilder link = getFullCode(okatoCode);
            link = new StringBuilder("https://classinform.ru/okato/" + link + ".html");
            return Jsoup.connect(link.toString()).get();
        } catch (Exception e) {
            System.out.println(okatoCode + " Error");
        }
        return null;
    }

    public StringBuilder getFullCode(String okatoCode) {
        StringBuilder fullCode = new StringBuilder(okatoCode);
        while (fullCode.length() < 11) {
            fullCode.append("0");
        }
        return fullCode;
    }

    public String getDocumentOkato(String okatoCode) {
        try {
            Document document = getPage(okatoCode);
            Elements elementsDocument = document.select("em div.four_fifth");
            for (org.jsoup.nodes.Element element : elementsDocument) {
                return element.text();
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
        return null;
    }

    public String getParentCodeOkato(String okatoCode) {
        try {
            Document document = getPage(okatoCode);
            Elements elementsDocument = document.select("div.one_fifth");
            String textElement;
            for (int i = 1; i < elementsDocument.size(); i++) {
                textElement = elementsDocument.get(i).text();
                if (textElement.equals("ОКАТО")) {
                    String result = elementsDocument.
                            get(i - 1).
                            text().
                            replace("-", "").
                            replace(" ", "");
                    result = String.valueOf(getFullCode(result));
                    return result;
                }
            }
            return null;
        } catch (Exception e) {
            System.out.println("Error");
        }
        return okatoCode;
    }

    public Okato pars(Okato okato) {
        String okatoCode = okato.getOkatoCode();
        okato.setParentOkatoCode(getParentCodeOkato(okatoCode));
        okato.setDocument(getDocumentOkato(okatoCode));
        return okato;
    }

    public static void main(String[] args) {
        Parser parser = new Parser();
        Okato okato = new Okato("07",
                "401",
                "360",
                "000",
                1,
                "Внутригородские районы г Ставрополя/",
                null,
                null,
                "442",
                2,
                "10.09.2021",
                "01.01.2022");
        parser.pars(okato);
        System.out.println(okato);
    }
}
