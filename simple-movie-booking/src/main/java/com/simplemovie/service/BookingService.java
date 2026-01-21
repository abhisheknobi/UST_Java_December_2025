package com.simplemovie.service;

import com.simplemovie.entity.Booking;
import com.simplemovie.entity.Show;
import com.simplemovie.repository.BookingRepository;
import com.simplemovie.repository.ShowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private ShowRepository showRepository;

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public Booking createBooking(Booking booking) {
        // 1. Fetch the show details
        Show show = showRepository.findById(booking.getShow().getShowId())
                .orElseThrow(() -> new RuntimeException("Show not found"));

        // 2. Validate Business Rule: Are there enough seats?
        if (show.getAvailableSeats() < booking.getSeatsBooked()) {
            throw new RuntimeException("Not enough seats available!");
        }

        // 3. Reduce the seat count
        show.setAvailableSeats(show.getAvailableSeats() - booking.getSeatsBooked());
        showRepository.save(show); // Update the show in DB

        // 4. Save the booking
        booking.setBookingDate(LocalDate.now()); // Auto-generate date
        booking.setShow(show);
        return bookingRepository.save(booking);
    }

    public void cancelBooking(Long bookingId) {
        // 1. Find the booking
        Booking booking = bookingRepository.findById(bookingId)
                .orElseThrow(() -> new RuntimeException("Booking not found"));
        
        // 2. Restore the seats
        Show show = booking.getShow();
        show.setAvailableSeats(show.getAvailableSeats() + booking.getSeatsBooked());
        showRepository.save(show);

        // 3. Delete the booking
        bookingRepository.delete(booking);
    }
}