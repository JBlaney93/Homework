import React from "react";

const Basket = ({ basket, checkout, remove }) => {

    const basketItems = basket.map(shoe => {
        return (
            <div>
                <p>{shoe.name}</p>
                <p>{shoe.brand}</p>
                <p>{shoe.cost}</p>
                <p>{shoe.size}</p>
                <button type="submit" onClick={() => remove()}>Remove</button>
            </div>

        )
    });



    return (
        <div>
            <h3>This is the basket</h3>
            {basketItems}
            <button type="submit" onClick={() => checkout()}>Checkout</button>
        </div>
    )
};

export default Basket;