package ra.service;


import ra.model.Catalog;

import java.util.ArrayList;
import java.util.List;

public class CatalogService {
    List<Catalog> catalogs = new ArrayList<>();

    public List<Catalog> getAll() {
        return catalogs;
    }

    public int getSize() {
        return catalogs.size();
    }

    public void Save(Catalog newCatalog) {
        if (finById(newCatalog.getCatalogId()) == null) {
            //thêm　mới
            catalogs.add(newCatalog);
        } else {
            //update
            int index = catalogs.indexOf(finById(newCatalog.getCatalogId()));
            catalogs.set(index, newCatalog);
        }
    }

    public Catalog finById(int id) {
        for (Catalog catalog : catalogs) {
            if (catalog.getCatalogId() == id) {
                return catalog;
                //tìm thấy
            }
        }
        //không tìm thấy
        return null;
    }

    public boolean deleteCatalog(int delId) {
        if (finById(delId) == null) {
            System.err.println("không tìm thấy danh muc ");
            return false;
        }
        catalogs.remove(finById(delId));
        return true;
    }

    public int getNewId() {
        //id tự tăng
        int max = 0;
        for (Catalog catalog : catalogs) {
            if (catalog.getCatalogId() > max) {
                max = catalog.getCatalogId();
            }
        }
        return max + 1;
    }
}
