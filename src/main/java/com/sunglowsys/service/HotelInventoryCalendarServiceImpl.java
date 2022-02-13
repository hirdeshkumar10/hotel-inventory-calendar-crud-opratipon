package com.sunglowsys.service;

import com.sunglowsys.domain.HotelInventoryCalendar;
import com.sunglowsys.repository.HotelInventoryCalendarRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class HotelInventoryCalendarServiceImpl implements HotelInventoryCalendarService{

    private final Logger logger =  LoggerFactory.getLogger(HotelInventoryCalendarServiceImpl.class);

    private final HotelInventoryCalendarRepository hotelInventoryCalendarRepository;

    public HotelInventoryCalendarServiceImpl(HotelInventoryCalendarRepository hotelInventoryCalendarRepository) {
        this.hotelInventoryCalendarRepository = hotelInventoryCalendarRepository;
    }

    @Override
    public HotelInventoryCalendar save(HotelInventoryCalendar hotelInventoryCalendar) {
        logger.debug("Request to save hotelInventoryCalendar: {}",hotelInventoryCalendar);
        return hotelInventoryCalendarRepository.save(hotelInventoryCalendar);
    }

    @Override
    public HotelInventoryCalendar update(HotelInventoryCalendar hotelInventoryCalendar) {
        logger.debug("Request to save hotelInventoryCalendar: {}",hotelInventoryCalendar);
        return hotelInventoryCalendarRepository.save(hotelInventoryCalendar);
    }

    @Override
    public List<HotelInventoryCalendar> findAll() {
        logger.debug("Request to getAll hotelInventoryCalendar:");
        return hotelInventoryCalendarRepository.findAll();
    }

    @Override
    public Optional<HotelInventoryCalendar> findById(Long id) {
        logger.debug("Request to getById hotelInventoryCalendar: {}",id);
        return hotelInventoryCalendarRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        logger.debug("Request to save hotelInventoryCalendar: {}",id);
        hotelInventoryCalendarRepository.deleteById(id);

    }
}
