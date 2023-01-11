import React from "react";
import { Link } from "react-router-dom";
import styled from 'styled-components';

const NavBarItems = styled.ul`
  display:flex;
  justify-content: space-evenly;
  background-color: orange;
  padding: 20px 0px;
  `
const NavButtons = styled.li`
    text-decoration: none;
`
const SiteLogo = styled.h1`
    color: white;
    font-size: 40px;
    font-weight: 400;
`

const NavBar = () => {
    return (
        <NavBarItems>
            <NavButtons>
                <SiteLogo>KICKS</SiteLogo>
            </NavButtons>
            <NavButtons>
                <Link to="/" class="nav-bar-buttons">Home</Link>
            </NavButtons>
            <NavButtons>
                <Link to="/shoes" class="nav-bar-buttons">Shoes</Link>
            </NavButtons>
            <NavButtons>
                <Link to="/basket" class="nav-bar-buttons">Basket</Link>
            </NavButtons>
        </NavBarItems>
    )
}

export default NavBar;