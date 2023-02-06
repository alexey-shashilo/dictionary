package org.example.okato;

public class Okato {
    private String regionCode;
    private String areaCode;
    private String codeVillageCouncil;
    private String codeLocalityMo;
    private int codeSection;
    private String nameOkato;
    private String additionalInformation;
    private String description;
    private String changeNumber;
    private int status;
    private String acceptanceDate;
    private String initiationDate;
    private String okatoCode;
    private String fullName;
    private String parentOkatoCode;
    private String newOkatoCode;
    private String document;

    public Okato(
            String regionCode,
            String areaCode,
            String codeVillageCouncil,
            String codeLocalityMo,
            int codeSection,
            String nameOkato,
            String additionalInformation,
            String description,
            String changeNumber,
            int status,
            String acceptanceDate,
            String initiationDate) {
        this.regionCode = regionCode;
        this.areaCode = areaCode;
        this.codeVillageCouncil = codeVillageCouncil;
        this.codeLocalityMo = codeLocalityMo;
        this.codeSection = codeSection;
        this.nameOkato = nameOkato == null ? "" : nameOkato;
        this.additionalInformation = additionalInformation == null ? "" : additionalInformation;
        this.description = description == null ? "" : description;
        this.changeNumber = changeNumber;
        this.status = status;
        this.acceptanceDate = acceptanceDate;
        this.initiationDate = initiationDate;
        this.okatoCode = regionCode
                + areaCode
                + codeVillageCouncil
                + (codeSection == 1 ? "" : codeLocalityMo);
        this.fullName = nameOkato
                + (this.additionalInformation.equals("") ? "" : " (" + this.additionalInformation + ")")
                + (this.description.equals("") ? "" : " (" + this.description + ")")
                .replace(") (", " ");
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getRegionCode() {
        return regionCode;
    }

    public void setRegionCode(String regionCode) {
        this.regionCode = regionCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getCodeVillageCouncil() {
        return codeVillageCouncil;
    }

    public void setCodeVillageCouncil(String codeVillageCouncil) {
        this.codeVillageCouncil = codeVillageCouncil;
    }

    public String getCodeLocalityMo() {
        return codeLocalityMo;
    }

    public void setCodeLocalityMo(String codeLocalityMo) {
        this.codeLocalityMo = codeLocalityMo;
    }

    public int getCodeSection() {
        return codeSection;
    }

    public void setCodeSection(int codeSection) {
        this.codeSection = codeSection;
    }

    public String getNameOkato() {
        return nameOkato;
    }

    public void setNameOkato(String nameOkato) {
        this.nameOkato = nameOkato;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getChangeNumber() {
        return changeNumber;
    }

    public void setChangeNumber(String changeNumber) {
        this.changeNumber = changeNumber;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getAcceptanceDate() {
        return acceptanceDate;
    }

    public void setAcceptanceDate(String acceptanceDate) {
        this.acceptanceDate = acceptanceDate;
    }

    public String getInitiationDate() {
        return initiationDate;
    }

    public void setInitiationDate(String initiationDate) {
        this.initiationDate = initiationDate;
    }

    public String getOkatoCode() {
        return okatoCode;
    }

    public void setOkatoCode(String okatoCode) {
        this.okatoCode = okatoCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getParentOkatoCode() {
        return parentOkatoCode;
    }

    public void setParentOkatoCode(String parentOkatoCode) {
        this.parentOkatoCode = parentOkatoCode;
    }

    public String getNewOkatoCode() {
        return newOkatoCode;
    }

    public void setNewOkatoCode(String newOkatoCode) {
        this.newOkatoCode = newOkatoCode;
    }

    @Override
    public String toString() {
        return "Okato{" +
                "regionCode='" + regionCode + '\'' +
                ", areaCode='" + areaCode + '\'' +
                ", codeVillageCouncil='" + codeVillageCouncil + '\'' +
                ", codeLocalityMo='" + codeLocalityMo + '\'' +
                ", codeSection=" + codeSection +
                ", nameOkato='" + nameOkato + '\'' +
                ", additionalInformation='" + additionalInformation + '\'' +
                ", description='" + description + '\'' +
                ", changeNumber='" + changeNumber + '\'' +
                ", status=" + status +
                ", acceptanceDate='" + acceptanceDate + '\'' +
                ", initiationDate='" + initiationDate + '\'' +
                ", okatoCode='" + okatoCode + '\'' +
                ", fullName='" + fullName + '\'' +
                ", parentOkatoCode='" + parentOkatoCode + '\'' +
                ", newOkatoCode='" + newOkatoCode + '\'' +
                ", document='" + document + '\'' +
                '}';
    }
}
