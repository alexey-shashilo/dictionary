package org.example.okato;

public class Okato {
    private String regionCode;
    private String areaCode;
    private String codeVillageCouncil;
    private String codeLocalityMo;
    private String fullName;
    private String name;
    private String additionalInformation;
    private String description;
    private String okato;
    private String parentOkato;
    private String startDate;
    private String initiationDate;
    private String endDate;
    private String document;
    private String newOkato;

    public Okato(
            String regionCode,
            String areaCode,
            String codeVillageCouncil,
            String codeLocalityMo,
            String name,
            String additionalInformation,
            String description,
            String startDate,
            String endDate
    ) {
        this.regionCode = regionCode;
        this.areaCode = areaCode;
        this.codeVillageCouncil = codeVillageCouncil;
        this.codeLocalityMo = codeLocalityMo;
        this.name = name;
        this.additionalInformation = additionalInformation;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
        this.okato = regionCode + areaCode + codeVillageCouncil + codeVillageCouncil;
        this.fullName = (name
                + (additionalInformation.equals("") ? "" : " (" + additionalInformation + ")")
                + (description.equals("") ? "" : " (" + description + ")"))
                .replace(") ("," ");
    }
}
