package com.sunglowsys.rest;

import com.sunglowsys.domain.HotelInventoryCalendar;
import com.sunglowsys.service.HotelInventoryCalendarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class HotelInventoryCalendarResource {

    private final Logger logger = LoggerFactory.getLogger(HotelInventoryCalendarResource.class);

    private final HotelInventoryCalendarService hotelInventoryCalendarService;


    public HotelInventoryCalendarResource(HotelInventoryCalendarService hotelInventoryCalendarService) {
        this.hotelInventoryCalendarService = hotelInventoryCalendarService;
    }

    @PostMapping("/hotel-inventory-calendars")
    public ResponseEntity<HotelInventoryCalendar> createHotelInventoryCalendar(@RequestBody HotelInventoryCalendar hotelInventoryCalendar)throws URISyntaxException {
        logger.debug("REST request to save Hotel : {}", hotelInventoryCalendar );
        if (hotelInventoryCalendar.getId() != null) {
            throw new RuntimeException("Id should be null in create API call");
        }
        HotelInventoryCalendar result = hotelInventoryCalendarService.save(hotelInventoryCalendar);
        return ResponseEntity
                .created(new URI("/api/Hotel-inventory-calendars/"+result.getId()))
                .body(result);
    }

    @PutMapping("/hotel-inventory-calendars")
    public ResponseEntity<HotelInventoryCalendar> updateHotelInventoryCalendar(@RequestBody HotelInventoryCalendar hotelInventoryCalendar) {
        logger.debug("REST request to update HotelInventoryCalendar : {}", hotelInventoryCalendar);
        if (hotelInventoryCalendar.getId() == null) {
            throw new RuntimeException("Id should not be null in update API call");
        }
        HotelInventoryCalendar result = hotelInventoryCalendarService.update(hotelInventoryCalendar);
        return ResponseEntity
                .ok()
                .body(result);
    }

    @GetMapping("/hotel-inventory-calendars")
    public ResponseEntity<List<HotelInventoryCalendar>> getAllHotelInventoryCalendars(Pageable pageable) {
        logger.debug("REST request to get a List of HotelInventoryCalendars: {}",pageable.toString());
        Page<HotelInventoryCalendar> result = hotelInventoryCalendarService.findAll(pageable);
        return ResponseEntity
                .ok()
                .body(result.getContent());
    }

    @GetMapping("/hotel-inventory-calendars/{id}")
    public ResponseEntity<HotelInventoryCalendar> getHotelInventoryCalendar(@PathVariable Long id) {
        logger.debug("REST request to get HotelInventoryCalendar : {}", id);
        Optional<HotelInventoryCalendar> result = hotelInventoryCalendarService.findById(id);
        return ResponseEntity.ok().body(result.get());
    }

    @DeleteMapping("/hotel-inventory-calendars/{id}")
    public ResponseEntity<Void> deleteHotelInventoryCalendar(@PathVariable Long id) {
        logger.debug("REST request to delete HotelInventoryCalendar : {}", id);
        hotelInventoryCalendarService.delete(id);
        return ResponseEntity.noContent().build();
    }

}
