import React from "react";

const Basket = ({ basket, checkout, remove }) => {

    

    
    const basketItems = basket.map((shoe, index) => {
        return (
            <div>
                <p>{shoe.name}</p>
                <p>{shoe.brand}</p>
                <p>{shoe.cost}</p>
                <p>{shoe.size}</p>
                <button type="submit" onClick={() => remove(index)}>Remove</button>
            </div>

        )
    });


    const total = basket.reduce((carry, shoe) => {
        return carry + Number(shoe.cost)
    }, 0)

    return (
        <div>
            <h3>This is the basket</h3>
            {basketItems}
            <p> Total: £{total}</p>
            <button type="submit" onClick={() => checkout()}>Checkout</button>
        </div>
    )
};

export default Basket;