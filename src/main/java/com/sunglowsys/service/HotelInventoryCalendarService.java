package com.sunglowsys.service;

import com.sunglowsys.domain.HotelInventoryCalendar;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface HotelInventoryCalendarService {

    HotelInventoryCalendar save(HotelInventoryCalendar hotelInventoryCalendar);

    HotelInventoryCalendar update(HotelInventoryCalendar hotelInventoryCalendar);

    Page<HotelInventoryCalendar> findAll(Pageable pageable);

    Optional<HotelInventoryCalendar> findById(Long id);

    void delete(Long id);
}
