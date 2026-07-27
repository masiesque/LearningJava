package br.com.masiesque.Iinterfaces.test;

import br.com.masiesque.Iinterfaces.domain.DataLoader;
import br.com.masiesque.Iinterfaces.domain.DatabaseLoader;
import br.com.masiesque.Iinterfaces.domain.FileLoad;

public class TestLoader001 {
    public static void main(String[] args) {
        DatabaseLoader database = new DatabaseLoader();
        FileLoad file = new FileLoad();

        database.loading();
        file.loading();
        database.checkPermission();
        file.checkPermission();

        DataLoader.retrieveMaxDataSize();
    }
}
