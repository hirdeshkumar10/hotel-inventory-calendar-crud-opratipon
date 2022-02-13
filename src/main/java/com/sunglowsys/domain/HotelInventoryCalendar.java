package com.sunglowsys.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "hotel_inventory_calendar")
public class HotelInventoryCalendar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String available;

    @Column(nullable = false)
    private Integer sold;

    @Column(nullable = false)
    private Integer block;

    public HotelInventoryCalendar() {
    }

    public HotelInventoryCalendar(String available, Integer sold, Integer block) {
        this.available = available;
        this.sold = sold;
        this.block = block;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public Integer getSold() {
        return sold;
    }

    public void setSold(Integer sold) {
        this.sold = sold;
    }

    public Integer getBlock() {
        return block;
    }

    public void setBlock(Integer block) {
        this.block = block;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotelInventoryCalendar that = (HotelInventoryCalendar) o;
        return Objects.equals(id, that.id) && Objects.equals(available, that.available) && Objects.equals(sold, that.sold) && Objects.equals(block, that.block);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, available, sold, block);
    }


    @Override
    public String toString() {
        return "HotelInventoryCalendar{" +
                "id=" + id +
                ", available='" + available + '\'' +
                ", sold='" + sold + '\'' +
                ", block='" + block + '\'' +
                '}';
    }
}
