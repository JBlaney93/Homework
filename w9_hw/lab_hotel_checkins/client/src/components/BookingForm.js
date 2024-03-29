import { useState } from "react";
import { postBooking } from "../services/BookingService";


const BookingForm = ({addBooking}) => {

    const [formData, setFormData] = useState({
        guest_name: "",
        email: "",
        checked_in: false
    })

    const onChange = (event) => {
        const newFormData = {...formData};
        newFormData[event.target.name] = event.target.value;
        setFormData(newFormData)

    }

    const handleSubmit = (event) => {
        event.preventDefault();
        postBooking(formData)
        .then((data)=>{addBooking(data)})
    
        setFormData({
            guest_name: "",
            email: "",
            checked_in: false
        })
    }

    return(
        <div className="booking-form-container">
            <form onSubmit={handleSubmit} className="booking-form">
            <h2>new booking</h2>
                <input type="text"
                    id="guest_name"
                    name="guest_name"
                    placeholder="name"
                    value={formData.guest_name}
                    onChange={onChange}>
                </input>
                <input type="text"
                    id="email" 
                    name="email"
                    placeholder="email"
                    value={formData.email}
                    onChange={onChange}>
                </input>
                <input type="submit" className="submit-button"/>
            </form>
        </div>
    )
}

export default BookingForm;