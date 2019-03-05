package ua.lviv.iot.StationeryManager;

import ua.lviv.iot.Stationery.Stationary;

import java.util.List;
public interface StationeryManager<S> {
   // LinkedList<Stationary> List = new LinkedList<Stationary>();

    List<Stationary> findForSchoolChildren(List<Stationary> list, String typeOfGoods);
    List<Stationary> findForSeniorPupil(List<Stationary> list, String typeOfGoods);
    List<Stationary> findForStudent(List<Stationary> list, String typeOfGoods);
    List<Stationary> sortByPrice(List<Stationary> list, boolean sortGoods);
    List<Stationary> sortByType(List<Stationary> list, boolean sortGoods);
}
