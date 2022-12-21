import React from 'react';
import './App.css';
import MusicChartContainer from './containers/MusicChartContainer';

function App() {
  return (
    <div className="main-container">
      <h1 className='header-text'>UK Top 20 Hottest Garbage</h1>
      <h2 className='h2-text'>Hottest and freshest junk to ram in your earholes</h2>
      <MusicChartContainer />
    </div>
  );
}

export default App;
