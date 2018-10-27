package com.friendsystem.pojo;

public class Collection {
    private String collectionId;

    private String collectionPeople;

    private String collectionArticle;

    private String collectionCreatetime;

    private String collectionModifytime;

    public String getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId == null ? null : collectionId.trim();
    }

    public String getCollectionPeople() {
        return collectionPeople;
    }

    public void setCollectionPeople(String collectionPeople) {
        this.collectionPeople = collectionPeople == null ? null : collectionPeople.trim();
    }

    public String getCollectionArticle() {
        return collectionArticle;
    }

    public void setCollectionArticle(String collectionArticle) {
        this.collectionArticle = collectionArticle == null ? null : collectionArticle.trim();
    }

    public String getCollectionCreatetime() {
        return collectionCreatetime;
    }

    public void setCollectionCreatetime(String collectionCreatetime) {
        this.collectionCreatetime = collectionCreatetime == null ? null : collectionCreatetime.trim();
    }

    public String getCollectionModifytime() {
        return collectionModifytime;
    }

    public void setCollectionModifytime(String collectionModifytime) {
        this.collectionModifytime = collectionModifytime == null ? null : collectionModifytime.trim();
    }
}