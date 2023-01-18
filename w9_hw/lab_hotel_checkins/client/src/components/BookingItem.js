import { deleteBooking } from "../services/BookingService";

const BookingItem = ({booking, index, removeBooking}) => {

    const jandalDelete = () => {
        deleteBooking(booking._id)
        .then(data => {removeBooking(data._id)})
    };

    return(
        <li>
            <p>{booking.guest_name}</p>
            <p>{booking.email}</p>
            <p>{booking.checked_in ? "true":"false"}</p>
            <button onClick = {jandalDelete} className="delete-button">remove</button>
        </li>
    )
}
export default BookingItem