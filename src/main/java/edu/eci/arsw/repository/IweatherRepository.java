package edu.eci.arsw.repository;

import edu.eci.arsw.Model.entity;

public interface IweatherRepository extends DAO<entity,String> {
    entity getWeatherByCityName(String name);
}
