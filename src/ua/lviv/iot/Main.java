package ua.lviv.iot;

import ua.lviv.iot.Stationery.Stationary;
import ua.lviv.iot.StationeryManager.StationeryManagerImpl;
import ua.lviv.iot.Stationery.DevicesForReading;
import ua.lviv.iot.Stationery.StorageAccessories;
import ua.lviv.iot.Stationery.Writing;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        StationeryManagerImpl manager = new StationeryManagerImpl();
        LinkedList<Stationary> list = new LinkedList<Stationary>();

        DevicesForReading devicesForReading = new DevicesForReading("linz","Mizar", 200);
        Writing writing = new Writing("Pen","1ересня",8);
        StorageAccessories storageAccessories = new StorageAccessories("Box", "Optima", 180);

        List<Stationary> stationaries = Arrays.asList(
                new Stationary("linz","Mizar", 200),
                new Stationary("Pen","1ересня",8),
                new Stationary("Box", "Optima", 180)
        );

        list.add(devicesForReading);
        list.add(writing);
        list.add(storageAccessories);


        manager.sortByType(list, true);
        System.out.println("\nSort by Type ascending: ");
        for(int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i).getTypeOfGoods());
        }

        manager.sortByType(list, false);
        System.out.println("Sort by price descending: ");
        for(int i = 0; i < list.size();i++) {
                System.out.println(list.get(i).getTypeOfGoods());
        }

        manager.sortByPrice(list, true);
        System.out.println("\nSort by price ascending: ");
        for(int i = 0; i< list.size();i++) {
                System.out.println(list.get(i).getPriceOfGoods());
        }

        manager.sortByPrice(list, false);
        System.out.println("\nSort by price descending: ");
        for(int i = 0;i < list.size();i++) {
                System.out.println(list.get(i).getPriceOfGoods());
        }

        manager.findForSchoolChildren(list, "linz");
        System.out.println("Goods for Children: ");
        Stationary resultForChildren = stationaries.stream().filter(x -> "linz".equals(x.getTypeOfGoods())).findAny().orElse(null);
        System.out.println("\n" + resultForChildren);


        manager.findForSeniorPupil(list, "Pen");
        System.out.println("Goods for senior pupil: ");
        Stationary resultForSeniorPupil = stationaries.stream().filter(x -> "Pen".equals(x.getTypeOfGoods())).findAny().orElse(null);
        System.out.println("\n" + resultForSeniorPupil);

        manager.findForStudent(list, "Box");
        System.out.println("Goods for student: ");
        Stationary resultForStudent = stationaries.stream().filter(x -> "Box".equals(x.getTypeOfGoods())).findAny().orElse(null);
        System.out.println("\n" + resultForStudent);
    }
}
