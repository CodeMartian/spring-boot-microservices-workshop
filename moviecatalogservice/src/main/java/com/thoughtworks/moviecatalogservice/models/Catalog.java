package com.thoughtworks.moviecatalogservice.models;

import java.util.List;

public class Catalog {
    private List<CatalogItem> catalogItems;

    public Catalog() {}


    public void setCatalogItems(List<CatalogItem> catalogItems) {
        this.catalogItems = catalogItems;
    }

    public List<CatalogItem> getCatalogItems() {
        return catalogItems;
    }
}
