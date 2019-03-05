package ua.lviv.iot.StationeryManager;

import ua.lviv.iot.Stationery.Stationary;

import java.util.Comparator;
import java.util.List;

public class StationeryManagerImpl implements StationeryManager<Object> {

    @Override
    public java.util.List<Stationary> findForSchoolChildren(List<Stationary> list, String typeOfGoods) {
        return list;
    }

    @Override
    public java.util.List<Stationary> findForSeniorPupil(List<Stationary> list, String typeOfGoods) {
        return list;
    }

    @Override
    public java.util.List<Stationary> findForStudent(List<Stationary> list, String typeOfGoods) {
        return list;
    }

    @Override
    public java.util.List<Stationary> sortByPrice(java.util.List<Stationary> list, boolean sortGoods) {
        if(sortGoods == true) {
            list.sort(Comparator.comparing(Stationary::getPriceOfGoods));
        }

        if(sortGoods == false) {
            list.sort(Comparator.comparing(Stationary::getPriceOfGoods).reversed());
        }
        return list;
    }

    @Override
    public java.util.List<Stationary> sortByType(java.util.List<Stationary> list, boolean sortGoods) {
        if(sortGoods == true) {
            list.sort(Comparator.comparing(Stationary::getTypeOfGoods));
        }

        if(sortGoods == false) {
            list.sort(Comparator.comparing(Stationary::getTypeOfGoods).reversed());
        }
        return list;
    }
}
