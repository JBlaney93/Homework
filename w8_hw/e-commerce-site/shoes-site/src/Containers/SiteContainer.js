
import React, { useState, useEffect } from "react";
import { BrowserRouter as Router, Routes, Route } from "react-router-dom";
import styled from 'styled-components';
import shoeData from "../data/shoes";
import ShoeList from "../Components/ShoeList";
import Home from "../Components/Home";
import Basket from "../Components/Basket";
import NavBar from "../Components/NavBar";


const SiteContainer = () => {
    // const [shoes, setShoes] = useState(shoeData);
    // const [selectedShoe, setSelectedShoe] = useState([])
    const [basket, setBasket] = useState([])

    const addToBasket = (shoe) => {
        const newBasket = [...basket, shoe]
        setBasket(newBasket)
    }

    const checkout = () => {
        const emptyBasket = []
        setBasket(emptyBasket)
    }
    const removeFromBasket = (index) => {
        const newBasket = [...basket.slice(index)]
        setBasket(newBasket)
    }


    return (
        <div class="container">
            <h1>KICKERS</h1>

            <Router>
                <div class="nav-bar"><NavBar /></div>
                <Routes>
                    <Route path="/shoes" element={<ShoeList shoeData={shoeData} addToBasket={addToBasket} />} />
                    <Route path="/" element={<Home />} />
                    <Route path="/basket" element={<Basket basket={basket} checkout={checkout} remove={removeFromBasket} />} />
                </Routes>
            </Router>
        </div>
    );


}

export default SiteContainer;
