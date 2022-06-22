package com.herusaputranidjaya192102214.cuaca;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RootModel {
    @SerializedName("List")
    private List<ListModel> listModelList;

    public RootModel() {
    }

    public List<ListModel> getListModelList() {return listModelList;}

    public void setListModelList(List<ListModel> listModelList) {
        this.listModelList = listModelList;
    }
}
