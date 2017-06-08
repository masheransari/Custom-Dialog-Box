package com.example.expansion.customdialogbox;

/**
 * Created by asher.ansari on 6/8/2017.
 */

public class customVariable {
    private String town;
    private String townDetail;

    public String getTown() {
        return town;
    }

    public String getTownDetail() {
        return townDetail;
    }

    public customVariable() {
    }

    public customVariable(String town, String townDetail) {
        this.town = town;
        this.townDetail = townDetail;
    }
}
