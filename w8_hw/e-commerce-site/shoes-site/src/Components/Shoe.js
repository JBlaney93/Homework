import React from 'react';

const Shoe = ({ brand, name, cost, size }) => {


    return (
        <>
            <li>{brand}</li>
            <li>{name}</li>
            <li>{cost}</li>
            <li>{size}</li>
        </>
    )
}

export default Shoe;