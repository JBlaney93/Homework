import React from "react";
import { Link } from "react-router-dom";

const NavBar = () => {
    return (
        <ul>
            <li>
                <Link to="/">Home</Link>
            </li>
            <li>
                <Link to="/shoes">Shoes</Link>
            </li>
            <li>
                <Link to="/basket">Basket</Link>
            </li>
            {/* <li>
                <Link to="/contact">Contact Us</Link>
            </li>
            <li>
                <Link to="/reviews">Reviews</Link>
            </li> */}
        </ul>
    )
}

export default NavBar;