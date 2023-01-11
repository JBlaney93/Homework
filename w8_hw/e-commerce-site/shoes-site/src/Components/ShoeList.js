import React from 'react';
import Shoe from './Shoe';

const ShoeList = ({ shoeData, addToBasket }) => {


    const Shoes = shoeData.map(shoe => {
        return (
            <div>
                <Shoe name={shoe.name}
                    brand={shoe.brand}
                    cost={shoe.cost}
                    size={shoe.size}
                >
                </Shoe >
                <button type="submit" onClick={() => addToBasket(shoe)}>Add to cart</button>
            </div>
        )
    });

    return (
        <>

            <ul>{Shoes}</ul>
        </>
    )

};

export default ShoeList;