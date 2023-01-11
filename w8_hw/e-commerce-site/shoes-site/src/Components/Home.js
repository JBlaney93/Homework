import React from "react";
import styled from 'styled-components';

const MainContainer = styled.div`
    max-width: 70%;
    margin: 0 auto;
`

const Home = () => (
    <MainContainer>
        <h2>Home</h2>
        <p>Welcome to the best kicks in town</p>
    </MainContainer>
);

export default Home;
