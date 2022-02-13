package com.sunglowsys.service;

import com.sunglowsys.domain.HotelInventoryCalendar;

import java.util.List;
import java.util.Optional;

public interface HotelInventoryCalendarService {

    HotelInventoryCalendar save(HotelInventoryCalendar hotelInventoryCalendar);

    HotelInventoryCalendar update(HotelInventoryCalendar hotelInventoryCalendar);

    List<HotelInventoryCalendar> findAll();

    Optional<HotelInventoryCalendar> findById(Long id);

    void delete(Long id);
}
